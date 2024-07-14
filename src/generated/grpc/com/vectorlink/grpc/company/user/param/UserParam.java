package com.vectorlink.grpc.company.user.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.experimental.Tolerate;

import  java.io.Serializable;;

@Getter @Setter @Builder
public class UserParam implements Serializable {
  private Long userId;
  private String displayName;
  private String name;
  private String password;
  private String gender;
  private Integer age;
  private Boolean is_enable;
  private String wxCpUserId;
  private java.util.List<Integer> teamIds;
  @Tolerate
  public UserParam() { }
}
