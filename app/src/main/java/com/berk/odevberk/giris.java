package com.berk.odevberk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class giris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giris);


        //-----------Durum çubuğunu gizlemek için satır-------------

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);





        //-----------Öğrenci kaydol activitysini açmak için kodlar------------

        Button ogrenci_kaydol = (Button)findViewById(R.id.buton_ogrenci_kaydol);
        ogrenci_kaydol.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(giris.this, ogrenci_kaydol.class));
            }
        });




        //-----------Öğrenci giriş activitysini açmak için kodlar------------

        Button ogrenci_giris = (Button)findViewById(R.id.buton_ogrenci_giris);
        ogrenci_giris.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(giris.this, ogrenci_ana_ekran.class));
            }
        });


        //-----------Öğrenci şifremi unuttum activitysini açmak için kodlar------------
        Button sifremi_unuttum = (Button)findViewById(R.id.buton_ogrenci_sifremi_unuttum);
        sifremi_unuttum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(giris.this, ogrenci_sifremi_unuttum.class));
            }
        });

        //-----------Akademisyen girişi activitysini açmak için kodlar------------
        Button akademisyen_giris = (Button)findViewById(R.id.button_giris_ekrani_akademisyen);
        akademisyen_giris.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(giris.this, akademisyen_giris.class));
            }
        });

    }
}