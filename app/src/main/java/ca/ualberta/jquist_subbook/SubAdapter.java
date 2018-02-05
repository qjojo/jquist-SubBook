package ca.ualberta.jquist_subbook;

import android.content.Context;
import android.icu.lang.UScript;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jonah on 2018-02-05.
 */

public class SubAdapter extends ArrayAdapter<Subscription> {
    public SubAdapter(Context context, ArrayList<Subscription> subscriptions) {
        super(context, 0, subscriptions);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Subscription sub = getItem(position);
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView name = convertView.findViewById(R.id.name);
        TextView cost = convertView.findViewById(R.id.cost);
        TextView date = convertView.findViewById(R.id.date);
        name.setText(sub.getName());
        cost.setText(String.format("%.2f", sub.getCost()));
        date.setText(sub.getStart().toString());
        return convertView;
    }
}
