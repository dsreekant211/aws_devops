import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestMessageUtil {

  String message = "Robert";    
  MessageUtil messageUtil = new MessageUtil(message);
   
  @Test
  public void testPrintMessage() {      
    System.out.println("Inside testPrintMessage()");     
    assertEquals(message,messageUtil.printMessage());
  }

  @Test
  public void testSalutationMessage() {
    System.out.println("Inside testSalutationMessage()");
<<<<<<< HEAD
    message = "from terraform" + "sreekanth";
=======
    message = "Hello!" + "Robert";
>>>>>>> c62e23b993bfdc46ba49f68636ebf3cab1daf5cb
    assertEquals(message,messageUtil.salutationMessage());
  }
}
