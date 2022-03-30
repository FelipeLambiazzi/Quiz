package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declarando as variaveis
    Button buttonCalcular;
    Spinner spinnerPergunta1;
    Spinner spinnerPergunta2;
    Spinner spinnerPergunta3;
    private TextView viewPontos;
    private int pontos = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //identificando onde estão as variaveis e linkando onde vão parar
        buttonCalcular = findViewById(R.id.buttonCalcular);
        spinnerPergunta1 = (Spinner) findViewById(R.id.spinnerPergunta1);
        spinnerPergunta2 = (Spinner) findViewById(R.id.spinnerPergunta2);
        spinnerPergunta3 = (Spinner) findViewById(R.id.spinnerPergunta3);
        viewPontos = findViewById(R.id.pontuacao);

        String[] respostas = getResources().getStringArray(R.array.pergunta1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, respostas);
        spinnerPergunta1.setAdapter(adapter);


        getResources().getStringArray(R.array.pergunta2);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, respostas);
        spinnerPergunta2.setAdapter(adapter1);


        getResources().getStringArray(R.array.pergunta3);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, respostas);
        spinnerPergunta3.setAdapter(adapter2);

        //chama o metodo
        verificaResposta();
    }
        public void verificaResposta () {
            buttonCalcular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String certo1, certo2, certo3;
                    certo1 = spinnerPergunta1.getSelectedItem().toString();
                    certo2 = spinnerPergunta1.getSelectedItem().toString();
                    certo3 = spinnerPergunta1.getSelectedItem().toString();

                    if (certo1 == "SOROCABA") {
                        pontos++;
                    }
                    if (certo2 == "FACULDADE DE ENGENHARIA DE SOROCABA") {
                        pontos++;
                    }
                    if (certo3 == "VESTIBULAR") {
                        pontos++;
                    }

                    viewPontos = findViewById(R.id.viewPontos);
                    viewPontos.setText("" + pontos);

                }
            });
        }

}
