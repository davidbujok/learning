package com.codebase.file_folder_person_task.components;

import com.codebase.file_folder_person_task.types.Ext;
import com.codebase.file_folder_person_task.models.File;
import com.codebase.file_folder_person_task.models.Folder;
import com.codebase.file_folder_person_task.models.Person;
import com.codebase.file_folder_person_task.repositories.FileRepository;
import com.codebase.file_folder_person_task.repositories.FolderRepository;
import com.codebase.file_folder_person_task.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;

@Profile("!test")
//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Person jimmy = new Person("Jimmy Hazard");
        personRepository.save(jimmy);

        Folder dontOpen = new Folder("Don't open", jimmy);
        folderRepository.save(dontOpen);

        File cv = new File("Ron Cv", Ext.TXT, 0.003, dontOpen);
        fileRepository.save(cv);
        File debts = new File("win Big",Ext.DOC , 0.3, dontOpen);
        fileRepository.save(debts);
        File friends = new File("Casino's Addresses",Ext.DOC , 1.2, dontOpen);
        fileRepository.save(friends);
        ///////////////////////

        Person susan = new Person("Susan Headfi");
        personRepository.save(susan);

        Folder music = new Folder("Favourite Bands", susan);
        folderRepository.save(music);

        File music1 = new File("Don't Sing", Ext.MP3, 1.94, music);
        fileRepository.save(music1);
        File music2 = new File("My ears are in pain", Ext.MP3, 3.3, music);
        fileRepository.save(music2);
        File music3 = new File("Mic dropped", Ext.MP3, 2.2, music);
        fileRepository.save(music3);
        ////////////////////////////

        Person olaf = new Person("Olaf Pad");
        personRepository.save(olaf);

        Folder games = new Folder("Games Download", olaf);
        folderRepository.save(games);

        File game1 = new File("The Last Of Us", Ext.PS4, 43000.2, games);
        fileRepository.save(game1);
        File game2 = new File("Fifa 21", Ext.EXE, 21309.0, games);
        fileRepository.save(game2);
        File game3 = new File("Fluffy Ball", Ext.DMG, 431.2, games);
        fileRepository.save(game3);


    }
}
