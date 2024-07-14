package com.vectorlink.grpc.company.user.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.experimental.Tolerate;

import  java.io.Serializable;;

@Getter @Setter @Builder
public class V3UserModel implements Serializable {
  private Long userId;
  private String displayName;
  private String name;
  private String password;
  private String gender;
  private Integer age;
  private Boolean is_enable;
  private String qrcode;
  private String wxCpUserId;
  private String createSourceName;
  private String createUserName;
  private String createTime;
  private java.util.List<com.vectorlink.grpc.company.model.Dict> teams;
  @Tolerate
  public V3UserModel() { }
}
