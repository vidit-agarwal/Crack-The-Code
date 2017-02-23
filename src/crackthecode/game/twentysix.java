package crackthecode.game;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class twentysix extends Activity{
Button b26 ;
ImageView iv;
TextView y;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.twentysix);
		b26=(Button)findViewById(R.id.button26);
	
		iv=(ImageView)findViewById(R.id.imageView1);
		
y=(TextView)findViewById(R.id.textView26);
		
		Typeface font1 = Typeface.createFromAsset(getAssets(), "Courneuf-Regular.ttf");
		y.setTextColor(Color.rgb(23, 45, 19));		
	    y.setTypeface(font1);
		
		b26.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Intent exit1 = new Intent(Intent.ACTION_MAIN); 
				exit1.addCategory(Intent.CATEGORY_HOME); 
				exit1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
				startActivity(exit1); 
				finish();	
				
				
				
				
			}
		});
		
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		//twentyone.this.finish();
	}	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	  super.onConfigurationChanged(newConfig);
	  setContentView(R.layout.twentysix);
	}

}
