package com.xiaobu121.xiaobu.new_fast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.xiaobu121.xiaobu.fast_check.CheckActivity;


/**
 * [![](https://jitpack.io/v/lxm10110/rx_check.svg)](https://jitpack.io/#lxm10110/rx_check)
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_second);
//        Log.e("nxdx------"," "+CheckActivity.TAG);
        findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CheckActivity.class));

            }
        });
    }
}