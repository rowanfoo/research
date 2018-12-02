package com.dana.research.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
public class Fundamental {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String code;
  private java.sql.Date date;
  private long shares;
  private long sales;
  private String ebitda;
  private long ebit;
  private long cf;
  private double pe;
  private double eps;
  private long cash;
  private long debt;
  private long equity;
  private long assets;
  private String notes;
  private String founder;
  private String management;



}
