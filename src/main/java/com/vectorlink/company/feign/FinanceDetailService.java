package com.vectorlink.company.feign;


import com.vectorlink.common.ServiceNameConstants;
import com.vectorlink.grpc.finance.detail.FinanceDetailControllerApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = ServiceNameConstants.BASE_FINANCE)
public interface FinanceDetailService extends FinanceDetailControllerApi {
}