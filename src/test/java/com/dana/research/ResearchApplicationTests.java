package com.dana.research;

import com.dana.research.controller.AllStockController;
import com.dana.research.data.entity.Allstock;
import com.dana.research.data.entity.QAllstock;
import com.dana.research.data.repo.AllstockRepo;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ResearchApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void test(){
        try {

            mockMvc.perform(put("/fundamental")
                    .param("code", "John Doe")
                    .param("notes", "rowan foo") )
                    .andDo(print()).andExpect(status().isOk());






        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Autowired AllStockController allStockController;
    @Test
    public void testx(){
        allStockController.allstocks();

    }

    @PersistenceContext
    private EntityManager em;
    @Test
    public void em(){
//        JPAQuery query=new JPAQuery(em);
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
      //  List<Allstock> stks = query.from(QAllstock.allstock).groupBy(QAllstock.allstock.subcategory).orderBy(QAllstock.allstock.subcategory.desc()).s

        List<String> stks =  queryFactory.select(QAllstock.allstock.subcategory).  from(QAllstock.allstock).groupBy(QAllstock.allstock.subcategory)
                .orderBy(QAllstock.allstock.subcategory.asc())
                .fetch();

        stks.forEach((a)->{
            System.out.println("------------------cat-----------" + a);
        });


    }


    @Autowired AllstockRepo allstockRepo;
    @Test
    public void em1(){
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        //  List<Allstock> stks = query.from(QAllstock.allstock).groupBy(QAllstock.allstock.subcategory).orderBy(QAllstock.allstock.subcategory.desc()).s

        Iterable<Allstock> stks =  allstockRepo.findAll(QAllstock.allstock.subcategory.eq("Energy"),QAllstock.allstock.marketcap.asc() );




//        List<Allstock> stks =  queryFactory. from(QAllstock.allstock).groupBy(QAllstock.allstock.subcategory)
//                .orderBy(QAllstock.allstock.subcategory.asc())
//                .fetch();

        stks.forEach((a)->{
            System.out.println("------------------cat-----------" + a);
        });


    }




}
