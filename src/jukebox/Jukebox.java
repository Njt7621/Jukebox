package jukebox;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        //runSim();
        prtStats();
        }

    /**
     * A Song whose instances can be compared by artist, then by song.
     */
    public void runSim (String filename) throws FileNotFoundException {
        HashSet<String> h_set = new HashSet<String>();
        HashMap<Song, Integer> h_map = new HashMap<Song, Integer>();

        //read data from file, line by line
        String line;
        Scanner in = new Scanner(new File(filename));
        while(in.hasNext()){
            line= in.nextLine();
            String[] values = line.split("<SEP>",4);
            //access individual values
            String song = values[0];
            String artist = values[1];
            Song t = new Song( song, artist);
            h_map.put(t, 0);

        }
        //run simulation now
        System.out.println("Jukebox of " + "songs starts rockin'...");
        System.out.println("Simulation took " + " second/s" );
        System.out.println("Number of simulations run: " );
    }
        //for (String key : hash_map.keySet()) {
            //System.out.println(key + "Should be a string" + hash_map.get(key));
        //}

    /**
     * A Song whose instances can be compared by artist, then by song.
     */
    public int getStats () {
        //to acess random songs:
        //hashmap.get(randomnumber)

        //get total number of songs played:


        //get average num of songs per simulation:
        //(totSong/50000)

        //get most played song:
        return 0;

    }

    /**
     * A Song whose instances can be compared by artist, then by song.
     */
    public static String prtStats() {
        System.out.println("Total number of songs played: " );
        System.out.println("Average number of songs played per simulation to get duplicate: " );
        System.out.println("Most played song: " );
        System.out.println("All songs alphabetically by " );
        System.out.println( " with "+" plays");
        return "foo";
    }
}