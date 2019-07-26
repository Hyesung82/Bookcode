package com.example.bookcodekr;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.kakao.auth.Session;
import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.LogoutResponseCallback;

import static com.example.bookcodekr.MainActivity.loginButton;
import static com.example.bookcodekr.MainActivity.success_layout;
import static com.kakao.usermgmt.UserManagement.getInstance;

public class MyLibrary extends AppCompatActivity {


    public void requestLogout() {
        success_layout.setVisibility(View.GONE);
        loginButton.setVisibility(View.VISIBLE);
        UserManagement.getInstance().requestLogout(new LogoutResponseCallback() {
            @Override
            public void onCompleteLogout() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MyLibrary.this, "로그아웃 성공", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                });
            }



        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_library);


    }
    public void logoutClick(View view) {
        requestLogout();
    }

    public void listClick(View view) {
        Intent intent = new Intent(this, BookList.class);
        startActivity(intent);
    }

    public void cameraClick(View view) {

    }
}
