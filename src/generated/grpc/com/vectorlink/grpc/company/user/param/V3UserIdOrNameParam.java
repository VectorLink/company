package com.vectorlink.grpc.company.user.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.experimental.Tolerate;

import  java.io.Serializable;;

@Getter @Setter @Builder
public class V3UserIdOrNameParam implements Serializable {
  private String idOrName;
  private com.vectorlink.core.PageQueryParam page;
  @Tolerate
  public V3UserIdOrNameParam() { }
}
