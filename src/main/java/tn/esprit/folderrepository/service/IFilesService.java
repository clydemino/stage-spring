package tn.esprit.folderrepository.service;

import tn.esprit.folderrepository.entity.Files;

import java.util.List;

public interface IFilesService {
    public void AddFile(Files file);
    public void activateFile(int idfile);
    public List<Files> filesList(int idfolder);
}
