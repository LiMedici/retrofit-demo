package com.medici.retrofit.main;

/**
 * ***************************************
 *
 * @desc:
 * @author：李宗好
 * @time: 2018/3/14 0014 20:18
 * @email：lzh@cnbisoft.com
 * @version：
 * @history:
 *
 * ***************************************
 */
public interface MainContract {

    interface View{
        void show(String content);
    }

    interface Presenter{
        void start();
    }

}
