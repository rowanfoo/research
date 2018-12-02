package com.dana.research.controller;

import com.dana.research.data.entity.Allstock;
import com.dana.research.data.entity.QAllstock;
import com.dana.research.data.repo.AllstockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AllStockServiceController {

    @Autowired
    AllstockRepo allstockRepo;

//    @CrossOrigin
//    @GetMapping("/stocks/category")
//    public List<Allstock> allstocks(){
//        List ls = allstockRepo.findAll();
//        allstockRepo.findAll(QAllstock.allstock.code.)
//        System.out.println("-------allstocks ------" + ls.size() );
//        return ls;
//
//    }



}
