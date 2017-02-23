package crackthecode.game;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class detail extends Activity {
ImageView i;
TextView d , d1 , d2 , d3 , d4;	

@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail);
		
		i=(ImageView)findViewById(R.id.image);
		d=(TextView)findViewById(R.id.textView1);
		d1=(TextView)findViewById(R.id.View2);
		d2=(TextView)findViewById(R.id.View3);
		d3=(TextView)findViewById(R.id.View4);
		d4=(TextView)findViewById(R.id.View5);
		
		
		
		Typeface font1 = Typeface.createFromAsset(getAssets(), "Courneuf-Regular.ttf");
		d.setTextColor(Color.YELLOW);		
	    d.setTypeface(font1);
	    
	    Typeface font2 = Typeface.createFromAsset(getAssets(), "NewShape-BoldOblique.ttf");
		d1.setTextColor(Color.GREEN);		
	    d1.setTypeface(font2);
	    
	    Typeface font3 = Typeface.createFromAsset(getAssets(), "NewShape-BoldOblique.ttf");
		d2.setTextColor(Color.GREEN);		
	    d2.setTypeface(font3);
	    
	    Typeface font4 = Typeface.createFromAsset(getAssets(), "NewShape-BoldOblique.ttf");
		d3.setTextColor(Color.GREEN);		
	    d3.setTypeface(font4);
	    
	    Typeface font5 = Typeface.createFromAsset(getAssets(), "NewShape-BoldOblique.ttf");
		d4.setTextColor(Color.GREEN);		
	    d4.setTypeface(font5);
	}
@Override
public void onBackPressed() {
	// TODO Auto-generated method stub
	Intent j= new Intent(detail.this , MainActivity.class);
	startActivity(j);
}
@Override
public void onConfigurationChanged(Configuration newConfig) {
  super.onConfigurationChanged(newConfig);
  setContentView(R.layout.detail);
}

@Override
protected void onPause() {
	// TODO Auto-generated method stub
	super.onPause();
	//detail.this.finish();
}

//@Override
//protected void onStop() {
//	// TODO Auto-generated method stub
//	super.onStop();
//	detail.this.finish();
//}	


}
