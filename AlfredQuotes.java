import java.text.DateFormat;
import java.util.Date;

public class AlfredQuotes {

    public static void main(String[] args) {
        
    }
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello, %s!", name);
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }

    public String respondBeforeAlexis(String alfredQuotes) {
        
        boolean alexisTest = true;
        boolean alfredTest = true;
        // boolean notRelevantTest = true;

        if (alexisTest) {
            System.out.println("Alexis! Play some low-fi beats.");
        } else if (alfredTest) {
            System.out.println("I can't find my yo-yo. Maybe Alfred will know where it is.");
        } else  {
            System.out.println("Maybe that's what Batman is about. Not winning. But failing.");
        }

        return (alfredQuotes);
    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method()
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
}
