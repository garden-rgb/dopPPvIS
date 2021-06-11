package task2.interfaces;

public interface WriterController {
    DocumentModel createDocument(String caption, String text);
    void updateDocument(DocumentModel document, String caption, String text) throws Exception;
}
