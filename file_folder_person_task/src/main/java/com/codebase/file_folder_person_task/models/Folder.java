package com.codebase.file_folder_person_task.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    private String title;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "folder")
    @JsonIgnoreProperties({"folder"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<File> files;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    @JsonIgnoreProperties({"folder"})
    private Person person;

    public Folder(String title, Person person) {
        this.title = title;
        this.person = person;
    }
    public Folder(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void addFiles(File file){
        files.add(file);
    }
}
