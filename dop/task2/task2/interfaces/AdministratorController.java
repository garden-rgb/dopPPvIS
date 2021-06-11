package task2.interfaces;

public interface AdministratorController {
    boolean deleteDocument(DocumentModel document) throws Exception;
    FolderModel createFolder(String catalogName) throws Exception;
    void transportDocument(DocumentModel document, FolderModel targetCatalog) throws Exception;
}
