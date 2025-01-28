import java.util.ArrayList;
import java.util.*;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist = new ArrayList<Song>();
    



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
      public Playlist(ArrayList<Song> Skib) {
        playlist = Skib;
      }


      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!
       */
      public void Add(Song mySong){
        playlist.add(mySong);
      }

      public void LikeSong(Song mySong){
        mySong.like();
      }

      public void RemoveSong(Song mySong){
        for(int i = 0; i<playlist.size();i++){
          if(playlist.get(i).equals(mySong)){
            playlist.remove(i);
          }
        }
      }

      public void ExaminingSongs(Song mySong){
        System.out.println("Showing all songs: ");
        for(int i = 0; i<playlist.size();i++){
          System.out.println(playlist.get(i));
        }
      }
}
