package com.dana.research.data.repo;

import com.dana.research.data.entity.Allstock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional

public interface AllstockRepo extends JpaRepository<Allstock,Long> , QuerydslPredicateExecutor<Allstock> {

}



