package com.example.juankno4.activitysintents;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txtnumero);
                                 /*segundos 10 */
        new CountDownTimer(10000, 100) {
            @Override
            public void onTick(long millisUntilFinished) {
                txt.setText(String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
               Intent t = new Intent(MainActivity.this,Ventana2.class);
               t.putExtra("Nombre","Juan");
               startActivity(t);
               finish();
            }
        }.start();




    }
}
