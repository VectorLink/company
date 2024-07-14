package com.vectorlink.grpc.company.user;

import com.vectorlink.common.ApiResult;
import com.vectorlink.common.PageResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


public interface CompanyControllerApi {
  @RequestMapping(value = "Company/listV3Users", method = RequestMethod.POST)
  ApiResult<com.vectorlink.grpc.company.user.param.ListUserPageRespData> listV3Users(@RequestBody com.vectorlink.grpc.company.user.param.V3UserIdOrNameParam param);

  @RequestMapping(value = "Company/addV3User", method = RequestMethod.POST)
  ApiResult addV3User(@RequestBody com.vectorlink.grpc.company.user.param.UserParam param);

  @RequestMapping(value = "Company/editV3User", method = RequestMethod.POST)
  ApiResult editV3User(@RequestBody com.vectorlink.grpc.company.user.param.UserParam param);

  @RequestMapping(value = "Company/updateV3UserQrCode", method = RequestMethod.POST)
  ApiResult updateV3UserQrCode(@RequestBody com.vectorlink.grpc.company.user.param.UserQrCodeParam param);

  @RequestMapping(value = "Company/getV3UserQrCode", method = RequestMethod.POST)
  ApiResult<String> getV3UserQrCode(@RequestBody com.vectorlink.core.IdParam param);

  @RequestMapping(value = "Company/removeV3UserQrCode", method = RequestMethod.POST)
  ApiResult removeV3UserQrCode(@RequestBody com.vectorlink.core.IdParam param);

  @RequestMapping(value = "Company/getV3UserByName", method = RequestMethod.POST)
  ApiResult<com.vectorlink.grpc.company.user.param.V3UserRespModel> getV3UserByName(@RequestBody com.vectorlink.core.StringParam param);

  @RequestMapping(value = "Company/getSysUser", method = RequestMethod.POST)
  ApiResult<com.vectorlink.grpc.company.user.param.V3UserRespModel> getSysUser(@RequestBody com.vectorlink.core.EmptyParam param);

  @RequestMapping(value = "Company/getUserList", method = RequestMethod.POST)
  ApiResult<java.util.List<com.vectorlink.grpc.company.user.param.V3UserRespModel>> getUserList(@RequestBody com.vectorlink.core.LongListParam param);

  @RequestMapping(value = "Company/getProcurePrincipalList", method = RequestMethod.POST)
  ApiResult<java.util.List<com.vectorlink.grpc.company.user.param.V3UserRespModel>> getProcurePrincipalList(@RequestBody com.vectorlink.core.EmptyParam param);

  @RequestMapping(value = "Company/listBu", method = RequestMethod.POST)
  ApiResult<java.util.List<com.vectorlink.grpc.company.user.param.BuModel>> listBu(@RequestBody com.vectorlink.core.EmptyParam param);

}
