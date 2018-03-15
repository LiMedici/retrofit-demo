package com.medici.net;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author qiujuer Email:qiujuer@live.cn
 * @version 1.0.0
 */
public class Factory {

    private static final String TAG = Factory.class.getSimpleName();
    /**
     * 单例模式
     */
    private static final Factory instance;
    /**
     * 全局的Gson
     */
    private final Gson gson;


    static {
        instance = new Factory();
    }

    private Factory() {
        gson = new GsonBuilder()
                // 设置时间格式
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")
                // 设置一个过滤器，数据库级别的Model不进行Json转换
                // .setExclusionStrategies(new DBFlowExclusionStrategy())
                .create();
    }

    /**
     * 返回一个全局的Gson，在这可以进行Gson的一些全局的初始化
     *
     * @return Gson
     */
    public static Gson getGson() {
        return instance.gson;
    }
}
