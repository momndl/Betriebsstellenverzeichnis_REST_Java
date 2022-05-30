package de.mo.BahnstellenverzeichnisApi.controller;

import de.mo.BahnstellenverzeichnisApi.CsvReader.CsvReader;
import de.mo.BahnstellenverzeichnisApi.bahnstelle.Betriebsstelle;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BsvController {

    @RequestMapping("/betriebsstelle")
    public String greetinag(){
        return  " <div> " +
                    " <h1> to get a valid JSON response, please add the RL-100 code after /betriebsstelle </h1> " +
                    " <h2> example: betriebsstelle/XABC </h2> " +
                " </div>";

    }

    @RequestMapping("/betriebsstelle/{RL100}")
    public Betriebsstelle returnBetriebsstelle(@PathVariable("RL100") String rl100) {
        CsvReader reader = new CsvReader();

        return reader.searchForEntry(rl100);
    }

    @RequestMapping("*")
    public String greeting(){
        return  " <div> " +
                    " <h1> Welcome to BetriebsstellenverzeichnisRestApi. </h1> " +
                    " <h2> For further documentation please contact your webmaster. </h2> " +
                " </div>";
    }



}
