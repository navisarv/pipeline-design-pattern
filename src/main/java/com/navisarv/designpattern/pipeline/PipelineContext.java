package com.navisarv.designpattern.pipeline;

import java.util.List;

public interface PipelineContext {
	
	List<PipelineError> getErrors();
	void addError(PipelineError error);
}
