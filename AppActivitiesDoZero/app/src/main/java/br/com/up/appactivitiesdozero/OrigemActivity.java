package br.com.up.appactivitiesdozero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class OrigemActivity extends AppCompatActivity {

    public static final String ORIGEM_ACTIVITY = "OrigemActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_origem);
        Log.d(ORIGEM_ACTIVITY, "onCreate()");
/*
        Button btnEnviar = (Button)findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v) {
                EditText listNome = (EditText)findViewById(R.id.list_item)
            }
        });

        */


        Button btnEnviar = (Button)findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText txtMensagem = (EditText)findViewById(R.id.txtMensagem);
                String mensagem = txtMensagem.getText().toString();
                Intent intencao = new Intent(OrigemActivity.this, DestinoActivity.class);
                intencao.putExtra("STR_MSG", mensagem);
                startActivity(intencao);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(ORIGEM_ACTIVITY, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(ORIGEM_ACTIVITY, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(ORIGEM_ACTIVITY, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(ORIGEM_ACTIVITY, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(ORIGEM_ACTIVITY, "onDestroy()");
    }
}