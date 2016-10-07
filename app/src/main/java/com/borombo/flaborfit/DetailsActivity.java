package com.borombo.flaborfit;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciceText = (TextView) findViewById(R.id.exercicetitle);
        ImageView exerciceimage = (ImageView) findViewById(R.id.exerciceImage);
        LinearLayout main_bg = (LinearLayout) findViewById(R.id.main_bg);

        String exerciceTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciceText.setText(exerciceTitle);

        if (exerciceTitle.equalsIgnoreCase(MainActivity.EXERCICE_WEIGHTS)){
            exerciceimage.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            main_bg.setBackgroundColor(Color.parseColor("#2ca5f5"));
        }else if(exerciceTitle.equalsIgnoreCase(MainActivity.EXERCICE_YOGA)){
            exerciceimage.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            main_bg.setBackgroundColor(Color.parseColor("#916bcd"));
        } else {
            exerciceimage.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            main_bg.setBackgroundColor(Color.parseColor("#52ad56"));
        }
    }
}
