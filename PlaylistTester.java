
/**
 * Write a description of class PlaylistTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlaylistTester
{
    public static void main(String[] args)
    {
        System.out.println("Creating a Playlist...");
        Playlist p = new Playlist();
        System.out.println("Adding Song objects...");
        p.addSong(new Song("songtitle", "songauthor", 483));
        p.addSong(new Song("Flouring With You", "Pedro Silva", 289, true));
        System.out.println("Testing listString() method...");
        System.out.println("Expected:");
        System.out.println("'songtitle' by songauthor (8:03)\n'Flouring With You' by Pedro Silva (4:49) -- liked");
        System.out.println("Recieved:");
        System.out.println(p.listString());
        
        System.out.println("Testing like() and unlike() methods...");
        p.like(1);
        p.unlike(2);
        System.out.println("Expected:");
        System.out.println("'songtitle' by songauthor (8:03) -- liked\n'Flouring With You' by Pedro Silva (4:49)");
        System.out.println("Recieved:");
        System.out.println(p.listString());
        
        System.out.println("Testing listLiked() method...");
        System.out.println("Expected:");
        System.out.println("'songtitle' by songauthor (8:03) -- liked");
        System.out.println("Recieved:");
        System.out.println(p.listLiked());
        
        System.out.println("Testing totalDuration() method...");
        System.out.println("Expected:");
        System.out.println("12:52");
        System.out.println("Recieved:");
        System.out.println(p.totalDuration());
        System.out.println("");
        
        System.out.println("Testing removeUnliked() method...");
        p.removeUnliked();
        System.out.println("Expected:");
        System.out.println("'songtitle' by songauthor (8:03) -- liked");
        System.out.println("Recieved:");
        System.out.println(p.listString());
        System.out.println("Adding more songs...");
        p.addSong(new Song("It Means Everything", "OMOCAT", 176, false));
        System.out.println("New list of songs:");
        System.out.println(p.listString());
        
        System.out.println("Testing remove() method by removing the first song...");
        p.remove(1);
        System.out.println("Expected:");
        System.out.println("'It Means Everything' by OMOCAT (2:56)");
        System.out.println("Recieved:");
        System.out.println(p.listString());
    }
}
