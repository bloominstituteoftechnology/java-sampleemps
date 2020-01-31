package com.lamdaschool.sampleemps.repositories;

import com.lamdaschool.sampleemps.models.JobTitle;
import org.springframework.data.repository.CrudRepository;

public interface JobTitleRepository
    extends CrudRepository<JobTitle, Long>
{
}
