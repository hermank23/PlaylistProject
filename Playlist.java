
/**
 * Write a description of class Playlist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Playlist
{
    // instance variables - replace the example below with your own
    private ArrayList<Song> songs;

    /**
     * Constructor for objects of class Playlist
     */
    public Playlist()
    {
        songs = new ArrayList<Song>();
    }
    
    //Various methods for adding songs to the playlist
    /**
     * Allows the user to add a song.
     * @param the Song object to be added
     */
    public void addSong(Song s)
    {
        songs.add(s);
    }
    /**
     * Allows the user to add a song
     * @param the song's title
     * @param the song's author
     * @param the song's duration in seconds
     * @param whether the song is liked or not
     */
    public void addSong(String title, String author, int duration, boolean liked)
    {
        songs.add(new Song(title, author, duration, liked));
    }   
    /**
     * Allows the user to add a song without specifying whether it is liked -
     * it is assumed that the song is not liked.
     * @param the song's title
     * @param the song's author
     * @param the song's duration in seconds
     */
    public void addSong(String title, String author, int duration)
    {
        songs.add(new Song(title, author, duration));
    }
    
    //Methods managing liking and unliking
    /**
     * Allows the user to set a song as liked.
     * @param the position in the list whose song will be set to liked
     */
    public void like(int position)
    {
        songs.get(position - 1).setLiked();
    }
    /**
     * Allows the user to set a song as liked.
     * @param the position in the list whose song will be set to liked
     */
    public void unlike(int position)
    {
        songs.get(position - 1).setUnliked();
    }
    
    public void remove(int position)
    {
        songs.remove(position - 1);
    }
    public String listString()
    {
        String list = "";
        for (int i = 0; i < songs.size(); i++)
        {
            list += "'" + songs.get(i).getTitle() + "'" + " by " + songs.get(i).getAuthor() + " (" + (songs.get(i).getDuration() / 60) + ":" + String.valueOf(100 + (songs.get(i).getDuration() % 60)).substring(1,3) + ")";
            if (songs.get(i).getLiked())
            {
                list += " -- liked";
            }
            list += "\n";
        }
        return list;
    }
    public String listLiked()
    {
        String list = "";
        for(int i = 0; i < songs.size(); i++)
        {
            if(songs.get(i).getLiked())
            {
                list += "'" + songs.get(i).getTitle() + "'" + " by " + songs.get(i).getAuthor() + " "  + "(" + (songs.get(i).getDuration() / 60) + ":" + String.valueOf(100 + (songs.get(i).getDuration() % 60)).substring(1,3) + ")" + " -- liked \n";
            }
        }
        return list;
    }
    public void removeUnliked()
    {
        for(int i = 0; i < songs.size(); i++)
        {
            if(!(songs.get(i).getLiked()))
            {
                songs.remove(i);
                i -= 1;
            }
        }
    }
    public String totalDuration()
    {
        int total = 0;
        for(int i = 0; i < songs.size(); i++)
        {
            total += songs.get(i).getDuration();
            
        }
        return (total / 60) + ":" + String.valueOf(100 + (total % 60)).substring(1,3);
    }
}
