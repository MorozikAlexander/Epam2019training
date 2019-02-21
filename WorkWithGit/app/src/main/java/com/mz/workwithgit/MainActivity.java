package com.mz.workwithgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Prepare to rebase 2
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        //create and show text message
        Toast toast = Toast.makeText(getApplicationContext(),
                "Toast 1 is showing better & better)",
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void showToast1(View view) {
        //create and show text message
        Toast toast = Toast.makeText(getApplicationContext(),
                "Toast 2 is showing better & better)",
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
