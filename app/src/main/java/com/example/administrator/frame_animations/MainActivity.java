package com.example.administrator.frame_animations;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
    private  boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ll = (LinearLayout) findViewById(R.id.layout1);
        //获取animationdraable对象
        final AnimationDrawable anim = (AnimationDrawable) ll.getBackground();
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    anim.setOneShot(false);
                    anim.start();
                    flag = false;
                }else {
                    anim.stop();
                    flag = true;
                }
            }
        });


    }
}
