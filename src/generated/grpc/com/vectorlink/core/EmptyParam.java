package com.vectorlink.core;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.experimental.Tolerate;

import  java.io.Serializable;;

@Getter @Setter
public class EmptyParam implements Serializable {
  @Tolerate
  public EmptyParam() { }
}
