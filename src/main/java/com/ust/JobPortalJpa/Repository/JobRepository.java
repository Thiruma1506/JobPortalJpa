package com.ust.JobPortalJpa.Repository;

import com.ust.JobPortalJpa.Entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobEntity,Long> {

}
