package mcm.edu.ph.dizon_multical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Force extends AppCompatActivity implements View.OnClickListener {
    Button calculateForce;
    EditText massForce, accelerationForce;
    TextView resultForce;

    Formulas allformulas = new Formulas();
    Modules allmodules = new Modules();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force);

        //Button
        calculateForce = findViewById(R.id.calculateForce);

        //EditText
        massForce = findViewById(R.id.massForce);
        accelerationForce = findViewById(R.id.accelerationForce);

        //TextView
        resultForce = findViewById(R.id.resultForce);

        calculateForce.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calculateForce:
                allmodules.setMass2(Double.parseDouble(massForce.getText().toString()));
                allmodules.setAcceleration1(Double.parseDouble(accelerationForce.getText().toString()));
                double answer = allformulas.Force(allmodules.getMass2(), allmodules.getAcceleration1());
                resultForce.setText("" + answer);
                break;

        }
    }
}