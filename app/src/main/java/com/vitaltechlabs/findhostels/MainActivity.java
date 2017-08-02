package com.vitaltechlabs.findhostels;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.vitaltechlabs.findhostels.util.SharedPrefsUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
		implements NavigationView.OnNavigationItemSelectedListener
{

	/*@BindView(R.id.hostelNametxt)
	TextView hostelNameTVID;

	@BindView(R.id.hostelAddresstxt)
	TextView hostelAddressTVID;*/

	Context mContext;
	String Address;
	TextView hostelNametxt;
	TextView hostelAddresstxt;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		mContext = MainActivity.this;
//		ButterKnife.bind(this);


		try
		{
			DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
			ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
					this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
			drawer.setDrawerListener(toggle);
			toggle.syncState();

			NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
			View view = ((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.nav_header_main, navigationView);
			hostelNametxt = (TextView) view.findViewById(R.id.hostelNametxt);
			hostelAddresstxt = (TextView) view.findViewById(R.id.hostelAddresstxt);
			navigationView.setNavigationItemSelectedListener(this);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}


		try
		{
			String hostelname = SharedPrefsUtil.getStringPreference(mContext, "hostelname");
			if (hostelname != null && !hostelname.isEmpty())
			{
				hostelNametxt.setText(hostelname + "");
			}
			String area = SharedPrefsUtil.getStringPreference(mContext, "area");
			String city = SharedPrefsUtil.getStringPreference(mContext, "city");
			if (area != null && !area.isEmpty())
			{
				Address = area;
			}
			if (city != null && !city.isEmpty())
			{
				Address = area + " , " + city;
			}
			if (Address != null)
			{
				hostelAddresstxt.setText(Address + "");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}


	}

	@Override
	public void onBackPressed()
	{
		try
		{
			DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
			if (drawer.isDrawerOpen(GravityCompat.START))
			{
				drawer.closeDrawer(GravityCompat.START);
			}
			else
			{
				super.onBackPressed();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings)
		{
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	@SuppressWarnings("StatementWithEmptyBody")
	@Override
	public boolean onNavigationItemSelected(MenuItem item)
	{
		// Handle navigation view item clicks here.
		int id = item.getItemId();

		if (id == R.id.nav_camera)
		{
			// Handle the camera action
		}
		else if (id == R.id.nav_gallery)
		{

		}
		else if (id == R.id.nav_slideshow)
		{

		}
		else if (id == R.id.nav_manage)
		{

		}
		else if (id == R.id.nav_share)
		{

		}
		else if (id == R.id.nav_send)
		{

		}

		DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		drawer.closeDrawer(GravityCompat.START);
		return true;
	}
}
