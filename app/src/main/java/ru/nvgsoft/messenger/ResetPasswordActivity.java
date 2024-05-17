package ru.nvgsoft.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ResetPasswordActivity extends AppCompatActivity {


    private static final String EXTRAS_EMAIL = "email";
    private EditText editTextEmailForgotPassword;
    private Button buttonResetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        initViews();
        String email = getIntent().getStringExtra(EXTRAS_EMAIL);
        editTextEmailForgotPassword.setText(email);
        buttonResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTextEmailForgotPassword.getText().toString().trim();
            }
        });
    }

    private void initViews() {
        editTextEmailForgotPassword = findViewById(R.id.editTextEmailForgotPassword);
        buttonResetPassword = findViewById(R.id.buttonResetPassword);
    }

    public static Intent newIntent(Context context, String email) {
        Intent intent = new Intent(context, ResetPasswordActivity.class);
        intent.putExtra(EXTRAS_EMAIL, email);
        return intent;
    }
}