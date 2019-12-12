public class Song
{
    //1) instance variables
    private String title;
    private String artist; //can also be composer
    private boolean hasLyrics;
    private int length; //in seconds
    private double fileSize; //in megaBytes
    private static int count = 0; //number of songs in my playlist

    //2) constructors
    //Overloaded constructors have early binding
    public Song()
    {
        title = null;
        artist = null;
        hasLyrics = false;
        length = 0;
        fileSize = 0.0;
        count++;
    }//end zero-arg AKA default constructor

    public Song(String title, String newArtist, boolean newHasLyrics)
    {
        this.title = title;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = 0;
        fileSize = 0.0;
        count++;
    }//end three-arg constructor

    public Song(String title, String artist, Boolean hasLyrics, int newLength, double fileSize)
    {
        this.title = title;
        this.artist = artist;
        this.hasLyrics = hasLyrics;
        this.length = checkLength(length);
        this.fileSize = fileSize;
        count++;
    }//end multi-arg constructor

    //4) Getters
    public String getTitle()
    {
        return title;
    }//end getTitle

    public String getArtist()
    {
        return artist;
    }//end getArtist

    public boolean gethasLyrics()
    {
        return hasLyrics;
    }//get hasLyrics

    public int getLength()
    {
        return length;
    }//end getLength

    public double getfileSize()
    {
        return fileSize;
    }//end getfileSize

    public static int getCount()
    {
        return count;
    }//end getCount

    //5) setters
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }//end setTitle

    public void setArtist(String newArtist)
    {
        artist = newArtist;
    }//end setArtist

    public void setHasLyrics(boolean newHasLyrics)
    {
        hasLyrics = newHasLyrics;
    }//end setHasLyrics
    //Pre-Condition: object exists
    //Post-Condition: length == newLength validated to (0,20)
    public void setLength(int newLength)
    {
        length = checkLength(newLength);
    }//end setLength
    public void setFileSize(double newFileSize)
    {
        fileSize = newFileSize;
    }//end setFileSize

    //6) Brain Methods
    public String toMinSec()
    {
        int minutes = length / 60;
        int seconds = length % 60;
        return minutes + " min " + seconds + " sec";
    }//end brain method toMinSec

    public int compareTo(Song someSong)
    {
        if(this.length < someSong.length)
        {
            return -1;
        }
        else if(this.length == someSong.length)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    /*
    checkLength is a helper method.
    It is private because it helps the other public methods by validating entry.
    This is an example of method decomposition -
    each method oes just one thing
    */
    private int checkLength(int newLength)
    {
        int tempLength = newLength;
        if(tempLength < 0)
        {
            tempLength = 0;
        }//end less than 0 if
        else if(tempLength > 1200)
        {
            tempLength = 1200;
        }//end greater than 1200 sec if
        return tempLength;
    }//end length validation method checkLength

    //3) toString(A must have for every great object class)
    public String toString()
    {
        String output = "";
        output += "Title: " + title;
        output += "\nArtist: " + artist;
        output += "\nHas Lyrics: " + hasLyrics;
        output += "\nLength: " + length;
        output += " \nFile Size: " + fileSize;
        return output;
    }//end toString

}//end class Song