package info.androidhive.foodon;
/*package info.androidhive.foodon;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MapActivity extends Activity {

	static final LatLng HAMBURG = new LatLng(53.558, 9.927);
    static final LatLng KIEL = new LatLng(53.551, 9.993);
    private GoogleMap map;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_map);
		Toast.makeText(getBaseContext(), "haha!!", Toast.LENGTH_LONG).show();
		
		Marker hamburg = map.addMarker(new MarkerOptions().position(new LatLng(1.374894, 103.809110))
                .title("Hamburg FC"));
            Marker kiel = map.addMarker(new MarkerOptions()
                .position(new LatLng(1.361987, 103.886422))
                .title("Kiel")
                .snippet("Kiel is cool")
                .icon(BitmapDescriptorFactory
                    .fromResource(R.drawable.ic_launcher)));

            // Move the camera instantly to hamburg with a zoom of 15.
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(1.374894, 103.809110), 15));

            // Zoom in, animating the camera.
            map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);
	}
}*/
