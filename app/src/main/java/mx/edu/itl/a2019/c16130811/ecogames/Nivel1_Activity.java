package mx.edu.itl.a2019.c16130811.ecogames;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Chronometer;

public class Nivel1_Activity extends Activity {

    private Chronometer chronometer;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel1_);
        chronometer = findViewById(R.id.chronometer);
        chronometer.start();
    }
}
