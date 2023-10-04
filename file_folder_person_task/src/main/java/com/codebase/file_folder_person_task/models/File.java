package com.codebase.file_folder_person_task.models;

import com.codebase.file_folder_person_task.types.Ext;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    private String name;
    private Ext extension;
    private double size;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    @JsonIgnoreProperties({"folder"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE) // if file deleted, it will delete it from the project as well
    private Folder folder;

    public File(String name, Ext extension, double size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }
    public File(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ext getExtension() {
        return extension;
    }

    public void setExtension(Ext extension) {
        this.extension = extension;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
