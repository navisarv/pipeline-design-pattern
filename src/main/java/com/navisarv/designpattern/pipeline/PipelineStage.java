package com.navisarv.designpattern.pipeline;

public interface PipelineStage {
	PipelineContext execute(PipelineContext context);
	
	default PipelineStage pipe(PipelineStage predecessor) {
		return successor -> predecessor.execute(execute(successor));
	}
	
	static PipelineStage of(PipelineStage input) {
		return input;
	}
}
