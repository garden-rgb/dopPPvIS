package task2.classes;

import task2.interfaces.DocumentModel;
import task2.interfaces.FolderModel;
import task2.interfaces.SecretaryController;

import java.util.List;

public class SecretaryControllerImpl implements SecretaryController {
    private FolderModel folder;

    public SecretaryControllerImpl(FolderModel folder) throws Exception {
        if (folder == null) {
            throw new Exception("Folder is not defined");
        }
        this.folder = folder;
    }

    @Override
    public FolderModel getFolder() {
        return folder;
    }

    @Override
    public void setFolder(FolderModel folder) {
        this.folder = folder;
    }

    @Override
    public synchronized boolean addDocument(DocumentModel document) throws Exception {
        if (document == null) {
            throw new Exception("Document is not defined");
        }

        List<DocumentModel> list = folder.getDocumentList();
        if (list.contains(document)) {
            throw new Exception("Document does not exist in this folder");
        }

        return list.add(document);
    }

    @Override
    public synchronized DocumentModel defineDocumentByAuthorName(String authorName) throws Exception {
        List<DocumentModel> list = folder.getDocumentList();
        list.removeIf((some) -> some.getWriterName().equals(authorName));

        if (list.size() == 0) {
            throw new Exception("Document does not exist in this folder");
        }
        else {
            return list.get(0);
        }
    }

    @Override
    public synchronized DocumentModel defineDocumentByCaption(String caption) throws Exception {
        List<DocumentModel> list = folder.getDocumentList();
        list.removeIf((some) -> !some.getHeadLine().equals(caption));

        if (list.size() == 0) {
            throw new Exception("Document does not exist in this folder");
        }
        else {
            return list.get(0);
        }
    }
}
