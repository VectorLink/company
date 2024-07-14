package com.vectorlink.core;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.experimental.Tolerate;

import  java.io.Serializable;;

@Getter @Setter @Builder
public class Page implements Serializable {
  private Integer number;
  private Integer size;
  private Integer pages;
  private Integer total;
  private Integer offset;
  @Tolerate
  public Page() { }
}
