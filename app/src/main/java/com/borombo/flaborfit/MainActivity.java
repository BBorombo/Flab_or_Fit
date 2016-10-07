package com.borombo.flaborfit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM_TITLE = "extra.item.title";
    public static final String EXERCICE_WEIGHTS = "Weight lifting";
    public static final String EXERCICE_YOGA = "Yoga";
    public static final String EXERCICE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightButton = (RelativeLayout) findViewById(R.id.weightButton);
        RelativeLayout yogaButton = (RelativeLayout) findViewById(R.id.yogaButton);
        RelativeLayout cardioButton = (RelativeLayout) findViewById(R.id.cardioButton);

        assert weightButton != null;
        weightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(EXERCICE_WEIGHTS);
            }
        });

        assert yogaButton != null;
        yogaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(EXERCICE_YOGA);
            }
        });

        assert cardioButton != null;
        cardioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(EXERCICE_CARDIO);
            }
        });

    }

    private void loadDetailActivity(String exerciceTitle ){
        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciceTitle);
        startActivity(intent);
    }
}
