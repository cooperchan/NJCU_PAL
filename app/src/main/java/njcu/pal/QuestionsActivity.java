package njcu.pal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class QuestionsActivity extends AppCompatActivity implements View.OnClickListener {
    Integer i = 0;
    TextView tvquestion;
    Button submit;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    String Question[] = {"I am no longer a danger to myself or others.",
                         "I can now manage thoughts and behaviors that were previously considered dangerous to myself or others.",
                         "I am demonstrating healthy behaviors.",
                         "I have verbalized a plan if I begin to feel unsafe.",
                         "I am not verbalizing or glorifying dangerous acts.",
                         "I am able to identify problems that led to being referred for services.",
                         "I understand how my behavior may have contributed to problems.",
                         "I am motivated to address my problem(s) and change my behavior.",
                         "I am able to identify potential issues and events that could contribute to going back to my previous high-risk behavior.",
                         "I am open to hearing feedback related to problems in my life.",
                         "I understand how my behaviors were dangerous.",
                         "I do not accept blame for problems considered out of my control(i.e. abuse.",
                         "I have identified personal strengths to encourage coping and decrease stress.",
                         "I have identified weakness that discourage coping and increase stress.",
                         "I am willing to increase my social support.",
                         "I have identified healthy behaviors that I need to demonstrate.",
                         "I can solve my problems and make decisions in a healthy way.",
                         "I am willing to explore alternatives that led to unhealthy dangerous behaviors.",
                         "I agree to attend follow-up services.",
                         "My parent(s)/guardian(s) are willing to comply with follow-up recommendations.",
                         "My family and me have indentified adequate resources (financial, transportation, etc.) to follow recommendations.",
                         "I have access to support outside the immediate home environment.",
                         "My parent(s)/guardian(s) have access to support outside the immediate home environment.",
                         "I have identified appropriate services/resources.",
                         "My parent(s)/guardian(s) believe I can benefit from further counseling."};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        tvquestion = (TextView) findViewById(R.id.tv_question);
        submit = (Button) findViewById(R.id.questions_submit);
        cb1 = (CheckBox) findViewById(R.id.cb_1);
        cb2 = (CheckBox) findViewById(R.id.cb_2);
        cb3 = (CheckBox) findViewById(R.id.cb_3);
        cb4 = (CheckBox) findViewById(R.id.cb_4);
        cb5 = (CheckBox) findViewById(R.id.cb_5);

        submit.setOnClickListener(this);
        tvquestion.setText(Question[0]);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.questions_submit:

                if (i <= 24) {
                    tvquestion.setText(Question[i + 1]);
                    i = i + 1;
                }
                // else { send form data }
                if (!cb1.isChecked()|| !cb2.isChecked() || !cb3.isChecked() || !cb4.isChecked() || !cb5.isChecked()) {

                }
                cb1.setChecked(false);
                cb2.setChecked(false);
                cb3.setChecked(false);
                cb4.setChecked(false);
                cb5.setChecked(false);

                break;
        }
    }

    public void onCheckboxClicked(View v) {
        switch(v.getId()) {

            case R.id.cb_1:

                cb2.setChecked(false);
                cb3.setChecked(false);
                cb4.setChecked(false);
                cb5.setChecked(false);
                break;

            case R.id.cb_2:

                cb1.setChecked(false);
                cb3.setChecked(false);
                cb4.setChecked(false);
                cb5.setChecked(false);
                break;

            case R.id.cb_3:

                cb1.setChecked(false);
                cb2.setChecked(false);
                cb4.setChecked(false);
                cb5.setChecked(false);
                break;

            case R.id.cb_4:

                cb1.setChecked(false);
                cb2.setChecked(false);
                cb3.setChecked(false);
                cb5.setChecked(false);
                break;

            case R.id.cb_5:

                cb1.setChecked(false);
                cb2.setChecked(false);
                cb3.setChecked(false);
                cb4.setChecked(false);
                break;
        }
    }
}
