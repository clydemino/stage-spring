package tn.esprit.folderrepository.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.folderrepository.entity.Files;

import java.util.List;

@Repository
public interface FilesRepository extends CrudRepository<Files, Integer> {
    @Query("select f from Files f where f.folder.reference = ?1")
    public List<Files> getFilesByFolder(int idfolder);
}
