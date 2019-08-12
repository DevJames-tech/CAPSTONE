package com.example.crownmediajameschannel.View.Activities

import android.os.Bundle
import android.util.Log
import androidx.core.view.GravityCompat
import androidx.appcompat.app.ActionBarDrawerToggle
import android.view.MenuItem
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import android.view.Menu
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.crownmediajameschannel.Model.Adapter.AdapterPager
import com.example.crownmediajameschannel.R
import kotlinx.android.synthetic.main.viewpager.*

class NavigationDrawerActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    private lateinit var pagerAdapterInstance: PagerAdapter;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_navigation_drawer)


        //To display the navigation drawer
        setupNavigationDrawer();

        val mockData = ArrayList<String>();


        mockData.add("One of those things you have to do");
        mockData.add("Kotlin .. Yes.. Null safe right.");
        mockData.add("It time to duel!");
        mockData.add("The egg is on top");
        mockData.add("Pancakes mr. please self");

        val viewPager: ViewPager? = viewPagerId;
        pagerAdapterInstance = AdapterPager(supportFragmentManager, mockData); // constructors have to be called with a nested class
        viewPager?.adapter = pagerAdapterInstance;


        //pagerAdapterInstance = AdapterPager(supportFragmentManager);
        //make variable pass it into fragment pass the same variable to custom page adapter

    }


/****************************************/
    fun setupNavigationDrawer(){


        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)


        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)

    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.actionbar_search, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
                // Handle the camera action
            }
            R.id.nav_watchlist -> {

            }
            R.id.nav_movies -> {

            }
            R.id.nav_live -> {

            }
            R.id.nav_shows -> {

            }
            R.id.nav_schedule -> {

            }
            R.id.nav_settings -> {

            }
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
