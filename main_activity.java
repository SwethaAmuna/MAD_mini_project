package com.example.colorchanger;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rootLayout;
    Button changeColorButton;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootLayout = findViewById(R.id.root_layout);
        changeColorButton = findViewById(R.id.change_color_button);

        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Generate random RGB color
                int color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                rootLayout.setBackgroundColor(color);
            }
        });
    }
}
