package com.oie.jpa.repository;

import com.oie.jpa.entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Integer> {
    List<Submission> findByInternId(Integer internId);

    List<Submission> findByProjectId(Integer projectId);

    List<Submission> findByScoreGreaterThan(Integer score);

    List<Submission> findAllByOrderBySubmittedAtDesc();

}
