package com.example.fooddelivery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.fooddelivery.Adapters.MycartAdapter;
import com.example.fooddelivery.Adapters.RestaurantDetailAdapter;
import com.example.fooddelivery.Adapters.WeeklyDealsAdapter;
import com.example.fooddelivery.Models.RestaurantDetailModel;
import com.example.fooddelivery.Models.WeeklyDealsModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;
    SharedPreferences sharedPreferences;
    // creating shared preference name and key name
//    private static final String SHARED_PREF_NAME = "myPref";
//    private static final String KEY_EMAIL = "email";
//    private static final String KEY_PASS = "password";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




            setContentView(R.layout.activity_home);
            //loading the default fragment
            loadFragment(new HomeFragment());

            //getting bottom navigation view and attaching the listener
            BottomNavigationView navigation = findViewById(R.id.navigation);
            navigation.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) this);



        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        Boolean b1 = sh.getBoolean("isLoggedIn",false);
        String s1 = sh.getString("email","");
      //  Log.v("sbc",s1);

        Toast.makeText(Home.this, ""+s1, Toast.LENGTH_LONG).show();
        if(!b1){
            Intent m = new Intent(this, LogIn.class);
            startActivity(m);
            finish();
        }



    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull @org.jetbrains.annotations.NotNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;

            case R.id.navigation_category:
                fragment = new categoryFragment();
                break;

            case R.id.navigation_offer:
                fragment = new offerFragment();
                break;

            case R.id.navigation_more:
                fragment = new moreFragment();
                break;

            case R.id.navigation_profile:
                fragment = new ProfileFragment();
                break;
        }

        return loadFragment(fragment);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.top_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
                Intent i = new Intent(this, SearchActivity.class);
                this.startActivity(i);
                return true;
            case R.id.action_trolly:
                Intent m = new Intent(this, MyCartActivity.class);
                this.startActivity(m);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
