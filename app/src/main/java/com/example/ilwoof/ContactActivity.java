package com.example.ilwoof;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button logoutButton = (Button) findViewById(R.id.logout);
        logoutButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ContactActivity.this, MainActivity.class));
            }
        });


        List<User> users = new ArrayList<>();
        users.add(new User(R.drawable.yohai, "Yohai", "yohai.s@gmail.com"));
        users.add(new User(R.drawable.danielle, "Danielle", "danielle.b@gmail.com"));
        users.add(new User(R.drawable.ziv, "Ziv", "ziv.m@gmail.com"));

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(false);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);

        UserAdapter adapter = new UserAdapter(users);
        recyclerView.setAdapter(adapter);
    }
}