package com.example.hellomenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //chama menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.item_sobre){
            //faz alguma coisa
            Intent intent = new Intent(this, SobreActivity.class);
            intent.putExtra("TITULO", "Sobre");
            startActivity(intent);
        }
        else if (id == R.id.item_contato){
            Intent intent = new Intent(this, SobreActivity.class);
            intent.putExtra("TITULO", "Contato");
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }


}
