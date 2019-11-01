package com.example.gitsmca;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.firebase.auth.AuthResult;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;


public class Login extends AppCompatActivity {
    private EditText mail;
    private EditText pass;
    private FirebaseAuth auth;
    private ProgressBar progressBar;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        auth = FirebaseAuth.getInstance();

        if (auth.getCurrentUser() != null) {
            startActivity(new Intent(this, facultypage.class));
            finish();

        }
        mail = (EditText) findViewById(R.id.email);
        pass= (EditText) findViewById(R.id.password);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        login = (Button) findViewById(R.id.btn_login);

        //Get Firebase auth instance
        auth = FirebaseAuth.getInstance();


login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String email = mail.getText().toString();
            final String password = pass.getText().toString();

            if (TextUtils.isEmpty(email)) {
                Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                return;
            }

            if (TextUtils.isEmpty(password)) {
                Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                return;
            }

            progressBar.setVisibility(View.VISIBLE);
//authenticate user
            auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            // If sign in fails, display a message to the user. If sign in succeeds
                            // the auth state listener will be notified and logic to handle the
                            // signed in user can be handled in the listener.
                            progressBar.setVisibility(View.GONE);
                            if (!task.isSuccessful()) {
                                // there was an error
                                if (password.length() < 4) {

                                    pass.setError("password too short");
                                } else {
                                    Toast.makeText(getApplicationContext(), "Authentication failed, check your email and password or internet connection", Toast.LENGTH_LONG).show();
                                }
                            } else {
                                Intent in = new Intent(Login.this, facultypage.class);
                                startActivity(in);
                                finish();
                           }
                        }
                    });
        }
});
    }



public void signup(View V)
{

}
}



