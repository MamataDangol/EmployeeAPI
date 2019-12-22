package com.mamata.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.mamata.employeeapi.API.EmployeeAPI;
import com.mamata.employeeapi.model.Employee;
import com.mamata.employeeapi.url.URL;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ShowAllEmployeeActivity extends AppCompatActivity {
    TextView tvOutput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all_employee);
        tvOutput = findViewById(R.id.tvOutput);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL.base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EmployeeAPI employeeAPI = retrofit.create(EmployeeAPI.class);
        Call<List<Employee>> listCall = employeeAPI.getAllEmployees();

        //Asynchronous call
        listCall.enqueue(new Callback<List<Employee>>() {
            @Override
            public void onResponse(Call<List<Employee>> call, Response<List<Employee>> response) {

                if (!response.isSuccessful()){
                    Toast.makeText(ShowAllEmployeeActivity.this, "Error code", Toast.LENGTH_SHORT).show();
                    return;
                }
                List<Employee> employeeList = response.body();

                for (Employee emp: employeeList){
                    String data = "";
                    data += "Name is :" + emp.getEmployee_name() + "\n";
                    data += "Salary is :" + emp.getEmployee_salary() + "\n";
                    data += "Age is :" + emp.getEmployee_age() + "\n";

                    data += "-------------------" + "\n";
                    tvOutput.append(data);


                }


            }

            @Override
            public void onFailure(Call<List<Employee>> call, Throwable t) {
                Log.d("msg", "onFailure:" + t.getLocalizedMessage());
                Toast.makeText(ShowAllEmployeeActivity.this, "Error", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
