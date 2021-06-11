package task2.classes;

import task2.interfaces.DocumentModel;

import java.time.LocalDate;
import java.util.Objects;

public class DocumentModelImpl implements DocumentModel {
    private String headLine;
    private final LocalDate creationDate;
    private final String writerName;
    private String content;

    public DocumentModelImpl(String headLine, LocalDate creationDate, String writerName, String content) {
        this.headLine = headLine;
        this.creationDate = creationDate;
        this.writerName = writerName;
        this.content = content;
    }

    @Override
    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    @Override
    public LocalDate getCreationDate() {
        return creationDate;
    }

    @Override
    public String getWriterName() {
        return writerName;
    }

    @Override
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        DocumentModelImpl document = (DocumentModelImpl) object;
        return Objects.equals(headLine, document.headLine)
                && Objects.equals(creationDate, document.creationDate)
                && Objects.equals(writerName, document.writerName)
                && Objects.equals(content, document.content);
    }

    @Override
    public String toString() {
        return headLine + creationDate + writerName + content;
    }
}
