package com.example.pr7_zlobina_pr21101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignIn extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        Button btn = findViewById(R.id.button2);
    }
    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.button2){
            Intent intent = new Intent(this, Profile.class);
            startActivity(intent);
        }
        else
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Невозможно выполнить!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
