package com.ust.JobPortalJpa.Repository;

import com.ust.JobPortalJpa.Entity.JobApplicantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicantRepository extends JpaRepository<JobApplicantEntity,Long> {

}
