package com.example.hopitaux.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hopitaux.DonorQuizActivity;
import com.example.hopitaux.R;

public class SignUpActivity extends AppCompatActivity {

    private Button iAmADonorButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setTitle("Sign Up");
        iAmADonorButton = findViewById(R.id.iAmADonor);
        iAmADonorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDonorQuizActivity();
            }
        });
    }
    public void openDonorQuizActivity(){
        Intent intent = new Intent(this, DonorQuizActivity.class);
        startActivity(intent);
    }
}