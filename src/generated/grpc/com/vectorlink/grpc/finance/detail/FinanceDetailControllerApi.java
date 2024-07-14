package com.vectorlink.grpc.finance.detail;

import com.vectorlink.common.ApiResult;
import com.vectorlink.common.PageResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


public interface FinanceDetailControllerApi {
  @RequestMapping(value = "FinanceDetail/listAllCompanyDetail", method = RequestMethod.POST)
  ApiResult<java.util.List<com.vectorlink.grpc.finance.detail.FinanceDetailModel>> listAllCompanyDetail(@RequestBody com.vectorlink.core.StringParam param);

}
