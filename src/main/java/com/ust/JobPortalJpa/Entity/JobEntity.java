package com.ust.JobPortalJpa.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "jobinfo")
public class JobEntity {
    @Id
    public Long id;
    public String jobrole;
    public String jobdescription;
    public boolean jobopen;
    public int experience;

    @OneToMany(mappedBy = "applyingto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<JobApplicantEntity> applicants;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobrole() {
        return jobrole;
    }

    public void setJobrole(String jobrole) {
        this.jobrole = jobrole;
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

    public boolean isJobopen() {
        return jobopen;
    }

    public void setJobopen(boolean jobopen) {
        this.jobopen = jobopen;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public List<JobApplicantEntity> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<JobApplicantEntity> applicants) {
        this.applicants = applicants;
    }

    // Constructors

    public JobEntity(Long id, String jobrole, String jobdescription, boolean jobopen, int experience) {
        this.id = id;
        this.jobrole = jobrole;
        this.jobdescription = jobdescription;
        this.jobopen = jobopen;
        this.experience = experience;
    }

    public JobEntity() {
    }
}