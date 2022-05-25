package mcm.edu.ph.dizon_multical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Speed extends AppCompatActivity implements View.OnClickListener {
    Button calculateSpeed;
    EditText distanceSpeed, timeSpeed;
    TextView resultSpeed;

    Formulas allformulas = new Formulas();
    Modules allmodules = new Modules();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        //Button
        calculateSpeed = findViewById(R.id.calculateSpeed);

        //EditText
        distanceSpeed = findViewById(R.id.distanceSpeed);
        timeSpeed = findViewById(R.id.timeSpeed);

        //TextView
        resultSpeed = findViewById(R.id.resultSpeed);

        calculateSpeed.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calculateSpeed:
                allmodules.setDistance(Double.parseDouble(distanceSpeed.getText().toString()));
                allmodules.setTime(Double.parseDouble(timeSpeed.getText().toString()));
                double answer = allformulas.Speed(allmodules.getDistance(), allmodules.getTime());
                resultSpeed.setText("" + answer);
                break;

        }
    }
}