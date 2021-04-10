package com.example.radio_group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radio_group_id);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton=radioGroup.findViewById(checkedId);
                Toast.makeText(MainActivity.this, ""+radioButton.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void submitRadioButton(View view){
        int selectedid=radioGroup.getCheckedRadioButtonId();
        if(selectedid==-1){
            Toast.makeText(this, "You have not selected anything", Toast.LENGTH_SHORT).show();
        }

        else{
            Toast.makeText(this, ""+radioButton.getText(), Toast.LENGTH_SHORT).show();
        }
    }




}