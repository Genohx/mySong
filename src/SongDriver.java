public class SongDriver
{
    public static void main(String args[])
    {
        //1) create a song
        Song someSong = new Song();
        Song fireworks = new Song("Fireworks", "Katy Perry", true, 234, 6.94);
        Song deadLochs = new Song("Deadlochs", "Blue Face", true, 150, 3.57);
        Song september = new Song("September", "Earth, Wind, and Fire", true, 236, 5.39);
        Song happySong = new Song("Moi", "The Happy Song", true);
        Song happySong2 = new Song("Moi", "The Happy Song", true);
        Song happySong3 = happySong;

        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong(fireworks);
        myPlaylist.addSong(deadLochs);
        myPlaylist.addSong(september);
        myPlaylist.addSong(happySong);
        myPlaylist.addSong(happySong2);
        System.out.println(myPlaylist.toString());

//        if(happySong == happySong2)
//        {
//            System.out.println("They are the same");
//        }
//        else
//        {
//            System.out.println("They are not the same");
//        }
//
//        if(happySong == happySong3)
//        {
//            System.out.println("They are the same");
//        }
//        else
//        {
//            System.out.println("They are not the same");
//        }

//        System.out.println("There are "+Song.getCount()+" songs");

        //4) checking other methods & properties
        //deadLochs.setLength(-5);
        //System.out.println(deadLochs);
//        fireworks.title = "Happy Song";
//        System.out.println(fireworks);
        //2) print it out
        //System.out.println(fireworks);
        //System.out.println();
        //System.out.println(deadLochs);
        //System.out.println();
        //System.out.println(september);
        //System.out.println(happySong);

        //3) test getters
//        System.out.println(fireworks.getTitle());
//        System.out.println(deadLochs.getArtist());
//        System.out.println(september.gethasLyrics());
//
//        System.out.println("In minutes: " + september.toMinSec());
        //testing setters
        //System.out.println("\n" + someSong);
        //someSong.setTitle("Plastic Bag");
        //someSong.setArtist("yaya");
        //someSong.setHasLyrics(true);
        //someSong.setLength(30);
        //someSong.setFileSize(2.34);
        //System.out.println("\n" + someSong);
    }//end main method
}//end class SongDriver(the class where things happen)
