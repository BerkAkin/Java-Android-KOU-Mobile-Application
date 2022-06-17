package com.berk.odevberk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class ogrenci_biten_basvurular extends AppCompatActivity {


    //RECYCLERVÝEW
    private RecyclerView nFirestoreList;

    //FÝREBASE BAÐLANTISI
    private FirebaseFirestore firebaseFirestore;

    //VERÝTABANI VE RECYCLER ARASI BAÐLANTIYI SAÐLAYACAK ADAPTÖR
    private FirestoreRecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ogrenci_biten_basvurular);



        //-----------Durum çubuðunu gizlemek için satýr-------------
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //FÝRESTORE BAÐLANTISINI AÇMAK ÝÇÝN
        firebaseFirestore = FirebaseFirestore.getInstance();

        //RECYCLERVÝEW'Ý LAYOUT ÝÇERÝSÝNDEKÝNE BAÐLAMAK ÝÇÝN
        nFirestoreList = findViewById(R.id.recyclerview_ogrenci_biten_basvurularim);



        //FÝRESTORE'DA HANGÝ KOLEKSÝYONDAN(TABLODAN) VERÝ ALACAÐIMIZI BELÝRLEMEK ÝÇÝN SORGU
        Query query = firebaseFirestore.collection("ogrenciler");


        //FÝRESTORE RECYCLER AYARLARINI YAPMAK ÝÇÝN (NEYÝN NASIL PARSE EDÝLDÝÐÝNÝ AYARLIYOR)
        FirestoreRecyclerOptions<ogrenci_biten_basvurulari_gormek> options = new FirestoreRecyclerOptions.Builder<ogrenci_biten_basvurulari_gormek>()
                .setQuery(query, ogrenci_biten_basvurulari_gormek.class)
                .build();
        adapter = new FirestoreRecyclerAdapter<ogrenci_biten_basvurulari_gormek, ogrenci_biten_basvurular.viewHolder>(options) {


            @NonNull
            @Override
            //VERÝ GÖRÜNTÜMÜZ OLUÞURKEN ÝÇERÝKLERÝN AGÖRÜNTÜLENMESÝ ÝÇÝN
            public ogrenci_biten_basvurular.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ogrenci_biten_basvurular_tek_bilgi, parent, false);
                return new ogrenci_biten_basvurular.viewHolder(view);
            }


            //VÝEWHOLDER'I ALIP ÝÇÝNDEKÝ NESNELERÝ GÖRÜNTÜYE BAÐLAR
            @Override
            protected void onBindViewHolder(@NonNull ogrenci_biten_basvurular.viewHolder holder, int position, @NonNull ogrenci_biten_basvurulari_gormek model) {
                holder.list_tc.setText((model.getTC()));
                holder.list_adres.setText((model.getAdres()));
                holder.list_mail.setText((model.getMail()));


            }
        };
        nFirestoreList.setHasFixedSize(true);
        nFirestoreList.setLayoutManager(new LinearLayoutManager(this));
        nFirestoreList.setAdapter(adapter);
    }


    //OLUÞTURDUÐUMUZ GÖRÜNTÜLERÝ SAKLAMAK ÝÇÝN TUTUCU
    private class viewHolder extends RecyclerView.ViewHolder {

        //BAÞVURULARIN NASIL GÖRÜNTÜLENECÐÝNÝN YERLÝÞÝMÝNDEKÝ DEÐÝÞKENLER ÝLE BAÐLANTISI
        private TextView list_tc, list_mail, list_adres;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            list_adres = itemView.findViewById(R.id.tw_ogrenci_bitenbasvuru_biten_tek_bilgi_basvuru_ismi);
            list_tc = itemView.findViewById(R.id.tw_ogrenci_bitenbasvuru_tek_bilgi_biten_basvuru_tarihi);
            list_mail = itemView.findViewById(R.id.tw_ogrenci_bitenbasvuru_tek_bilgi_biten_basvuru_durumu);


        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }


}