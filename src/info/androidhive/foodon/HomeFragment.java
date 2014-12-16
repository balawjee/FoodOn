package info.androidhive.foodon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import info.androidhive.foodon.adapter.ExpandableListAdapter;
import info.androidhive.foodon.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class HomeFragment extends Fragment {
	
	public HomeFragment(){}
	private ExpandableListView expListView;
	private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    private HashMap<String, List<String>> listChildImage;
    private ExpandableListAdapter listAdapter;
    private Button btnChangeLocation;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        
        btnChangeLocation=(Button) rootView.findViewById(R.id.btnChangeLocation);
        
        // get the listview
        expListView=(ExpandableListView) rootView.findViewById(R.id.expandableListView1);
             
        // preparing list data
        prepareListData();
 
        listAdapter = new ExpandableListAdapter(getActivity().getBaseContext(), listDataHeader, listDataChild,listChildImage);
 
        // setting list adapter
        expListView.setAdapter(listAdapter);
        expListView.expandGroup(0);
        
        return rootView;
    }
	
	/*public void showMap_clickHandler(View v)
	{
		//get the row the clicked button is in
        RelativeLayout vwParentRow = (RelativeLayout)v.getParent();
         
        TextView txtchild = (TextView)vwParentRow.getChildAt(0);
        Button btnChild = (Button)vwParentRow.getChildAt(1);
        
        btnChild.setText("blah</font>");
        Toast.makeText(getActivity().getBaseContext(), "showmap", Toast.LENGTH_LONG).show();
	}*/
	
	 /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        listChildImage=new HashMap<String, List<String>>();
        
        // Adding child data
        listDataHeader.add("All Products");
        /*listDataHeader.add("Now Showing");
        listDataHeader.add("Coming Soon...");*/
 
        // Adding child data
        List<String> pubs = new ArrayList<String>();
        List<String> imgs=new ArrayList<String>();
		/*pubs.add("Alchemy Bistro Singapore");
		pubs.add("Brewerkz Singapore");
		pubs.add("Charlie’s SnackBar");
		pubs.add("Crysabelle KTV Lounge");
		pubs.add("Harry's Bar Pekin Street Singapore");
		pubs.add("Harry's Riverside Point");
		pubs.add("Prince of Wales Backpacker Pub & Hostel");
		pubs.add("Blooie's Roadhouse");
		pubs.add("Mel’s Place");*/
		
        imgs.add("apples");
        pubs.add("<font color=\"#aea8a8\">S$3</font><font color=\"#009200\"> <b>S$1</b></font> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ~1.3Km");
		//pubs.add("<b>Alchemy Bistro Singapore </b><br> <i>Clemenceau Ave </i><br> <font color=\"#000000\">England 5 vs Italy 8</font>");
		imgs.add("beer");
		pubs.add("<font color=\"#aea8a8\">S$4</font><font color=\"#009200\"> <b>S$1</b></font> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ~0.3Km");
		//pubs.add("<b>Brewerkz Singapore </b><br> <i>Orchard Rd </i><br> <font color=\"#000000\">England ? vs Italy ?</font>");
		imgs.add("cans");
		pubs.add("<font color=\"#aea8a8\">S$5</font><font color=\"#009200\"> <b>S$2</b></font> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ~0.2Km");
		//pubs.add("<b>Charlie’s Snack Bar</b><br> <i>Loyang Ave </i><br> <font color=\"#000000\">England 10 vs Italy ?</font>");
		imgs.add("chips");
		pubs.add("<font color=\"#aea8a8\">S$2.30</font><font color=\"#009200\"> <b>S$0.50</b></font> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ~0.6Km");
		//pubs.add("<b>Crysabelle KTV Lounge</b><br> <i>Outram Park </i><br> <font color=\"#000000\">England 3 vs Italy 2</font>");
		imgs.add("yogurt");
		pubs.add("<font color=\"#aea8a8\">S$1.20</font><font color=\"#009200\"> <b>S$0.30</b></font> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp ~0.3Km");
		//pubs.add("<b>Harry's Bar Pekin Street Singapore</b> <br> <i>Pizza Hut Far East Square </i><br> <font color=\"#000000\">Germany 5 vs Portugal 8</font>");
		/*pubs.add("<b>Harry's Riverside Point</b><br> <i>Havelock Rd </i><br> <font color=\"#008000\">Germany 7 vs Portugal 4</font>");
		pubs.add("<b>Prince of Wales Backpacker Pub & Hostel</b><br> <i>Rochor Canal Rd </i><br> <font color=\"#008000\">Germany ? vs Portugal ?</font>");
		pubs.add("<b>Blooie's Roadhouse</b> <br> <i>Jalan Tua Kong </i><br> <font color=\"#008000\">Brazil 8 vs Mexico ?</font>");
		pubs.add("<b>Mel’s Place </b><br> <i>East Coast Rd </i><br> <font color=\"#008000\">Brazil 1 vs Mexico 3 </font>");*/
 
        /*List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("The Conjuring");
        nowShowing.add("Despicable Me 2");
        nowShowing.add("Turbo");
        nowShowing.add("Grown Ups 2");
        nowShowing.add("Red 2");
        nowShowing.add("The Wolverine");
 
        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("2 Guns");
        comingSoon.add("The Smurfs 2");
        comingSoon.add("The Spectacular Now");
        comingSoon.add("The Canyons");
        comingSoon.add("Europa Report");        
 */
        listDataChild.put(listDataHeader.get(0), pubs);
        listChildImage.put(listDataHeader.get(0), imgs);
        // Header, Child data
        //listDataChild.put(listDataHeader.get(1), nowShowing);
        //listDataChild.put(listDataHeader.get(2), comingSoon);
    }
}


