package com.example.jobtracker.repository;
import com.example.jobtracker.model.JobApplication;
import java.util.List;
import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long>{
    List<JobApplication> findByStatus(String status);
}
