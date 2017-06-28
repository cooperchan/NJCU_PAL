package njcu.pal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton student;
    RadioButton counselor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        student = (RadioButton) findViewById(R.id.signUp_student);
        counselor = (RadioButton) findViewById(R.id.signUp_counselor);

        student.setOnClickListener(this);
        counselor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {

            //case R.id.signUp_student:

                //Intent intent = new Intent(SignUpActivity.this, StudentSignUpActivity.class);
                //startActivity(intent);

               // break;

            //case R.id.signUp_counselor:

                //break;
        }
    }
}
