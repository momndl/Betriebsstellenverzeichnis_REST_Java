package de.mo.BetriebsstellenverzeichnisApi.controller;

import de.mo.BetriebsstellenverzeichnisApi.betriebsstelle.Betriebsstelle;
import de.mo.BetriebsstellenverzeichnisApi.csvHandler.CsvHandler;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BsvController {



    @RequestMapping("/betriebsstelle")
    public String betriebsstelle(){

        return  " <div> " +
                    " <h1> to get a valid JSON response, please add the RL-100 code after /betriebsstelle </h1> " +
                    " <h2> example: betriebsstelle/XABC </h2> " +
                " </div>";

    }

    @RequestMapping("/betriebsstelle/{RL100}")
    public Betriebsstelle returnBetriebsstelle(@PathVariable("RL100") String rl100Code) {
        CsvHandler csvHandler = new CsvHandler();
        csvHandler.readCsv("src/main/resources/assets/BSV_2021_10.csv");
        return csvHandler.searchForBetriebsstelle(rl100Code);
    }

    @RequestMapping("*")
    public String greeting(){
        return  " <div> " +
                    " <h1> Welcome to BetriebsstellenverzeichnisRestApi. </h1> " +
                    " <h2> For further documentation please contact your webmaster. </h2> " +
                " </div>";
    }



}
