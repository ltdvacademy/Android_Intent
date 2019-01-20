package id.luckytruedev.androidintent.java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import id.luckytruedev.androidintent.R;

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}