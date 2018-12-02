package com.dana.research.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
public class Investigate {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private java.sql.Date date;
  private String code;
  private String reason;
  private String crap;
  private String watch;
  private String why;
  private String type;




}
