package com.uninorte.quiz3danna;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ViewGroup layout;
    private int i=1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (ViewGroup) findViewById(R.id.content);
    }

    public void addLeft(View button)
    {
        addChild(false);
    }


    @SuppressLint("InlinedApi")
    private void addChild(boolean right)
    {
        LayoutInflater inflater = LayoutInflater.from(this);
        int id = R.layout.addlayout;

        RelativeLayout relativeLayout = (RelativeLayout) inflater.inflate(id, null, false);

        TextView textView = (TextView) relativeLayout.findViewById(R.id.textView);
        textView.setText("Campo: "+i);
        i=i+1;

        Log.d("MENSAJE: ", textView.getText()+"");

        layout.addView(relativeLayout);
    }

}

