package com.rahmahnajiyahimtihan.asmaulhusna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listasma;

    String nama[] = {
            "الله","1.Ar-Rahman", "2.Ar-Rahim", "3.Al-Malik", "4.Al-Quddus", "5.As-Salaam", "6.Al-mumin", "7.Al Muhaimin", "8.Al Aziz", "9.Al - Jabbar", "10.Al-Mutakabbir", "11.Al Kholiq", "12.Al Baari", "13.Al Mushowwir", "14.Al Ghoffar", "15.Al qohhar", "16.Al Wahhab", "17.Ar Rozzaq", "18.Al Fattah", "19.Al Alim", "20.Al Qobidh",
                    "21.Al Basith", "22.Al Khofid", "23.Ar Rofiu", "24.Al Muiz", "25.Al Muzill", "26.As Samiiu", "27.Al Basiir", "28.Al Hakam", "29.Al Adlu", "30.Al Latif", "31.Al Khobir", "32.Al Haliim", "33.Al Adzim", "34.Al Ghofur", "35.Asy Syakur", "36.Al Aliy", "37.Al Kabir", "38.Al Hafidz", "39.Al Muqiith", "40.Al Hasiib",
                    "41.Al Jaliil", "42.Al Kariim", "43.Ar Roqiib", "44.Al Mujiib", "45.Al Waasiu", "46.Al Hakiim", "47.Al Waduud", "48.Al Majiid", "49.Al Baaits", "50.Asy Syahiid", "51.Al Haqq", "52.Al Wakiil", "53.Al Qowiyy", "54.Al Matiin", "55.Al Waliyy", "56.Al Hamiid", "57.Al Muhshiy", "58.Al Mubdi", "59.Al Muiid", "60.Al Muhyiy",
                    "61.Al Mumiit", "62.Al Hayyu", "63.Al Qoyyum", "64.Al Waajid", "65.Al Maajid", "66.Al Wahid", "67.Al Ahdu", "68.As Shomad", "69.Al Qoodir", "70.Al Muqtadir", "71.Al Muqoddim", "72.Al Muakhkhir", "73.Al Awwal", "74.Al Aakhir", "75.Az Zhoohir", "76.Al Bathiin", "77.Al Waaliy", "78.Al Muta-aaliy", "79.Al Barr", "80.At Tawaab", "81.Al Muntaqimu",
                    "82.Al Afuww", "83.Ar Rouuf", "84.Maalikul Mulki", "85.Zul jalaali wal ikrom", "86.Al Muqshith", "87.Al Jaamiu", "88.Al Ghoniyy", "89.Al Mughniy", "90.Al Maaniu", "91.Ad Doorr", "92.An Naafii", "93.An Nuur", "94.Al Haadiy", "95.Al Badiiu", "96.Al Baaqiy", "97.Al Waarits", "98.Ar Rosyiid", "99.Ash Shobuur"
    };

    String arti[] = {
           "ALLAH","Allah Yang Maha Pengasih", "Allah Yang Maha Penyayang", "Allah Yang Maha Merajai", "Allah Yang Maha Suci", "Allah Yang Maha Memberi Kesejahteraan", "Allah Yang Maha Memberi Keamanan", "Allah Yang Maha Mengatur", "Allah Yang Maha Perkasa", "Allah Yang Memiliki Mutlak Kegagahan","Allah Yang Maha Megah,Yang Memiliki Kebesaran","Allah Yang Maha Pencipta", "Allah Yang Maha Melepaskan (Membuat,Membentuk, Menyeimbangkan)", "Allah Yang Maha Membentuk Rupa(makhluknya)", "Allah Yang Maha Pengampun", "Allah Yang Maha Menundukkan/Menaklukkan Segala Sesuatu", "Allah Yang Maha Pemberi Karunia", "Allah Yang Maha Pemberi Rezeki", "Allah Yang Maha Pembuka Rahmat", "Allah Yang Maha Mengetahui MemilikiIlmu", "Allah Yang Maha Menyempitkan makhluknya", "Allah Yang Maha Melapangkan makhluknya", "Allah Yang Maha Merendahkan makhluknya", "Allah Yang Maha Meninggikan makhluknya",
                   "Allah Yang Maha Memuliakan makhluknya","Allah Yang Maha Menghinakan makhluknya", "Allah Yang Maha Mendengar", "Allah Yang Maha Melihat", "Allah Yang Maha Menetapkan", "Allah Yang Maha Adil", "Allah Yang Maha Lembut", "Allah Yang Maha Mengenal", "Allah Yang Maha Penyantun", "Allah Yang Maha Agung", "Allah Yang Maha Memberi Pengampunan", "Allah Yang Maha Pembalas Budi (Menghargai)", "Allah Yang Maha Tinggi", "Allah Yang Maha Besar", "Allah Yang Maha Memelihara", "Allah Yang Maha Pemberi Kecukupan" , "Allah Yang Maha Membuat Perhitungan",
                   "Allah Yang Maha Luhur" , "Allah Yang Maha Pemurah" , "Allah Yang Maha Mengawasi" , "Allah Yang Maha Mengabulkan" , "Allah Yang Maha Luas" , "Allah Yang Maha Bijaksana" , "Allah Yang Maha Mengasihi" , "Allah Yang Maha Mulia" , "Allah Yang Maha Membangkitkan" , "Allah Yang Maha Menyaksikan" , "Allah Yang Maha Benar" , "Allah Yang Maha Memelihara" , "Allah Yang Maha Kuat" , "Allah Yang Maha Kokoh" , "Allah Yang Maha Melindungi","Allah Yang Maha Terpuji", "Allah Yang Maha Menghitung Segala Sesuatu" , "Allah Yang Maha Memulai" , "Allah Yang Maha Mengembalikan Kehidupan", "Allah Yang Maha Menghidupkan", "Allah Yang Maha Mematikan" , "Allah Yang Maha Hidup" ,"Allah Yang Maha Mandiri" , "Allah Yang Maha Penemu" , "Allah Yang Maha Mulia" , "Allah Yang Maha Tunggal" , "Allah Yang Maha Esa" , "Allah Yang Maha Dibutuhkan-TempatMeminta", "Allah Yang Maha Menentukan-Maha Menyeimbangkan" , "Allah Yang Maha Berkuasa" ,
                   "Allah Yang Maha Mendahulukan" , "Allah Yang Maha Mengakhirkan" , "Allah Yang Maha Awal" , "Allah Yang Maha Akhir" , "Allah Yang Maha Nyata" , "Allah Yang Maha Ghaib" , "Allah Yang Maha Memerintah" , "Allah Yang Maha Tinggi" , "Allah Yang Maha Penderma (MahaPemberi Kebajikan)" , "Allah Yang Maha Penerima Tobat", "Allah Yang Maha Pemberi Balasan" , "Allah Yang Maha Pemaaf" , "Allah Yang Maha Pengasuh" , "Allah Yang Maha Penguasa Kerajaan(Semesta)" , "Allah Yang Maha Pemilik Kebesaran danKemuliaan" , "Allah Yang Maha Pemberi Keadilan" , "Allah Yang Maha Mengumpulkan" , "Allah Yang Maha Kaya" , "Allah Yang Maha Pemberi Kekayaan" , "Allah Yang Maha Mencegah" ,"Allah Yang Maha Penimpa Kemudharatan",
                   "Allah Yang Maha Memberi Manfaat", "Allah Yang Maha Bercahaya (Menerangi,Memberi Cahaya)" , "Allah Yang Maha Pemberi Petunjuk" , "Allah Yang Maha Pencipta Yang TiadaBandingannya" , "Allah Yang Maha Kekal" , "Allah Yang Maha Pewaris" , "Allah Yang Maha Pandai" , "Allah Yang Maha Sabar"
    };

    int gambar[] = {
            R.drawable.allah_by_proama,R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14, R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20,
            R.drawable.a21, R.drawable.a22, R.drawable.a23, R.drawable.a24, R.drawable.a25, R.drawable.a26, R.drawable.a27, R.drawable.a28, R.drawable.a29, R.drawable.a30, R.drawable.a31, R.drawable.a32, R.drawable.a33, R.drawable.a34, R.drawable.a35, R.drawable.a36, R.drawable.a37, R.drawable.a38, R.drawable.a39, R.drawable.a40,
            R.drawable.a41, R.drawable.a42, R.drawable.a43, R.drawable.a44, R.drawable.a45, R.drawable.a46, R.drawable.a47, R.drawable.a48, R.drawable.a49, R.drawable.a50, R.drawable.a51, R.drawable.a52, R.drawable.a53, R.drawable.a54, R.drawable.a55, R.drawable.a56, R.drawable.a57, R.drawable.a58, R.drawable.a59, R.drawable.a60,
            R.drawable.a61, R.drawable.a62, R.drawable.a63, R.drawable.a64, R.drawable.a65, R.drawable.a66, R.drawable.a67, R.drawable.a68, R.drawable.a69, R.drawable.a70, R.drawable.a71, R.drawable.a72, R.drawable.a73, R.drawable.a74, R.drawable.a75, R.drawable.a76, R.drawable.a77, R.drawable.a78, R.drawable.a79, R.drawable.a80,
            R.drawable.a81, R.drawable.a82, R.drawable.a83, R.drawable.a84, R.drawable.a85, R.drawable.a86, R.drawable.a87, R.drawable.a88, R.drawable.a89, R.drawable.a90, R.drawable.a91, R.drawable.a92, R.drawable.a93, R.drawable.a94, R.drawable.a95, R.drawable.a96, R.drawable.a97, R.drawable.a98, R.drawable.a99
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listasma =  (ListView)  findViewById(R.id.listasma);

        //adapter listview
        adapter adapterListView = new adapter (this, gambar,nama,arti);//hrs sama kayak yg di public adapter (diadapter)
        listasma.setAdapter(adapterListView);

    }
}
