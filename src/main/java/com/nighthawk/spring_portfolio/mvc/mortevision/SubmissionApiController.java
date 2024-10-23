package com.nighthawk.spring_portfolio.mvc.mortevision;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/submissions")
public class SubmissionApiController {

    @Autowired
    private AssignmentJpaRepository repository_assign;

    @Autowired
    private SubmissionJpaRepository repository_sub;
    // GET queue for a specific assignment
    

    // GET all assignments

    @PostMapping("/Submit")
    public ResponseEntity<Submission> createAssignment(@RequestBody Submission submission) {
        repository_sub.save(submission);
        return new ResponseEntity<>(submission, HttpStatus.CREATED);
    }

    


    

}
