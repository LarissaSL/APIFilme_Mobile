package com.example.apifilme;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText searchBar;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchBar = findViewById(R.id.searchBar);
        searchButton = findViewById(R.id.searchButton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchTerm = searchBar.getText().toString().trim();
                if (!searchTerm.isEmpty()) {
                    iniciarBusca(searchTerm);
                }
            }
        });
    }

    private void iniciarBusca(String termoBusca) {
        Intent intent = new Intent(this, TelaInfoFilme.class);
        intent.putExtra("busca", termoBusca);
        startActivity(intent);
    }
}