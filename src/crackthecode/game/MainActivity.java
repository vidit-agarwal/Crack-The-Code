package crackthecode.game;



import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
Button play , quit , hw , b;
TextView tv1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b=(Button)findViewById(R.id.but1);
		play=(Button)findViewById(R.id.button1);
		quit=(Button)findViewById(R.id.button3);
		hw=(Button)findViewById(R.id.button2);
		tv1=(TextView) findViewById(R.id.textView1);
		tv1.setVisibility(View.GONE);
		tv1.postDelayed(new Runnable() {
	        public void run() {
	            tv1.setVisibility(View.VISIBLE);
	        }
	    }, 2000);
		Typeface font1 = Typeface.createFromAsset(getAssets(), "Courneuf-Regular.ttf");
		tv1.setTextColor(Color.RED);		
	tv1.setTypeface(font1);
	
		
		
		play.setVisibility(View.GONE);
		play.postDelayed(new Runnable() {
	        public void run() {
	            play.setVisibility(View.VISIBLE);
	        }
	    }, 5000);
		
		hw.setVisibility(View.GONE);
		hw.postDelayed(new Runnable() {
	        public void run() {
	            hw.setVisibility(View.VISIBLE);
	        }
	    }, 6500);
		
		quit.setVisibility(View.GONE);
		quit.postDelayed(new Runnable() {
	        public void run() {
	            quit.setVisibility(View.VISIBLE);
	        }
	    }, 8000);
		
		b.setVisibility(View.GONE);
		b.postDelayed(new Runnable() {
	        public void run() {
	            b.setVisibility(View.VISIBLE);
	        }
	    }, 9500);
		
		
		
		
		
		play.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i= new Intent(MainActivity.this , one.class);
				startActivity(i);
			}
		});
		
		
		quit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				   
				Intent exit = new Intent(Intent.ACTION_MAIN); 
				exit.addCategory(Intent.CATEGORY_HOME); 
				exit.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
				startActivity(exit); 
				finish();	
				
				
			}
		});
		
		
		hw.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				   
				Intent exit1 = new Intent(MainActivity.this , information.class); 
				
				startActivity(exit1); 
				
				
				
			}
		});
		
b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				   
				Intent exit5 = new Intent(MainActivity.this , detail.class); 
				
				startActivity(exit5); 
//				
				
				
			}
		});
		
                
	}
	
	
	
    public void onBackPressed() {
		
    	final AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(this);
	    alertDialogBuilder.setTitle("WARNING !!!");
        alertDialogBuilder.setIcon(R.drawable.exit2);
		alertDialogBuilder.setMessage("DO U WANT TO EXIT ??");
		
		//alertDialogBuilder.setViewBackground(HALLOWEEN_ORANGE);
		alertDialogBuilder.setPositiveButton("EXIT",new DialogInterface.OnClickListener()
		{
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),"EXIT SUCCESSFUL !!!",1000).show();
				Intent startMain = new Intent(Intent.ACTION_MAIN); 
				startMain.addCategory(Intent.CATEGORY_HOME); 
				startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); 
				startActivity(startMain); 
				finish();
				
			}
		});
		alertDialogBuilder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
	}
		});
		

        AlertDialog alertDialog=alertDialogBuilder.create();
		alertDialog.show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	//information.this.finish();
	}	
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	  super.onConfigurationChanged(newConfig);
	  setContentView(R.layout.activity_main);
	}
}
