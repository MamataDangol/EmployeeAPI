package com.mamata.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateDeleteEmployeeActivity extends AppCompatActivity {
   EditText etEmployeeId, etUpdateName, etUpdateSalary, etUpdateAge;
      Button btnUpdate, btnDelete, btnEmployeeIdSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_delete_employee);
        etEmployeeId = findViewById(R.id.etemployeeid);
        etUpdateName = findViewById(R.id.etUpdateName);
        etUpdateSalary = findViewById(R.id.etUpdateSalary);
        etUpdateAge = findViewById(R.id.etUpdateAge);
        btnDelete = findViewById(R.id.btnDelete);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnEmployeeIdSearch = findViewById(R.id.btnEmployeeIdSearch);

        btnEmployeeIdSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etEmployeeId.getText())){
                    etEmployeeId.setError("Please Enter Employee ID");
                    return;
                }
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etEmployeeId.getText())){
                    etEmployeeId.setError("Please enter employee id");
                    return;
                }
                if (TextUtils.isEmpty(etUpdateName.getText())){
                    etUpdateName.setError("Please enter employee name");
                    return;

                }
                if (TextUtils.isEmpty(etUpdateAge.getText())){
                    etUpdateAge.setError("Please enter employee age");
                    return;
                }
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etEmployeeId.getText())) {
                    etEmployeeId.setError("Please enter employee id");
                    return;
                }
            }
        });

    }
}
