package com.mamata.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SearchEmployeeActivity extends AppCompatActivity {
   EditText etemployeeid ;
       Button btnsearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_employee);

        etemployeeid = findViewById(R.id.etemployeeid);
        btnsearch = findViewById(R.id.btnsearch);
        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etemployeeid.getText())){
                    etemployeeid.setError("PLEASE ENTER EMPLOYEE ID");
                    return;
                }
            }
        });
    }
}
