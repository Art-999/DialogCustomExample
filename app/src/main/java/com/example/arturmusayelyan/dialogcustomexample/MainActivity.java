package com.example.arturmusayelyan.dialogcustomexample;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {
        MyAlert myAlert = MyAlert.newInstance();
        myAlert.show(getSupportFragmentManager(), "My Alert");
    }

    public void showAsFragment(View view) {
        MyAlert myAlert = MyAlert.newInstance();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frame_container, myAlert, "My Alert");
        transaction.commit();
    }
}
