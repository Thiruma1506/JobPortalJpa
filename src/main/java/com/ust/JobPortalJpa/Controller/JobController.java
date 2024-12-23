package com.ust.JobPortalJpa.Controller;

import com.ust.JobPortalJpa.Entity.JobApplicantEntity;
import com.ust.JobPortalJpa.Entity.JobEntity;
import com.ust.JobPortalJpa.service.JobApplicantService;
import com.ust.JobPortalJpa.service.JobEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/portal")
public class JobController {
    @Autowired
    public JobApplicantService applicantservice;

    @Autowired
    public JobEntityService jobservice;

    //get all applications
    @GetMapping("/applicant")
    public List<JobApplicantEntity> getAllApplicants(){
        return applicantservice.getAllApplicants();
    }
    //get all jobs
    @GetMapping("/job")
    public List<JobEntity> getAllJobs(){
        return jobservice.getAllJobs();
    }
    //create an opening
    @PostMapping("/job")
    public JobEntity createJob(@RequestBody JobEntity job){
        return jobservice.createapplication(job);
    }
    //create an applicant
    @PostMapping("/applicant")
    public JobApplicantEntity createApplicant(@RequestBody JobApplicantEntity applicant){
        return applicantservice.createApplicant(applicant);
    }
}
