package com.dana.research.data.repo;

import com.dana.research.data.entity.FundCompany;
import com.dana.research.data.entity.Investigate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional

public interface InvestigateRepo extends JpaRepository<Investigate,Long> , QuerydslPredicateExecutor<Investigate> {

}

