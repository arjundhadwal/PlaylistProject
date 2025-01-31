import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist{
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;
    private int totalDuration = 0;
    
    private ArrayList<Song> playlist;
    private int totalDuration = 0;
    



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
      public Playlist() {
      playlist  = new ArrayList<Song>();
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
        totalDuration = 0;
        for(int i = 0; i<playlist.size(); i++){
          totalDuration+=playlist.get(i).getLength();
        }
        System.out.println("Total duration of the songs: "+(totalDuration/60)+" mins "+(totalDuration%60)+" seconds");
      }
      





      public void removeUnlikedSongs(){
        for(int i = 0; i<playlist.size();i++){
          boolean x = playlist.get(i).isLiked();
          if(x == false){
            playlist.remove(i);
            i--;
          }
        }
        System.out.println("Removed all non-liked songs");
         
      }

    
}
