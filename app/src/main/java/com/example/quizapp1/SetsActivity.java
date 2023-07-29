package com.example.quizapp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.quizapp1.Adapters.GrideAdapter;
import com.example.quizapp1.databinding.ActivitySetsBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;

public class SetsActivity extends AppCompatActivity {
    ActivitySetsBinding binding;
    FirebaseDatabase database;
    GrideAdapter adapter;int a = 1;
    String key;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySetsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        database = FirebaseDatabase.getInstance();
        key = getIntent().getStringExtra("key");

      adapter = new GrideAdapter(getIntent().getIntExtra("sets",0),
              getIntent().getStringExtra("category"));

      binding.gridView.setAdapter(adapter);




    }
}
