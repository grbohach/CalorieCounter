package com.example.user.caloriecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalorieCounter extends AppCompatActivity implements View.OnClickListener{

    private String TAG = "MyApp";
    private TextView total;
    private EditText fats;
    private EditText proteins;
    private EditText carbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_counter);
        idControls();
        setupButtons();
    }

    private void idControls(){
        fats = (EditText)this.findViewById(R.id.edtFats);
        proteins = (EditText)this.findViewById(R.id.edtProtein);
        carbs = (EditText)this.findViewById(R.id.edtCarbs);
        total = (TextView)this.findViewById(R.id.txvTotal);
    }

    private void setupButtons(){
        Button b = (Button) this.findViewById(R.id.btnCalculate);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "Clicked the button");
        String sFats = fats.getText().toString();
        int iFats = Integer.parseInt(sFats)*9;
        String sProteins = proteins.getText().toString();
        int iProteins = Integer.parseInt(sProteins)*4;
        String sCarbs = carbs.getText().toString();
        int iCarbs = Integer.parseInt(sCarbs)*4;
        int calculated = iCarbs+iProteins+iFats;
        total.setText(Integer.toString(calculated));
    }
}
