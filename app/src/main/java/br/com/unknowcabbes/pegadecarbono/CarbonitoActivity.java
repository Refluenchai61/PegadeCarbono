package br.com.unknowcabbes.pegadecarbono;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CarbonitoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carbonito);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_carbonito, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        final EditText agua = (EditText) findViewById(R.id.aguatxt);
        final EditText eletricidade = (EditText) findViewById(R.id.eletricidadetxt);
        switch (item.getItemId()){
            case R.id.calculaCo2:
                double calculo_CO2 = ((0.11 * Double.valueOf(String.valueOf(eletricidade.getText()))) + (0.11 * Double.valueOf(String.valueOf(agua.getText()))))/ 1000;
                Toast.makeText(CarbonitoActivity.this, "Sua emição de Co2 em toneladas é de " + calculo_CO2, Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
