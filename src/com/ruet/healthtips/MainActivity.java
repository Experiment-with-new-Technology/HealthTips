package com.ruet.healthtips;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
 Button btn_heartrate,btn_bmi,btn_about,btn_help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   btn_heartrate=(Button) findViewById(R.id.button_heartrate);
   btn_heartrate.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		Intent i = new Intent(MainActivity.this,HeartRate.class);
		startActivity(i);
		
	}
});    
				
	btn_bmi=(Button) findViewById(R.id.button_bmi);	
	btn_bmi.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent i = new Intent(MainActivity.this,BmiClass.class);
			startActivity(i);
			
		}
	});
     
	
	
	btn_about=(Button) findViewById(R.id.Button_about);
	btn_about.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent i = new Intent(MainActivity.this,AboutClass.class);
			startActivity(i);
			
		}
	});
	
	btn_help=(Button) findViewById(R.id.Button_help);
	btn_help.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent i = new Intent(MainActivity.this,HelpCLass.class);
			startActivity(i);
			
		}
	});
	
	
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
