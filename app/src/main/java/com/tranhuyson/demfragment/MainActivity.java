package com.tranhuyson.demfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnFragment02;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFragment02=findViewById(R.id.btnfragment02);
        getFragment(Fragment01.newInstance());
        btnFragment02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragment(Fragment02.newInstance());
            }
        });
    }
    public void getFragment(Fragment fragment){
      try {
          getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
      }
      catch (Exception e){
          e.printStackTrace();

          Log.d(TAG,"getFragment: "+e.getMessage());
      }

    }
}
