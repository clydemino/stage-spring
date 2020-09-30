package tn.esprit.folderrepository.service;

import tn.esprit.folderrepository.entity.Folder;

import java.util.List;

public interface IFolderService {
    public void AddFolder(Folder folder);
    public void activateFolder(int idfolder);
    public List<Folder> foldersList();
}
