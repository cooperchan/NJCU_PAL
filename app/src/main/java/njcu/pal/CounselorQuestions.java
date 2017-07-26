package njcu.pal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CounselorQuestions extends AppCompatActivity implements View.OnClickListener {

    Integer j = 0;
    TextView counselorQuestions;
    Button c_submit;
    CheckBox counselor1, counselor2, counselor3, counselor4, counselor5;
    String CounselorQ[] = {"The client is no longer a danger to self or others.",
                           "Thoughts and behaviors that were previously considered as a danger to self or others are now manageable.",
                           "The client has demonstrated stable behaviors.",
                           "The client had verbalized a plan if he/she begins to feel unsafe.",
                           "The client is able to identify problems that led to begin referred for services.",
                           "The client understands how his/her behavior may have contributed to the problem.",
                           "The client expresses motivation to address the problem(s) and change behavior.",
                           "The client is able to identify potential issues and events that could contribute to regressing back to previous high-risk behavior.",
                           "The client is open to hearing feedback related to problems in his/her life.",
                           "The client understands how his/her behaviors were dangerous.",
                           "The client does not accept blame for problems considered out of his/her control (i.e. abuse).",
                           "The client worked toward identifying personal strengths to encourage coping and decrease stress.",
                           "The client worked toward identifying weaknesses that discourage coping and increase stress.",
                           "The client is willing to increase his or her social support.",
                           "The client has verbalized healthy behaviors that he/she needs to demonstrate.",
                           "The client has demonstrated ability toward healthy problem-solving and decision-making.",
                           "The client was willing to explore alternatives that led to unhealthy/dangerous behaviors.",
                           "The client agrees to attend follow-up services.",
                           "The parent(s)/guardians(s) are willing to comply with follow-up recommendations.",
                           "The client and family have identified adequate resources (financial, transportation, etc.) to follow recommendations.",
                           "The client has access to support outside the immediate home environment.",
                           "The parent(s)/guardian(s) have access to support outside the immediate home environment.",
                           "Appropriate services/resources were identified by the client.",
                           "Parent(s)/guardian(s) believe the client can benefit from further counseling."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselor_questions);

        counselorQuestions = (TextView) findViewById(R.id.counselor_question);
        c_submit = (Button) findViewById(R.id.counselor_submit);
        counselor1 = (CheckBox) findViewById(R.id.counselor_1);
        counselor2 = (CheckBox) findViewById(R.id.counselor_2);
        counselor3 = (CheckBox) findViewById(R.id.counselor_3);
        counselor4 = (CheckBox) findViewById(R.id.counselor_4);
        counselor5 = (CheckBox) findViewById(R.id.counselor_5);

        c_submit.setOnClickListener(this);
        counselorQuestions.setText(CounselorQ[0]);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {

            case R.id.counselor_submit:

                if (j <= 24) {
                    counselorQuestions.setText(CounselorQ[j + 1]);
                    j = j + 1;
                }

                // else { send form data }
                if (!counselor1.isChecked()|| !counselor2.isChecked() || !counselor3.isChecked() || !counselor4.isChecked() || !counselor5.isChecked()) {

                }
                counselor1.setChecked(false);
                counselor2.setChecked(false);
                counselor3.setChecked(false);
                counselor4.setChecked(false);
                counselor5.setChecked(false);

                break;
        }
    }

    public void onCheckboxClicked(View v){
        switch(v.getId()) {

            case R.id.counselor_1:

                counselor2.setChecked(false);
                counselor3.setChecked(false);
                counselor4.setChecked(false);
                counselor5.setChecked(false);
                break;

            case R.id.counselor_2:

                counselor1.setChecked(false);
                counselor3.setChecked(false);
                counselor4.setChecked(false);
                counselor5.setChecked(false);
                break;

            case R.id.counselor_3:

                counselor1.setChecked(false);
                counselor2.setChecked(false);
                counselor4.setChecked(false);
                counselor5.setChecked(false);
                break;

            case R.id.counselor_4:

                counselor1.setChecked(false);
                counselor2.setChecked(false);
                counselor3.setChecked(false);
                counselor5.setChecked(false);
                break;
            case R.id.counselor_5:

                counselor1.setChecked(false);
                counselor2.setChecked(false);
                counselor3.setChecked(false);
                counselor4.setChecked(false);
                break;
        }
    }
}
