package com.vectorlink.grpc.company.user.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.experimental.Tolerate;

import  java.io.Serializable;;

@Getter @Setter @Builder
public class V3UserRespModel implements Serializable {
  private Long userId;
  private String userDisplayName;
  private String userName;
  private java.util.List<com.vectorlink.grpc.company.model.Dict> teams;
  @Tolerate
  public V3UserRespModel() { }
}
