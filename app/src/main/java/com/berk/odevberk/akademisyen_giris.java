package com.berk.odevberk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class akademisyen_giris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.akademisyen_giris);

        //-----------Durum �ubu�unu gizlemek i�in sat�r-------------
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button akademisyen_sifremi_sifirla= (Button)findViewById(R.id.buton_akademisyen_sifremi_unuttum2);
        akademisyen_sifremi_sifirla.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(akademisyen_giris.this, akademisyen_sifre_unuttum.class));
            }
        });


        //-----------Akademisyen Giri� activitysini a�mak i�in kodlar------------
        Button giris = (Button)findViewById(R.id.buton_akademsiyen_ekrani_giris_yap);
        giris.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(akademisyen_giris.this, akademisyen_basvurular.class));
            }
        });


    }
}