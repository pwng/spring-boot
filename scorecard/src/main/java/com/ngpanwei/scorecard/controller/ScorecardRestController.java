package com.ngpanwei.scorecard.controller;

import com.ngpanwei.scorecard.datastore.ScorecardGroupDataStore;
import com.ngpanwei.scorecard.model.ScorecardGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pwng on 10/01/2017.
 */
@RestController
@RequestMapping("/scorecard")
public class ScorecardRestController {
    private final Logger logger = LoggerFactory.getLogger(
            this.getClass()) ;

    @Autowired
    private ScorecardGroupDataStore scorecardGroupDataStore ;

    @RequestMapping()
    public String home() {
        return "<h1>Hello World</h1>" ;
    }
    @RequestMapping(path="/createGroup",method= RequestMethod.GET)
    public @ResponseBody ScorecardGroup createScorecardGroup(
            @RequestParam(value="name",required=false) String name) {
        logger.error("name = %"+name);
        return new ScorecardGroup(name);
    }
    @RequestMapping(value="/group/{name}",method=RequestMethod.GET)
    public ScorecardGroup createScorecardGroup2(
            @PathVariable String name) {
        logger.error("name = %"+name);
        return new ScorecardGroup(name);
    }
    public ScorecardGroup findbyName(String name) {

        return null ;
    }
}



