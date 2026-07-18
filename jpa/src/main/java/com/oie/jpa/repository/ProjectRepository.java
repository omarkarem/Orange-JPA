package com.oie.jpa.repository;

import com.oie.jpa.entity.Project;
import com.oie.jpa.entity.ProjectStatus;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findByStatus(ProjectStatus status);

    Optional<Project> findbyName(String name);

    int countByStatus(ProjectStatus status);

}
