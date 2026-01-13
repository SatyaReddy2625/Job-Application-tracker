package com.example.jobtracker.controller;
import com.example.jobtracker.exception.ResourceNotFoundException;
import com.example.jobtracker.model.JobApplication;
import  com.example.jobtracker.service.JobApplicationService;
import org.springframework.web.bind.annotation.*;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.List;

/**
 * This class works as a controller tho the application.
 */
@RestController //Combines @Controller + @ResponseBody
@RequestMapping("/api/applications")
public class JobApplicationController {
    private final JobApplicationService service;

    /**
     * initializing the JobapplicationService
     * @param service this represents the service class that we have
     */
    public JobApplicationController(JobApplicationService service) {
        this.service = service;
    }

    /**
     * This method handles HTTP Post requests.
     * @param application the application we need to create
     * @return the application which is created
     * @RequestBody Combines @Controller + @ResponseBody
     * @PostMapping is gonna create the mapping after creating the aplication
     */
    @PostMapping
    public JobApplication createApplication(@RequestBody JobApplication application){
        return service.createJobApplication(application);
    }

    /**
     * This method handles HTTP GET requests to fetch
     * @return all the applications that are created
     * @GetMapping gets the Mapping to the method get all applications
     */
    @GetMapping
    public List<JobApplication> getAllApplications(){
        return service.getAllApplications();
    }

    /**
     * This method handles HTTP GET requests to fetch
     * @param id a single JobApplication using its ID
     * @return Call the service layer to find a JobApplication by ID.
     *     // The service returns an Optional<JobApplication>
     *     // because the record may or may NOT exist in the database.
     * @PathVariavle Extracts values from URL
     */
    @GetMapping("/{id}")
    public JobApplication getApplicationById(@PathVariable Long id){
        return service.getJobApplicationById(id).orElseThrow(()-> new ResourceNotFoundException("Application Not Found"));
    }

    /**
     *This method handles HTTP GET requests to fetch
     * @param status getting application using status
     * @return gets the application by calling the service layer
     */
    @GetMapping("/status/{status}")
    public List<JobApplication> getApplicationByStatus(@PathVariable String status){
        return service.getApplicationsByStatus(status);
    }

    /**
     * This method handles HTTP delete requests to delete the application
     * @param id using id we can delete the application
     */
    @DeleteMapping
    public void deleteApplication(@PathVariable Long id){
        service.deleteApplication(id);
    }

}
