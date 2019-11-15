package com.techweezy.modcomandroid;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.EditText;

public class FragmentActivity  extends
        androidx.fragment.app.FragmentActivity
        implements ToolbarFragment.ToolbarListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

    }

    public void onButtonClick(int fontsize, String text) {
        TextFragment textFragment =
                (TextFragment) getSupportFragmentManager()
                                .findFragmentById(R.id.fragment);

        textFragment.changeTextProperties(fontsize, text);
    }
}
