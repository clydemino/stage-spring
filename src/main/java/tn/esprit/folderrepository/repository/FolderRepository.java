package tn.esprit.folderrepository.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.folderrepository.entity.Folder;

@Repository
public interface FolderRepository extends CrudRepository<Folder, Integer> {
}
