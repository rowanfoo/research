package com.dana.research.data.repo;

import com.dana.research.data.entity.Allstock;
import com.dana.research.data.entity.Fundamental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional

public interface FundamentalRepo extends JpaRepository<Fundamental,Long> , QuerydslPredicateExecutor<Fundamental> {

}

