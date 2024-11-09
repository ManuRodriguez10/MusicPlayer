public class Main {
    public static void main (String[] args) {
        // Initialize the user with a username
        User currentUser = new User();

        // Songs for the playlist (Only doing pop for this example)
        Song song1 = new Song("One Kiss", "Calvin Harris", 3.34);
        Song song2 = new Song("Treasure", "Bruno Mars", 2.58);
        Song song3 = new Song("Blinding Lights", "The Weeknd", 3.20);

        // Create a pop playlist using the User class method
        Playlist popPlaylist = currentUser.createPlaylist("Pop Playlist", "Pop");

        // Add songs to the playlist
        currentUser.addSongToPlaylist(popPlaylist, song1);
        currentUser.addSongToPlaylist(popPlaylist, song2);
        currentUser.addSongToPlaylist(popPlaylist, song3);

        // Play all songs in the playlist
        System.out.println("Playing songs in the playlist:");
        popPlaylist.playAllSongs();

        // Delete a song from the playlist
        currentUser.removeSongFromPlaylist(popPlaylist, song1);

        // Play all songs after deletion
        System.out.println("\nPlaying songs currently in the playlist:");
        popPlaylist.playAllSongs();

        // Delete the playlist
        currentUser.deletePlaylist(popPlaylist);
    }
}
