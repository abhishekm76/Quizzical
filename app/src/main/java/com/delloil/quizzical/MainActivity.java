package com.delloil.quizzical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button falseButton;
    private Button trueButton;
    private ImageButton nextQ;

    private int currentIndex =0;

    private TextView questionTextView;
    private QuestionModel[] questionBank = new QuestionModel[]{
            new QuestionModel(R.string.Q1, false),
            new QuestionModel(R.string.Q2, true),
            new QuestionModel(R.string.Q3, false),
            new QuestionModel(R.string.Q4, true),
            new QuestionModel(R.string.Q5, false),
            new QuestionModel(R.string.Q6, true),
            new QuestionModel(R.string.Q7, false),
            new QuestionModel(R.string.Q8, true),


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        falseButton=findViewById(R.id.false_button);
        trueButton=findViewById(R.id.true_button);
        nextQ=findViewById(R.id.nextButton);
        questionTextView=findViewById(R.id.answer_TextView);



        falseButton.setOnClickListener(this);
        trueButton.setOnClickListener(this);
        nextQ.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.false_button:
                checkAnswer(false);
                break;

            case R.id.true_button:
                checkAnswer(true);
                break;

            case R.id.nextButton:

                currentIndex += 1 ;
                if (currentIndex == questionBank.length){
                    currentIndex=0;
                }
                updateQuestion();
                break;

        }
    }

    private void updateQuestion(){
        questionTextView.setText(questionBank[currentIndex].getAnswerID());



    }

    private void checkAnswer(boolean userChoice){
        boolean correctAnswer = questionBank[currentIndex].isAnnswerResult();

        if (correctAnswer == userChoice){
            Toast.makeText(MainActivity.this, userChoice+ " is correct", Toast.LENGTH_SHORT).show();
            Log.d("MYTAG", "onClick: "+currentIndex);

        }else {
            Toast.makeText(MainActivity.this, userChoice+ " is incorrect", Toast.LENGTH_SHORT).show();
            Log.d("MYTAG", "onClick: "+currentIndex);
        }

    }
}

// TODO: 21-11-2019 change backgroud
// TODO: 21-11-2019 change image button for icon on home page
// TODO: 21-11-2019 change button for next
// TODO: 21-11-2019 add a previous question functionality  