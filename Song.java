// Song class representing a musical track with a title, artist, and duration
public class Song {
    private String title; // Title of the song
    private String artist; // Song artist
    private double duration; // Song duration

    // Constructor to initialize a Song object with title, artist, and duration
    public Song(String userInputTitle, String artist, double duration) {
        this.title = userInputTitle; // Set the title
        this.artist = artist; // Set the artist
        this.duration = duration; // Set the duration
    }

    // Getter method for title
    public String getTitle() {
        return title; // Return the title of the song
    }

    // Getter method for artist
    public String getArtist() {
        return artist; // Return the artist of the song
    }

    // Getter method for duration
    public double getDuration() {
        return duration; // Return the duration of the song
    }

    // Override the toString method to provide a string representation of the song
    @Override
    public String toString() {
        return "\nName: " + title + "\n Artist: " + artist + "\nDuration: " + duration; // Print the song
    }
}


