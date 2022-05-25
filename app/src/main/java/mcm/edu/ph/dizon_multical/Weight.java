package mcm.edu.ph.dizon_multical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Weight extends AppCompatActivity implements View.OnClickListener {
    Button calculateWeight;
    EditText massWeight, accelerationWeight;
    TextView resultWeight;

    Formulas allformulas = new Formulas();
    Modules allmodules = new Modules();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        //Button
        calculateWeight = findViewById(R.id.calculateWeight);

        //EditText
        massWeight = findViewById(R.id.massDensity);
        accelerationWeight = findViewById(R.id.accelerationWeight);

        //TextView
        resultWeight = findViewById(R.id.resultWeight);

        calculateWeight.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calculateWeight:
                allmodules.setMass1(Double.parseDouble(massWeight.getText().toString()));
                allmodules.setAcceleration(Double.parseDouble(accelerationWeight.getText().toString()));
                double answer = allformulas.Weight(allmodules.getMass1(), allmodules.getAcceleration());
                resultWeight.setText(""+answer);
                break;
        }
    }
}