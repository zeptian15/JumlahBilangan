package com.example.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Inisialisasi beberapa variabel yang akan digunakan
    private EditText bilangan_satu;
    private EditText bilangan_dua;
    private EditText jumlah;
    private Button btn_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    // Membuat Fungsi Inisialisasi
    private void initUI(){
        bilangan_satu = (EditText) findViewById(R.id.bilangan_satu);
        bilangan_dua = (EditText) findViewById(R.id.bilangan_dua);
        jumlah = (EditText) findViewById(R.id.hasil_penjumlahan);
        btn_hasil = (Button) findViewById(R.id.btn_hasil);
    }

    // Membuat Fungsi Event pada Button
    private void initEvent(){
        btn_hasil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                hitungJumlah();
            }
        });
    }

    // Membuat Fungsi Hitung Jumlah
    private void hitungJumlah(){
        int angka_satu = Integer.parseInt(bilangan_satu.getText().toString());
        int angka_dua = Integer.parseInt(bilangan_dua.getText().toString());
        int total = angka_satu + angka_dua;
        jumlah.setText(total+"");
    }
}
