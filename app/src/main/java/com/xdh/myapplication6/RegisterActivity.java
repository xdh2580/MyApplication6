package com.xdh.myapplication6;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
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
                    MyDBOpenHelper myDBOpenHelper = new MyDBOpenHelper(RegisterActivity.this,"mydb",null,1);
                   SQLiteDatabase db = myDBOpenHelper.getWritableDatabase();
                    ContentValues values1 = new ContentValues();
                    values1.put("user_id", "004" );
                    values1.put("name", name );
                    values1.put("password", password1 );
                    //参数依次是：表名，强行插入null值得数据列的列名，一行记录的数据
                    db.insert("user", null, values1);
                    Toast.makeText(RegisterActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}