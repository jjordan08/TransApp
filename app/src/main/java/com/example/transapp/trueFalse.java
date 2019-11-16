package com.example.transapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

    public class trueFalse extends AppCompatActivity {

        private TextView mScoreView, mQuestion;
        private Button mTrueButton, mFalseButton;

        private boolean mAnswer;
        private int mScore = 0;
        private int mQuestionNumber = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_true_false);

            mScoreView = (TextView)findViewById(R.id.points);
            mQuestion = (TextView)findViewById(R.id.question);
            mTrueButton = (Button)findViewById(R.id.trueButton);
            mFalseButton = (Button)findViewById(R.id.falseButton);

            updateQuestion();

            //Logic for true button
            mTrueButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mAnswer == true) {
                        mScore++;
                        updateScore(mScore);

                        //perform check before you update the question
                        if (mQuestionNumber == QuizBook.questions.length) {
                            Intent i = new Intent(trueFalse.this, trueFalseResult.class);
                            Bundle bundle = new Bundle();
                            bundle.putInt("finalScore", mScore);
                            i.putExtras(bundle);
                            trueFalse.this.finish();
                            startActivity(i);
                        } else {
                            updateQuestion();
                        }
                    }
                    else {
                        if (mQuestionNumber == QuizBook.questions.length) {
                            Intent i = new Intent(trueFalse.this, trueFalseResult.class);
                            Bundle bundle = new Bundle();
                            bundle.putInt("finalScore", mScore);
                            i.putExtras(bundle);
                            trueFalse.this.finish();
                            startActivity(i);
                        } else {
                            updateQuestion();
                        }
                    }
                }
            });




            //Logic for false button
            mFalseButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mAnswer == false) {
                        mScore++;
                        updateScore(mScore);

                        //perform check before you update the question
                        if (mQuestionNumber == QuizBook.questions.length) {
                            Intent i = new Intent(trueFalse.this, trueFalseResult.class);
                            Bundle bundle = new Bundle();
                            bundle.putInt("finalScore", mScore);
                            i.putExtras(bundle);
                            trueFalse.this.finish();
                            startActivity(i);
                        } else {
                            updateQuestion();
                        }
                    }
                    else {
                        if (mQuestionNumber == QuizBook.questions.length) {
                            Intent i = new Intent(trueFalse.this, trueFalseResult.class);
                            Bundle bundle = new Bundle();
                            bundle.putInt("finalScore", mScore);
                            i.putExtras(bundle);
                            trueFalse.this.finish();
                            startActivity(i);
                        } else {
                            updateQuestion();
                        }
                    }
                }
            });

        }

        private void updateQuestion() {

            mQuestion.setText(QuizBook.questions[mQuestionNumber]);
            mAnswer = QuizBook.answers[mQuestionNumber];
            mQuestionNumber++;
        }

        private void updateScore(int point) {
            mScoreView.setText("" + mScore);
        }

        public void clickExit(View view) {
            askToClose();
        }


        @Override
        public void onBackPressed() {
            askToClose();
        }

        private void askToClose (){
            AlertDialog.Builder builder = new AlertDialog.Builder(trueFalse.this);
            builder.setMessage("Are you sure you want to quit?");
            builder.setCancelable(true);
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    finish();
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();

                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        }
    }