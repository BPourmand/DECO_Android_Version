package comdeco_ducs.bihttpsgithub.decotreetourappandroid;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static comdeco_ducs.bihttpsgithub.decotreetourappandroid.R.id.map;

public class STDMapView extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public int curView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stdmap_view);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
        mapFragment.getMapAsync(this);
        //activate the toolbar
        //Toolbar myToolbar =(Toolbar) findViewById(R.id.my_toolbar);
        //setSupportActionBar(myToolbar);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        curView = GoogleMap.MAP_TYPE_NORMAL;

        // Add markers here!
        LatLng start = new LatLng(37.220026, -93.286371);
        LatLng druryTest = new LatLng(37.218451, -93.285680);
        LatLng druryTest2 = new LatLng(37.221070, -93.285696);
        LatLng druryTest3 = new LatLng(37.218217, -93.287392);
        LatLng druryTest4 = new LatLng(37.217409, -93.287392);
        LatLng druryTest5 = new LatLng(37.218960, -93.286120);
        LatLng messageTest = new LatLng(37.217985, -93.285475);
        mMap.addMarker(new MarkerOptions().position(druryTest).title("Silver Maple").snippet("Species: 'Acer Sacharinum', Family: ACERACEAE"));
        mMap.addMarker(new MarkerOptions().position(druryTest2).title("Basswood").snippet("Species: 'Tiliaamericana', Family: MALVACEAE"));
        mMap.addMarker(new MarkerOptions().position(druryTest3).title("Willow").snippet("Species: 'Quercus Phellos', Family: FAGACEAE"));
        mMap.addMarker(new MarkerOptions().position(druryTest4).title("Catalpa").snippet("Species: 'Catalpa Speciosa;, Family: BIGNONIACEAE"));
        mMap.addMarker(new MarkerOptions().position(druryTest5).title("Sycamore").snippet("Species: 'Platanus Occidentalis', Family: PLATANACEAE"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(start, 17));
    }



        public void SwitchSatellite(View v) {

        FragmentManager manager = getSupportFragmentManager();
        SupportMapFragment mapFragment = (SupportMapFragment) manager.findFragmentById(R.id.map);

        if (curView == GoogleMap.MAP_TYPE_NORMAL) {
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            curView = GoogleMap.MAP_TYPE_SATELLITE;
        }
         else if (curView == GoogleMap.MAP_TYPE_SATELLITE) {
            mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            curView = GoogleMap.MAP_TYPE_NORMAL;
        }
        }

    }
