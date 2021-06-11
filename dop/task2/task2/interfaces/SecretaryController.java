package task2.interfaces;

public interface SecretaryController {
    FolderModel getFolder();
    void setFolder(FolderModel folder);
    boolean addDocument(DocumentModel document) throws Exception;
    DocumentModel defineDocumentByAuthorName(String authorName) throws Exception;
    DocumentModel defineDocumentByCaption(String caption) throws Exception;
}
