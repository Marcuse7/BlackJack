import org.junit.Assert;
import org.junit.Test;

public class ParticipantTest {
Participant participant = new Participant();
Card testCard = new Card(13, 1, 10);
    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(0, participant.getSum());
        Assert.assertEquals("", participant.toString());
        participant.takeCard(testCard);
        Assert.assertEquals(10, participant.getSum());
    }

    // TODO
}