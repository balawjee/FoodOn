package info.androidhive.foodon;

import info.androidhive.foodon.adapter.ExpandableListAdapter;
import info.androidhive.foodon.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

public class WhatsHotFragment extends Fragment {
	
	public WhatsHotFragment(){}
	private ExpandableListView expListView;
	private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    private ExpandableListAdapter listAdapter;
    private HashMap<String, List<String>> listChildImage;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_whats_hot, container, false);
         
        // get the listview
        expListView=(ExpandableListView) rootView.findViewById(R.id.expandableListView1);
     
        // preparing list data
        prepareListData();
 
        listAdapter = new ExpandableListAdapter(getActivity().getBaseContext(), listDataHeader, listDataChild, listChildImage);
 
        // setting list adapter
        expListView.setAdapter(listAdapter);

        return rootView;
    }
	
	 /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
 
        // Adding child data
        listDataHeader.add("England vs Italy");
        listDataHeader.add("Germany vs Portugal");
        listDataHeader.add("Brazil vs Mexico");
 
        // Adding child data
        List<String> pubs_match1 = new ArrayList<String>();
		/*pubs.add("Alchemy Bistro Singapore");
		pubs.add("Brewerkz Singapore");
		pubs.add("Charlie’s SnackBar");
		pubs.add("Crysabelle KTV Lounge");
		pubs.add("Harry's Bar Pekin Street Singapore");
		pubs.add("Harry's Riverside Point");
		pubs.add("Prince of Wales Backpacker Pub & Hostel");
		pubs.add("Blooie's Roadhouse");		
		pubs.add("Mel’s Place");*/
        
		pubs_match1.add("<b>Alchemy Bistro Singapore </b><br> <i>Clemenceau Ave </i><br> <font color=\"#008000\">England 15 vs Italy 14</font>");
		pubs_match1.add("<b>Brewerkz Singapore </b><br> <i>Orchard Rd </i><br> <font color=\"#008000\">England 6 vs Italy 11</font>");
		pubs_match1.add("<b>Charlie’s Snack Bar</b><br> <i>Loyang Ave </i><br> <font color=\"#008000\">England ? vs Italy 4</font>");
		pubs_match1.add("<b>Crysabelle KTV Lounge</b><br> <i>Outram Park </i><br> <font color=\"#008000\">England 2 vs Italy 8</font>");
 
        List<String> pubs_match2 = new ArrayList<String>();
        pubs_match2.add("<b>Harry's Bar Pekin Street Singapore</b> <br> <i>Pizza Hut Far East Square </i><br> <font color=\"#008000\">Germany ? vs Portugal 3</font>");
        pubs_match2.add("<b>Harry's Riverside Point</b><br> <i>Havelock Rd </i><br> <font color=\"#008000\">Germany 5 vs Portugal 1</font>");
        pubs_match2.add("<b>Prince of Wales Backpacker Pub & Hostel</b><br> <i>Rochor Canal Rd </i><br> <font color=\"#008000\">Germany 20 vs Portugal 14</font>");
        /*nowShowing.add("The Conjuring");
        nowShowing.add("Despicable Me 2");
        nowShowing.add("Turbo");
        nowShowing.add("Grown Ups 2");
        nowShowing.add("Red 2");
        nowShowing.add("The Wolverine");*/
 
        List<String> pubs_match3 = new ArrayList<String>();
        pubs_match3.add("<b>Blooie's Roadhouse</b> <br> <i>Jalan Tua Kong </i><br> <font color=\"#008000\">Brazil 4 vs Mexico 1</font>");
		pubs_match3.add("<b>Mel’s Place </b><br> <i>East Coast Rd </i><br> <font color=\"#008000\">Brazil 5 vs Mexico 6</font>");
        /*comingSoon.add("2 Guns");
        comingSoon.add("The Smurfs 2");
        comingSoon.add("The Spectacular Now");
        comingSoon.add("The Canyons");
        comingSoon.add("Europa Report");   */     
 
        listDataChild.put(listDataHeader.get(0), pubs_match1);
        listDataChild.put(listDataHeader.get(1), pubs_match2);
        listDataChild.put(listDataHeader.get(2), pubs_match3);
        // Header, Child data
        //listDataChild.put(listDataHeader.get(1), nowShowing);
        //listDataChild.put(listDataHeader.get(2), comingSoon);
    }
}
