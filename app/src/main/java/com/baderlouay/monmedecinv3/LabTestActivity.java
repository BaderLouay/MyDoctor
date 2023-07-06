package com.baderlouay.monmedecinv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class LabTestActivity extends AppCompatActivity {

    private String[][] packages =
            {
                    {"Package 1 : Full Body Checkup", "Available cities : xxxxxx","","","xxx"},
                    {"Package 2 : Blood Glucose Fasting", "Available cities : xxxxxx","","","xxx"},
                    {"Package 3 : COVID-19 Antibody - IgG", "Available cities : xxxxxx","","","xxx"},
                    {"Package 4 : Thyroid Check", "Available cities : xxxxxx","","","xxx"},
                    {"Package 5 : Immunity Check", "Available cities : xxxxxx","","","xxx"},
            };

    private String[] package_details =
            {
              "Blood Glucose Fasting\n" +
                      "Complete Hemogram\n" +
                      "HbA1c\n" +
                      "Iron Studies\n" +
                      "Kidney Function Test\n" +
                      "LDH Lactate Dehydrogenase, Serum\n" +
                      "Lipid Profile\n" +
                      "Liver Function Test",
              "Blood Clucose Fasting",
              "COVID-19 Antibody - IgG",
              "Thyroid Profile-Total (T3, T4 & TSH Ultra-sensitive",
              "Complete Hemogram\n" +
                      "CRP (C Reactive Protein) Quantitative, Serum\n" +
                      "Iron Studies\n" +
                      "Kidney Function Test\n" +
                      "Vitamin D Total-25 Hydroxy\n" +
                      "Liver Function Test\n" +
                      "Lipid Profile"
            };
    HashMap<String,String> item;
    ArrayList list;
    SimpleAdapter sa;
    Button btnGoToCart, btnBack;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_test);

        btnGoToCart = findViewById(R.id.buttonLTGoToCart);
        btnBack = findViewById(R.id.buttonLTBack);
        listView = findViewById(R.id.listViewLT);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabTestActivity.this,HomeActivity.class));
            }
        });

        list = new ArrayList();
        for(int i=0;i<packages.length;i++) {
            item = new HashMap<String,String>();
            item.put( "line1", packages[i][0]);
            item.put( "line2", packages[i][1]);
            item.put( "line3", packages[i][2]);
            item.put( "line4", packages[i][3]);
            item.put( "line5", "Total Cost : " + packages[i][4] + "DT");
            list.add(item);
        }
    }
}