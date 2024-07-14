package com.vectorlink.grpc.company.user.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.experimental.Tolerate;

import  java.io.Serializable;;

@Getter @Setter @Builder
public class ListUserPageRespData implements Serializable {
  private com.vectorlink.core.Page page;
  private java.util.List<com.vectorlink.grpc.company.user.model.V3UserModel> items;
  @Tolerate
  public ListUserPageRespData() { }
}
