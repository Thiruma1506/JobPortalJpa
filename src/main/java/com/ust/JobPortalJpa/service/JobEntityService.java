package com.ust.JobPortalJpa.service;

import com.ust.JobPortalJpa.Entity.JobEntity;
import com.ust.JobPortalJpa.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobEntityService {
    @Autowired
    public JobRepository repo;

    //create a job opening
    public JobEntity createapplication(JobEntity opening){
        return repo.save(opening);
    }
    //find a job opening by id
    public JobEntity getapplicationbyid(Long id){
        return repo.findById(id).orElseThrow(()->new RuntimeException("Application id not valid"));
    }

    public List<JobEntity> getAllJobs() {
        return repo.findAll();
    }
}
