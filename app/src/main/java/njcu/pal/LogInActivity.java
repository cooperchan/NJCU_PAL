package njcu.pal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import njcu.pal.Remote.Email;
import njcu.pal.Remote.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


import static njcu.pal.Remote.Service.serEmail;
import static njcu.pal.Remote.Service.serPassword;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    TextView Logo1, Logo2;
    EditText user, password;
    Button subLog;
    private static String emailpost, passwordpost;

    public static String getemail()
    {
        return emailpost;
    }
    public static String getpassword()
    {
        return passwordpost;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


        Logo1 = (TextView) findViewById(R.id.home_logo1);
        Logo2 = (TextView) findViewById(R.id.home_logo2);
        user = (EditText) findViewById(R.id.home_User);
        password = (EditText) findViewById(R.id.home_pass);
        subLog = (Button) findViewById(R.id.home_log);

        subLog.setOnClickListener(this);

        emailpost = "" + user.getText();
        passwordpost = "" + user.getText();





    }

    @Override
    public void onClick(View v) {
                Service.Factory.getInstance().login(serEmail, serPassword).enqueue(new Callback<Email>() {

                    @Override
                    public void onResponse(Call<Email> call, Response<Email> response) {
                        Log.d("Okay", "lol");




                         Email posts = response.body();
                        Log.d("Error Code:", "" + posts.getStatus());
                        Log.d("Success", posts.getMessage());

                    }

            @Override
            public void onFailure(Call<Email> call, Throwable t) {
                Log.d("Failed", t.getMessage());
            }
        });

    }
}
