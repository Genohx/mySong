public class Playlist
{
    //instance variables
    private Song[] playlist;
    private int countSong;

    //constructors
    public Playlist()
    {
        playlist = new Song[4];
    }//end zero arg constructor

    public void addSong(Song aSong)
    {
        if(countSong==playlist.length)
        {
            increaseSize();
        }
        playlist[countSong] = aSong;
        countSong++;
    }

    private void increaseSize()
    {
        Song[] temp = new Song[playlist.length * 2];
        for(int s = 0; s<playlist.length; s++)
        {
            temp[s]=playlist[s];
        }//end loop moving songs from the 1st to the 2nd playlist
        playlist=temp;//changes name of the temp to playlist
    }//end method to double length of array Playlist

    //toString
    public String toString()
    {
        String output = "--------------My Playlist---------------\n";
        for (int s = 0; s< countSong; s++)
        {
            output+= playlist[s].toString() + "\n";
            output+="--------------------------------\n";

        }
        return output;
    }
}//end class Playlist
