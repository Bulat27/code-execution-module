package com.judge0.sample_code_execution.services;

import com.judge0.sample_code_execution.model.Response;
import com.judge0.sample_code_execution.model.StatusToken;
import com.judge0.sample_code_execution.model.SubmissionParameter;


public interface CodeExecutionService {

    Response submitCode(SubmissionParameter submissionParameter);
}
