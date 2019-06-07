package com.example.myapp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerA;
    private TextView textViewA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerA = findViewById(R.id.spinnerA);
        textViewA = findViewById(R.id.textViewA);
    }

    public void buttonA_onClick(View view) {
        int position = spinnerA.getSelectedItemPosition();
        textViewA.setText(getDescriptionByPosition(position));
    }

    private String getDescriptionByPosition(int position){
        String[] descriptions = getResources().getStringArray(R.array.spinnerAcharacter);
        return descriptions[position];
    }


}
