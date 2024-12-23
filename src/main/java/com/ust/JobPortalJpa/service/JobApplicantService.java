package com.ust.JobPortalJpa.service;

import com.ust.JobPortalJpa.Entity.JobApplicantEntity;
import com.ust.JobPortalJpa.Repository.JobApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicantService {
    @Autowired
    public JobApplicantRepository repo;

    //create a new job applicant
    public JobApplicantEntity createApplicant(JobApplicantEntity applicant){
        return repo.save(applicant);
    }
    //get a job applicantById
    public JobApplicantEntity getAplicant(Long id){
        return repo.findById(id).orElseThrow(()->new RuntimeException("Applicant not found"));
    }
    //get all applicants
    public List<JobApplicantEntity> getAllApplicants() {
        return repo.findAll();
    }
}
