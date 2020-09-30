package tn.esprit.folderrepository.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Folder implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "folder_sequence")
    @SequenceGenerator(name = "folder_sequence", sequenceName = "folder_sequence")
    private int reference;

    private String title;

    private Date add_date;

    private boolean state;

    @OneToMany(mappedBy = "folder" , fetch = FetchType.EAGER , cascade = {CascadeType.PERSIST , CascadeType.REMOVE})
    private List<Files> files = new ArrayList<Files>();

    public Folder() {
    }

    public Folder(String title, Date add_date) {
        this.title = title;
        this.add_date = add_date;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getAdd_date() {
        return add_date;
    }

    public void setAdd_date(Date add_date) {
        this.add_date = add_date;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public List<Files> getFiles() {
        return files;
    }

    public void setFiles(List<Files> files) {
        this.files = files;
    }

}
