package com.mamata.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterEmployeeActivity extends AppCompatActivity {
EditText etname, etsalary, etage;
Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_employee);
        etname = findViewById(R.id.etname);
        etage = findViewById(R.id.etage);
        etsalary = findViewById(R.id.etsalary);
        btnregister = findViewById(R.id.btnregister);

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(etname.getText())){
                    etname.setError("Please enter employee name");
                    return;
                }

                if (TextUtils.isEmpty(etsalary.getText())){
                        etsalary.setError("please enter employee salary");
                        return;
                }

                if (TextUtils.isEmpty(etage.getText())){
                    etage.setError("please enter age");
                    return;
                }
            }
        });
    }
}
