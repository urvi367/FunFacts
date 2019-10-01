package com.example.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1,t2;
    Button b1;
    RelativeLayout rv;
    facts f=new facts();
    bgcolor bg=new bgcolor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.b);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        rv=(RelativeLayout)findViewById(R.id.rv);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int x=bg.getbg();
                t2.setText(f.getFact());
                rv.setBackgroundColor(x);
                b1.setTextColor(x);
            }
        });
    }
}
