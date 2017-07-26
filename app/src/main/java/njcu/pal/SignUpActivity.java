package njcu.pal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import njcu.pal.Remote.Email;
import njcu.pal.Remote.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton student;
    RadioButton counselor;
    Button submit;
    EditText name, email, password, school_code;

    Integer rstudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = (EditText) findViewById(R.id.enter_Name);
        email = (EditText) findViewById(R.id.enter_Email);
        password = (EditText)findViewById(R.id.enter_Password);
        school_code = (EditText) findViewById(R.id.enter_Code);



        student = (RadioButton) findViewById(R.id.signUp_student);
        counselor = (RadioButton) findViewById(R.id.signUp_counselor);
        submit = (Button) findViewById(R.id.signUp_btn);


        student.setOnClickListener(this);
        counselor.setOnClickListener(this);
        submit.setOnClickListener(this);





            }



    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.signUp_student:
                if (student.isChecked()) {
                    rstudent = 1;
                }
                break;
            case R.id.signUp_counselor:
                if (counselor.isChecked()) {
                    rstudent = 2;
                }
                break;
            case R.id.signUp_btn:

               // Integer school = Integer.parseInt(school_code.getText().toString());
               // Integer student1 = Integer.parseInt(rstudent.toString());

                Service.Factory.getInstance().signup(name.getText().toString(), email.getText().toString(), password.getText().toString(), school_code.getText().toString(), rstudent + "").enqueue(new Callback<Email>() {
                    @Override
                    public void onResponse(Call<Email> call, Response<Email> response) {
                        Log.d("Success", "Connection Successful");

                        Email posts = response.body();
                        Log.d("Error Code:", "" + posts.getStatus());
                        Log.d("Success", posts.getMessage());
                    }

                    @Override
                    public void onFailure(Call<Email> call, Throwable t) {
                        Log.d("Failure", t.getLocalizedMessage());

                    }
                });
        }

      //  switch(v.getId()) {

            //case R.id.signUp_student:

                //Intent intent = new Intent(SignUpActivity.this, StudentSignUpActivity.class);
                //startActivity(intent);

               // break;

            //case R.id.signUp_counselor:

                //break;
        }
    }

