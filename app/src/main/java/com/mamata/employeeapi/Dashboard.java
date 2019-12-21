package com.mamata.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
    Button btnshowallemployee, btnregisteremployee, btnsearchemployee, btnupdatedelete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnshowallemployee = findViewById(R.id.btnshowallemployee);
        btnregisteremployee = findViewById(R.id.btnregisteremployee);
        btnsearchemployee = findViewById(R.id.btnsearchemployee);
        btnupdatedelete = findViewById(R.id.btnupdatedelete);

        btnshowallemployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnregisteremployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, RegisterEmployeeActivity.class);
                startActivity(intent);

            }
        });

        btnsearchemployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, SearchEmployeeActivity.class);
                startActivity(intent);

            }
        });

        btnupdatedelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, UpdateDeleteEmployeeActivity.class);
                startActivity(intent);
            }
        });
    }
}
