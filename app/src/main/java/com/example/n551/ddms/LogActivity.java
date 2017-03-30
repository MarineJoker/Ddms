package com.example.n551.ddms;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LogActivity extends AppCompatActivity {


    static final String TAG= "LogActivity";
    @Override
    protected void onStop() {
        super.onStop();
        Log.v(LogActivity.TAG, "FirstAcvity --->onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(LogActivity.TAG, "FirstAcvity --->onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(LogActivity.TAG, "FirstAcvity --->onPause");
    }
    protected void onStart() {
        super.onPause();
        Log.v(LogActivity.TAG, "FirstAcvity --->onStart");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(LogActivity.TAG, "FirstAcvity --->onCreate");
        setContentView(R.layout.activity_log);
        Button b =(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent();
                i.setClass(LogActivity.this,Second.class);
                startActivity(i);
            }
        });


    }
}
