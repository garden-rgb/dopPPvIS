package task2.interfaces;

import java.util.List;

public interface FolderModel {
    String getName();
    List<DocumentModel> getDocumentList();
    List<FolderModel> getFolderList();
}
