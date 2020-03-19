package com.example.viewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_design);
    }
    public void register(){
        EditText userName = findViewById(R.id.username);
        EditText pwd = findViewById(R.id.pwd);
        ProgressBar pbg = findViewById(R.id.pgb_login);
        String un = userName.getText().toString();
        String pd = pwd.getText().toString();
        if(un.equals("") || pd.equals("")){
            //进行无焦点提示
            Toast.makeText(this,"账号和密码不能为空",Toast.LENGTH_SHORT).show();
        }
    }
}
