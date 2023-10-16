//6. Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.
import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {
	private ArrayList<Songs> songs;

	public MusicLibrary() {
		this.songs = new ArrayList<Songs>();
	}

	public void addSongs(Songs song) {
		songs.add(song);
	}

	public void removeSongs(Songs song) {
		songs.remove(song);
	}

	public ArrayList<Songs> getSongs() {
		return songs;
	}

	public void playRandomSongs() {
		int size = songs.size();
		if (size == 0) {
			System.out.println("No Songs in the Library");
			return;
		}
		Random rand = new Random();
		int index = rand.nextInt(size);
		System.out.println("The Song is now Playing : " + " " + songs.get(index).getTitle() + " " + "by" + " "
				+ songs.get(index).getArtist());
	}
}

class Songs {
	String Title;
	String Artist;

	public Songs(String Title, String Artist) {
		this.Title = Title;
		this.Artist = Artist;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String Artist) {
		this.Artist = Artist;
	}
}

public class Assignment_Example6 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		MusicLibrary musiclibrarys = new MusicLibrary();
		musiclibrarys.addSongs(new Songs("Avator", "James Cameron"));
		musiclibrarys.addSongs(new Songs("Antakshari", "Vipin Das"));
		musiclibrarys.addSongs(new Songs("Hayyoda", "Anirudh Ravichander"));
		System.out.println("All Songs");
		for (Songs song : musiclibrarys.getSongs()) {
			System.out.println(song.getTitle() + " " + "by" + " " + song.getArtist());
		}
		System.out.println("\n**Playing Random Songs**");
		musiclibrarys.playRandomSongs();
		System.out.println();
		musiclibrarys.playRandomSongs();
		/*System.out.println();
		musiclibrarys.playRandomSongs();
		a*/
	}

}