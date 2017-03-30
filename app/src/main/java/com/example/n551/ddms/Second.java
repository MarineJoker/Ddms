package com.example.n551.ddms;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Second extends AppCompatActivity {

    static final String TAG= "LogActivity";
    @Override
    protected void onStop() {
        super.onStop();
        Log.v(Second.TAG, "SecondAcvity --->onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(Second.TAG, "SecondAcvity --->onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(Second.TAG, "SecondAcvity --->onPause");
    }
    protected void onStart() {
        super.onPause();
        Log.v(Second.TAG, "SecondAcvity --->onStart");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(Second.TAG, "SecondAcvity --->onCreate");
        setContentView(R.layout.second);

    }
}