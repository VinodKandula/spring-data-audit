package com.example.audit.article;

import javax.persistence.Entity;

import com.example.audit.Auditable;

import lombok.Data;

@Entity
@Data
public class Article extends Auditable{

  private String content;

}
