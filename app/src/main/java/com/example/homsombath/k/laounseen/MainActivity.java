package com.example.homsombath.k.laounseen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.edtX);
        final EditText editText1 = findViewById(R.id.edtY);
        final TextView textView = findViewById(R.id.result);
        Button button = findViewById(R.id.btnCalculate);

//Click Calculate to Plus X+Y and set result

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int iX = Integer.parseInt(editText.getText().toString());
                int iY = Integer.parseInt(editText1.getText().toString());
                textView.setText( iX + iY +"" );
            }
        });


    }
}
