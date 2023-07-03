package com.baderlouay.monmedecinv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    {"Doctor Name : Zaki Hidouri", "Adress : Avenue Avicenne doualy… Ariana Ariana Ville", "Exp : 8 yrs", "Mobile N° : XX XXX XXX", "60 DT"},
                    {"Doctor Name : Houcine Mnasri", "Adress : 153 avenue habib bourguiba-… Ariana Ariana Ville", "Exp : 12 yrs", "Mobile N° : XX XXX XXX", "65 DT"},
                    {"Doctor Name : Ghanem Mtibaa", "Adress : Rue Hedi Nouira, Immeuble… Sfax Sfax Ville", "Exp : 13 yrs", "Mobile N° : XX XXX XXX", "65 DT"},
                    {"Doctor Name : Ikbel Mbarek", "Adress : Cité awled bouyahi… Gafsa Redeyef", "Exp : 9 yrs", "Mobile N° : XX XXX XXX", "70 DT"},
                    {"Doctor Name : Mohamed Mlik", "Adress : palmarium sfax 3027… Ariana Ariana Ville", "Exp : 5 yrs", "Mobile N° : XX XXX XXX", "70 DT"},
                    {"Doctor Name : Nizar Abdedaiem", "Adress : Erable medical cabinet… Tunis La Goulette", "Exp : 12 yrs", "Mobile N° : XX XXX XXX", "50 DT"},
                    {"Doctor Name : Mahmoud Ayari", "Adress : 82 Ave Hassen Nouri,… Bizerte Bizerte Nord", "Exp : 14 yrs", "Mobile N° : XX XXX XXX", "70 DT"},
                    {"Doctor Name : Amira Dgham", "Adress : rue farhat hashed Ariana Ariana Ville", "Exp : 12 yrs", "Mobile N° : XX XXX XXX", "80 DT"},
                    {"Doctor Name : Anane Lamia Ben Hassin", "Adress : Dar el hakim à coté… Médenine Djerba - Houmt Souk", "Exp : 7 yrs", "Mobile N° : XX XXX XXX", "75 DT"}
            };

    private String[][] doctor_details2 =
            {
                    {"Doctor Name : Hana Briki", "Adress : El ghazala centre,avenue… Ariana Ariana Ville", "Exp : 7 yrs", "Mobile N° : XX XXX XXX", "60 DT"},
                    {"Doctor Name : Fatma Mahjoub", "Adress : El Menzah 5 Ariana Tunisia  ", "Exp : 12 yrs", "Mobile N° : XX XXX XXX", "50 DT"},
                    {"Doctor Name : Zouhaier Chater", "Adress : Les Berges Du Lac Tunis Tunisia ", "Exp : 12 yrs", "Mobile N° : XX XXX XXX", "50 DT"},
                    {"Doctor Name : Manel Bousselmi", "Adress : Centre Horizon Médical 1er étage,Route de Bizerte Km4", "Exp : 11 yrs", "Mobile N° : XX XXX XXX", "80 DT"},
                    {"Doctor Name : Manel Arfaoui", "Adress : 74 Avenue haramayn sharifayn, résidence houcine, Mourouj 3", "Exp : 8 yrs", "Mobile N° : XX XXX XXX", "75 DT"},
                    {"Doctor Name : Mohamed Hassen Bessaidi", "Adress : Centre médical Hannibal, 3 ème étage, jardins du lac", "Exp : 5 yrs", "Mobile N° : XX XXX XXX", "60 DT"},
                    {"Doctor Name : Wafa Said", "Adress : Centre médical jardins de carthage 75 avenue de carthage", "Exp : 15 yrs", "Mobile N° : XX XXX XXX", "75 DT"},
            };

    private String[][] doctor_details3 =
            {
                    {"Doctor Name : Raja Touzri", "Adress : Centre Médical el Ghazela,… Ariana Raoued", "Exp : 12 yrs", "Mobile N° : XX XXX XXX", "50 DT"},
                    {"Doctor Name : Issam Hajlaoui", "Adress : immeuble baklouti 2éme… Sidi Bouzid Bir El Hafey", "Exp : 11 yrs", "Mobile N° : XX XXX XXX", "70 DT"},
                    {"Doctor Name : Fares Turki", "Adress : Centre Tunisie Médicale… Ariana Ariana Ville", "Exp : 10 yrs", "Mobile N° : XX XXX XXX", "45 DT"},
                    {"Doctor Name : Zakaria Dekli", "Adress : 242 Avenue Habib Bourguiba,… Tunis Le Kram", "Exp : 8 yrs", "Mobile N° : XX XXX XXX", "90 DT"},
                    {"Doctor Name : Haykel Kamoun", "Adress : Centre Maghreb Médical… Tunis Centre ville", "Exp : 8 yrs", "Mobile N° : XX XXX XXX", "75 DT"},
                    {"Doctor Name : Soumaya Ben Aissa", "Adress : Cabinet Dr Soumaya Ben… Ariana Ariana Ville", "Exp : 7 yrs", "Mobile N° : XX XXX XXX", "45 DT"},
                    {"Doctor Name : Ilhem Mili", "Adress : Hôpital Charles Nicolle,… Ariana Ariana Ville", "Exp : 14 yrs", "Mobile N° : XX XXX XXX", "60 DT"},
                    {"Doctor Name : Mohame Khelif", "Adress : Hermes Médical en face… Nabeul Grombalia", "Exp : 12 yrs", "Mobile N° : XX XXX XXX", "60 DT"},
                    {"Doctor Name : Mejda Gharbi", "Adress : 52 avenue de la liberté,… Nabeul Korba", "Exp : 15 yrs", "Mobile N° : XX XXX XXX", "85 DT"},
            };

    private String[][] doctor_details4 =
            {
                    {"Doctor Name : Mohamed Chakroun", "Adress : R6W2+97 Tunis Tunis Cité El Khadra", "Exp : 17 yrs", "Mobile N° : XX XXX XXX", "300 DT"},
                    {"Doctor Name : Yacine Ben Safta", "Adress : 3e étage, Cabinet A… Ariana Ariana Ville", "Exp : 12 yrs", "Mobile N° : XX XXX XXX", "240 DT"},
                    {"Doctor Name : Haythem Rekik", "Adress : Dar Tabib Gabès , 1er… Gabès Gabès Medina", "Exp : 11 yrs", "Mobile N° : XX XXX XXX", "230 DT"},
                    {"Doctor Name : Selim Ben Jaafar", "Adress : 131 avenue de la liberte Tunis Bab El Bhar", "Exp : 10 yrs", "Mobile N° : XX XXX XXX", "370 DT"},
                    {"Doctor Name : Khaled Khadhri", "Adress : IRIS medical Center… Ariana Ariana Ville", "Exp : 7 yrs", "Mobile N° : XX XXX XXX", "290 DT"},
                    {"Doctor Name : Lazhar Othmani", "Adress : Centre Tunisie Médicale… Ariana Ariana Ville", "Exp : 8 yrs", "Mobile N° : XX XXX XXX", "225 DT"},
                    {"Doctor Name : Wassim Mahjoub", "Adress : 56 rue de l'environnement… Nabeul Menzel Temime", "Exp : 14 yrs", "Mobile N° : XX XXX XXX", "345 DT"},
                    {"Doctor Name : Sofien Abida", "Adress : Imm. Medical City .… Ariana Ariana Ville", "Exp : 7 yrs", "Mobile N° : XX XXX XXX", "400 DT"},
                    {"Doctor Name : Mehdi Ben Ammar", "Adress : Centre Tunisie Médicale… Ariana Ariana Ville", "Exp : 21 yrs", "Mobile N° : XX XXX XXX", "210 DT"},
                    {"Doctor Name : Mohamed Hichem Boulila", "Adress : Centre Tunisie Médicale… Ariana Ariana Ville", "Exp : 13 yrs", "Mobile N° : XX XXX XXX", "240 DT"}
            };

    private String[][] doctor_details5 =
            {
                    {"Doctor Name : Kais Mrabet", "Adress : Coral Medical Center Ariana Ariana Ville", "Exp : 12 yrs", "Mobile N° : XX XXX XXX", "120 DT"},
                    {"Doctor Name : Houssem El Manaa", "Adress : 56 rue de l'environnement… Nabeul Menzel Temime", "Exp : 14 yrs", "Mobile N° : XX XXX XXX", "90 DT"},
                    {"Doctor Name : Mohamed Sghaier", "Adress : 29 Avenue Farhat Hached… Ben Arous Mégrine", "Exp : 9 yrs", "Mobile N° : XX XXX XXX", "50 DT"},
                    {"Doctor Name : Karim Mani", "Adress : Rue Zouila 5100 Mahdia… Mahdia Mahdia", "Exp : 20 yrs", "Mobile N° : XX XXX XXX", "50 DT"}
            };
    TextView tv;
    Button btn;
    String[][] doctor_details = {};
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonDDBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Anaesthesia")==0)
            doctor_details = doctor_details1;
        else
        if (title.compareTo("Dietician")==0)
            doctor_details = doctor_details2;
        else
        if (title.compareTo("Ophthalmologist")==0)
            doctor_details = doctor_details3;
        else
        if (title.compareTo("Surgeon")==0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;

            btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorDetailsActivity.this,FindDoctorActivity.class));
            }
        });

        list = new ArrayList();
        for(int i =0;i<doctor_details.length;i++) {
            item = new HashMap<String,String>();
            item.put( "line1", doctor_details[i][0]);
            item.put( "line2", doctor_details[i][1]);
            item.put( "line3", doctor_details[i][2]);
            item.put( "line4", doctor_details[i][3]);
            item.put( "line5", "Fee:"+doctor_details[i][4]);
            list.add( item );
        }
        sa = new SimpleAdapter(this,list,
                R.layout.multi_lines,
                new String[]{"line1","line2","line3","line4","line5"},
                new int[]{R.id.line_a,R.id.line_b,R.id.line_c,R.id.line_d,R.id.line_e}
                );
        ListView lst = findViewById(R.id.listViewDD);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(DoctorDetailsActivity.this,BookAppointmentActivity.class);
                it.putExtra("text1",title);
                it.putExtra("text2",doctor_details[i][0]);
                it.putExtra("text3",doctor_details[i][1]);
                it.putExtra("text4",doctor_details[i][3]);
                it.putExtra("text5",doctor_details[i][4]);
                startActivity(it);
            }
        });
    }
}