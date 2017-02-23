package crackthecode.game;


import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class information extends Activity{
TextView t , t1 , t2  , t4 , t5  , t6 , t8;
ImageView iv;

//private GestureDetectorCompat gestureDetectorCompat;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.information);
	//	gestureDetectorCompat = new GestureDetectorCompat(this, new MyGestureListener());
		
		iv=(ImageView)findViewById(R.id.image1);
		t=(TextView)findViewById(R.id.textV1);
		t1=(TextView)findViewById(R.id.text2);
		t2=(TextView)findViewById(R.id.text3);
		t8=(TextView)findViewById(R.id.text7);
		t4=(TextView)findViewById(R.id.text4);
		t5=(TextView)findViewById(R.id.text5);
		t6=(TextView)findViewById(R.id.text6);

		
		
		Typeface font1 = Typeface.createFromAsset(getAssets(), "Courneuf-Regular.ttf");
		t.setTextColor(Color.CYAN);		
	    t.setTypeface(font1);
	    
	    Typeface font2 = Typeface.createFromAsset(getAssets(), "AIRBORNE GP.ttf");
		t1.setTextColor(Color.GREEN);		
	    t1.setTypeface(font2);
	    
	    Typeface font3 = Typeface.createFromAsset(getAssets(), "AIRBORNE GP.ttf");
		t2.setTextColor(Color.GREEN);		
	    t2.setTypeface(font3);
	    
	    
	    Typeface font5 = Typeface.createFromAsset(getAssets(), "AIRBORNE GP.ttf");
		t4.setTextColor(Color.GREEN);		
	    t4.setTypeface(font5);
	    
	    Typeface font6 = Typeface.createFromAsset(getAssets(), "AIRBORNE GP.ttf");
		t5.setTextColor(Color.GREEN);		
	    t5.setTypeface(font6);
	    
	    Typeface font7 = Typeface.createFromAsset(getAssets(), "AIRBORNE GP.ttf");
		t6.setTextColor(Color.GREEN);		
	    t6.setTypeface(font7);
	    
	    Typeface font9 = Typeface.createFromAsset(getAssets(), "AIRBORNE GP.ttf");
	  		t8.setTextColor(Color.GREEN);		
	  	    t8.setTypeface(font9);
	  	    
	    
		
	}

//	 @Override
//	 public boolean onTouchEvent(MotionEvent event) {
//	 	// TODO Auto-generated method stub
//	 	 this.gestureDetectorCompat.onTouchEvent(event);
//	      return super.onTouchEvent(event);
//
//	 }
//	 
	 
	 
//	 class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
//		  //handle 'swipe left' action only
//
//		        @Override
//		        public boolean onFling(MotionEvent event1, MotionEvent event2, 
//		                float velocityX, float velocityY) 
//		        {
//		            
//		       if(event2.getX() < event1.getX())
//		         {
//		         // Toast.makeText(getApplicationContext(),"swipe up", Toast.LENGTH_SHORT).show();
//		          
//		          //switch another activity
//		             Intent in = new Intent(information.this, inf1.class);
//		             startActivity(in);
//		         }
//
//		            return true;
//		        }
//		    }
//	 
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	  super.onConfigurationChanged(newConfig);
	  setContentView(R.layout.information);
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent n = new Intent(information.this , MainActivity.class);
		startActivity(n);
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	//information.this.finish();
	}	
	
//	protected void onDestroy() {
//		// TODO Auto-generated method stub
//		super.onDestroy();
//		information.this.finish();
//	}
}
