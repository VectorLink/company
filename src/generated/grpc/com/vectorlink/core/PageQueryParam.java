package com.vectorlink.core;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.experimental.Tolerate;

import  java.io.Serializable;;

@Getter @Setter @Builder
public class PageQueryParam implements Serializable {
  private Integer number;
  private Integer size;
  private String orderBy;
  private Boolean isAsc;
  @Tolerate
  public PageQueryParam() { }
}
