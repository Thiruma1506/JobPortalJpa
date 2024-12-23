package com.ust.JobPortalJpa.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "applicantinfo")
public class JobApplicantEntity {
    @Id
    public Long id;
    public String applicantname;
    public String applicantskills;
    public int applicantexperience;
    public Long applicantnumber;
    public String applicantemail;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private JobEntity applyingto;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplicantname() {
        return applicantname;
    }

    public void setApplicantname(String applicantname) {
        this.applicantname = applicantname;
    }

    public String getApplicantskills() {
        return applicantskills;
    }

    public void setApplicantskills(String applicantskills) {
        this.applicantskills = applicantskills;
    }

    public int getApplicantexperience() {
        return applicantexperience;
    }

    public void setApplicantexperience(int applicantexperience) {
        this.applicantexperience = applicantexperience;
    }

    public Long getApplicantnumber() {
        return applicantnumber;
    }

    public void setApplicantnumber(Long applicantnumber) {
        this.applicantnumber = applicantnumber;
    }

    public String getApplicantemail() {
        return applicantemail;
    }

    public void setApplicantemail(String applicantemail) {
        this.applicantemail = applicantemail;
    }

    public JobEntity getApplyingto() {
        return applyingto;
    }

    public void setApplyingto(JobEntity applyingto) {
        this.applyingto = applyingto;
    }

    // Constructors

    public JobApplicantEntity(Long id, String applicantname, String applicantskills, int applicantexperience, Long applicantnumber, String applicantemail, JobEntity applyingto) {
        this.id = id;
        this.applicantname = applicantname;
        this.applicantskills = applicantskills;
        this.applicantexperience = applicantexperience;
        this.applicantnumber = applicantnumber;
        this.applicantemail = applicantemail;
        this.applyingto = applyingto;
    }

    public JobApplicantEntity() {
    }
}