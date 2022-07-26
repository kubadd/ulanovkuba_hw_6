package com.geektech.ulanovkuba_hw_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText gmail, pin;
    private Button btn1;
    private TextView textView1, textView2, textView3, textView4;
    String email = "admin@gmail.com";
    String pincode = "admin";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        onClick();

    }

    private void onClick() {
        btn1.setOnClickListener(v -> {
            if (gmail.getText().toString().equals(email)
                    &&pin.getText().toString().equals(pincode)){
                gmail.setVisibility(View.GONE);
                pin.setVisibility(View.GONE);
                btn1.setVisibility(View.GONE);
                textView1.setVisibility(View.GONE);
                textView2.setVisibility(View.GONE);
                textView3.setVisibility(View.GONE);
                textView4.setVisibility(View.GONE);
                Toast.makeText(this,"вы успешно зашли",Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this,"неправельные данные",Toast.LENGTH_LONG).show();
            }
        });

        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
            if (gmail.getText().toString().length()>0){
                btn1.setBackgroundColor(getColor(R.color.orenge));
            }else {
                btn1.setBackgroundColor(getColor(R.color.ser));

            }
            }
        });
    }

    private void initView() {
        gmail = findViewById(R.id.pochta);
        pin = findViewById(R.id.password);
        btn1 = findViewById(R.id.button);
       textView1 = findViewById(R.id.forget_password);
       textView2 = findViewById(R.id.najmisuda);
       textView3 = findViewById(R.id.vhod);
       textView4 = findViewById(R.id.vhod1);
        gmail = findViewById(R.id.pochta);
        gmail = findViewById(R.id.pochta);
        gmail = findViewById(R.id.pochta);

    }
}