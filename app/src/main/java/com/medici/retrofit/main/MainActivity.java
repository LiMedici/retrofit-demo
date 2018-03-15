package com.medici.retrofit.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.medici.retrofit.R;

/**
 * @author mrmedici
 * @desc 主页面
 */
public class MainActivity extends AppCompatActivity implements MainContract.View{

    private TextView mTxtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTxtContent = findViewById(R.id.txt_content);
        MainPresenter presenter = new MainPresenter(this);
        presenter.start();

    }

    @Override
    public void show(String content) {
        mTxtContent.setText(content);
    }
}
