package task2.classes;

import task2.interfaces.DocumentModel;
import task2.interfaces.FolderModel;

import java.util.ArrayList;
import java.util.List;

public class FolderModelImpl implements FolderModel {
    private final String name;
    private final List<DocumentModel> documentList;
    private final List<FolderModel> folderList;

    public FolderModelImpl(String name) {
        this.name = name;
        this.documentList = new ArrayList<>();
        this.folderList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<DocumentModel> getDocumentList() {
        return documentList;
    }

    @Override
    public List<FolderModel> getFolderList() {
        return folderList;
    }
}
