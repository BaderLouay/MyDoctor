package com.baderlouay.monmedecinv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddDoctorActivity extends AppCompatActivity {

    EditText edUsernameD, edEmailD, edPasswordD, edConfirmD;
    Button btnD;
    TextView tvD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_doctor);

        edUsernameD = findViewById(R.id.editTextRegUsernameD);
        edPasswordD = findViewById(R.id.editTextRegPasswordD);
        edEmailD = findViewById(R.id.editTextRegEmailD);
        edConfirmD = findViewById(R.id.editTextRegConfirmPasswordD);
        btnD = findViewById(R.id.buttonRegisterD);
        tvD = findViewById(R.id.textViewExistingUserD);

        tvD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddDoctorActivity.this, LoginActivity.class));
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String doctor = edUsernameD.getText().toString();
                String spec = edEmailD.getText().toString();
                String address = edPasswordD.getText().toString();
                String fee = edConfirmD.getText().toString();

                Database db = new Database(getApplicationContext(), "mydoctor", null, 1);

                            db.addDoctor(doctor, spec, address, fee);
                            Toast.makeText(getApplicationContext(), "Record Inserted", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(AddDoctorActivity.this, LoginActivity.class));

            }
        });
    }

}