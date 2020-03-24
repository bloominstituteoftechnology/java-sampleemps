package com.lambdaschool.sampleemps.controllers;

import com.lambdaschool.sampleemps.models.JobTitle;
import com.lambdaschool.sampleemps.services.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobtitles")
public class JobTitleController
{
    @Autowired
    private JobTitleService jtService;

    @PutMapping(value = "/jobtitle/{jobtitlesid}",
        consumes = {"application/json"})
    public ResponseEntity<?> putUpdateJobTitle(
        @PathVariable
            long jobtitlesid,
        @RequestBody
            JobTitle newJT)
    {
        newJT = jtService.update(jobtitlesid,
            newJT);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping(value = "/jobtitle/{jobtitlesid}",
        consumes = {"application/json"})
    public ResponseEntity<?> patchUpdateJobTitle(
        @PathVariable
            long jobtitlesid,
        @RequestBody
            JobTitle newJT)
    {
        newJT = jtService.update(jobtitlesid,
            newJT);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

