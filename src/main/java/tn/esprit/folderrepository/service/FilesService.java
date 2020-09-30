package tn.esprit.folderrepository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.folderrepository.entity.Files;
import tn.esprit.folderrepository.repository.FilesRepository;

import java.util.List;

@Service
public class FilesService implements IFilesService{
    @Autowired
    FilesRepository filesRepository;

    @Override
    public void AddFile(Files file) {
        filesRepository.save(file);
    }

    @Override
    public void activateFile(int idfile) {
        Files f = filesRepository.findById(idfile).get();
        f.setState(true);
        filesRepository.save(f);
    }

    @Override
    public List<Files> filesList(int idfolder) {
        return filesRepository.getFilesByFolder(idfolder);
    }
}
