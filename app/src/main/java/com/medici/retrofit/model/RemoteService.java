package com.medici.retrofit.model;

import com.medici.net.model.RspModel;
import com.medici.retrofit.model.api.CodeModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 网络请求的所有的接口
 *
 * @author qiujuer Email:qiujuer@live.cn
 * @version 1.0.0
 */
public interface RemoteService {

    @GET("www.mrmedici.com")
    /**
     * @desc 测试请求
     * @return Call<String>
     */
    Call<String> mediciHTML();

    /**
     * 忘记密码用手机请求验证码
     *
     * @param phone
     * @return
     */
    @GET("user/getForgetPhoneCheckCode")
    Call<RspModel<CodeModel>> getForgetPhoneCode(@Query("phone") String phone);
}
