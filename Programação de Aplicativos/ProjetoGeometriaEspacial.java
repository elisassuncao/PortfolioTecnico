package com.example.geoespacial;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton at, aba, abv, nl, af, vo, h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        at = findViewById(R.id.at);
        aba = findViewById(R.id.aba);
        abv = findViewById(R.id.abv);
        nl = findViewById(R.id.nl);
        af = findViewById(R.id.af);
        vo = findViewById(R.id.vo);
        h = findViewById(R.id.h);
    }
    public void click(View v){
        Intent i = new Intent(this, TelaCalculo.class);

        if(at.isChecked()){
            TelaCalculo.formula = 1;
            startActivity(i);
        }

        else if(aba.isChecked()){
            TelaCalculo.formula = 2;
            startActivity(i);
        }

        else if(abv.isChecked()){
            TelaCalculo.formula = 3;
            startActivity(i);
        }

        else if(nl.isChecked()){
            TelaCalculo.formula = 4;
            startActivity(i);
        }

        else if(af.isChecked()){
            TelaCalculo.formula = 5;
            startActivity(i);
        }

        else if(vo.isChecked()){
            TelaCalculo.formula = 6;
            startActivity(i);
        }

        else if(h.isChecked()){
            TelaCalculo.formula = 7;
            startActivity(i);
        }

        else{
            Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_LONG).show();
        }
    }

} 

package com.example.geoespacial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class TelaCalculo extends AppCompatActivity {
    static int formula;
    EditText et1, et2, et3;
    TextView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_calculo);
        getSupportActionBar().hide();
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        r = findViewById(R.id.resultado);
        organizaTela();
    }

    private void organizaTela() {
        if (formula == 1) {
            et1.setHint("Digite a área da base");
            et2.setHint("Digite o número de faces");
            et3.setHint("Digite a área da face lateral");

        } else if (formula == 2) {
            et1.setHint("Área Total");
            et2.setHint("Número de Faces Laterais");
            et3.setHint("Área das Faces Laterais");

        } else if (formula == 3) {
            et1.setHint("Volume");
            et2.setHint("Altura");
            et3.setVisibility(View.INVISIBLE);


        } else if (formula == 4) {
            et1.setHint("Área Total");
            et2.setHint("Área da Base");
            et3.setHint("Área da Face Lateral");


        } else if (formula == 5) {
            et1.setHint("Área Total");
            et2.setHint("Área da Base");
            et3.setHint("Número de Faces Laterais");

        } else if (formula == 6) {
            et1.setHint("Área da Base");
            et2.setHint("Altura");
            et3.setVisibility(View.INVISIBLE);

        } else if (formula == 7) {
            et1.setHint("Volume");
            et2.setHint("Área da Base");
            et3.setVisibility(View.INVISIBLE);

        }


    }
    public void alberto(View view){
        double conta;
        double a = Double.parseDouble(et1.getText().toString());
        double b = Double.parseDouble(et2.getText().toString());
        double c;

        switch(formula){
            case 1 :
                c = Double.parseDouble(et3.getText().toString());
                conta = 2*a + b*c;
                r.setText(conta+"");
                break;

            case 2 :
                c = Double.parseDouble(et3.getText().toString());
                conta = a - b*c / 2;
                r.setText(conta+"");
                break;

            case 4 :
                c = Double.parseDouble(et3.getText().toString());
                conta = a - 2*b / c;
                r.setText(conta+"");
                break;

            case 5 :
                c = Double.parseDouble(et3.getText().toString());
                conta = a - 2*b / c;
                r.setText(conta+"");
                break;

            case 3 :
                conta = a/b;
                r.setText(conta+"");
                break;

            case 6 :
                conta = a*b;
                r.setText(conta+"");
                break;

            case 7 :
                conta = a/b;
                r.setText(conta+"");
                break;

        }
    }
}
