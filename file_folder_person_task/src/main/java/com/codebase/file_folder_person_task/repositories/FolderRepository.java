package com.codebase.file_folder_person_task.repositories;

import com.codebase.file_folder_person_task.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
