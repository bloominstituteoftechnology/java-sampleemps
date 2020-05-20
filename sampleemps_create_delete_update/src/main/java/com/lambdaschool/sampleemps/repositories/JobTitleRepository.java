package com.lambdaschool.sampleemps.repositories;

import com.lambdaschool.sampleemps.models.JobTitle;
import org.springframework.data.repository.CrudRepository;

public interface JobTitleRepository
    extends CrudRepository<JobTitle, Long>
{
}
