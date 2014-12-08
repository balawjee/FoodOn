package info.androidhive.foodon;

import info.androidhive.foodon.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MapFragment extends Fragment {
	
	public MapFragment(){}
	/*static final LatLng HAMBURG = new LatLng(53.558, 9.927);
    static final LatLng KIEL = new LatLng(53.551, 9.993);*/
    private MapFragment map;
    
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);
         
        map = ((MapFragment) getChildFragmentManager().findFragmentById(R.id.the_map));
        
        return rootView;
    }
}
