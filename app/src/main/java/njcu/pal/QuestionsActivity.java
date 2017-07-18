package njcu.pal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionsActivity extends AppCompatActivity implements View.OnClickListener {

    Button answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        answer = (Button) findViewById(R.id.home_submit);

        answer.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
