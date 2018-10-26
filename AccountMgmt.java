package com.example.dfk.csci187_mealtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AccountMgmt extends AppCompatActivity {

    Button loginButton, passwordButton, createAccountButton;
    EditText emailInput, pwInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_mgmt);

        loginButton = findViewById(R.id.login);
        passwordButton = findViewById(R.id.forgotPassword);
        createAccountButton = findViewById(R.id.createAccount);
        emailInput = findViewById(R.id.email);
        pwInput = findViewById(R.id.pw);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, pw;

                email = emailInput.getText().toString();
                pw = pwInput.getText().toString();
                if(loginSuccessful(email, pw)) {
                    // load user and go to splash screen
                }
                else {
                    Toast invalidInput = Toast.makeText(AccountMgmt.this, "E-mail/password is not valid", Toast.LENGTH_SHORT);
                    invalidInput.setGravity(Gravity.CENTER, 0,60);
                    invalidInput.show();
                    emailInput.setText("");
                    pwInput.setText("");
                }

            }
        });

        passwordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // go to password reminder screen
            }
        });

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // go to account creation page
            }
        });
    }

    // to add if more time: salt + hashing function for password
    // store only hashed pw in DB, hash inputtedPw and then check against DB
    boolean loginSuccessful(String email, String pw) {
        // DB query to look-up email, pw in User table

        /*if e-mail not in database
              return false
        if e-mail in DB, check inputted pw against DB pw
            if inputtedPw == dbPw
                return true;
            else
                return false
        */

        // for testing dialogue Toast
        return false;
    }
}
