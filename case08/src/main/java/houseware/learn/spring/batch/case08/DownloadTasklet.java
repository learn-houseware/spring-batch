package houseware.learn.spring.batch.case08;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * @author fphilip@houseware.es
 */
public class DownloadTasklet implements Tasklet {

    private String targetFile;

    private BatchService batchService;

    /* (non-Javadoc)
     * @see org.springframework.batch.core.step.tasklet.Tasklet#execute(org.springframework.batch.core.StepContribution, org.springframework.batch.core.scope.context.ChunkContext)
     */
    @Override
    public RepeatStatus execute(StepContribution contribution,
                                ChunkContext chunkContext) throws Exception {
        batchService.download(targetFile);
        return RepeatStatus.FINISHED;
    }

    public void setTargetFile(String targetFile) {
        this.targetFile = targetFile;
    }

    public void setBatchService(BatchService batchService) {
        this.batchService = batchService;
    }

}
