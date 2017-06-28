package njcu.pal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    EditText user, password;
    Button subLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        user = (EditText) findViewById(R.id.home_User);
        password = (EditText) findViewById(R.id.home_pass);
        subLog = (Button) findViewById(R.id.home_log);

        subLog.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

    }
}
