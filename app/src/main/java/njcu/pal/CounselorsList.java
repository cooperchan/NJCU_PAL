package njcu.pal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import njcu.pal.Remote.Counselor;
import njcu.pal.Remote.Service;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Yeury on 7/26/2017.
 */

public class CounselorsList extends AppCompatActivity {
    ListView lv;
    List<Counselor> counselors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselors_list);
        //Lets get those values back
        String school_code = getIntent().getExtras().getString("school_code");
        String user_id = getIntent().getExtras().getString("user_id");
        //
        lv = (ListView) findViewById(R.id.counselors_list);


        //After we are going to get all the counselors using the api
        getAllCounselors(school_code);







        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                //This is the user you clicked on
                Counselor object = (Counselor) lv.getItemAtPosition(position);



            }
        });







    }

    public void getAllCounselors(String school_code) {

        Service.Factory.getInstance().getAllCounselors(school_code).enqueue(new Callback<List<Counselor>>() {
            @Override
            public void onResponse(Call<List<Counselor>> call, Response<List<Counselor>> response) {
                counselors = response.body();
                // populateList();

                Log.d("We got These many: ", counselors.size()+"");
                ArrayList<String> names = new ArrayList<>();
//        CounselorAdaptor adapter = new CounselorAdaptor(this, counselors);
                for (Counselor counselor : counselors) {
                    names.add(counselor.getName());
                }

                ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(CounselorsList.this, android.R.layout.simple_list_item_1, android.R.id.text1, names);


                lv.setAdapter(itemsAdapter);



            }

            @Override
            public void onFailure(Call<List<Counselor>> call, Throwable t) {

            }
        });
    }

    private void populateList() {


    }


}
