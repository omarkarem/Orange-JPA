package com.oie.jpa.repository;

import com.oie.jpa.entity.InternProject;
import com.oie.jpa.entity.InternProjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface InternProjectRepository extends JpaRepository<InternProject, InternProjectId> {
    List<InternProject> findByInternId(Integer internId);

    List<InternProject> findByProjectId(Integer projectId);

    List<InternProject> findByAssignedAtGreaterThanEqual(LocalDate date);

}
