package br.com.up.testeapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    public  static  final  String ACTIVITY_MAIN = "ActivityMain";

    Button btnButton = (Button)findViewById(R.id.btnEnviar);
    btnEnvia

    /*
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

    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
