import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		String movieName;
		String ratingName;
		int numTickets;
		String answer;
		
		Scanner keyboard = new Scanner(System.in);
		do {
		Movie movie = new Movie();

		System.out.println("Enter the name of the movie: ");
		movieName=keyboard.nextLine();
		movie.setTitle(movieName);
		
		System.out.println("Enter the rating of the movie: ");
		ratingName=keyboard.nextLine();
		movie.setRating(ratingName);
		
		System.out.println("Enter the number of tickets sold for this movie: ");
		numTickets=keyboard.nextInt();
		movie.setSoldTickets(numTickets);
		
		System.out.println(movie.toString());		
		keyboard.nextLine();
		System.out.println("Do you want to enter another? YES or NO");

		answer=keyboard.nextLine();	

	    }while(answer.equalsIgnoreCase("yes")); 		
        keyboard.close();
		System.out.println("Good bye");
	}

}
