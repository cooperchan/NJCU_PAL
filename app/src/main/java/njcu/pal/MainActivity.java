
package njcu.pal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import njcu.pal.Remote.Email;
import njcu.pal.Remote.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView pal_logo1;
    TextView pal_logo2;
    Button logIn;
    Button signUp;
    Button respond;
    Button counselorquestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pal_logo1 = (TextView) findViewById(R.id.home_logo1);
        pal_logo2 = (TextView) findViewById(R.id.home_logo2);
        logIn = (Button) findViewById(R.id.home_logIn);
        signUp = (Button) findViewById(R.id.home_signUp);
        respond = (Button) findViewById(R.id.home_inte);
        counselorquestions = (Button) findViewById(R.id.counselor_btn);

        logIn.setOnClickListener(this);
        signUp.setOnClickListener(this);
        respond.setOnClickListener(this);
        counselorquestions.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){

            case R.id.home_logIn:
                Intent loginintent = new Intent(MainActivity.this, LogInActivity.class);
                startActivity(loginintent);

                break;

            case R.id.home_signUp:
                Intent signupintent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(signupintent);

                break;
            case R.id.home_inte:
                Intent res = new Intent(MainActivity.this, QuestionsActivity.class);
                startActivity(res);
                break;

            case R.id.counselor_btn:
                Intent cques = new Intent(MainActivity.this, CounselorQuestions.class);
                startActivity(cques);
                break;



        }

    }
}
