package com.portfolio.rainbowx.Graduation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.portfolio.rainbowx.R;

public class Graduation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        getSupportActionBar().setTitle("Education");}
    public void onHome(View v){

        startActivity(new Intent(Graduation.this,Home.class));
    }
    public void onSchool(View v){

        startActivity(new Intent(Graduation.this,Graduation.class));
    }
    public void onHobby(View v){

        startActivity(new Intent(Graduation.this,Hobby.class));
    }
    public void onContact(View v){

        startActivity(new Intent(Graduation.this,Contact.class));
    }
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
