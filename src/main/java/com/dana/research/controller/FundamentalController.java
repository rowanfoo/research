package com.dana.research.controller;

import com.dana.research.data.entity.Fundamental;
import org.springframework.web.bind.annotation.*;

@RestController
public class FundamentalController {


    @GetMapping("/fundamental/{code}")
    public String  stock(@PathVariable("id") String  code){
        return "";
    }

    @GetMapping("/fundamentals")
    public String  allstocks(@PathVariable("id") String  code){
        return "all fundaments";
    }


    @PostMapping ("/fundamental")
    public void  createfundamental(@ModelAttribute Fundamental fund){
        System.out.println("createfundamental");
    }


    @PutMapping ("/fundamental")
    public void  updatefundamental(@ModelAttribute  Fundamental fund){
        System.out.println("  updatefundamental   " + fund);
    }
    @DeleteMapping ("/fundamental")
    public void  deletefundamental(@ModelAttribute  Fundamental fund){
        System.out.println("  updatefundamental   " + fund);
    }

}
