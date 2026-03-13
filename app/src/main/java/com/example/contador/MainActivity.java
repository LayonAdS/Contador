package com.example.contador;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // definior variaveis globais (objetos da tela)
    private int contador=0;
    private TextView tvContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // vincular os componentes xrl com java
        tvContador = findViewById(R.id.tvContador);
        Button btnInc = findViewById(R.id.btnIncrementar);
        Button btnDec = findViewById(R.id.btnDecrementar);

        // eventos de click para inicrementar



        });
    }
}