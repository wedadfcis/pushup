package com.example.wedad.pushup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void SayHello()
    {
        System.out.println("hi");
    }
    public void SayWelcomBack()
    {

        System.out.println("Wecolm back");
    }
}
