package crackthecode.game;


import crackthecode.game.inf1.MyGestureListener;
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

public class inf2 extends Activity{
TextView t7 , t8 ;
ImageView iv;
private GestureDetectorCompat gestureDetectorCompat;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inf2);
		gestureDetectorCompat = new GestureDetectorCompat(this, new MyGestureListener());
		
		iv=(ImageView)findViewById(R.id.image12);
		t7=(TextView)findViewById(R.id.textV12);
		t8=(TextView)findViewById(R.id.text7);
		
		
		
		Typeface font8 = Typeface.createFromAsset(getAssets(), "Courneuf-Regular.ttf");
		t7.setTextColor(Color.CYAN);		
	    t7.setTypeface(font8);
	    
	    Typeface font9 = Typeface.createFromAsset(getAssets(), "AIRBORNE GP.ttf");
		t8.setTextColor(Color.GREEN);		
	    t8.setTypeface(font9);
	    
	    
	    
		
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
		            
		        
		         

		         
		         
		         
		         if(event2.getX() > event1.getX())
		         {
		         // Toast.makeText(getApplicationContext(),  "swipe up",Toast.LENGTH_SHORT).show();
		          
		          //switch another activity
		             Intent intta = new Intent(inf2.this, inf1.class);
		             startActivity(intta);
		         }

		            return true;
		        }
		    }
	 
	 
	 
	 
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		
		Intent n = new Intent(inf2.this , MainActivity.class);
		startActivity(n);
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		inf2.this.finish();
	}	
}
