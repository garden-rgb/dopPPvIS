package task2.interfaces;

import java.time.LocalDate;

public interface DocumentModel {
    String getHeadLine();
    LocalDate getCreationDate();
    String getWriterName();
    String getContent();
}
