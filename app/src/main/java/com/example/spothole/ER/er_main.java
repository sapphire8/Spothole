package com.example.spothole.ER;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.spothole.R;
import com.google.firebase.auth.FirebaseAuth;

public class er_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_er_main);


        Button btn=findViewById(R.id.buttonLogoutER);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth firebaseAuth;
                firebaseAuth= FirebaseAuth.getInstance();
                firebaseAuth.signOut();
                Intent logout=new Intent(er_main.this, er_login.class);
                startActivity(logout);
                finish();
                Toast.makeText(er_main.this, "You have logged out successfully!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
