package tn.esprit.folderrepository.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.folderrepository.entity.Folder;
import tn.esprit.folderrepository.repository.FolderRepository;

import java.util.List;

@Service
public class FolderService implements IFolderService{
    @Autowired
    FolderRepository folderRepository;

    @Override
    public void AddFolder(Folder folder) {
        folderRepository.save(folder);
    }

    @Override
    public void activateFolder(int idfolder) {
        Folder f = folderRepository.findById(idfolder).get();
        f.setState(true);
        folderRepository.save(f);
    }

    @Override
    public List<Folder> foldersList() {
        return (List<Folder>)folderRepository.findAll();
    }
}
