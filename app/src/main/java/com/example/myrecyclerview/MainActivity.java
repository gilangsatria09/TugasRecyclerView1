package com.example.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Mail> mailList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerViewAdapter rvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.rv_main);

        rvAdapter = new RecyclerViewAdapter(mailList);
        RecyclerView.LayoutManager rvLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(rvLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(rvAdapter);

        mailItem();
    }
    private void mailItem(){
        Mail mail = new Mail("G",R.drawable.rounded_drawable_green,"Gilang Satria","Mari Bercocok Tanam",
                "Ayo kita sama-sama bercocok-tanam agar..","09:00am");
        mailList.add(mail);
        mail = new Mail("F",R.drawable.rounded_drawable_red,"Fakhri Maulana Falah","Konfirmasi GITS Indonesia",
                "Halo Fakhri, mohon anda mengisi dokumen dibawah ini ya","02:00pm");
        mailList.add(mail);
        mail = new Mail("S",R.drawable.rounded_drawable,"Sulthon Auliya","Yamaha.co.id",
                "Selamat Sore, terkait dengan hal motor R15 bapak...","07:00pm");
        mailList.add(mail);
        mail = new Mail("T",R.drawable.rounded_drawable_yellow,"Tokopedia","Pesanan anda telah diantar",
                "Pesanan 1 buah laptop berbalut emas yang anda pesan...","10:00pm");
        mailList.add(mail);
        mail = new Mail("T",R.drawable.rounded_drawable_orange,"Nugraha Adi","Hai Gilang",
                "Selamat, anda diterima dalam Universitas Singapore, dimohon...","08:00am");
        mailList.add(mail);
        mail = new Mail("B",R.drawable.rounded_drawable_white,"BiruTekno","Perihal PKL di BiruTekno",
                "Selamat Pagi, kami dari BiruTekno akan memberi tahukan..","09:20am");
        mailList.add(mail);
      mail = new Mail("A",R.drawable.rounded_drawable_red,"Akulaku",
              "Promo Cashback 100%","Cashback Samsung Galaxy Note 10 Seharga Rp.0!!!","12:00pm");
        mailList.add(mail);
      mail = new Mail("H",R.drawable.rounded_drawable_green,"Harajuku Corps",
              "Persetujuan Kerja Sama","Kerja sama denga Chewie Corps mohon maaf...","11:15am");
      mailList.add(mail);
//      mail = new Mail("",,"","","","");
//      mail = new Mail("",,"","","","");
//      mail = new Mail("","","","","");
//      mail = new Mail("","","","","");
//      mail = new Mail("","","","","");
//      mail = new Mail("","","","","");
        rvAdapter.notifyDataSetChanged();
    }
}
