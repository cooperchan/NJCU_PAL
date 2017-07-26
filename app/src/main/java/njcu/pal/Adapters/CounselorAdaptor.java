package njcu.pal.Adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;

import java.util.List;

import njcu.pal.R;
import njcu.pal.Remote.Counselor;
/**
 * Created by Yeury on 7/26/2017.
 */

public class CounselorAdaptor extends BaseAdapter {

    List<Counselor> counselors;
    Context c;
    LayoutInflater inflater;

    public CounselorAdaptor (Context c, List<Counselor> counselors) {
        this.c = c;
        this.counselors = counselors;
    }

    @Override
    public int getCount() {return counselors.size(); }
    @Override
    public Object getItem(int position) {
        return counselors.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //Basic row
            convertView = inflater.inflate(R.layout.counselor_row, null);

        }


        TextView textView = (TextView) convertView.findViewById(R.id.counselor_row_textview);
        final Counselor counselor = (Counselor) getItem(position);
        textView.setText(counselor.getName());

        return convertView;
    }




}



