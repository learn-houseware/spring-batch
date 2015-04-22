package houseware.learn.spring.springbatch.case05.test;

import houseware.learn.spring.springbatch.base.TestCaseBase;
import org.junit.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;


/**
 * @author fphilip@houseware.es
 *
 */

@ContextConfiguration(locations = "classpath:houseware/learn/spring/springbatch/case05/test/test-context.xml")
public class EJ05TestCase extends TestCaseBase {

    @Autowired
    private Job dummyJobs;

    @Test
    public void dummyJobs() throws Exception {
        JobParameters jobParameters = new JobParametersBuilder()
                				.addString("file", "my-file.txt")
                				.toJobParameters();

        jobLauncher.run(dummyJobs, jobParameters);
    }


}
