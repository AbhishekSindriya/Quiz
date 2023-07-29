package com.example.quizapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quizapp1.databinding.ActivityScoreBinding;

public class ScoreActivity extends AppCompatActivity {
ActivityScoreBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        int correct = getIntent().getIntExtra("correctAnsw",0);
        int totalQuestion = getIntent().getIntExtra("totalQuestion",0);

        int wrong = totalQuestion - correct;

        binding.totalRight.setText(String.valueOf(correct));
        binding.totalWrong.setText(String.valueOf(wrong));

        binding.totalQuestion.setText(String.valueOf(totalQuestion));

        binding.progressBar.setProgress(totalQuestion);
        binding.progressBar.setProgress(correct);

        binding.progressBar.setProgressMax(totalQuestion);





        binding.btnRetry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });


        binding.btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });







    }
}