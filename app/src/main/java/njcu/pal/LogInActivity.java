package njcu.pal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {

    TextView Logo1, Logo2;
    EditText user, password;
    Button subLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


        Logo1 = (TextView) findViewById(R.id.home_logo1);
        Logo2 = (TextView) findViewById(R.id.home_logo2);
        user = (EditText) findViewById(R.id.home_User);
        password = (EditText) findViewById(R.id.home_pass);
        subLog = (Button) findViewById(R.id.home_log);

        subLog.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

    }
}
