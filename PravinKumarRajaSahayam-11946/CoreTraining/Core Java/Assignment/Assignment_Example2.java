
//2. Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.
import java.util.ArrayList;
import java.util.Arrays;

class Movie {
	String title;
	String director;
	ArrayList<String> actors;
	ArrayList<Review> reviews;

	Movie(String title, String director, ArrayList<String> actors) {
		this.title = title;
		this.director = director;
		this.actors = actors;
		this.reviews = new ArrayList<Review>();
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}

	public ArrayList<Review> getReviews() {
		return this.reviews;
	}

	public String getTitle() {
		return this.title;
	}

	public String getDurector() {
		return this.director;
	}

	public ArrayList<String> getActors() {
		return this.actors;
	}
}

class Review {
	String reviewText;
	String reviewerName;
	int rating;

	Review(String reviewText, String reviewerName, int rating) {
		this.reviewText = reviewText;
		this.reviewerName = reviewerName;
		this.rating = rating;
	}

	public String getReviewText() {
		return reviewText;
	}

	public String getReviewerName() {
		return reviewerName;
	}

	public int getrating() {
		return rating;
	}
}

public class Assignment_Example2 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Movie movie1 = new Movie("Titanic", "James Cameron",
				new ArrayList<String>(Arrays.asList("Leonardo DiCaprio", "Kate Winslet")));
		Review review1 = new Review("Great movie!", "Irvine Rolf", 4);
		Review review2 = new Review("Highly recommended!", "Ashkii Karlheinz", 1);
		Review review3 = new Review("A classic that never gets old.", "Nele Athol", 2);
		Review review4 = new Review("Great movie!", "Cipactli Anselma", 3);
		Review review5 = new Review("Highly recommended!", "Martin Nadine", 5);
		movie1.addReview(review1);
		movie1.addReview(review2);
		movie1.addReview(review3);
		movie1.addReview(review5);
		Movie movie2 = new Movie("The Godfather", "Francis Ford Coppola",
				new ArrayList<String>(Arrays.asList("Marlon Brando", "Al Pacino", "James Caan")));
		System.out.println("\nReviews for '" + movie1.getTitle() + "':");
		for (Review review : movie1.getReviews()) {
			System.out.println(review.getReviewerName() + "by" + review.getReviewerName() + "-" + review.getrating());
		}
		movie2.addReview(review1);
		movie2.addReview(review4);
		movie1.addReview(review3);
		System.out.println("\nReviews for '" + movie2.getTitle() + "':");
		for (Review review : movie2.getReviews()) {
			System.out.println(review.getReviewerName() + "by" + review.getReviewerName() + "-" + review.getrating());
		}
		Movie movie3 = new Movie("Avator", "James Cameron",
				new ArrayList<String>(Arrays.asList("Zoe Saldana", "Sam Worthington", "Sigourney Weaver")));
		movie3.addReview(review4);
		System.out.println("\nReviews for '" + movie3.getTitle() + "':");
		for (Review review : movie3.getReviews()) {
			System.out.println(review.getReviewerName() + "by" + review.getReviewerName() + "-" + review.getrating());
		}
	}

}