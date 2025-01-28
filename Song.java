/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String artist = "";
    private String name = "";
    private int length = 0;
    private boolean isLiked = false;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */

    /**
     * @see The length of the song is in seconds!!! Will print in toString but return an integer seconds value.
     * @param myName the name of the song
     * @param myArtist the artist of the song
     * @param myLength the length of the song (in seconds)
     */
     public Song(String myName, String myArtist, int myLength){
        name = myName;
        artist = myArtist;
        length = myLength;
     }





     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

     /**
      * 
      * @return the name of the sogn
      */
      public String getName(){
        return name;
      }
    /**
     * 
     * @return the artist of the song
     */
      public String getArtist(){
        return artist;
      }
      /**
       * 
       * @return the length of the song in seconds
       */
    public int getLength(){
        return length;
      }
      
      public void like(){
        isLiked = true;
      }

      public void removeLike(){
        isLiked =false;
      }

      public boolean isLiked(){
        return isLiked();
      }

      public String toString(){
        return(name + " by "+artist+"("+(length/60)+":"+(length%60)+")");
      }

}
