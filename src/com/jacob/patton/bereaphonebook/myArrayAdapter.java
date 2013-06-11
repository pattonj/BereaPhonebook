package com.jacob.patton.bereaphonebook;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class myArrayAdapter extends ArrayAdapter<String[]> {

	
	private final List<String[]> values;
	 private Activity activity;
	
	
	public myArrayAdapter(Activity activity, List<String[]> values) {
	    super(activity, R.layout.listview_row, values);
	    this.activity = activity;
	    this.values = values;
	  }
	
	
	
	 @Override
	  public View getView(final int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.listview_row, parent, false);
	    
	    TextView textView = (TextView) rowView.findViewById(R.id.lvTitle);
	    textView.setText(values.get(position)[0]);
	    
	    ImageView phone = (ImageView) rowView.findViewById(R.id.lvPhone);
	    phone.setImageResource(R.drawable.phone_small);
	    
		phone.setOnClickListener(new OnClickListener() {
	
	           @Override
	           public void onClick(View v) {
	        		
	              ((PhoneBook)activity).phoneCall(position);
	           }
	           
           

       });
			   
			   
			   
	    return rowView;
	  }
	

}
