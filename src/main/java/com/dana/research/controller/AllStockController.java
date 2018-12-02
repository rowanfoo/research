package com.dana.research.controller;

import com.dana.research.data.entity.Allstock;
import com.dana.research.data.entity.Fundamental;
import com.dana.research.data.entity.Investigate;
import com.dana.research.data.entity.QAllstock;
import com.dana.research.data.repo.AllstockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class AllStockController {

    @Autowired AllstockRepo allstockRepo;

    @CrossOrigin
    @GetMapping("/stocks")
    public List<Allstock> allstocks(){
        List ls = allstockRepo.findAll();

        System.out.println("-------allstocks ------" + ls.size() );
        return ls;

    }

    @CrossOrigin
    @PostMapping("/stock")
    public ResponseEntity<Allstock>   createStock( @RequestBody Allstock stk){
        System.out.println("-----------------------createStocksss-----------------" + stk);
        //System.out.println("-----------------------createStock-----------------" );

//        Allstock stocks =   allstockRepo.findOne(QAllstock.allstock.code.eq(stk.getCode())).get();
//        stocks.setDescp(stk.getDescp());
//        stocks.setReason(stk.getReason());

        return new ResponseEntity<Allstock>(stk, HttpStatus.OK);

    }




}
