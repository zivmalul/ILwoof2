package com.example.ilwoof;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button logoutButton = (Button) findViewById(R.id.logout);
        logoutButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
            }
        });


        List<MenuOption> options = new ArrayList<>();
        options.add(new MenuOption(R.drawable.videos, "Videos", "see recommended videos", VideosActivity.class));
        options.add(new MenuOption(R.drawable.tutorials, "Tutorials", "Useful tutorials and guidelines", TutorialsActivity.class));
        options.add(new MenuOption(R.drawable.contact, "Contact us", "Let's be in touch!", ContactActivity.class));

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(false);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);

        MenuOptionsAdapter adapter = new MenuOptionsAdapter(options);
        recyclerView.setAdapter(adapter);
    }
}