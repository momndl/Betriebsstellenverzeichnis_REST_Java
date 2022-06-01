package de.mo.BetriebsstellenverzeichnisApi.csvHandler;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.JSONPObject;
import de.mo.BetriebsstellenverzeichnisApi.betriebsstelle.Betriebsstelle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvHandler {

    private ArrayList<Betriebsstelle> betriebsstellenverzeichnis = new ArrayList<>();
    private String line = "";
    // seperator used in the readCsv method
    private String seperator = ";";

    public void readCsv(String pathToFile) {
        try  {
            BufferedReader br = new BufferedReader(new FileReader(pathToFile));

            while((line = br.readLine())!= null ) {
                String[] values = line.split(seperator);

                Betriebsstelle betriebsstelle = new Betriebsstelle(
                        values[0], values[1], values[2], values[3], values[4], values[5], values[6],
                        values[7], values[8], values[9], values[10], values[11]);

                betriebsstellenverzeichnis.add(betriebsstelle);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }

    public Betriebsstelle searchForBetriebsstelle(String rl100Code) {

        for (Betriebsstelle betriebsstelle : betriebsstellenverzeichnis) {
            if (betriebsstelle.getRl100Code().equals(rl100Code)) {
                return betriebsstelle;
            }
        }
        return new Betriebsstelle();
    }
}
