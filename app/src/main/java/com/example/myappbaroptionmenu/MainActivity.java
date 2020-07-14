package com.example.myappbaroptionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.Home:
                Toast.makeText(getApplicationContext(),"Home menu item selected",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.AboutUs:
                Toast.makeText(getApplicationContext(),"About us menu item selected",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.Contact:
                Toast.makeText(getApplicationContext(),"Contact menu item selected",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.icon1:
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("google.com"));
                startActivity(i);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

        public void callsecondactivity(View view) {
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}