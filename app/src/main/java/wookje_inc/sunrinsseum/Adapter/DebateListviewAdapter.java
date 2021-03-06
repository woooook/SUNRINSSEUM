package wookje_inc.sunrinsseum.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import wookje_inc.sunrinsseum.Item.DebateListviewitem;
import wookje_inc.sunrinsseum.R;

public class DebateListviewAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<DebateListviewitem> data;
    private int layout;

    public DebateListviewAdapter(Context context, int layout, ArrayList<DebateListviewitem> data) {
        this.inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data=data;
        this.layout=layout;
    }

    @Override
    public int getCount() { return data.size(); }

    @Override
    public String getItem(int position) { return data.get(position).getName(); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            convertView=inflater.inflate(layout,parent,false);
        }

        DebateListviewitem debateListviewitem = data.get(position);

        ImageView image = (ImageView)convertView.findViewById(R.id.imageview);
        image.setImageResource(debateListviewitem.getImage());

        TextView name = (TextView)convertView.findViewById(R.id.textview);
        name.setText(debateListviewitem.getName());

        return convertView;
    }
}