package com.vectorlink.grpc.company.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.experimental.Tolerate;

import  java.io.Serializable;;

@Getter @Setter @Builder
public class Dict implements Serializable {
  private Long id;
  private String name;
  private Integer state;
  @Tolerate
  public Dict() { }
}
