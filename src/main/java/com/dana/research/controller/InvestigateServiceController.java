package com.dana.research.controller;

import com.dana.research.data.entity.Investigate;
import com.dana.research.data.entity.QInvestigate;
import com.dana.research.data.repo.InvestigateRepo;
import org.glassfish.jersey.internal.guava.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InvestigateServiceController {
@Autowired
    InvestigateRepo investigateRepo;
    @CrossOrigin
    @GetMapping("/reinvestigate")
    public List<Investigate>  getallreinvestigate(){
        return  Lists.newArrayList( investigateRepo.findAll( QInvestigate.investigate.watch.isNull()  ));

    }
}
