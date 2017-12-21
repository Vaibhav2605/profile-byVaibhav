package com.example.vaibhav.myprofile;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.util.Log;

import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {
    private Button mainbutton;
    private ImageView myimg;
    private Button mybutton;
    private Button mybutton1;
    private TextView lel;


    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
//        myimg=(ImageView)findViewById(R.id.mainimage);
//        mybutton=(Button)findViewById(R.id.edubutton) ;
//        mybutton1=(Button)findViewById(R.id.workbutton);
//        lel=(TextView)findViewById(R.id.textname);
        mainbutton=(Button)findViewById(R.id.mainbutton);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.maintext);
        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),myprofile.class);
                startActivity(i);
            }
        });
//        mybutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(), Education.class);
//                startActivity(i);
//            }
//        });
//        mybutton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i= new Intent(getApplicationContext(),Workexperience.class);
//                startActivity(i);
//            }
//        });
//        myimg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i= new Intent(getApplicationContext(),profphoto.class);
//                startActivity(i);
//            }
//        });
        //tv.setText(stringFromJNI());

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
