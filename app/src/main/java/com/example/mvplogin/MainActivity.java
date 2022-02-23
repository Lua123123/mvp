package com.example.mvplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IMainActivity{

    TextView txtview;
    Presenterr presenterr = new Presenterr();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenterr.m = this;

        txtview = findViewById(R.id.txtview);
        presenterr.getData();
    }


    @Override
    public void printf(String data) {
        txtview.setText(data);
    }
}