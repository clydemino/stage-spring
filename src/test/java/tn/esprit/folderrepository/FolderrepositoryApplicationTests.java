package tn.esprit.folderrepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.folderrepository.entity.Files;
import tn.esprit.folderrepository.entity.Folder;
import tn.esprit.folderrepository.service.FilesService;
import tn.esprit.folderrepository.service.FolderService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class FolderrepositoryApplicationTests {

    @Autowired
    FilesService filesService;

    @Autowired
    FolderService folderService;


    @Test
    void contextLoads() {
          /*  Folder f1 = new Folder("Vianney inscription",new Date());

        Files fi1 = new Files("baccalaureate","fdfsds.png",new Date(),f1);
        Files fi2 = new Files("transcript","dfasfadsl.png",new Date(),f1);

        folderService.AddFolder(f1);
        filesService.AddFile(fi1);
        filesService.AddFile(fi2);


        Folder f2 = new Folder("Clyde inscription",new Date());
        Files fi3 = new Files("baccalaureate","daslfdsja.png",new Date(),f2);
        Files fi4 = new Files("transcript","fdajklds.png",new Date(),f2);

        folderService.AddFolder(f2);
        filesService.AddFile(fi3);
        filesService.AddFile(fi4);
*/
    }

}
