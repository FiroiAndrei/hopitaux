package com.example.hopitaux;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DonorQuizActivity extends AppCompatActivity {

    private Button yesButton;
    private Button noButton;
    private TextView question;
    private String questions[]={
            "Are you 18-75 years old?",
            "Had a tattoo in the last 4 months?",
            "Are you pregnant or recently given birth?"};
    private String correctAnsweres[] = {  // 1 == "yes" , 0 == "no"
            "1",
            "0",
            "0"};
    private int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_quiz);
        index = 0;
        yesButton = findViewById(R.id.yesButton);
        noButton = findViewById(R.id.noButton);
        question = findViewById(R.id.donorQuestion);
        question.setText(questions[index]);
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (correctAnsweres[index] == "0") {  // if the answer is wrong, that person cannot donate and will be taken to another activity
                    openDonorQuizFailedActivity();
                }
                else {
                    loadNewQuestion();
                }
            }
        });
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (correctAnsweres[index] == "1") {  // if the answer is wrong, that person cannot donate and will be taken to another activity
                    openDonorQuizFailedActivity();
                }
                else {
                    loadNewQuestion();
                }

            }
        });


    }

    public void loadNewQuestion(){
        if (index == questions.length - 1)
        {
            openDonorFormActivity();
        }
        else
            question.setText(questions[++index]);
    }
    public void openDonorQuizFailedActivity(){
        Intent intent = new Intent(this, DonorQuizFailed.class);
        startActivity(intent);
    }
    public void openDonorFormActivity(){
        Intent intent = new Intent(this, DonorForm.class);
        startActivity(intent);
    }
    }
