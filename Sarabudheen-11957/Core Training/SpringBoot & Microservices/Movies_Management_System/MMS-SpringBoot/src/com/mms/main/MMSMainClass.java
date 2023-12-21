package com.mms.main;

import java.util.List;
import java.util.Scanner;

import com.mms.bean.Movies;
import com.mms.dao.MoviesDAO;

public class MMSMainClass {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		System.out.println(
				" 1.Insert Movie \n 2.Delete Movie \n 3.Update Movie \n 4.Find Movie \n 5.FindAll Movies \n 6.Exit ");
		System.out.println("===========================");
		return sc.nextInt();

	}

	public static Movies insertMovie() {
		System.out.println("Enter Movie ID,Name,Type,Language and Duration : ");
		return new Movies(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next());
	}

	public static int deleteMovie() {
		System.out.println("Enter the Movie ID : ");
		return sc.nextInt();
	}

	public static Movies updateMovie() {
		System.out.println("Enter Movie ID,Name,Type,Language and Duration : ");
		return new Movies(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next());
	}

	public static int findMovie() {
		System.out.println("Enter the Movie ID : ");
		return sc.nextInt();
	}

	public static void findAllMovies() {
	}

	public static void main(String[] args) {

		MoviesDAO dao = new MoviesDAO();
		String msg = "";

		do {

			switch (displayMenu()) {

			case 1:

				if (dao.insertMovie(insertMovie()) == 1) {
					System.out.println("Movie Inserted");
				} else {
					System.out.println("Movie Not Inserted");
				}

				break;

			case 2:

				if (dao.deleteMovie(deleteMovie()) == 1) {
					System.out.println("Movie Deleted");
				} else {
					System.out.println("Movie not found");
				}
				break;

			case 3:
				if (dao.updateMovie(updateMovie()) == 1) {
					System.out.println("Movie Updated");
				} else {
					System.out.println("Movie Not Updated");
				}
				break;

			case 4:

				int id = findMovie();
				Movies bean = dao.findMovie(id);
				if (bean != null) {
					bean.displayMovies();
				} else {
					System.out.println("Movie Not Found");
				}
				break;

			case 5:
				List<Movies> list = dao.findAllMovies();
				for (Movies e : list)
					e.displayMovies();
				break;

			case 6:
				System.exit(0);

			default:
				System.err.println("Enter Valid Choice !!!");
				System.exit(0);
				break;
			}

			System.out.println("Do you want to continue [Yes || No ] : ");
			msg = sc.next();

		} while (msg.equalsIgnoreCase("Yes"));
	}

}
