/*
*This is the driver class for the movie class
*
*/
import java.util.Scanner;
public class MovieDriver2{
    public static void main(String[] args){
    
        Scanner stdin = new Scanner(System.in);
        Movie mov = new Movie();
        char cont = 'y';

        //main loop
        while(cont == 'y'){     
            //clearing scanner cache   
            stdin.nextLine();                

            //reading input for title and setting it to the movie object
            System.out.println("Enter the title of a movie: ");
            String title = stdin.nextLine();
            mov.setTitle(title);

            //reading user input for rating and setting it to movie object
            System.out.println("Enter the movie's rating: ");
            String rating = stdin.nextLine();
            mov.setRating(rating);

            //reading user input for num tickets
            System.out.println("Enter the number of tickets sold: ");
            int ticketsSold = stdin.nextInt();
            mov.setSoldTickets(ticketsSold);

            //using the Movie class's get method
            System.out.println(mov.getTitle() + " (" + mov.getRating() + "): Tickets Sold: " + mov.getSoldTickets());

            //ask if user wants to continue
            System.out.println("Do you want to enter another? (y or n)");
            cont = stdin.next().charAt(0);


        }
        
        System.out.println("Goodbye");

    }
}


