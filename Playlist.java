import java.util.ArrayList;
import java.util.List;
public class Playlist {
    private String name; // Name of the playlist

    // List to store songs in the playlist
    List<Song> songs = new ArrayList<>();

    // Constructor for the playlist
    public Playlist(String userInputName) {
        this.name = userInputName; // Set the name of the playlist
    }

    // Method to add a song to the playlist
    public void addSong(Song song) {
        songs.add(song);
    }

    // Method to remove a song from the playlist
    public void removeSong(Song song) {
        songs.remove(song);
    }

    // Method to play all songs in the playlist
    public void playAllSongs() {
        System.out.println(songs);
    }
}

