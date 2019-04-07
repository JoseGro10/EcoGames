package mx.edu.itl.a2019.c16130811.ecogames;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciar(View v){
        Intent intent = new Intent(MainActivity.this,Nivel1_Activity.class);
        startActivity(intent);
    }
}
