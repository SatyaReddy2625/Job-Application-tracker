package com.example.jobtracker.service;
import com.example.jobtracker.model.JobApplication;
import java.util.List;
import java.util.Optional;

/**
 * This interface is used to implement the services we require for this application.
 */
public interface JobApplicationService {
    /**
     * this method creates the job application
     * @param jobApplication represents the job application
     * @return the job application.
     */
    JobApplication createJobApplication(JobApplication jobApplication);

    /**
     * this method gets all the applications
     * @return gets the applications that we applied.
     */
    List<JobApplication> getAllApplications();

    /**
     * This method is used to get the application by id
     * @param id uses this id to get the application.
     * @return gets application with id
     */
    Optional<JobApplication> getJobApplicationById(Long id);

    /**
     * This method is used to get application by status
     * @param status the status of the application
     * @return the application with status
     */
    List<JobApplication> getApplicationsByStatus(String status);

    /**
     * this method is used to delete the application using id of the application
     * @param id this represents the id of the application.
     */
    void deleteApplication(Long id);



}
