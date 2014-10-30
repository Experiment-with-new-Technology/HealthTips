package com.ruet.healthtips;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Category extends ActionBarActivity {


	 int flag_click;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);
        
final Double dbl_bmi=Double.parseDouble(""+getIntent().getStringExtra("dbl_bmi"));
final TextView textview_category=(TextView) findViewById(R.id.Textview_Category);
Button button_treatement=(Button) findViewById(R.id.btnTreatement);
final TextView textview_treatement=(TextView) findViewById(R.id.TextView_Treatement);
final TextView textview_tips=(TextView) findViewById(R.id.TextView_tips);
if(dbl_bmi<=18.5){
	textview_category.setText("Category : UnderWeight");
	textview_treatement.setText("Treatement: You should increase intake carbohydrates and eat Foods like wheat bread,muffins,pasta,crackers,bagels etc.");}
else
if(dbl_bmi>18.5 && dbl_bmi<25.0){
	textview_category.setText("Category : Normal Weight");
	textview_treatement.setText("Treatement: You should keep your health as it is.");}
else
if(dbl_bmi>=25.0 && dbl_bmi<30.0){
	textview_category.setText("Category : Overweight"); 
	textview_treatement.setText("Treatement: Your body weight is controlled by the number of calories you eat and the number of calories you use each day. So, if you consume fewer calories than you burn, you will lose weight. You can do this by becoming more physically active or by eating less.");}

	
else
if(dbl_bmi>=30.0 && dbl_bmi<35.0){
	textview_category.setText("Category : Obesity (Class 1)"); 
	textview_treatement.setText("Treatement: The method of treatment depends on your level of obesity, overall health condition, and motivation to lose weight.Treatment includes a combination of diet, exercise, behavior modification, and sometimes weightloss drugs. In some cases of severe obesity, gastrointestinal surgery may be recommended.");}

else
if(dbl_bmi>=35.0 && dbl_bmi<40.0){
	textview_category.setText("Category : Obesity (Class 2)");
	textview_treatement.setText("Treatement: The method of treatment depends on your level of obesity, overall health condition, and motivation to lose weight.Treatment includes a combination of diet, exercise, behavior modification, and sometimes weightloss drugs. In some cases of severe obesity, gastrointestinal surgery may be recommended.");
}
else
if(dbl_bmi>=40.0){
	textview_category.setText("Category : Morbid Obesity"); 
	textview_treatement.setText("Treatement: The method of treatment depends on your level of obesity, overall health condition, and motivation to lose weight.Treatment includes a combination of diet, exercise, behavior modification, and sometimes weightloss drugs. In some cases of severe obesity, gastrointestinal surgery may be recommended.");
}
flag_click=1;
button_treatement.setOnClickListener(new OnClickListener() {
	

	@Override
	public void onClick(View v) {
		if(flag_click==1){
		if(dbl_bmi<=18.5)
			textview_tips.setText("1) Drink at least 6-8 glasses of  water a day." +
					"\n2) Eat frequent but small meals.\n3) Eat lots of raw fruits and vegetables (green leafy vegetables are great)" +
					"\n4) Do not drink coffee, alcohol, soda pop,...\n5) Do not eat processed foods; white sugar, white flower,..." +
					"\n6) Avoid red meat and animal fats.\n7) Reduce intake of dairy products.\n8) Do not smoke and avoid second hand smoke. ");


		
			else
		if(dbl_bmi>18.5 && dbl_bmi<25.0)
			textview_tips.setText("1.Take regular free hand exercise and eat balanced diet to maintain this physical state.");
		else
		if(dbl_bmi>=25.0 && dbl_bmi<30.0)
			textview_tips.setText("1) Eliminate Red Meat\n2) Cut out fried foods like Grill, bake, roast, broil or boil your food" +
					"\n3) Start with a soup or a salad\n4) Stop Cola consumption \n5) Drink water");
			
			
		else
		if(dbl_bmi>=30.0 && dbl_bmi<35.0)
			textview_tips.setText("1) Eliminate Red Meat\n2) Cut out fried foods like Grill, bake, roast, broil or boil your food" +
					"\n3) Start with a soup or a salad\n4) Stop Cola consumption \n5) Drink water\n6) Regular Excercise should be done\n7) Regular Meal should be reduced day by day\n8)Take advice from a physiologist");
			
		else
		if(dbl_bmi>=35.0 && dbl_bmi<40.0)
			textview_tips.setText("1) Eliminate Red Meat\n2) Cut out fried foods like Grill, bake, roast, broil or boil your food" +
					"\n3) Start with a soup or a salad\n4) Stop Cola consumption \n5) Drink water\n6) Regular Excercise should be done\n7) Regular Meal should be reduced day by day\n8)Take advice from a physiologist");
			
		else
		if(dbl_bmi>=40.0)
			textview_tips.setText("1) Eliminate Red Meat\n2) Cut out fried foods like Grill, bake, roast, broil or boil your food" +
					"\n3) Start with a soup or a salad\n4) Stop Cola consumption \n5) Drink water\n6) Regular Excercise should be done\n7) Regular Meal should be reduced day by day\n8)Take advice from a physiologist");
			
	flag_click=0;
		}
		else {textview_tips.setText("");flag_click=1;}
			
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
