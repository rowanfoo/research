package com.dana.research.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Allstock {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String code;
  private String name;
  private String subcategory;
  private Double yearlow;
  private Double pe;
  private Double eps;
  private Double dividend;
  private Long dailyvol;
  private Double yearchangepercentage;
  private Long shares;
  private Long marketcap;
  private String tolook;
  private String top;
  private String descp;
  private String reason;
  private String tags;



}
