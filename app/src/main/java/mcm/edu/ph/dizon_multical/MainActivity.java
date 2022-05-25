package mcm.edu.ph.dizon_multical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button speedButton, densityButton, forceButton, weightButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Buttons
        speedButton = findViewById(R.id.speedButton);
        densityButton = findViewById(R.id.densityButton);
        forceButton = findViewById(R.id.forceButton);
        weightButton = findViewById(R.id.weightButton);

        speedButton.setOnClickListener(this);
        densityButton.setOnClickListener(this);
        forceButton.setOnClickListener(this);
        weightButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.speedButton:
                Intent intent = new Intent(MainActivity.this,Speed.class);
                startActivity(intent);
                break;
            case R.id.densityButton:
                Intent intent2 = new Intent(MainActivity.this,Density.class);
                startActivity(intent2);
                break;
            case R.id.forceButton:
                Intent intent3 = new Intent(MainActivity.this,Force.class);
                startActivity(intent3);
                break;
            case R.id.weightButton:
                Intent intent4 = new Intent(MainActivity.this,Weight.class);
                startActivity(intent4);
                break;
        }

    }
}