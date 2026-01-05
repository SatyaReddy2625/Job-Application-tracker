package com.example.jobtracker.model;

import java.time.LocalDate;
import jakarta.persistence.*;
/**
 * this class is used to initialize the instant variables which we can use ;
 * @author Satya reddy
 * @version 05/01/2026
 */
@Entity
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public String jobTitle;
    public String status;
    public LocalDate applicationDate;

    @Column(length = 2000)
    public String notes;

    /**
     * this method is used to get the id of the job application.
     */
    public long getId(Long id){
        return this.id = id;
    }

    /**
     * This method is used to get thr name of the company.
     */
    public String getName(String name){
        return this.name = name;
    }

    /**
     * this method is used to get the job title.
     */
    public String getJobTitle(String jobTitle){
        return this.jobTitle = jobTitle;
    }

    /**
     * this method is used to get status of the job application.
     */
    public String getStatus(String status){
        return this.jobTitle = jobTitle;
    }

    /**
     * this method is used to get the date of the application.
     */
    public LocalDate getApplicationDate(LocalDate date){
        return this.applicationDate = date;
    }

    /**
     * This method is used to get the notes on the application.
     */
    public String getNotes(String notes){
        return this.notes = notes;
    }


}
