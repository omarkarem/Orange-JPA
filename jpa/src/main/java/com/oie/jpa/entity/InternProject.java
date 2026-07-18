package com.oie.jpa.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "intern_projects")
public class InternProject {
    @EmbeddedId
    private InternProjectId id;

    @ManyToOne
    @MapsId("internId")
    @JoinColumn(name = "intern_id")
    private Intern intern;

    @ManyToOne
    @MapsId("projectId")
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(name = "assigned_at", nullable = false)
    private LocalDate assignedAt;

    public InternProject() {
    }

    public InternProject(InternProjectId id, Intern intern, Project project, LocalDate assignedAt) {
        this.id = id;
        this.intern = intern;
        this.project = project;
        this.assignedAt = assignedAt;
    }

    public InternProjectId getId() {
        return id;
    }

    public void setId(InternProjectId id) {
        this.id = id;
    }

    public Intern getIntern() {
        return intern;
    }

    public void setIntern(Intern intern) {
        this.intern = intern;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public LocalDate getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(LocalDate assignedAt) {
        this.assignedAt = assignedAt;
    }

}
