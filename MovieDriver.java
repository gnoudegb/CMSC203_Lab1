/**
 * 
 * @author esse Noudegbessi
 * 
 */
import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
	
		String answ;
		do 
		 	{Scanner keyboard = new Scanner (System.in);
			Movie firMovie = new Movie();
			
			String firTitle, firRating;
			int firSoldTickets;
			
			System.out.println("Enter the name of a movie");
			firTitle = keyboard.nextLine();
			
			firMovie.setTitle (firTitle);
			
			System.out.println("Enter the rating of the movie");
			firRating = keyboard.nextLine();
			
			firMovie.setRating (firRating);
			
			System.out.println("Enter the number of tickets sold for this movie");
			firSoldTickets = keyboard.nextInt();
			
			firMovie.setSoldTickets (firSoldTickets);
			
			System.out.println(firMovie.getTitle() + "("+ firMovie.getRating() +"): "+ firMovie.getSoldTickets());
			
			System.out.println("Do you want to enter another movie? (y or n): ");
			keyboard.nextLine();
			answ = keyboard.nextLine();}
		while (answ == "y");

	}
	


}
