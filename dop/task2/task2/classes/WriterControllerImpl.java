package task2.classes;

import task2.interfaces.DocumentModel;
import task2.interfaces.WriterController;

import java.time.LocalDate;

public class WriterControllerImpl implements WriterController {
    private final String author;

    public WriterControllerImpl(String author) {
        this.author = author;
    }

    @Override
    public synchronized DocumentModel createDocument(String caption, String text) {
        return new DocumentModelImpl(caption, LocalDate.now(), author, text);
    }

    @Override
    public synchronized void updateDocument(DocumentModel document, String caption, String text) throws Exception {
        if (document == null) {
            throw new Exception("Document is not defined");
        }

        DocumentModelImpl doc = (DocumentModelImpl) document;
        doc.setHeadLine(caption);
        doc.setContent(text);
    }
}
