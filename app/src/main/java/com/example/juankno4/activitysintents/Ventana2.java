package com.example.juankno4.activitysintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ventana2 extends AppCompatActivity {

    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);

        Bundle n = getIntent().getExtras();


      txt1 = findViewById(R.id.txtnombre);
     /* String rt = getIntent().getStringExtra("Nombre");*/
       /* String rt = getIntent().getExtras().getString("Nombre");*/
        String rt = n.getString("Nombre");
        txt1.setText(rt);








    }
}
