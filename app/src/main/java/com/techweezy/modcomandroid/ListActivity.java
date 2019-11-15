package com.techweezy.modcomandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    ListView lv;
    Context context;
    ArrayList prgmName;
    ListView mlist;
    ArrayAdapter mAdapter;
    String [] user_list= {"Jack","Hellen","Meshack","Brian","Angela"};
    String [] user_numbers= {"222","223","224","225","226"};
    public static int [] userImages= {
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        mlist = findViewById(R.id.userlist);

        mlist.setAdapter(new CustomAdapter(this,
                user_list, user_numbers,userImages));

//        mAdapter = new ArrayAdapter
//                (this, android.R.layout.simple_list_item_1,
//                        user_list);
//        mlist.setAdapter(mAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.items_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.msg_item:
                Toast.makeText(this, "You clicked Message Item",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.share_item:
                Toast.makeText(this, "You clicked Share Item",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.send_item:
                Toast.makeText(this, "You clicked send Item",
                        Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
