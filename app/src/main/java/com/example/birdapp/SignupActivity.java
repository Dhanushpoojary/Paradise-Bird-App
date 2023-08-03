package com.example.birdapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.birdapp.databinding.ActivitySignupBinding;

public class SignupActivity extends AppCompatActivity {

    ActivitySignupBinding binding;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);

        binding.signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.signupEmail.getText().toString();
                String password = binding.signupPassword.getText().toString();
                String confirmPassword = binding.signupConfirm.getText().toString();

                if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(SignupActivity.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                } else {
                    // Check if the email is in a valid format
                    if (!isValidEmail(email)) {
                        Toast.makeText(SignupActivity.this, "Invalid email address!", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (!isValidPassword(password)) {
                        Toast.makeText(SignupActivity.this, "Invalid password! Password must be at least 6 characters long and contain letters and numbers.", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    if (password.equals(confirmPassword)) {
                        Boolean checkUserEmail = databaseHelper.checkEmail(email);

                        if (checkUserEmail == false) {
                            Boolean insert = databaseHelper.insertData(email, password);

                            if (insert) {
                                Toast.makeText(SignupActivity.this, "Signup Successfully!", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(SignupActivity.this, "Signup Failed!", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(SignupActivity.this, "User already exists! Please login", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(SignupActivity.this, "Passwords do not match!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        binding.loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    // Validate email format
    private boolean isValidEmail(String email) {
        // Use a regular expression to check if the email format is valid
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    // Validate password format
    private boolean isValidPassword(String password) {
        // Password must be at least 6 characters long and contain letters and numbers
        return password.length() >= 6 && password.matches(".*[a-zA-Z]+.*") && password.matches(".*\\d+.*");
    }
}
