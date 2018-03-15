package com.medici.retrofit.helper;

import android.support.annotation.NonNull;

import com.medici.net.Network;
import com.medici.net.data.DataSource;
import com.medici.net.model.RspModel;
import com.medici.retrofit.Factory;
import com.medici.retrofit.R;
import com.medici.retrofit.model.RemoteService;
import com.medici.retrofit.model.api.CodeModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * ***************************************
 *
 * @desc:
 * @author：李宗好
 * @time: 2018/3/14 0014 20:25
 * @email：lzh@cnbisoft.com
 * @version：
 * @history: ***************************************
 */
public class MediciHelper {

    public static void sendCode(@NonNull String phone, @NonNull final DataSource.Callback<CodeModel> callback){
        RemoteService service = Network.remote(RemoteService.class);
        Call<RspModel<CodeModel>> call = service.getForgetPhoneCode(phone);
        call.enqueue(new Callback<RspModel<CodeModel>>() {
            @Override
            public void onResponse(Call<RspModel<CodeModel>> call, Response<RspModel<CodeModel>> response) {
                RspModel<CodeModel> model = response.body();
                if (model.success()) {
                    callback.onDataLoaded(model.getData());
                } else {
                    // 错误解析
                    Factory.decodeRspCode(model, callback);
                }
            }

            @Override
            public void onFailure(Call<RspModel<CodeModel>> call, Throwable t) {
                // 网络请求失败
                if (callback != null)
                    callback.onDataNotAvailable(R.string.data_network_error);
            }
        });

    }

}
