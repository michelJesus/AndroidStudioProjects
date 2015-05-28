package br.com.up.appactivitiesdozero;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class DestinoActivity extends ListActivity {
/*
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("STR_MSG");
        TextView txt = (TextView) findViewById(R.id.txtDestino);
        txt.setText(msg);
    }
*/

        //Array de strings hardcode
        private String[] alunos = {"Paulo", "Ana", "Joao", "Ricardo", "Maria", "Juliana", "Ademir", "Nilson"};

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_destino);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, alunos);
            setListAdapter(adapter);
        }
}
