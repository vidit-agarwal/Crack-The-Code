package crackthecode.game;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class inf1 extends Activity{
TextView t3 , t4 , t5  , t6 ;
ImageView iv1;

private GestureDetectorCompat gestureDetectorCompat;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inf1);
		gestureDetectorCompat = new GestureDetectorCompat(this, new MyGestureListener());
		
		iv1=(ImageView)findViewById(R.id.image11);
		t3=(TextView)findViewById(R.id.textV11);
		t4=(TextView)findViewById(R.id.text4);
		t5=(TextView)findViewById(R.id.text5);
		t6=(TextView)findViewById(R.id.text6);

		
		
		Typeface font4 = Typeface.createFromAsset(getAssets(), "Courneuf-Regular.ttf");
		t3.setTextColor(Color.CYAN);		
	    t3.setTypeface(font4);
	    
	    Typeface font5 = Typeface.createFromAsset(getAssets(), "AIRBORNE GP.ttf");
		t4.setTextColor(Color.GREEN);		
	    t4.setTypeface(font5);
	    
	    Typeface font6 = Typeface.createFromAsset(getAssets(), "AIRBORNE GP.ttf");
		t5.setTextColor(Color.GREEN);		
	    t5.setTypeface(font6);
	    
	    Typeface font7 = Typeface.createFromAsset(getAssets(), "AIRBORNE GP.ttf");
		t6.setTextColor(Color.GREEN);		
	    t6.setTypeface(font7);
	    
	    
		
	}

	 @Override
	 public boolean onTouchEvent(MotionEvent event) {
	 	// TODO Auto-generated method stub
	 	 this.gestureDetectorCompat.onTouchEvent(event);
	      return super.onTouchEvent(event);

	 }
	 
	 
	 
	 class MyGestureListener extends GestureDetector.SimpleOnGestureListener {
		  //handle 'swipe left' action only

		        @Override
		        public boolean onFling(MotionEvent event1, MotionEvent event2, 
		                float velocityX, float velocityY) 
		        {
		            
		        
		         

		         
		         if(event2.getX() < event1.getX())
		         {
		         // Toast.makeText(getApplicationContext(),  "swipe up",Toast.LENGTH_SHORT).show();
		          
		          //switch another activity
		             Intent intt = new Intent(inf1.this, inf2.class);
		             startActivity(intt);
		         }
		         
		         else if(event2.getX() > event1.getX())
		         {
		         // Toast.makeText(getApplicationContext(),  "swipe up",Toast.LENGTH_SHORT).show();
		          
		          //switch another activity
		             Intent inttd = new Intent(inf1.this, information.class);
		             startActivity(inttd);
		         }

		            return true;
		        }
		    }
	 
	 
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent n = new Intent(inf1.this , MainActivity.class);
		startActivity(n);
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		inf1.this.finish();
	}	

}
