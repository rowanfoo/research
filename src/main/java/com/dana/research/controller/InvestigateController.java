package com.dana.research.controller;

import com.dana.research.data.entity.Allstock;
import com.dana.research.data.entity.Investigate;
import com.dana.research.data.entity.QAllstock;
import com.dana.research.data.entity.QInvestigate;
import com.dana.research.data.repo.InvestigateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InvestigateController {
    @Autowired
    InvestigateRepo investigateRepo;


    @CrossOrigin
    @GetMapping("/investigate/{code}")
    public Investigate investigate(@PathVariable String code){
        System.out.println("-------------------INVESTIGATE CODE--------------" + code );
       return  investigateRepo.findOne(QInvestigate.investigate.code.eq(code)).get() ;

    }

    @CrossOrigin
    @PostMapping("/investigate")//create
    public  ResponseEntity<Investigate> createInvestigate(@RequestBody Investigate invs){
        System.out.println("-----------------------createStock-----------------" + invs);
        //System.out.println("-----------------------createStock-----------------" );
//
//        Investigate investigate =   investigateRepo.findOne(QInvestigate.investigate.code.eq(invs.getCode())).get();
//
//        investigate.setCrap(invs.getCrap());
//        investigate.setWhy(invs.getWhy());
//        investigate.setWatch(invs.getWatch());
//        investigateRepo.saveAndFlush(investigate);


        return new ResponseEntity<Investigate>(invs, HttpStatus.OK);


    }





    @CrossOrigin
    @PutMapping("/investigate")
    public  ResponseEntity<Investigate> updateInvestigate(@RequestBody Investigate invs){
        System.out.println("-----------------------createStock-----------------" + invs);
        //System.out.println("-----------------------createStock-----------------" );
//
//        Investigate investigate =   investigateRepo.findOne(QInvestigate.investigate.code.eq(invs.getCode())).get();
//
//        investigate.setCrap(invs.getCrap());
//        investigate.setWhy(invs.getWhy());
//        investigate.setWatch(invs.getWatch());
//        investigateRepo.saveAndFlush(investigate);


        return new ResponseEntity<Investigate>(invs, HttpStatus.OK);


    }




}
