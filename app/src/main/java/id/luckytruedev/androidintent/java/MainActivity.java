package id.luckytruedev.androidintent.java;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.luckytruedev.androidintent.R;



public class MainActivity extends AppCompatActivity {

    Button explicit_btn, implicit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explicit_btn = findViewById(R.id.btnExplisit);
        implicit_btn = findViewById(R.id.btnImplisit);

        explicit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ActivityKedua.class);
                startActivity(intent);
            }
        });
        implicit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.luckytruedev.com"));
                startActivity(intent);
            }
        });
    }}

