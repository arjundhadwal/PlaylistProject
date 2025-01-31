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
      public Playlist() {
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

      public void LikeSong(int index){
        playlist.get(index).like();
      }

      public void RemoveSong(int index){
        playlist.remove(index);
      }

      public void ExaminingSongs(){
        System.out.println("Showing all songs: ");
        for(int i = 0; i<playlist.size();i++){
          System.out.println(playlist.get(i));
        }
      }

      public void ExaminingLikedSongs(){
        System.out.println("Showing all liked songs: ");
        for(int i = 0; i<playlist.size();i++){
          boolean x = playlist.get(i).isLiked();
          if(x == true){
            System.out.println(playlist.get(i));
          }
        }
      }



      public void TotalDuration(){
        System.out.println("Listing Songs and they durations");
        for(int i = 0; i<playlist.size();i++){
          int x = playlist.get(i).getLength();
          String y = playlist.get(i).getName();
          System.out.println(y + ", " + x + "minutes");
        }
      }
      





      public void removeUnlikedSongs(){
        System.out.println("Removing all non-liked songs");
        for(int i = 0; i<playlist.size();i++){
          boolean x = playlist.get(i).isLiked();
          if(x == false){
            playlist.remove(i);
          }
        }
         
      }

    
}
