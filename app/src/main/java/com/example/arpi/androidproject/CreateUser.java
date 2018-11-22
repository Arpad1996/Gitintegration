package com.example.arpi.androidproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateUser extends AppCompatActivity{

    private static final String TAG = "Create User";

    EditText firstName;
    EditText lastName;
    EditText email;
    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.create_user);

        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
        email = findViewById(R.id.email);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, msg:"onClick: firstName: " + firstName.getText().toString());
            }
        });

    }
}
