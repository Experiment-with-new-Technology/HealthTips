package com.ruet.healthtips;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.NumberPicker.OnValueChangeListener;
import android.widget.Toast;

public class BmiClass extends ActionBarActivity {
 Double dbl_bmi;
 NumberPicker np_ft,np_inch1,np_inch2;
 Double dbl_Weight=0.0,dbl_Heght=0.0,dbl_Weight_pound=0.0,dbl_feet=5.0,dbl_inch1=0.0,dbl_inch2=0.0;
 EditText txt_Weight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
   
       txt_Weight=(EditText) findViewById(R.id.txtFeildWeight);
        Button btn_Submit=(Button) findViewById(R.id.btnTreatement);
        np_ft=(NumberPicker) findViewById(R.id.numberPicker_ft);
        np_inch1=(NumberPicker) findViewById(R.id.NumberPicker_inch1);
        np_inch2=(NumberPicker) findViewById(R.id.NumberPicker_inch2);
        np_inch1.setMinValue(0);
        np_inch1.setMaxValue(1);
        np_inch1.setWrapSelectorWheel(false);
        np_inch1.setOnValueChangedListener(new OnValueChangeListener() {
			
			public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
			dbl_inch1=10.0*(double) newVal;
				
			}
		});
        
        np_inch2.setMinValue(0);
        np_inch2.setMaxValue(9);
        np_inch2.setWrapSelectorWheel(false);
        np_inch2.setOnValueChangedListener(new OnValueChangeListener() {
			
   			public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
   			dbl_inch2=(double) newVal;
   				
   			}
   		});
        np_ft.setMinValue(0);
        np_ft.setMaxValue(9);
        np_ft.setValue(5);
        np_ft.setWrapSelectorWheel(false);
        np_ft.setOnValueChangedListener(new OnValueChangeListener() {
			
			public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
			dbl_feet=(double) newVal;
				
			}
		});
        txt_Weight.setText("");
        btn_Submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			String string_Weight="0";
				
				if(txt_Weight.getText().toString().equals(""))
					Toast.makeText(BmiClass.this, "Empty Weight Please fill up all information",Toast.LENGTH_SHORT).show();
				else{
				string_Weight=txt_Weight.getText().toString();
		
				
				
				dbl_bmi=0.0;
				
				dbl_Weight=Double.parseDouble(string_Weight);
				
			dbl_Heght=dbl_inch1+dbl_inch2+(12*dbl_feet);
				dbl_Weight_pound=dbl_Weight*2.20462;
				dbl_bmi=(dbl_Weight_pound/(dbl_Heght*dbl_Heght))*703.0;
				
				
			   
				
				Intent i = new Intent(BmiClass.this, Category.class);
				i.putExtra("dbl_bmi", ""+dbl_bmi);
				
				startActivity(i);
				}
				
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
