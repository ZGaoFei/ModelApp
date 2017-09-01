package cn.com.zgfei.modelapp;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AsyncTask<Intent, Void, Void>() {

            @Override
            protected Void doInBackground(Intent... params) {
                return null;
            }
        }.execute();

        AsyncTask.execute(new Runnable(){

            @Override
            public void run() {

            }
        });
    }
}
