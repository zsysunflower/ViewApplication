package com.example.viewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        Button btn = findViewById(R.id.btn1); //通过自定义内部类实现点击事件,1.找到按键的信息

        //点击事件：被点击时触发事件,自定义一个类被点击的时候使用
        MyListener ms = new MyListener();//3.实例化自定义的类
        btn.setOnClickListener(ms); //2.为按钮注册点击事件监听器

        //关于匿名内部类的编写
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {            @Override
            public void onClick(View view) {
                //打印出log消息
                Log.e("TAG","=========匿名内部类========");
            }
        });

        //直接使用本类来直接实现ACTIVITY小哥哥
        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.e("TAG","直接使用本类this来实现操作效果");
    }

    //实现一个方法直接在xml里面使用
    public void myclick(View view) {
        switch (view.getId())
        {
            case R.id.btn4:
                Log.e("TAG","btn4");
                break;
            case R.id.btn5:
                Log.e("TAG","btn5");
                break;
            case R.id.btn6:
                Log.e("TAG","btn6");
                break;
        }
    }

    class MyListener implements View.OnClickListener{
        //给类定义一个方法在控制台显示内容
        @Override
        public void onClick(View view) {
            //在控制台输出一条语句
            Log.e("TAG","通过点击按钮实现了注册内容监听器对象的按钮");
        }
    }
}
