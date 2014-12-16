package info.androidhive.foodon.adapter;
 
//import info.androidhive.foodon.MapActivity;
import info.androidhive.foodon.MapFragment;
import info.androidhive.foodon.R;

import java.util.HashMap;
import java.util.List;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
 
public class ExpandableListAdapter extends BaseExpandableListAdapter {
 
    private Context _context;
    private List<String> _listDataHeader; // header titles
    // child data in format of header title, child title
    private HashMap<String, List<String>> _listDataChild;
    private HashMap<String, List<String>> _listChildImage;
 
    public ExpandableListAdapter(Context context, List<String> listDataHeader,
            HashMap<String, List<String>> listChildData, HashMap<String, List<String>> listChildImage) {
        this._context = context;
        this._listDataHeader = listDataHeader;
        this._listDataChild = listChildData;
        this._listChildImage=listChildImage;
    }
 
    /*public void showMap_clickHandler(View v)
	{
		//get the row the clicked button is in
        RelativeLayout vwParentRow = (RelativeLayout)v.getParent();
         
        TextView txtchild = (TextView)vwParentRow.getChildAt(0);
        Button btnChild = (Button)vwParentRow.getChildAt(1);
        
        btnChild.setText("blah");
        Toast.makeText(this._context, "showmap", Toast.LENGTH_LONG).show();
	}*/
    
    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .get(childPosititon);
    }
    
    public Object getChildImage(int groupPosition, int childPosition){
    	return this._listChildImage.get(this._listDataHeader.get(groupPosition)).get(childPosition);
    }
 
    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }
 
    @Override
    public View getChildView(int groupPosition, final int childPosition,
            boolean isLastChild, View convertView, ViewGroup parent) {
 
        final String childText = (String) getChild(groupPosition, childPosition);
        final String childImage=(String) getChildImage(groupPosition, childPosition);
 
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_item, null);
        }
 
        ImageView imgListChild=(ImageView) convertView.findViewById(R.id.imgListItem);
        TextView txtListChild = (TextView) convertView.findViewById(R.id.lblListItem);
        //Button btnListRegisterChild=(Button) convertView.findViewById(R.id.lstButtonItem_Register);
        //Button btnListShowMapChild=(Button) convertView.findViewById(R.id.lstButtonItem_ShowMap);
 
        Resources resources = this._context.getResources();
        final int resourceId = resources.getIdentifier(childImage, "drawable", 
        this._context.getPackageName());
        //return resources.getDrawable(resourceId);
        
        imgListChild.setImageDrawable(resources.getDrawable(resourceId));
        imgListChild.setScaleType(ScaleType.CENTER_CROP); 
        txtListChild.setText(Html.fromHtml(childText));
        
        //show map on button click
        /*btnListShowMapChild.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//get the row the clicked button is in
				Fragment fragment=new MapFragment();
		        RelativeLayout vwParentRow = (RelativeLayout)v.getParent();
		         
		        TextView txtchild = (TextView)vwParentRow.getChildAt(0);
		        Button btnChild = (Button)vwParentRow.getChildAt(1);
		        
		        Toast.makeText(_context, "loading map", Toast.LENGTH_LONG).show();
		        /*Intent myIntent = new Intent(_context,MapActivity.class);		       
		        _context.startActivity(myIntent);
		        
		        double lat=1.30649;
		        double lon=103.828;
		        
		       String uribegin = "geo:" + lat + "," + lon;
		       String query = lat + "," + lon + " (" + txtchild.getText() + ")";
		       String encodedQuery = Uri.encode(query);
		       String uriString = uribegin + "?q=" + encodedQuery + "&z=16";
	            Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uriString));
	            intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
	            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	            _context.startActivity(intent);
		        
		       /* Intent geoIntent = new Intent(
		                android.content.Intent.ACTION_VIEW, Uri
		                    .parse("geo"));
		        geoIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		        _context.startActivity(geoIntent);*/
		        
		        /*if (fragment != null) {
					FragmentManager fragmentManager = fragment.getFragmentManager();
					fragmentManager.beginTransaction()
							.replace(R.id.frame_container, fragment).commit();
		        }
			}
		}); */
        
        //register to event on button click
       /* btnListRegisterChild.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//get the row the clicked button is in
		        RelativeLayout vwParentRow = (RelativeLayout)v.getParent();
		         
		        TextView txtchild = (TextView)vwParentRow.getChildAt(0);
		        Button btnChild = (Button)vwParentRow.getChildAt(1);
		       
		        Toast.makeText(_context, "Registered!!", Toast.LENGTH_LONG).show();
		        btnChild.setText("Registered");
		        //btnChild.setBackgroundColor(Color.CYAN);
				
			}
		});*/

        return convertView;
    }
 
    @Override
    public int getChildrenCount(int groupPosition) {
        return this._listDataChild.get(this._listDataHeader.get(groupPosition))
                .size();
    }
 
    @Override
    public Object getGroup(int groupPosition) {
        return this._listDataHeader.get(groupPosition);
    }
 
    @Override
    public int getGroupCount() {
        return this._listDataHeader.size();
    }
 
    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }
 
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
            View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_group, null);
        }
 
        TextView lblListHeader = (TextView) convertView
                .findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);
 
        return convertView;
    }
 
    @Override
    public boolean hasStableIds() {
        return false;
    }
 
    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}