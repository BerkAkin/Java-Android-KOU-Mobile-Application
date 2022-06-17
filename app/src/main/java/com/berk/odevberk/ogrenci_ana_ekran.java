package com.berk.odevberk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ogrenci_ana_ekran extends AppCompatActivity
{
    Button ogrenci_yaz_okulu, ogrenci_yatay_gecis, ogrenci_ders_intibaki, ogrenci_cap_basvurusu,
    ogrenci_dgs, ogrenci_cikis, ogrenci_bitenbasvuru, ogrenci_devamedenbasvuru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ogrenci_ana_ekran);

        //-----------Durum çubuðunu gizlemek için satýr-------------
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);






        //-----------Öðrenci Yaz Okulu Baþvurusu activitysini açmak için kodlar------------
        ogrenci_yaz_okulu = (Button)findViewById(R.id.buton_ogrenci_basvuruyap_yazokulu);
        ogrenci_yaz_okulu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ogrenci_ana_ekran.this, ogrenci_yaz_okulu_basvuru.class));
            }
        });







        //-----------Öðrenci Yatay Geçiþ Baþvurusu activitysini açmak için kodlar------------
         ogrenci_yatay_gecis= (Button)findViewById(R.id.buton_ogrenci_basvuruyap_yataygecis);
        ogrenci_yatay_gecis.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ogrenci_ana_ekran.this, ogrenci_yatay_gecis_basvuru.class));
            }
        });








        //-----------Öðrenci Ders Ýntibaký Baþvurusu activitysini açmak için kodlar------------
        ogrenci_ders_intibaki = (Button)findViewById(R.id.buton_ogrenci_basvuruyap_dersintibaki);
        ogrenci_ders_intibaki.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ogrenci_ana_ekran.this, ogrenci_ders_intibaki_basvuru.class));
            }
        });







        //-----------Öðrenci Çap Baþvurusu activitysini açmak için kodlar------------
        ogrenci_cap_basvurusu = (Button)findViewById(R.id.buton_ogrenci_basvuruyap_cap);
        ogrenci_cap_basvurusu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ogrenci_ana_ekran.this, ogrenci_cap_basvurusu.class));
            }
        });







        //-----------Öðrenci DGS Baþvurusu activitysini açmak için kodlar------------
        ogrenci_dgs = (Button)findViewById(R.id.buton_ogrenci_basvuruyap_dikeygecis);
        ogrenci_dgs.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ogrenci_ana_ekran.this, ogrenci_dgs_basvurusu.class));
            }
        });







        //-----------Öðrenci Biten Baþvurular activitysini açmak için kodlar------------
        ogrenci_bitenbasvuru = (Button)findViewById(R.id.buton_ogrenci_biten_basvurular);
        ogrenci_bitenbasvuru.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ogrenci_ana_ekran.this, ogrenci_biten_basvurular.class));
            }
        });






        //-----------Öðrenci Devam Eden Baþvurular activitysini açmak için kodlar------------
        ogrenci_devamedenbasvuru = (Button)findViewById(R.id.buton_ogrenci_devam_basvurular);
        ogrenci_devamedenbasvuru.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ogrenci_ana_ekran.this, ogrenci_devam_eden_basvurular.class));
            }
        });

    }
}