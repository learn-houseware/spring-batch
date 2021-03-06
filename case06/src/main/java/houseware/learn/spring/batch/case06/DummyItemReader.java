package houseware.learn.spring.batch.case06;

import lombok.Getter;
import lombok.Setter;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * @author fphilip@houseware.es
 */
public class DummyItemReader implements ItemReader<Dummy> {
    private long i = 1;
    @Getter @Setter
    private long size=100;
    @Override
    public Dummy read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (i > size) {
            return null;
        }

        return new Dummy(i++);
    }
}
