package com.vectorlink.grpc.company.user.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.experimental.Tolerate;

import  java.io.Serializable;;

@Getter @Setter @Builder
public class BuModel implements Serializable {
  private Long userId;
  private String userName;
  private String buName;
  @Tolerate
  public BuModel() { }
}
