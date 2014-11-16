package com.example.campre;

import java.io.IOException;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;


public class MainActivity extends Activity {
	private CamPre mPrev;
	//private RelativeLayout mLayout;
	Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        //mLayout = new RelativeLayout(this);
        
        //this.setContentView(mLayout);//R.layout.activity_main);
        this.setContentView(R.layout.activity_main);
        FrameLayout frame1 = (FrameLayout)findViewById(R.id.prev1);
        //FrameLayout frame2 = (FrameLayout)findViewById(R.id.prev2);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(1080,960);
        frame1.setLayoutParams(lp);
        //frame2.setLayoutParams(lp);
        try {
        	intent = new Intent(this, CamPre.class);
			mPrev = new CamPre(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
        frame1.addView(mPrev);
        //frame2.addView(mPrev);
        
        Log.d("Error", "late");
   }
    
    
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}