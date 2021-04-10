package com.xdh.myapplication6;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);






        Button button_next = (Button) findViewById(R.id.button_next);
        button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                EditText edit_name = (EditText) findViewById(R.id.edit_name);
                EditText edit_password1 = (EditText) findViewById(R.id.edit_password1);
                EditText edit_password2 = (EditText) findViewById(R.id.edit_password2);
                String name = edit_name.getText().toString();
                String password1 = edit_password1.getText().toString();
                String password2 = edit_password2.getText().toString();

                if(!password1.equals(password2)){
                    Toast.makeText(RegisterActivity.this, "p1:"+password1+" p2:"+password2, Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}