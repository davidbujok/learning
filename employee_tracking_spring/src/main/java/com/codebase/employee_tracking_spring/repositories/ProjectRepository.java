package com.codebase.employee_tracking_spring.repositories;

import com.codebase.employee_tracking_spring.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
