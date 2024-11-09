import java.util.ArrayList;
import java.util.List;
public class User {
    private String username; // Username of the user
    Playlist playlist; // Current playlist
    List<Playlist> playlists = new ArrayList<Playlist>(); // List to store multiple playlists

    // Method to create a new playlist based on the specified type
    public Playlist createPlaylist(String name, String type) {
        // Check the type and create the corresponding playlist
        if (type.equals("Jazz")) {
            playlist = new JazzPlaylist(name); // Create a Jazz playlist
            playlists.add(playlist); // Add the created playlist to the list
        }
        else if (type.equals("Rock")) {
            playlist = new RockPlaylist(name); // Create a Rock playlist
            playlists.add(playlist); // Add the created playlist to the list
        }
        else if (type.equals("Pop")) {
            playlist = new PopPlaylist(name); // Create a Pop playlist
            playlists.add(playlist); //Add the created playlist to the list
        }
        else {
            System.out.println("Playlist cannot be created");
        }
        return playlist; // Return the created playlist (or null if invalid type)
    }

    // Method to delete a playlist
    public void deletePlaylist(Playlist playlist) {
        playlists.remove(playlist); // Remove the playlist from the list
    }

    // Method to add a song to the playlist
    public void addSongToPlaylist(Playlist playlist, Song song) {
        playlist.addSong(song);
    }

    // Method to remove a song from the playlist
    public void removeSongFromPlaylist(Playlist playlist, Song song) {
        playlist.removeSong(song);
    }
}

