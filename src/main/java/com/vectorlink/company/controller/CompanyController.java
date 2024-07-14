package com.vectorlink.company.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import com.vectorlink.common.ApiResult;
import com.vectorlink.company.feign.FinanceDetailService;
import com.vectorlink.core.EmptyParam;
import com.vectorlink.core.IdParam;
import com.vectorlink.core.LongListParam;
import com.vectorlink.core.Page;
import com.vectorlink.core.StringParam;
import com.vectorlink.grpc.company.user.CompanyControllerApi;
import com.vectorlink.grpc.company.user.model.V3UserModel;
import com.vectorlink.grpc.company.user.param.BuModel;
import com.vectorlink.grpc.company.user.param.ListUserPageRespData;
import com.vectorlink.grpc.company.user.param.UserParam;
import com.vectorlink.grpc.company.user.param.UserQrCodeParam;
import com.vectorlink.grpc.company.user.param.V3UserIdOrNameParam;
import com.vectorlink.grpc.company.user.param.V3UserRespModel;
import com.vectorlink.grpc.finance.detail.FinanceDetailModel;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "公司信息")
@RestController
public class CompanyController implements CompanyControllerApi {
    @Resource
    private FinanceDetailService financeDetailService;
    @Override
    @ApiOperation("获取公司的所有的人员信息")
    public ApiResult<ListUserPageRespData> listV3Users(V3UserIdOrNameParam param) {
        ListUserPageRespData data = ListUserPageRespData.builder()
                .items(
                        Arrays.asList(
                                V3UserModel.builder()
                                        .age(1)
                                        .is_enable(true)
                                        .name("王二娃")
                                        .gender("男")
                                        .userId(1L)
                                        .build(),
                                V3UserModel.builder()
                                        .age(1)
                                        .is_enable(true)
                                        .name("王二娃")
                                        .gender("男")
                                        .userId(2L)
                                        .build(),
                                V3UserModel.builder()
                                        .age(1)
                                        .is_enable(true)
                                        .name("王二娃")
                                        .gender("男")
                                        .userId(3L)
                                        .build(),
                                V3UserModel.builder()
                                        .age(1)
                                        .is_enable(true)
                                        .name("王二娃")
                                        .gender("男")
                                        .userId(4L)
                                        .build(),
                                V3UserModel.builder()
                                        .age(1)
                                        .is_enable(true)
                                        .name("王二娃")
                                        .gender("男")
                                        .userId(5L)
                                        .build()
                        )
                )

                .page(
                        Page.builder().number(1)
                                .pages(1)
                                .size(20).total(5).build()
                )
                .build();
        return ApiResult.success(data);
    }

    @Override
    public ApiResult addV3User(UserParam param) {
        return null;
    }

    @Override
    public ApiResult editV3User(UserParam param) {
        return null;
    }

    @Override
    public ApiResult updateV3UserQrCode(UserQrCodeParam param) {
        return null;
    }

    @Override
    public ApiResult<String> getV3UserQrCode(IdParam param) {
        return null;
    }

    @Override
    public ApiResult removeV3UserQrCode(IdParam param) {
        return null;
    }

    @Override
    public ApiResult<V3UserRespModel> getV3UserByName(StringParam param) {
        return null;
    }

    @Override
    public ApiResult<V3UserRespModel> getSysUser(EmptyParam param) {
        return null;
    }

    @Override
    public ApiResult<List<V3UserRespModel>> getUserList(LongListParam param) {
        return null;
    }

    @Override
    public ApiResult<List<V3UserRespModel>> getProcurePrincipalList(EmptyParam param) {
        return null;
    }

    @Override
    public ApiResult<List<BuModel>> listBu(EmptyParam param) {
        ApiResult<List<FinanceDetailModel>> test = financeDetailService.listAllCompanyDetail(StringParam.builder().str("test").build());
        List<BuModel> collect = test.getData().stream().map(
                l -> BuModel.builder()
                        .buName(l.getCompanyName())
                        .userId(l.getCompanyId().longValue())
                        .build()
        ).collect(Collectors.toList());
        return ApiResult.success(collect);
    }
}
