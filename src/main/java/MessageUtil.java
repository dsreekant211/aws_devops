public class MessageUtil {
  private String message;

  public MessageUtil(String message) {
    this.message = message;
  }

  public String printMessage() {
    System.out.println(message);
    return message;
  }

  public String salutationMessage() {
<<<<<<< HEAD
    message = "Hellooooo!" + message;
=======
    message = "Hello!" + message;
>>>>>>> c62e23b993bfdc46ba49f68636ebf3cab1daf5cb
    System.out.println(message);
    return message;
  }
}
