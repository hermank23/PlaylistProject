
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    //initializing instance variables
    private String title;
    private String author;
    private int duration;
    private boolean liked;
    
    /**
     * Constructor for objects of class Song
     */
    public Song(String title, String author, int duration, boolean liked)
    {
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.liked = liked;
    }
    /**
     * Overloaded constructor allowing the user not to specify like status.
     * Status is assumed to be unliked.
     */
    public Song(String title, String author, int duration)
    {
        this.title = title;
        this.author = author;
        this.duration = duration;
        this.liked = false;
    }
    
    /**
     * Methods allowing the player to get information about a given Song
     * object.
     */
    public boolean getLiked()
    {
        return liked;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getDuration()
    {
        return duration;
    }
    
        /**
     * Methods allowing the user to toggle like status.
     */
    public void setLiked()
    {
        liked = true;
    }
    public void setUnliked()
    {
        liked = false;
    }
}
