package task2.classes;

import task2.interfaces.AdministratorController;
import task2.interfaces.DocumentModel;
import task2.interfaces.FolderModel;
import task2.interfaces.SecretaryController;

public class AdministratorControllerImpl implements AdministratorController {
    private final FolderModel folder;
    private final SecretaryController secretaryController;

    public AdministratorControllerImpl(SecretaryController secretaryController) {
        this.secretaryController = secretaryController;
        this.folder = secretaryController.getFolder();
    }

    @Override
    public synchronized boolean deleteDocument(DocumentModel document) throws Exception {
        if (document == null) {
            throw new Exception("Document is not defined");
        }

        return folder.getDocumentList().remove(document);
    }

    @Override
    public synchronized FolderModel createFolder(String folderName) throws Exception {
        if (folderName == null || folderName.isEmpty()) {
            throw new Exception("Incorrect folder name");
        }

        return new FolderModelImpl(folderName);
    }

    @Override
    public synchronized void transportDocument(DocumentModel document, FolderModel folder) throws Exception {
        if (folder == null) {
            throw new Exception("Incorrect path");
        }

        deleteDocument(document);
        secretaryController.setFolder(folder);
        secretaryController.addDocument(document);
        secretaryController.setFolder(this.folder);
    }
}
