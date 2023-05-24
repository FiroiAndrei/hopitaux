package com.example.hopitaux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hopitaux.ui.login.SignUpActivity;

public class DonorForm extends AppCompatActivity {

    private Button signUpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_form);

        EditText nameInput = findViewById(R.id.editNameForm);
        String name = nameInput.getText().toString();

        EditText addressInput = findViewById(R.id.editAddressForm);
        String address = addressInput.getText().toString();

        EditText cityInput = findViewById(R.id.editCityForm);
        String city = cityInput.getText().toString();

        EditText ageInput = findViewById(R.id.editAgeForm);
        String age = ageInput.getText().toString();

        EditText sexInput = findViewById(R.id.editSexForm);
        String sex = sexInput.getText().toString();

        // this is where i need to send these values to the database

        signUpButton = findViewById(R.id.buttonSignUpForm);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainMenu();
            }
        });

    }

    public void openMainMenu(){
        // go to main menu
//        Intent intent = new Intent(this, HomeActivity.class);
//        startActivity(intent);
    }
}