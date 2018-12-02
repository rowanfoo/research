package com.dana.research.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
public class FundCompany {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String code;
  private String year;
  private double sales;
  private double ebit;
  private double dividend;
  private double npat;
  private double eps;
  private String category;
  private double equity;
  private double asset;
  private double debt;
  private double cf;
  private double cash;
  private String descp;
  private double shares;
  private double ceosalary;
  private double chairmansalary;
  private double coosalary;
  private double cfosalary;
  private String companycol;
  private java.sql.Timestamp updatetime;



}
