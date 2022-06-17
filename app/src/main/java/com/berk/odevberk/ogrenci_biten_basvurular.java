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


    //RECYCLERV�EW
    private RecyclerView nFirestoreList;

    //F�REBASE BA�LANTISI
    private FirebaseFirestore firebaseFirestore;

    //VER�TABANI VE RECYCLER ARASI BA�LANTIYI SA�LAYACAK ADAPT�R
    private FirestoreRecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ogrenci_biten_basvurular);



        //-----------Durum �ubu�unu gizlemek i�in sat�r-------------
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //F�RESTORE BA�LANTISINI A�MAK ���N
        firebaseFirestore = FirebaseFirestore.getInstance();

        //RECYCLERV�EW'� LAYOUT ��ER�S�NDEK�NE BA�LAMAK ���N
        nFirestoreList = findViewById(R.id.recyclerview_ogrenci_biten_basvurularim);



        //F�RESTORE'DA HANG� KOLEKS�YONDAN(TABLODAN) VER� ALACA�IMIZI BEL�RLEMEK ���N SORGU
        Query query = firebaseFirestore.collection("ogrenciler");


        //F�RESTORE RECYCLER AYARLARINI YAPMAK ���N (NEY�N NASIL PARSE ED�LD���N� AYARLIYOR)
        FirestoreRecyclerOptions<ogrenci_biten_basvurulari_gormek> options = new FirestoreRecyclerOptions.Builder<ogrenci_biten_basvurulari_gormek>()
                .setQuery(query, ogrenci_biten_basvurulari_gormek.class)
                .build();
        adapter = new FirestoreRecyclerAdapter<ogrenci_biten_basvurulari_gormek, ogrenci_biten_basvurular.viewHolder>(options) {


            @NonNull
            @Override
            //VER� G�R�NT�M�Z OLU�URKEN ��ER�KLER�N AG�R�NT�LENMES� ���N
            public ogrenci_biten_basvurular.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ogrenci_biten_basvurular_tek_bilgi, parent, false);
                return new ogrenci_biten_basvurular.viewHolder(view);
            }


            //V�EWHOLDER'I ALIP ���NDEK� NESNELER� G�R�NT�YE BA�LAR
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


    //OLU�TURDU�UMUZ G�R�NT�LER� SAKLAMAK ���N TUTUCU
    private class viewHolder extends RecyclerView.ViewHolder {

        //BA�VURULARIN NASIL G�R�NT�LENEC��N�N YERL���M�NDEK� DE���KENLER �LE BA�LANTISI
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