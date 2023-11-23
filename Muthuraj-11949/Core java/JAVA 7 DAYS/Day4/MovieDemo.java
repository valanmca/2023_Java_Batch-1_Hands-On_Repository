package Day4;
import java.util.ArrayList;

class Movie {
	 private String title;
	 private String director;
	 private ArrayList<String> actors;
	 private ArrayList<String> reviews;

	 public Movie(String title, String director) {
	 this.title = title;
	 this.director = director;
	 this.actors = new ArrayList<>();
	 this.reviews = new ArrayList<>();
	 
	 }
	 
	 // Method to add an actor to the movie this add action and display
	 public void addActor(String actor) {
	 actors.add(actor);
	 }

	 // Method to add a review for the movie
	 public void addReview(String review) {
	 reviews.add(review);
	 }

	 // Method to retrieve the title of the movie
	 public String getTitle() {
	 return title;
	 }

	 // Method to retrieve the director of the movie
	 public String getDirector() {
	 return director;
	 }

	 // Method to retrieve the list of actors in the movie
	 public ArrayList<String> getActors() {
	 return actors;
	 }

	 // Method to retrieve the list of reviews for the movie
	 public ArrayList<String> getReviews() {
	 return reviews;
	 }
	}

public class MovieDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie movie = new Movie("The Shawshank Redemption", "Frank Darabont");

		 // Add actors to the movie
		 movie.addActor("Tim Robbins");
		 movie.addActor("Morgan Freeman");

		 // Add reviews for the movie
		 movie.addReview("A masterpiece! Must-watch.");
		 movie.addReview("Great acting and storytelling.");
		 movie.addReview("Good Movie");
		 
		 // Retrieve and display movie details
		 System.out.println("Movie Title: " + movie.getTitle());
		 System.out.println("Director: " + movie.getDirector());
		 System.out.println("Actors: " + movie.getActors());
		 System.out.println("Reviews: " + movie.getReviews());
	}
}