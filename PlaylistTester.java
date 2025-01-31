/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist p = new Playlist();
        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */

         p.Add(new Song("Thick Of It", "KSI", 300)); //0
         p.Add(new Song("Get lucky", "Daft Punk", 143)); //1
         p.Add(new Song("Shape of You", "Ed Sheeran", 233)); //2
         p.Add(new Song("Blinding Lights", "The Weeknd", 200)); //3
         p.Add(new Song("Levitating", "Dua Lipa", 203)); //4
         p.Add(new Song("Bad Guy", "Billie Eilish", 194)); //5
         p.Add(new Song("Uptown Funk", "Mark Ronson ft. Bruno Mars", 269)); //6
         p.Add(new Song("Rolling in the Deep", "Adele", 228)); //7
         p.Add(new Song("Thank U, Next", "Ariana Grande", 228)); //8
         p.Add(new Song("Watermelon Sugar", "Harry Styles", 174)); //9



        System.out.println("Printing the songs...\n");
        p.ExaminingSongs();


        System.out.println("\nLiking the songs in position 2, 6, 7 \n");
        p.LikeSong(2); //liking Shape Of You
        p.LikeSong(6); //liking Uptown Funk
        p.LikeSong(7); //liking Rolling in the Deep

        System.out.println("Printing the songs...\n");
        p.ExaminingSongs();

        System.out.println("\nRemoving the song in position 0, 5, 9 \n");


        System.out.println("Printing the songs...\n");


        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!


        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds


        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
    }
}
