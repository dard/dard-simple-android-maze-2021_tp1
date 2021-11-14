package ar.edu.ips.aus.seminario2.sampleproject;

import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.app.Activity;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        Button play = (Button) findViewById(R.id.btnplay);
        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startGame = new Intent(SplashActivity.this, GameSelectionActivity.class);
                startActivity(startGame);
                finish();
            }
        });
    }
}
