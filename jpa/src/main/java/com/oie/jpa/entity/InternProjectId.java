package com.oie.jpa.entity;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class InternProjectId implements Serializable {

    @Column(name = "ïntern_id")
    private Integer internId;

    @Column(name = "project_id")
    private Integer projectId;

    public InternProjectId() {
    }

    public InternProjectId(Integer internId, Integer projectId) {
        this.internId = internId;
        this.projectId = projectId;
    }

    public Integer getInternId() {
        return internId;
    }

    public void setInternId(Integer internId) {
        this.internId = internId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        InternProjectId that = (InternProjectId) o;
        return Objects.equals(internId, that.internId) && Objects.equals(projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(internId, projectId);
    }

    @Override
    public String toString() {
        return "InternProjectId {" +
                "internId=" + internId +
                ", projectId=" + projectId +
                '}';
    }

}
