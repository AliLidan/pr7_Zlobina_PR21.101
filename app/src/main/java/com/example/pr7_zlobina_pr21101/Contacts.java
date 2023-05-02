package com.example.pr7_zlobina_pr21101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Contacts extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);
        Button bt = findViewById(R.id.button7);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.button7){
            Intent intent = new Intent(this, SignIn.class);
            startActivity(intent);
        }
        else
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Невозможно выполнить!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
