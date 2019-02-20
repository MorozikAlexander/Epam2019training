package com.mz.workwithgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //develop
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showToast(View view) {
        //создаём и отображаем текстовое уведомление
        Toast toast = Toast.makeText(getApplicationContext(),
                "Toast is showing",
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
