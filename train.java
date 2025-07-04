import java.util.*;
//making a ticket application
public class trainticket
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        Random rand = new Random();         //class making for taking a random number for Sl. Number
        System.out.println("********==============********");
        System.out.println("**** Welcome to India Railway ****");
        System.out.print("Number of Ticket You Want to Booking:");
        int booking = in.nextInt();
        String[] names = new String[booking];
        int[] ages = new int[booking];
        int[] serialNumbers = new int[booking];

            for (int i = 0; i < booking; i++)
            {
                  System.out.println("\nBooking ticket #" + (i + 1));
                  in.nextLine();     // Here is my error
                 System.out.print("Enter passenger name: ");
                 names[i] = in.nextLine();

                  System.out.print("Enter age: ");
                 ages[i] = in.nextInt();
                 serialNumbers[i] = rand.nextInt(9000) + 1000;
            }
        System.out.println("\n--- Booking Summary ---");
        for (int i = 0; i < booking; i++)
        {
            System.out.println("Ticket Number #" + (i + 1) );
            System.out.println("Sl. Number: "+ serialNumbers[i]);
            System.out.println("Name: "+ names[i]);
            System.out.println("Age: "+ ages[i]);
            System.out.println("Ticket Charge: 2500");
            System.out.println("Thankyou,Payment Successful..!!");
            System.out.println("---------------------------------------");
            System.out.println();
        }
        in.close();
    }
}
