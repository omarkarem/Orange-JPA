package com.oie.jpa.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "submissions")
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    @ManyToOne
    @JoinColumn(name = "intern_id", nullable = false)
    private Intern intern;

    @Column(name = "submission_at", nullable = false)
    private LocalDateTime submittedAt;

    @Column(name = "score")
    private Integer score;

    public Submission() {
    }

    public Submission(Project project, Intern intern, LocalDateTime submittedAt, Integer score) {
        this.project = project;
        this.intern = intern;
        this.submittedAt = submittedAt;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Intern getIntern() {
        return intern;
    }

    public void setIntern(Intern intern) {
        this.intern = intern;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Submission { id=" + id + ", project=" + project + ", intern=" + intern + ", submittedAt=" + submittedAt
                + ", score=" + score + " }";
    }

}
