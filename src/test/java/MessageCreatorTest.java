import org.junit.Assert;
import org.junit.Test;

public class MessageCreatorTest {

    @Test
    public void shouldCreateValidMessage(){
        // given
        MessageCreator messageCreator = new MessageCreator();
        // when
        String result = messageCreator.createMessage();

        // then
        Assert.assertEquals("Hello, world!", result);
    }

}