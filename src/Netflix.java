import java.util.ArrayList;

public class Netflix {
public static void main(String[] args) {
	NetflixQueue movies= new NetflixQueue();
	Movie a= new Movie("Avengers", 4);
	Movie b= new Movie("Thor", 5);
	Movie c= new Movie("Twilight", 5);
	Movie d= new Movie("Harry Potter", 3);
	Movie e= new Movie("Tree", 2);
System.out.println(a.getTicketPrice());
movies.addMovie(a);
movies.addMovie(b);
movies.addMovie(c);
movies.addMovie(d);
movies.addMovie(e);
movies.printMovies();
System.out.println(movies.getBestMovie());
System.out.println("The best movie is " + movies.getBestMovie() );
System.out.println("The second best movie is "+ movies.getMovie(2));


	
	
	
	
}
}
