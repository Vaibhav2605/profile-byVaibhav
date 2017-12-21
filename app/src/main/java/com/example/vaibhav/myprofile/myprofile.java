package com.example.vaibhav.myprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class myprofile extends AppCompatActivity {

    private ImageView myimg;
    private Button mybutton;
    private Button mybutton1;
    private TextView lel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);
        myimg=(ImageView)findViewById(R.id.mainimage);
        mybutton=(Button)findViewById(R.id.edubutton) ;
        mybutton1=(Button)findViewById(R.id.workbutton);
        lel=(TextView)findViewById(R.id.textname);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Education.class);
                startActivity(i);
            }
        });
        mybutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),Workexperience.class);
                startActivity(i);
            }
        });
        myimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),profphoto.class);
                startActivity(i);
            }
        });
    }
}
