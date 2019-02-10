package com.nanda.kamus_indonesia_mandailing;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DataKamus extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "kamus";

    private static final String INDONESIA = "indonesia";
    private static final String MANDAILING = "mandailing";

    public DataKamus(Context context){
        super(context, DATABASE_NAME, null,1);
    }

    //Method generateData untuk membuat table kamus
    public void createTable(SQLiteDatabase db){
        db.execSQL("DROP TABLE IF EXISTS kamus");
        db.execSQL("CREATE TABLE if not exists kamus (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "indonesia TEXT, mandailing TEXT);");
    }

    //Method generateData untuk mengisikan data ke kamus
    public void generatedData(SQLiteDatabase db){
        ContentValues cv = new ContentValues();

        cv.put(INDONESIA,"aku");
        cv.put(MANDAILING,"au");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"engkau");
        cv.put(MANDAILING,"ho");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kamu");
        cv.put(MANDAILING,"amu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dia");
        cv.put(MANDAILING,"ia");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kami");
        cv.put(MANDAILING,"ami");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kita");
        cv.put(MANDAILING,"ita");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mereka");
        cv.put(MANDAILING,"alai");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dimana");
        cv.put(MANDAILING,"idia");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"darimana");
        cv.put(MANDAILING,"ngon jia");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kemana");
        cv.put(MANDAILING,"tudia");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mau kemana");
        cv.put(MANDAILING,"get tu dia");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"apa");
        cv.put(MANDAILING,"aha");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"siapa");
        cv.put(MANDAILING,"ise");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"berapa");
        cv.put(MANDAILING,"sadia");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bagaimana");
        cv.put(MANDAILING,"songon dia");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mengapa");
        cv.put(MANDAILING,"mangua");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kapan");
        cv.put(MANDAILING,"andigan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sekolah");
        cv.put(MANDAILING,"sikola");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"orang");
        cv.put(MANDAILING,"alak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rupa");
        cv.put(MANDAILING,"rupo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pasar");
        cv.put(MANDAILING,"poken");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pulang");
        cv.put(MANDAILING,"mulak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kampung");
        cv.put(MANDAILING,"huta");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tidak");
        cv.put(MANDAILING,"inda");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gulaen");
        cv.put(MANDAILING,"ikan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"buat");
        cv.put(MANDAILING,"baen");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mau");
        cv.put(MANDAILING,"giot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"besar");
        cv.put(MANDAILING,"godang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rupiah");
        cv.put(MANDAILING,"rupia");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"yang");
        cv.put(MANDAILING,"na");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"putih");
        cv.put(MANDAILING,"bontar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"datang");
        cv.put(MANDAILING,"ro");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kecapi");
        cv.put(MANDAILING,"sotul");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nangka");
        cv.put(MANDAILING,"sibodak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"beras");
        cv.put(MANDAILING,"danon");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nanas");
        cv.put(MANDAILING,"onas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pisang");
        cv.put(MANDAILING,"pisang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sawah");
        cv.put(MANDAILING,"saba");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ada");
        cv.put(MANDAILING,"adong");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nasi");
        cv.put(MANDAILING,"indahan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ambil");
        cv.put(MANDAILING,"buat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"akan");
        cv.put(MANDAILING,"nagiot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"duduk");
        cv.put(MANDAILING,"juguk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ikut");
        cv.put(MANDAILING,"dohot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"durian");
        cv.put(MANDAILING,"tarutung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"harga");
        cv.put(MANDAILING,"arga");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ini");
        cv.put(MANDAILING,"on");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"itu");
        cv.put(MANDAILING,"ibo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nanti");
        cv.put(MANDAILING,"naron");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"satu");
        cv.put(MANDAILING,"sada");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dua");
        cv.put(MANDAILING,"dua");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tolu");
        cv.put(MANDAILING,"tiga");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"empat");
        cv.put(MANDAILING,"opat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lima");
        cv.put(MANDAILING,"lima");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"enam");
        cv.put(MANDAILING,"onom");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tujuh");
        cv.put(MANDAILING,"pitu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"delapan");
        cv.put(MANDAILING,"salapan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sembilan");
        cv.put(MANDAILING,"sambilan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sepuluh");
        cv.put(MANDAILING,"sapulu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sebelas");
        cv.put(MANDAILING,"sabolas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dua belas");
        cv.put(MANDAILING,"dua bolas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tiga belas");
        cv.put(MANDAILING,"tolu bolas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"empat belas");
        cv.put(MANDAILING,"opat belas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lima belas");
        cv.put(MANDAILING,"lima bolas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"enam belas");
        cv.put(MANDAILING,"onom bolas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tujuh belas");
        cv.put(MANDAILING,"pitu bolas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"delapan belas");
        cv.put(MANDAILING,"lapan bolas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sembilan bolas");
        cv.put(MANDAILING,"sambilan bolas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dua puluh");
        cv.put(MANDAILING,"dua puluh");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"senin");
        cv.put(MANDAILING,"sinayan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"selasa");
        cv.put(MANDAILING,"salasa");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rabu");
        cv.put(MANDAILING,"raba'a");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kamis");
        cv.put(MANDAILING,"kamis");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jumat");
        cv.put(MANDAILING,"jumahat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sabtu");
        cv.put(MANDAILING,"sabtu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"minggu");
        cv.put(MANDAILING,"akad");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rambut");
        cv.put(MANDAILING,"obuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kepala");
        cv.put(MANDAILING,"ulu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"muka");
        cv.put(MANDAILING,"muko");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dahi");
        cv.put(MANDAILING,"boi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"alis");
        cv.put(MANDAILING,"salibon");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mata");
        cv.put(MANDAILING,"mata");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"hidung");
        cv.put(MANDAILING,"igung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mulut");
        cv.put(MANDAILING,"baba");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bibir");
        cv.put(MANDAILING,"bibir");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gigi");
        cv.put(MANDAILING,"ipon");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lidah");
        cv.put(MANDAILING,"dila");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"telinga");
        cv.put(MANDAILING,"suping");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dagu");
        cv.put(MANDAILING,"isang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jenggot");
        cv.put(MANDAILING,"janggut");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kerongkongan");
        cv.put(MANDAILING,"talonan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bahu");
        cv.put(MANDAILING,"abara");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lengan");
        cv.put(MANDAILING,"botohon");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"siku");
        cv.put(MANDAILING,"ciku");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pergelangan tangan");
        cv.put(MANDAILING,"pargolangan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jari-jari");
        cv.put(MANDAILING,"jari-jari");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ketiak");
        cv.put(MANDAILING,"kihik");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dada");
        cv.put(MANDAILING,"indora");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"perut");
        cv.put(MANDAILING,"boltok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pusat");
        cv.put(MANDAILING,"pusot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"paha");
        cv.put(MANDAILING,"arumpang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pinggang");
        cv.put(MANDAILING,"ak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"punggung");
        cv.put(MANDAILING,"tanggurung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pipi");
        cv.put(MANDAILING,"urum");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"betis");
        cv.put(MANDAILING,"bitis");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lutut");
        cv.put(MANDAILING,"tot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pergelangan kaki");
        cv.put(MANDAILING,"pargolangan ni pat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tumit");
        cv.put(MANDAILING,"tambihul");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pantat");
        cv.put(MANDAILING,"urut");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kuku");
        cv.put(MANDAILING,"sisilon");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kulit");
        cv.put(MANDAILING,"ulit");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"otak");
        cv.put(MANDAILING,"utok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"darah");
        cv.put(MANDAILING,"daro");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tulang");
        cv.put(MANDAILING,"oli-oli");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jantung");
        cv.put(MANDAILING,"jantung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"paru-paru");
        cv.put(MANDAILING,"rak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"hati");
        cv.put(MANDAILING,"ate");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"usus");
        cv.put(MANDAILING,"usus");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"daging");
        cv.put(MANDAILING,"juhut");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nafas");
        cv.put(MANDAILING,"mosa");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ubun-ubun");
        cv.put(MANDAILING,"ombut-ombut");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"saring");
        cv.put(MANDAILING,"abas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kain");
        cv.put(MANDAILING,"abit");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"angkat");
        cv.put(MANDAILING,"abin");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"perempuan");
        cv.put(MANDAILING,"adaboru");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cegah");
        cv.put(MANDAILING,"adang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ada");
        cv.put(MANDAILING,"adong");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lomba");
        cv.put(MANDAILING,"adu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"arah");
        cv.put(MANDAILING,"adop");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"silahkan");
        cv.put(MANDAILING,"adope");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"hadapi");
        cv.put(MANDAILING,"adopi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"laporkan");
        cv.put(MANDAILING,"aduon");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"air");
        cv.put(MANDAILING,"aek");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"api");
        cv.put(MANDAILING,"api");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tanah");
        cv.put(MANDAILING,"tano");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"didik");
        cv.put(MANDAILING,"ajar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sangka");
        cv.put(MANDAILING,"agan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"maut");
        cv.put(MANDAILING,"ajal");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sadap");
        cv.put(MANDAILING,"agat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kehilangan");
        cv.put(MANDAILING,"agoan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"akal");
        cv.put(MANDAILING,"akal");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cari akal");
        cv.put(MANDAILING,"akali");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cocok");
        cv.put(MANDAILING,"akur");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"alam");
        cv.put(MANDAILING,"alam");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jemput");
        cv.put(MANDAILING,"alap");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"alas");
        cv.put(MANDAILING,"alas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"perkakas");
        cv.put(MANDAILING,"alat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"alim");
        cv.put(MANDAILING,"alim");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"angin");
        cv.put(MANDAILING,"angin");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sahuti");
        cv.put(MANDAILING,"alusi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bapak");
        cv.put(MANDAILING,"bapak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ayah");
        cv.put(MANDAILING,"ayah");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tikar");
        cv.put(MANDAILING,"amak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ayah kita");
        cv.put(MANDAILING,"amanta");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"abang ayah");
        cv.put(MANDAILING,"amang tua");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"adik ayah");
        cv.put(MANDAILING,"amang uda");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ayah tua");
        cv.put(MANDAILING,"amang tobang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bakul kecil");
        cv.put(MANDAILING,"ampang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gelas");
        cv.put(MANDAILING,"galas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"piring");
        cv.put(MANDAILING,"pinggan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mangkuk");
        cv.put(MANDAILING,"mangkuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sendok");
        cv.put(MANDAILING,"sendok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"garpu");
        cv.put(MANDAILING,"garpu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"botol");
        cv.put(MANDAILING,"botol");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kompor");
        cv.put(MANDAILING,"kompor");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kayu");
        cv.put(MANDAILING,"ayu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kayu bakar");
        cv.put(MANDAILING,"soban");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lumpang");
        cv.put(MANDAILING,"losung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"beling");
        cv.put(MANDAILING,"boling");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mertua laki");
        cv.put(MANDAILING,"amang boru");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"buang");
        cv.put(MANDAILING,"ambung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gendong");
        cv.put(MANDAILING,"ompa");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lompat");
        cv.put(MANDAILING,"ambur");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"burung");
        cv.put(MANDAILING,"amporik");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kiri");
        cv.put(MANDAILING,"ambirang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kanan");
        cv.put(MANDAILING,"siamun");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cekal");
        cv.put(MANDAILING,"ampal");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"anak");
        cv.put(MANDAILING,"danak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nangis");
        cv.put(MANDAILING,"tangis");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"akar");
        cv.put(MANDAILING,"urat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kurma");
        cv.put(MANDAILING,"karomo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sore");
        cv.put(MANDAILING,"potang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"malam");
        cv.put(MANDAILING,"borngin");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pagi");
        cv.put(MANDAILING,"manyogot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jadi");
        cv.put(MANDAILING,"antong");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"besok");
        cv.put(MANDAILING,"incogot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"agar");
        cv.put(MANDAILING,"anso");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"taksir");
        cv.put(MANDAILING,"agak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"guna-guna");
        cv.put(MANDAILING,"aji");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pagar betis");
        cv.put(MANDAILING,"ajir");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"hai");
        cv.put(MANDAILING,"ale");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mungkin");
        cv.put(MANDAILING,"aropku");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jelek");
        cv.put(MANDAILING,"jat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"enggan");
        cv.put(MANDAILING,"alang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bela");
        cv.put(MANDAILING,"abarahon");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ayun");
        cv.put(MANDAILING,"anggun");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"buang");
        cv.put(MANDAILING,"ambung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"anggota");
        cv.put(MANDAILING,"anggota");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"apalagi");
        cv.put(MANDAILING,"ahadope");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sesungguhnya");
        cv.put(MANDAILING,"apala");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"hapus");
        cv.put(MANDAILING,"apus");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sentuh");
        cv.put(MANDAILING,"antuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sakit");
        cv.put(MANDAILING,"ancit");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"asin");
        cv.put(MANDAILING,"ancim");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"manis");
        cv.put(MANDAILING,"manis");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pahit");
        cv.put(MANDAILING,"paet");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mentimun");
        cv.put(MANDAILING,"ancimun");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"adik");
        cv.put(MANDAILING,"anggi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"abang");
        cv.put(MANDAILING,"angkang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"angkut");
        cv.put(MANDAILING,"angkut");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"anting");
        cv.put(MANDAILING,"kerabu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kalung");
        cv.put(MANDAILING,"gonjong");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gelang");
        cv.put(MANDAILING,"golang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cincin");
        cv.put(MANDAILING,"tintin");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"upil");
        cv.put(MANDAILING,"uang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"baju");
        cv.put(MANDAILING,"baju");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"celana");
        cv.put(MANDAILING,"salaor");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kaos kaki");
        cv.put(MANDAILING,"kaos pat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kemeja");
        cv.put(MANDAILING,"kameja");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kaca");
        cv.put(MANDAILING,"kaco");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kenapa");
        cv.put(MANDAILING,"asi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"waspada");
        cv.put(MANDAILING,"awas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"campur");
        cv.put(MANDAILING,"baur");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"belanja");
        cv.put(MANDAILING,"balanjo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bekam");
        cv.put(MANDAILING,"bokom");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bekas");
        cv.put(MANDAILING,"bokas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"belerang");
        cv.put(MANDAILING,"barerang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bengkak");
        cv.put(MANDAILING,"bosar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"monyet");
        cv.put(MANDAILING,"bodat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bersin");
        cv.put(MANDAILING,"barsi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lancar");
        cv.put(MANDAILING,"bulus");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bambu");
        cv.put(MANDAILING,"bulu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"martabat");
        cv.put(MANDAILING,"bajora");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rumah");
        cv.put(MANDAILING,"bagas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ranjau");
        cv.put(MANDAILING,"ranjau");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tali");
        cv.put(MANDAILING,"tali");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gulung");
        cv.put(MANDAILING,"balun");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cuci");
        cv.put(MANDAILING,"basu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dengar");
        cv.put(MANDAILING,"bege");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"marah");
        cv.put(MANDAILING,"mangalo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"diam");
        cv.put(MANDAILING,"sip");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"malas");
        cv.put(MANDAILING,"malosok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ketawa");
        cv.put(MANDAILING,"mantata");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rajin");
        cv.put(MANDAILING,"ringgas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kacang");
        cv.put(MANDAILING,"kacang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mari");
        cv.put(MANDAILING,"roson");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"hantu");
        cv.put(MANDAILING,"begu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bisul");
        cv.put(MANDAILING,"baro");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lorong");
        cv.put(MANDAILING,"banjar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kaleng");
        cv.put(MANDAILING,"belek");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"balai");
        cv.put(MANDAILING,"bale");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"banjir");
        cv.put(MANDAILING,"banjir");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"balas");
        cv.put(MANDAILING,"balos");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"baling");
        cv.put(MANDAILING,"baling");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kamar");
        cv.put(MANDAILING,"bilik");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"meledak");
        cv.put(MANDAILING,"bingkas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cerewet");
        cv.put(MANDAILING,"bek-bek");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"koreng");
        cv.put(MANDAILING,"biring");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"buka");
        cv.put(MANDAILING,"buka");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tutup");
        cv.put(MANDAILING,"tutup");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bungkuk");
        cv.put(MANDAILING,"bungkuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"busuk");
        cv.put(MANDAILING,"bucuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"buruk");
        cv.put(MANDAILING,"buruk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"telan");
        cv.put(MANDAILING,"tolon");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"muntah");
        cv.put(MANDAILING,"muta");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"parit");
        cv.put(MANDAILING,"bondar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"berat");
        cv.put(MANDAILING,"borat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"belut");
        cv.put(MANDAILING,"bolut");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"besi");
        cv.put(MANDAILING,"bosi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"anak perempuan");
        cv.put(MANDAILING,"boru");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"beban");
        cv.put(MANDAILING,"boban");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lumpur");
        cv.put(MANDAILING,"bustak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"benang");
        cv.put(MANDAILING,"bonang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bunga");
        cv.put(MANDAILING,"bunga");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"belang");
        cv.put(MANDAILING,"bolang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bantal");
        cv.put(MANDAILING,"bantal");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sembunyi");
        cv.put(MANDAILING,"monjap");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bongkar");
        cv.put(MANDAILING,"bungkar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"benam");
        cv.put(MANDAILING,"bonom");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"buncit");
        cv.put(MANDAILING,"busung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bundar");
        cv.put(MANDAILING,"bulat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bulat");
        cv.put(MANDAILING,"ibul");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bungkus");
        cv.put(MANDAILING,"bungkus");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"melintang");
        cv.put(MANDAILING,"bontang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"putar");
        cv.put(MANDAILING,"putar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bengkok");
        cv.put(MANDAILING,"bengkok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"banyak");
        cv.put(MANDAILING,"bahat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bahaya");
        cv.put(MANDAILING,"bahaya");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pelit");
        cv.put(MANDAILING,"codik");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"baik");
        cv.put(MANDAILING,"denggan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jahat");
        cv.put(MANDAILING,"jahat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bagi");
        cv.put(MANDAILING,"bagi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"buku");
        cv.put(MANDAILING,"buku");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pensil");
        cv.put(MANDAILING,"partolot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"penghapus");
        cv.put(MANDAILING,"pangapus");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bagaimana");
        cv.put(MANDAILING,"bia");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cahaya");
        cv.put(MANDAILING,"cahayo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gelap");
        cv.put(MANDAILING,"golap");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"senja");
        cv.put(MANDAILING,"senja");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cincang");
        cv.put(MANDAILING,"cang-cang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"potong");
        cv.put(MANDAILING,"gotap");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"celup");
        cv.put(MANDAILING,"colup");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"coret");
        cv.put(MANDAILING,"coret");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"coba");
        cv.put(MANDAILING,"cubo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"caci");
        cv.put(MANDAILING,"cela");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cabut");
        cv.put(MANDAILING,"cabut");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gula aren");
        cv.put(MANDAILING,"cokar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cebok");
        cv.put(MANDAILING,"cebok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jatuh");
        cv.put(MANDAILING,"dabu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"berdiri");
        cv.put(MANDAILING,"jongjong");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cabang");
        cv.put(MANDAILING,"dangka");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pohon");
        cv.put(MANDAILING,"pohon");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ikut");
        cv.put(MANDAILING,"dohot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dapat");
        cv.put(MANDAILING,"dapot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"anak-anak");
        cv.put(MANDAILING,"daganak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tungku");
        cv.put(MANDAILING,"dalihan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lempar");
        cv.put(MANDAILING,"ramban");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rasakan");
        cv.put(MANDAILING,"dai");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lemah");
        cv.put(MANDAILING,"lomah");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"damai");
        cv.put(MANDAILING,"dame");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lembut");
        cv.put(MANDAILING,"dayuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"keras");
        cv.put(MANDAILING,"pir");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lembek");
        cv.put(MANDAILING,"lambek");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sebagian");
        cv.put(MANDAILING,"deba");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pijak");
        cv.put(MANDAILING,"dege");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kawan");
        cv.put(MANDAILING,"dongan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dengki");
        cv.put(MANDAILING,"dongki");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dendam");
        cv.put(MANDAILING,"dondam");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"saat");
        cv.put(MANDAILING,"dompak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tarik");
        cv.put(MANDAILING,"ela");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"padi");
        cv.put(MANDAILING,"eme");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ember");
        cv.put(MANDAILING,"ember");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"uang");
        cv.put(MANDAILING,"epeng");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ilmu");
        cv.put(MANDAILING,"elmu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"agama");
        cv.put(MANDAILING,"ugama");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bohong");
        cv.put(MANDAILING,"gabus");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"janji");
        cv.put(MANDAILING,"janji");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"upah");
        cv.put(MANDAILING,"gaji");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ubi");
        cv.put(MANDAILING,"gadung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kentang");
        cv.put(MANDAILING,"kantang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kol");
        cv.put(MANDAILING,"kol");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cakar");
        cv.put(MANDAILING,"garut");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sekiranya");
        cv.put(MANDAILING,"gari");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"suka");
        cv.put(MANDAILING,"giot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"panjang");
        cv.put(MANDAILING,"ginjang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pendek");
        cv.put(MANDAILING,"pondok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"besar");
        cv.put(MANDAILING,"godang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"benci");
        cv.put(MANDAILING,"goyak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gelang");
        cv.put(MANDAILING,"golang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gulai");
        cv.put(MANDAILING,"gule");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kunci");
        cv.put(MANDAILING,"goruk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"genggam");
        cv.put(MANDAILING,"golom");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pegang");
        cv.put(MANDAILING,"tiop");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tonjok");
        cv.put(MANDAILING,"tenju");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gosok");
        cv.put(MANDAILING,"gosok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tukar");
        cv.put(MANDAILING,"gonti");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gelitik");
        cv.put(MANDAILING,"gitik");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lipstik");
        cv.put(MANDAILING,"gincu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gula");
        cv.put(MANDAILING,"gulo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"minyak");
        cv.put(MANDAILING,"miak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lada");
        cv.put(MANDAILING,"lada");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ketumbar");
        cv.put(MANDAILING,"katumbar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pinang");
        cv.put(MANDAILING,"pining");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rapuh");
        cv.put(MANDAILING,"gabur");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gali");
        cv.put(MANDAILING,"gali");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ganjal");
        cv.put(MANDAILING,"ganjal");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"orang");
        cv.put(MANDAILING,"alak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"terbang");
        cv.put(MANDAILING,"mabang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"habis");
        cv.put(MANDAILING,"abis");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"keperluan");
        cv.put(MANDAILING,"haporluan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kambing");
        cv.put(MANDAILING,"ambeng");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sapi");
        cv.put(MANDAILING,"sapi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rusa");
        cv.put(MANDAILING,"ursa");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kalilawar");
        cv.put(MANDAILING,"lompong");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gempa");
        cv.put(MANDAILING,"lalo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"periuk");
        cv.put(MANDAILING,"hudon");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"karung");
        cv.put(MANDAILING,"goni");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"malu");
        cv.put(MANDAILING,"ila");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kelapa");
        cv.put(MANDAILING,"arambir");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sampah");
        cv.put(MANDAILING,"asar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"platik");
        cv.put(MANDAILING,"palastik");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"botol");
        cv.put(MANDAILING,"botol");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kardus");
        cv.put(MANDAILING,"kardus");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gadis");
        cv.put(MANDAILING,"bujing");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bujang");
        cv.put(MANDAILING,"poso-poso");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jual");
        cv.put(MANDAILING,"gadis");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"beli");
        cv.put(MANDAILING,"tabusi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"buang air besar");
        cv.put(MANDAILING,"tetek");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"buang air kecil");
        cv.put(MANDAILING,"koncing");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kamar mandi");
        cv.put(MANDAILING,"sumur");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"genteng");
        cv.put(MANDAILING,"loteng");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"buaya");
        cv.put(MANDAILING,"biawak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"daun");
        cv.put(MANDAILING,"bulung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"telur");
        cv.put(MANDAILING,"pira");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pisau");
        cv.put(MANDAILING,"piso");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jam");
        cv.put(MANDAILING,"jom");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"balon");
        cv.put(MANDAILING,"gombung-gombung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"palu");
        cv.put(MANDAILING,"martil");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"obeng");
        cv.put(MANDAILING,"obeng");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kipas");
        cv.put(MANDAILING,"miak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kantong");
        cv.put(MANDAILING,"caku");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sisir");
        cv.put(MANDAILING,"suri");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jangka");
        cv.put(MANDAILING,"jongkar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kaki seribu");
        cv.put(MANDAILING,"ancicibang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"anjing");
        cv.put(MANDAILING,"anjing");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"badak");
        cv.put(MANDAILING,"badak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"macan");
        cv.put(MANDAILING,"babiat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"babi");
        cv.put(MANDAILING,"babi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kuda");
        cv.put(MANDAILING,"kudo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"petir");
        cv.put(MANDAILING,"ronggur");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kucing");
        cv.put(MANDAILING,"uting");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tupai");
        cv.put(MANDAILING,"kotok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"curut");
        cv.put(MANDAILING,"nit-nit");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"semut");
        cv.put(MANDAILING,"porkis");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"unta");
        cv.put(MANDAILING,"unto");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"laba-laba");
        cv.put(MANDAILING,"rambang-rambang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lada");
        cv.put(MANDAILING,"lada");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"hutan");
        cv.put(MANDAILING,"harangan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kurang");
        cv.put(MANDAILING,"urang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pelepah");
        cv.put(MANDAILING,"hodong");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rotan");
        cv.put(MANDAILING,"hotang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"selamat dan sehat");
        cv.put(MANDAILING,"horas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"heran");
        cv.put(MANDAILING,"homang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kembangkan");
        cv.put(MANDAILING,"hombang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dia");
        cv.put(MANDAILING,"ia");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"saya");
        cv.put(MANDAILING,"iba");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sesuai");
        cv.put(MANDAILING,"ibana");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sayalah");
        cv.put(MANDAILING,"ibama");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kasihan");
        cv.put(MANDAILING,"ibo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"saudara perempuan");
        cv.put(MANDAILING,"iboto");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bebek");
        cv.put(MANDAILING,"itik");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ibu");
        cv.put(MANDAILING,"inang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bersih");
        cv.put(MANDAILING,"ias");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kecoa");
        cv.put(MANDAILING,"ipos");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"caci");
        cv.put(MANDAILING,"incak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"alat penumbuk");
        cv.put(MANDAILING,"indalu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tampi");
        cv.put(MANDAILING,"induri");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nampak");
        cv.put(MANDAILING,"tarida");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tidak sadar");
        cv.put(MANDAILING,"tarabu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"terkejut");
        cv.put(MANDAILING,"tarsonggot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"enak");
        cv.put(MANDAILING,"tabo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tepat");
        cv.put(MANDAILING,"topet");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tepis");
        cv.put(MANDAILING,"topis");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tanduk");
        cv.put(MANDAILING,"tanduk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bolong");
        cv.put(MANDAILING,"tombuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pukul");
        cv.put(MANDAILING,"toko");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"terong");
        cv.put(MANDAILING,"torung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pinggir");
        cv.put(MANDAILING,"topi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kolam");
        cv.put(MANDAILING,"tobat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tempurung");
        cv.put(MANDAILING,"takar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"boleh");
        cv.put(MANDAILING,"tola");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tolak");
        cv.put(MANDAILING,"tulak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"contoh");
        cv.put(MANDAILING,"tiruan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nakal");
        cv.put(MANDAILING,"tangkang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"terang");
        cv.put(MANDAILING,"torang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tebu");
        cv.put(MANDAILING,"tobu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"teras");
        cv.put(MANDAILING,"toras");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"terasa");
        cv.put(MANDAILING,"taraso");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tepung");
        cv.put(MANDAILING,"topung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tua");
        cv.put(MANDAILING,"tobang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bau");
        cv.put(MANDAILING,"bau");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"adik ayah");
        cv.put(MANDAILING,"uda");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"hujan");
        cv.put(MANDAILING,"udan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ular");
        cv.put(MANDAILING,"ulok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"anak laki-laki");
        cv.put(MANDAILING,"ucok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kentut");
        cv.put(MANDAILING,"untut");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"obat");
        cv.put(MANDAILING,"ubat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"selimut");
        cv.put(MANDAILING,"ulos");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pernah");
        cv.put(MANDAILING,"unjung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ayam");
        cv.put(MANDAILING,"manuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bangun");
        cv.put(MANDAILING,"ngot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"selesai");
        cv.put(MANDAILING,"sidung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sebentar");
        cv.put(MANDAILING,"satongkin");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kalau");
        cv.put(MANDAILING,"muda");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"istirahat");
        cv.put(MANDAILING,"maradian");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"menjelang");
        cv.put(MANDAILING,"marayak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cucu");
        cv.put(MANDAILING,"pahompu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"muda");
        cv.put(MANDAILING,"poso");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tidak sehat");
        cv.put(MANDAILING,"marun");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"miskin");
        cv.put(MANDAILING,"miskin");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"panas");
        cv.put(MANDAILING,"milas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dingin");
        cv.put(MANDAILING,"ngali");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"hitam");
        cv.put(MANDAILING,"lom-lom");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kuning");
        cv.put(MANDAILING,"gorsing");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"merah");
        cv.put(MANDAILING,"rara");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bagus");
        cv.put(MANDAILING,"jeges");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"biasa");
        cv.put(MANDAILING,"biaso");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sempit");
        cv.put(MANDAILING,"sompit");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"biru");
        cv.put(MANDAILING,"rata");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ungu");
        cv.put(MANDAILING,"bungo torung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cokelat");
        cv.put(MANDAILING,"cokelat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kerbau");
        cv.put(MANDAILING,"orbo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kelinci");
        cv.put(MANDAILING,"urnap");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sepeda");
        cv.put(MANDAILING,"kareta angin");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"motor");
        cv.put(MANDAILING,"honda");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mobil");
        cv.put(MANDAILING,"motor");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kereta api");
        cv.put(MANDAILING,"kareta api");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sendal");
        cv.put(MANDAILING,"solop");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sepatu");
        cv.put(MANDAILING,"sipatu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kodok");
        cv.put(MANDAILING,"touk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kura-kura");
        cv.put(MANDAILING,"labi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lebah");
        cv.put(MANDAILING,"loba");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"belalang");
        cv.put(MANDAILING,"siapor");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"capung");
        cv.put(MANDAILING,"siri-siri");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kupu-kupu");
        cv.put(MANDAILING,"rama-rama");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jangkrik");
        cv.put(MANDAILING,"urindik");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jauh");
        cv.put(MANDAILING,"dao");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"dekat");
        cv.put(MANDAILING,"donok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bayam");
        cv.put(MANDAILING,"bayom");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kangkung");
        cv.put(MANDAILING,"angkung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kunyit");
        cv.put(MANDAILING,"nagorsing");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"jahe");
        cv.put(MANDAILING,"sipode");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sereh");
        cv.put(MANDAILING,"ciak-ciak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kemiri");
        cv.put(MANDAILING,"tanaon");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"karet");
        cv.put(MANDAILING,"koje");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nangka");
        cv.put(MANDAILING,"sibodak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"maaf");
        cv.put(MANDAILING,"moop");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"manisan");
        cv.put(MANDAILING,"madu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sudah");
        cv.put(MANDAILING,"madung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mabuk");
        cv.put(MANDAILING,"mabuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lepas");
        cv.put(MANDAILING,"malua");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"makan");
        cv.put(MANDAILING,"mangan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"patah");
        cv.put(MANDAILING,"maripuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"susah");
        cv.put(MANDAILING,"marsak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mandi");
        cv.put(MANDAILING,"maridi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lari");
        cv.put(MANDAILING,"lojong");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"marotak");
        cv.put(MANDAILING,"pecah");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"manis");
        cv.put(MANDAILING,"manis");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"masuk");
        cv.put(MANDAILING,"masuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"robek");
        cv.put(MANDAILING,"masuak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pecah");
        cv.put(MANDAILING,"matapor");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tidur");
        cv.put(MANDAILING,"modom");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lembam");
        cv.put(MANDAILING,"modar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tikus");
        cv.put(MANDAILING,"monci");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kecil");
        cv.put(MANDAILING,"menek");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"matang");
        cv.put(MANDAILING,"malamun");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"terkupas");
        cv.put(MANDAILING,"maluak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"musang");
        cv.put(MANDAILING,"misang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"berak");
        cv.put(MANDAILING,"miting");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pantul");
        cv.put(MANDAILING,"mantul");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"terbakar");
        cv.put(MANDAILING,"mosok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"malas");
        cv.put(MANDAILING,"malosok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"hancur");
        cv.put(MANDAILING,"maropuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nyeri");
        cv.put(MANDAILING,"manyiak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"basah");
        cv.put(MANDAILING,"maraek");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"minum");
        cv.put(MANDAILING,"minum");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pulang");
        cv.put(MANDAILING,"mulak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"belajar");
        cv.put(MANDAILING,"marsiajar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kerja");
        cv.put(MANDAILING,"karejo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gemuk");
        cv.put(MANDAILING,"mok-mok");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kurus");
        cv.put(MANDAILING,"marnyiang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"matahari");
        cv.put(MANDAILING,"mataniari");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"buta");
        cv.put(MANDAILING,"mapitung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"putus");
        cv.put(MANDAILING,"magotap");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"berenang");
        cv.put(MANDAILING,"marlange");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tidak");
        cv.put(MANDAILING,"nada");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nanti");
        cv.put(MANDAILING,"naron");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"semalam");
        cv.put(MANDAILING,"natuari");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tadi");
        cv.put(MANDAILING,"nangkin");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pupuk");
        cv.put(MANDAILING,"napu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mertua perempuan");
        cv.put(MANDAILING,"namboru");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"masa dulu");
        cv.put(MANDAILING,"najolo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"bawa");
        cv.put(MANDAILING,"oban");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lempar");
        cv.put(MANDAILING,"ramban");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gesek");
        cv.put(MANDAILING,"ogos");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cegat");
        cv.put(MANDAILING,"olat");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tiup");
        cv.put(MANDAILING,"ombus");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cepat");
        cv.put(MANDAILING,"ompot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nenek");
        cv.put(MANDAILING,"ompung");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"iya");
        cv.put(MANDAILING,"olo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mata angin");
        cv.put(MANDAILING,"ombas");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pecat");
        cv.put(MANDAILING,"ongkan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"benar");
        cv.put(MANDAILING,"botul");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sewa");
        cv.put(MANDAILING,"ongkos");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"yakan");
        cv.put(MANDAILING,"olohon");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"perahu");
        cv.put(MANDAILING,"parau");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tempat mandi");
        cv.put(MANDAILING,"paridian");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"simpan");
        cv.put(MANDAILING,"pajopi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"babat");
        cv.put(MANDAILING,"rabi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ragi");
        cv.put(MANDAILING,"ragi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ragu");
        cv.put(MANDAILING,"ragu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rezeki");
        cv.put(MANDAILING,"rasoki");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"gila");
        cv.put(MANDAILING,"rintik");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"koyak");
        cv.put(MANDAILING,"ribak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ricuh");
        cv.put(MANDAILING,"ribut");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tumbang");
        cv.put(MANDAILING,"rumbak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"raja");
        cv.put(MANDAILING,"raja");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"ikat");
        cv.put(MANDAILING,"kobe");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"datang");
        cv.put(MANDAILING,"ro");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sawah");
        cv.put(MANDAILING,"saba");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sebelah");
        cv.put(MANDAILING,"sabariba");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sepakat");
        cv.put(MANDAILING,"sarumbuk");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"seribu");
        cv.put(MANDAILING,"saribu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"semua");
        cv.put(MANDAILING,"sude");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sedikit");
        cv.put(MANDAILING,"saotik");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"pedas");
        cv.put(MANDAILING,"siak");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"garam");
        cv.put(MANDAILING,"sira");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"beduk");
        cv.put(MANDAILING,"tabu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tebang");
        cv.put(MANDAILING,"taba");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"hormat");
        cv.put(MANDAILING,"tabi");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tapi");
        cv.put(MANDAILING,"tai");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tangkap");
        cv.put(MANDAILING,"tangkup");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lurus");
        cv.put(MANDAILING,"lidang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nampak");
        cv.put(MANDAILING,"ongkan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"nyamuk");
        cv.put(MANDAILING,"ronggit");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lemari");
        cv.put(MANDAILING,"lamari");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sayang");
        cv.put(MANDAILING,"holong");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"cinta");
        cv.put(MANDAILING,"cinta");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"hidup");
        cv.put(MANDAILING,"mangolu");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mati");
        cv.put(MANDAILING,"mate");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kadal");
        cv.put(MANDAILING,"bajonggir");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"berani");
        cv.put(MANDAILING,"barani");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"takut");
        cv.put(MANDAILING,"mabiar");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"murah");
        cv.put(MANDAILING,"mura");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mahal");
        cv.put(MANDAILING,"magodang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"keriting");
        cv.put(MANDAILING,"kariting");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rusak");
        cv.put(MANDAILING,"sega");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"baru");
        cv.put(MANDAILING,"deges");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"kotor");
        cv.put(MANDAILING,"kotor");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"awal");
        cv.put(MANDAILING,"parmuloan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"akhir");
        cv.put(MANDAILING,"pangabisan");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"mudah");
        cv.put(MANDAILING,"momo");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"sulit");
        cv.put(MANDAILING,"susah");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"menang");
        cv.put(MANDAILING,"monang");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tebal");
        cv.put(MANDAILING,"apal");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tipis");
        cv.put(MANDAILING,"tipis");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"lengket");
        cv.put(MANDAILING,"lokot");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"tajam");
        cv.put(MANDAILING,"tajom");
        db.insert("kamus", null, cv);

        cv.put(INDONESIA,"rindu");
        cv.put(MANDAILING,"malungun");
        db.insert("kamus", null, cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
    @Override
    public void onCreate(SQLiteDatabase db){
    }

    public List<MyObject> readIndonesia(String searchTerm) {
        List<MyObject> recordsList = new ArrayList<MyObject>();

        // select query
        String sql = "";
        sql += "SELECT * FROM " + DATABASE_NAME;
        sql += " WHERE " + INDONESIA + " LIKE '" + searchTerm + "%'";
        sql += " ORDER BY " + INDONESIA + " DESC";
        sql += " LIMIT 0,10";

        SQLiteDatabase db = this.getWritableDatabase();

        // execute the query
        Cursor cursor = db.rawQuery(sql, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                String indonesia = cursor.getString(cursor.getColumnIndex(INDONESIA));
                String mandailing = cursor.getString(cursor.getColumnIndex(MANDAILING));
                MyObject myObject = new MyObject(indonesia, mandailing);

                // add to list
                recordsList.add(myObject);

            } while (cursor.moveToNext());
        }

        cursor.close();

        // return the list of records
        return recordsList;
    }

    public List<MyObject> readMandailing(String searchTerm) {
        List<MyObject> recordsList = new ArrayList<MyObject>();

        // select query
        String sql = "";
        sql += "SELECT * FROM " + DATABASE_NAME;
        sql += " WHERE " + MANDAILING + " LIKE '" + searchTerm + "%'";
        sql += " ORDER BY " + MANDAILING + " DESC";
        sql += " LIMIT 0,10";

        SQLiteDatabase db = this.getWritableDatabase();

        // execute the query
        Cursor cursor = db.rawQuery(sql, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {

                String indonesia = cursor.getString(cursor.getColumnIndex(INDONESIA));
                String mandailing = cursor.getString(cursor.getColumnIndex(MANDAILING));
                MyObject myObject = new MyObject(mandailing, indonesia);

                // add to list
                recordsList.add(myObject);

            } while (cursor.moveToNext());
        }

        cursor.close();

        // return the list of records
        return recordsList;
    }
}
