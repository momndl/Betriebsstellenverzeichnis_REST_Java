package de.mo.BetriebsstellenverzeichnisApi.csvReader;


import de.mo.BetriebsstellenverzeichnisApi.betriebsstelle.Betriebsstelle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {

    // Path to csv file
    String path = "src/main/java/de/mo/BetriebsstellenverzeichnisApi/CsvReader/BSV_2021_10.csv";
    ArrayList<Betriebsstelle> betriebsstellenverzeichnis = new ArrayList<>();
    Betriebsstelle betriebsstelleToReturn = new Betriebsstelle();
    String line = "";



    public Betriebsstelle searchForEntry(String query){

        try  {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while((line = br.readLine())!= null ) {
                String[] values = line.split(";");
                Betriebsstelle bahnstelle = new Betriebsstelle(
                        values[0], values[1], values[2], values[3], values[4], values[5], values[6],
                        values[7], values[8], values[9], values[10], values[11]);
                betriebsstellenverzeichnis.add(bahnstelle);
            }

            for (Betriebsstelle betriebsstelle : betriebsstellenverzeichnis) {

                if (betriebsstelle.getRl100Code().equals(query)) {

                    betriebsstelleToReturn = betriebsstelle;

                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
         return betriebsstelleToReturn;
    }


}
