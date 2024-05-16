package ru.nvgsoft.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    private EditText editTextEmailRegistration;
    private EditText editTextPasswordRegistration;
    private EditText editTextName;
    private EditText editTextLastName;
    private EditText editTextAge;
    private Button buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        initViews();
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = getTrimmedValue(editTextEmailRegistration);
                String password = getTrimmedValue(editTextPasswordRegistration);
                String name = getTrimmedValue(editTextName);
                String lastName = getTrimmedValue(editTextLastName);
                int age = Integer.parseInt(getTrimmedValue(editTextAge));
                //TODO sign up
            }
        });
    }

    private void initViews(){
         editTextEmailRegistration = findViewById(R.id.editTextEmailRegistration);
         editTextPasswordRegistration = findViewById(R.id.editTextPasswordRegistration);
         editTextName = findViewById(R.id.editTextName);
         editTextLastName = findViewById(R.id.editTextLastName);
         editTextAge = findViewById(R.id.editTextAge);
         buttonSignUp = findViewById(R.id.buttonSignUp);
    }

    private  String getTrimmedValue(EditText editText){
        return editText.getText().toString().trim();
    }

    public static Intent newIntent(Context context){
        return new Intent(context, RegistrationActivity.class);
    }
}