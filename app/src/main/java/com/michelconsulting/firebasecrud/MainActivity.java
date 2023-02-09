package com.michelconsulting.firebasecrud;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit_name = findViewById(R.id.edit_name);
        EditText edit_position = findViewById(R.id.edit_position);
        Button bt_submit = findViewById(R.id.bt_submit);

        DaoEmployee dao = new DaoEmployee();

        //Create
//        bt_submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Employee employee = new Employee(edit_name.getText().toString(), edit_position.getText().toString());
//                dao.add(employee).addOnSuccessListener(suc -> {
//                    Toast.makeText(MainActivity.this, "Record is inserted", Toast.LENGTH_SHORT).show();
//                }).addOnFailureListener(er -> {
//                    Toast.makeText(MainActivity.this, er.getMessage(), Toast.LENGTH_SHORT).show();
//                });
//            }
//        });


        //Update
//        bt_submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                HashMap<String, Object> hashMap = new HashMap<>();
//                hashMap.put("name", edit_name.getText().toString());
//                hashMap.put("position", edit_position.getText().toString());
//                dao.update("-NNbvHDFv8IRQRyFtmTn", hashMap).addOnSuccessListener(suc -> {
//                    Toast.makeText(MainActivity.this, "Record is updated", Toast.LENGTH_SHORT).show();
//                }).addOnFailureListener(er -> {
//                    Toast.makeText(MainActivity.this, er.getMessage(), Toast.LENGTH_SHORT).show();
//                });
//            }
//        });
//    }

        //Delete
        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               dao.remove("-NNbvSkiStapUbsBeFBZ").addOnSuccessListener(suc -> {
                    Toast.makeText(MainActivity.this, "Record is removed", Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er -> {
                    Toast.makeText(MainActivity.this, er.getMessage(), Toast.LENGTH_SHORT).show();
                });
            }
        });
    }
}