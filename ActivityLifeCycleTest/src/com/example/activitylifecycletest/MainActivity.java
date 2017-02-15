package com.example.activitylifecycletest;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Log.d("MainActivity","onCreate");
        setContentView(R.layout.activity_main);
        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button) findViewById(R.id.start_dialog_activity);
        
        startNormalActivity.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent(MainActivity.this,NormalActivity.class);
        		startActivity(intent);
        	}
        });
        
        startDialogActivity.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Intent intent = new Intent(MainActivity.this,DialogActivity.class);
        		startActivity(intent);
        	}
        });
    }
    
    @Override
    protected void onStart(){
    	super.onStart();
    	Log.d("MainActivity","onStart");
    }
    
    @Override
    protected void onResume(){
    	super.onResume();
    	Log.d("MainActivity","onResume");
    }
    
    @Override
    protected void onPause(){
    	super.onPause();
    	Log.d("MainActivity","onPause");
    }
    
    @Override
    protected void onStop(){
    	super.onPause();
    	Log.d("MainActivity","onStop");
    }
    
    @Override
    protected void onDestroy(){
    	super.onPause();
    	Log.d("MainActivity","onDestroy");
    }
    
    @Override
    protected void onRestart(){
    	super.onPause();
    	Log.d("MainActivity","onRestart");
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
