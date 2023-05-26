package com.example.collectionx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    ImageView logo1;
    EditText email, password;
    Button signin;
    ProgressBar progressBar;
    TextView textView ,textView1;
    FirebaseAuth firebaseAuth;

    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        logo1=findViewById(R.id.logo1);
        email=findViewById(R.id.EmailAddress);
        password=findViewById(R.id.password1);
        signin=findViewById(R.id.signin1);
        textView = findViewById(R.id.forgotPassword);
        textView1 = findViewById(R.id.Register);
        progressBar = findViewById(R.id.progressbar);
        firebaseAuth = FirebaseAuth.getInstance();

        //DB= new DBHelper(this);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user=email.getText().toString().trim();
                String pass=password.getText().toString().trim();

                if (user.isEmpty()){
                    email.setError("Email is required!");
                    email.requestFocus();
                    return;
                }
                if (pass.isEmpty()){
                    password.setError("Password is required!");
                    password.requestFocus();
                    return;
                }
                if (pass.length() < 6){
                    password.setError("Min password length is 6 characters");
                    password.requestFocus();
                    return;

                }
                progressBar.setVisibility(View.VISIBLE);
                firebaseAuth.signInWithEmailAndPassword(user, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Intent intent = new Intent(getApplicationContext(), LoadingActivity.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(LoginActivity.this,"Failed to login! Please check your credintials", Toast.LENGTH_SHORT).show();
                        }
                    }
                });



            }
        });


    }
}