package com.techweezy.modcomandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter {
    String [] result1, result2;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public CustomAdapter(Context mContext,
                         String[] user_list,
                         String [] user_numbers,
                         int[] userImages) {
        // TODO Auto-generated constructor stub
        result1=user_list;
        result2= user_numbers;
        context=mContext;
        imageId=userImages;
        inflater = (LayoutInflater)context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result1.length;

    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv1, tv2;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView,
                        ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.custom_list, null);
        holder.tv1=(TextView) rowView.findViewById(R.id.text1);
        holder.tv2=(TextView) rowView.findViewById(R.id.text2);
        holder.img=(ImageView) rowView.findViewById(R.id.imgView);
        holder.tv1.setText(result1[position]);
        holder.tv2.setText(result2[position]);
        holder.img.setImageResource(imageId[position]);
        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "
                        +result1[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }
}

