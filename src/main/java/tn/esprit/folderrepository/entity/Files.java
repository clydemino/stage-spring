package tn.esprit.folderrepository.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Files implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "file_sequence")
    @SequenceGenerator(name = "file_sequence", sequenceName = "file_sequence")
    private int idfile;

    private String name;

    private String image;

    private boolean state;

    private Date add_date;

    @ManyToOne
    private Folder folder;

    public Files() {
    }

    public Files(String name, String image, Date add_date, Folder folder) {
        this.name = name;
        this.image = image;
        this.add_date = add_date;
        this.folder = folder;
    }

    public int getIdfile() {
        return idfile;
    }

    public void setIdfile(int idfile) {
        this.idfile = idfile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public Date getAdd_date() {
        return add_date;
    }

    public void setAdd_date(Date add_date) {
        this.add_date = add_date;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
