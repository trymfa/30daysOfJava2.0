import java.util.Scanner; 

/**
 * Fra video: Hands-on Java - All-in-One Tutorial Series (7 HOURS!)
 * Skriv her forrige timestamp:
 * 1:10:00
 * Ferdig med ssh
 * 
 * 
 * Write a description of class MySweetProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MySweetProgram
{
    /**
     *  Metoden her er "main"
     *  parameter holder på input 
     *  return type holder på output                                        
     *  method 
     *  void betyr uten return 
     *  static betyr at vi ikke trenger å kosntruere et objekt for å ta i bruk metoden
     */
    
   public static void main(String[] args) { 
       
       System.out.println("Seie an?????");
       
       Scanner in = new Scanner(System.in);
       String s = in.nextLine();
       
       System.out.println(s);
   }
}


