package jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        }

    public void runSim (String filename) {
        HashSet<String> h_set = new HashSet<String>();
        HashMap<String, String> h_map = new HashMap<String, String>();

        //read data from file, line by line
        String line;
        Scanner in = new Scanner(new File(filename));
        while(in.hasNext()){
            String[] values = line.split("<SEP>",4);
            //access individual values

            //set.add() the song object created from values
        }
        //run simulation now
        //System.out.println("Simulation took" + # + "second/s" );
        //System.out.println("Number of simulations run: " + #);
    }
        //for (String key : hash_map.keySet()) {
            //System.out.println(key + "Should be a string" + hash_map.get(key));
        //}

    public int getStats () {
            return 0;

    }

    public String prtStats () {
        System.out.println("Total number of songs played: " +);
        System.out.println("Average number of songs played per simulation to get duplicate: " +);
        System.out.println("Most played song: " +);
        System.out.println("All songs alphabetically by " +)
        System.out.println( + "with" +  + "plays");
        return "foo";
    }
}