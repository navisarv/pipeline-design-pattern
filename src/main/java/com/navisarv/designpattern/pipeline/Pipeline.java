package com.navisarv.designpattern.pipeline;

public interface Pipeline {
	Pipeline pipe(PipelineStage stage);
	Pipeline pipeOnError(PipelineStage errorStage);
	Pipeline pipeFinal(PipelineStage finalStage);
	Pipeline nestPipeline(Pipeline nestedPipeline);
	
	PipelineContext execute(PipelineContext context);
	

}
