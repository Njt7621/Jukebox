package jukebox;


/**
 * A Song whose instances can be compared by artist, then by song.
 */
public class Song implements Comparable< Song > {
    private String artist;
    private String song;

    /**
     * Create a Song
     * @param artist
     * @param song
     * */
    public Song(String artist, String song) {
        this.artist = artist;
        this.song = song;
    }
    /** song accessor */
    public String getSong() {
        return song;
    }
    /** artist accessor */
    public String getArtist() {

        return artist;
    }

    /**
     * Compare two Song's for equality.
     * @return true if other is a Song
     *    and if the artist and song are equal
     */
    @Override
    public boolean equals( Object other ) {
        if ( other instanceof Song ) {
            Song otherP = (Song)other;
            return artist.equals( otherP.artist ) && song.equals(otherP.song);
        }
        return false;
    }

    /**
     *  It hashes a Song.
     *  @return the artist hash codes plus the song hash codes
     */
    @Override
    public int hashCode(){
        return artist.hashCode() + song.hashCode();
    }

    /**
     * Compare two Song, favoring the artist.
     * @return first songs are compared alphabetically by artist
     * name. If the artist is the same, the songs are compared
     * alphabetically
     */
    @Override
    public int compareTo(Song other) {
        int result = artist.compareTo( other.artist );
        if ( result == 0 ) {
            result = song.compareTo( other.song );
        }
        return result;
    }
}
