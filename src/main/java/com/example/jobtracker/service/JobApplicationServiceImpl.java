package com.example.jobtracker.service;
import com.example.jobtracker.model.JobApplication;
import com.example.jobtracker.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *this class is used to implement the service that we require for our application.
 */
@Service
public class JobApplicationServiceImpl implements JobApplicationService{

    private final JobApplicationRepository repository;

    public JobApplicationServiceImpl(JobApplicationRepository repository) {
        this.repository = repository;
    }

    @Override
    public JobApplication createJobApplication(JobApplication application) {
        return repository.save(application);
    }

    @Override
    public List<JobApplication> getAllApplications() {
        return repository.findAll();
    }

    @Override
    public Optional<JobApplication> getJobApplicationById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<JobApplication> getApplicationsByStatus(String status) {
        return repository.findByStatus(status);
    }

    @Override
    public void deleteApplication(Long id) {
        repository.deleteById(id);

    }
}
