package de.mo.BetriebsstellenverzeichnisApi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import de.mo.BetriebsstellenverzeichnisApi.betriebsstelle.Betriebsstelle;
import de.mo.BetriebsstellenverzeichnisApi.csvHandler.CsvHandler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class BsvController {

    @RequestMapping("/betriebsstelle")
    public String betriebsstelle(){

        String headline = "to get a valid JSON response, please add the RL-100 code after /betriebsstelle";
        String h2 = "example: betriebsstelle/XABC";

        return  " <div> " +
                    " <h1> " + headline + " </h1> " +
                    " <h2> " + h2 + " </h2> " +
                " </div>";
    }

    @RequestMapping("/betriebsstelle/{RL100}")
    public Betriebsstelle returnBetriebsstelle(@PathVariable("RL100") String rl100Code){

        CsvHandler csvHandler = new CsvHandler();

        // change pathToFile here if you want to load another file
        csvHandler.readCsv("src/main/resources/assets/BSV_2021_10.csv");

        return csvHandler.searchForBetriebsstelle(rl100Code);
    }

    @RequestMapping("*")
    public String greeting(){

        String headline = "Welcome to BetriebsstellenverzeichnisRestApi.";
        String h2 = "For further documentation please contact your webmaster.";

        return  " <div> " +
                " <h1> " + headline + " </h1> " +
                " <h2> " + h2 + " </h2> " +
                " </div>";
    }
}
