package com.example.collectionx;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    

    ImageView logo;
    EditText name, email, pasword ;
    Button signup, signin;
    ProgressBar progressBar;

    FirebaseAuth firebaseAuth;

    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo=findViewById(R.id.logo);

        firebaseAuth = FirebaseAuth.getInstance();
        name=findViewById(R.id.FullName);
        pasword=findViewById(R.id.password);
        email=findViewById(R.id.Email);
        signup=findViewById(R.id.Signup);
        signin=findViewById(R.id.Signin);
        progressBar = findViewById(R.id.progressbarSignUp);
        DB = new DBHelper(this);



        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = name.getText().toString().trim();
                String pass = pasword.getText().toString().trim();
                String gmail = email.getText().toString().trim();

                if (fname.isEmpty()){
                    name.setError("Full name is required!");
                    name.requestFocus();
                    return;
                }
                if (gmail.isEmpty()){
                    email.setError("Email is required!");
                    email.requestFocus();
                    return;
                }

                if (pass.isEmpty()){
                    pasword.setError("Password is required");
                    pasword.requestFocus();
                    return;
                }
                if (pass.length() < 6){
                    pasword.setError("Min password length should be 6 characters!");
                    pasword.requestFocus();
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);
                firebaseAuth.createUserWithEmailAndPassword(gmail, pass)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()){
                                    User user = new User(fname, gmail);
                                    FirebaseDatabase.getInstance().getReference("User")
                                            .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                            .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if (task.isSuccessful()){
                                                Toast.makeText(MainActivity.this,"User has been successfully registered",Toast.LENGTH_SHORT).show();
                                                progressBar.setVisibility(View.VISIBLE);

                                                //redirect to log in
                                                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                                                startActivity(intent);

                                            } else {
                                                Toast.makeText(MainActivity.this, "Failed to register! Try again!", Toast.LENGTH_SHORT).show();
                                                progressBar.setVisibility(View.VISIBLE);
                                            }
                                        }
                                    });

                                } else {
                                    Toast.makeText(MainActivity.this,"Failed to register", Toast.LENGTH_SHORT).show();
                                    progressBar.setVisibility(View.VISIBLE);
                                }
                            }
                        });



            }
        });






    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Signin:
                startActivity(new Intent(this,LoginActivity.class));
                break;
            case R.id.Signup:

                break;
    }
}


}