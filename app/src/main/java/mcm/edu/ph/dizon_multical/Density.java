package mcm.edu.ph.dizon_multical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Density extends AppCompatActivity implements View.OnClickListener{
    Button calculateDensity;
    EditText massDensity, volumeDensity;
    TextView resultDensity;

    Formulas allformulas = new Formulas();
    Modules allmodules = new Modules();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_density);

        //Button
        calculateDensity = findViewById(R.id.calculateDensity);

        //EditText
        massDensity = findViewById(R.id.massDensity);
        volumeDensity = findViewById(R.id.volumeDensity);

        //TextView
        resultDensity = findViewById(R.id.resultDensity);

        calculateDensity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calculateDensity:
                allmodules.setMass(Double.parseDouble(massDensity.getText().toString()));
                allmodules.setVolume(Double.parseDouble(volumeDensity.getText().toString()));
                double answer = allformulas.Density(allmodules.getMass(),allmodules.getVolume());
                resultDensity.setText(""+answer);
                break;
        }

    }
}