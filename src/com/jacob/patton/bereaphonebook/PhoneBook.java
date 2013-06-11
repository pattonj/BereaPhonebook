package com.jacob.patton.bereaphonebook;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.actionbarsherlock.app.SherlockListActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;




import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class PhoneBook extends SherlockListActivity {
	
	
	SimpleAdapter myList;
	// list used in the adapter. 
	List<HashMap<String, String>> displayData;
	List<String[]> allData;
	List<String> listData;
	
	
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add("Theme")
		.setShowAsAction(MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
		return true;
	}	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
		if(settings.getInt("Theme",0) != 0){
		setTheme(R.style.Theme_BereaBlue);
		}
		else{
			setTheme(R.style.Theme_Sherlock);
		}
		
		super.onCreate(savedInstanceState);
		
		
		
		getSupportActionBar().setDisplayShowHomeEnabled(false);
		getSupportActionBar().setTitle("Berea Easy Phonebook");
		
		
		
		setContentView(R.layout.phone_book_activity);
		
		displayData = new ArrayList<HashMap<String, String>>();
		listData = new ArrayList<String>();
		
		PhoneBookDataStored data = new PhoneBookDataStored();
		allData = new ArrayList<String[]>(); 
		allData.addAll(data.createdata());
		
		
        for(int i =0;i < allData.size();i++){
        	HashMap<String, String> map = new HashMap<String, String>();
        	map.put("title", allData.get(i)[0]);
        	displayData.add(map);
        	
        	listData.add(allData.get(i)[0]);
        }
        
     
        myArrayAdapter adapter = new myArrayAdapter(this, allData);
        setListAdapter(adapter);
	
	}
	public void onListItemClick(ListView l, View v, int position, long id) {
		
		String info = "Phone: "+ allData.get(position)[1]+"\nAddress: "+allData.get(position)[3]+"\nHours: "+allData.get(position)[4]+"\n"; 
		final String email = allData.get(position)[2];
		
		new AlertDialog.Builder(this)
		.setTitle(allData.get(position)[0])
		.setPositiveButton("Email",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, just close
                    	Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                                "mailto",email, null));
                    startActivity(Intent.createChooser(emailIntent, "Send email..."));
                    }
		  })
		.setNegativeButton("Close",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, just close
                        dialog.cancel();
                    }
		  })

		.setMessage(info)
		.show();
			
	}
	
	public void phoneCall(int position){
		try {
			Toast.makeText(this, "Calling"+allData.get(position)[0],Toast.LENGTH_SHORT).show();
	        Intent callIntent = new Intent(Intent.ACTION_CALL);
	        callIntent.setData(Uri.parse("tel:"+allData.get(position)[1]));
	        startActivity(callIntent);
	    } catch (ActivityNotFoundException activityException) {
	         Log.e("dialer", "Call failed");
	    }
		
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getTitle().equals("Theme")){
			
			SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
			SharedPreferences.Editor editor = settings.edit();
			
			// if it is not false, apply BereaBlue
			if(settings.getInt("Theme",0) != 0){
				editor.putInt("Theme", 0);
			}
			// if it is, apply Theme.Sherlock
			else{
				editor.putInt("Theme", 1);
				
			}
			// commit the edit and then recreate the activity to apply the theme. 
		    editor.commit();
		    // super.recreate() works on 3.0 (API 11) and above.
		    if(Integer.valueOf(android.os.Build.VERSION.SDK_INT) <11){
		    	// this flags it for no animation and then restarts

		        Intent intent = getIntent();
		        overridePendingTransition(0, 0);
		        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
		        finish();

		        overridePendingTransition(0, 0);
		        startActivity(intent);
		    }
		    else{
		    	super.recreate();	
		    }
		    
		}
		
		return true;
	}
}
