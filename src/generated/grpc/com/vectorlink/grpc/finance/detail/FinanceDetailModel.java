package com.vectorlink.grpc.finance.detail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.experimental.Tolerate;

import  java.io.Serializable;;

@Getter @Setter @Builder
public class FinanceDetailModel implements Serializable {
  private Integer companyId;
  private String companyName;
  private Double financeDetail;
  private String operator;
  @Tolerate
  public FinanceDetailModel() { }
}
