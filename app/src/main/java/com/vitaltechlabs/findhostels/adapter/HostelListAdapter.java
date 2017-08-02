package com.vitaltechlabs.findhostels.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.vitaltechlabs.findhostels.MainActivity;
import com.vitaltechlabs.findhostels.R;
import com.vitaltechlabs.findhostels.model.HostelsListData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shiva on 8/2/2017.
 */

public class HostelListAdapter extends RecyclerView.Adapter<HostelListAdapter.ViewHolder>
{
	Context mContext;
	private List<HostelsListData> listData = new ArrayList<>();
	private MainActivity activity;

	public HostelListAdapter(MainActivity context, List<HostelsListData> hostelListData)
	{
		this.mContext = context;
		this.listData = hostelListData;
		this.activity = context;
	}

	public class ViewHolder extends RecyclerView.ViewHolder
	{
		//		public final TextView eventName, eventDate;
		public final TextView hostel_name, hostelArea, hostelType, hostelCity;
		private ImageView delete;
		private ImageView edit;


		public ViewHolder(View itemView)
		{
			super(itemView);
			hostel_name = (TextView) itemView.findViewById(R.id.hostel_name);
			hostelArea = (TextView) itemView.findViewById(R.id.hostelArea);
			hostelType = (TextView) itemView.findViewById(R.id.hostelType);
			hostelCity = (TextView) itemView.findViewById(R.id.hostelCity);
			delete = (ImageView) itemView.findViewById(R.id.delete);
			edit = (ImageView) itemView.findViewById(R.id.edit);

		}
	}


	public int getItemCount()
	{
		return listData.size();
	}

	public HostelListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
	{
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hostel_name_item, parent, false);
		return new HostelListAdapter.ViewHolder(view);
	}

	public void onBindViewHolder(final HostelListAdapter.ViewHolder viewHolder, final int position)
	{
		try
		{
			if (listData.get(position).getHostelname() != null && !listData.get(position).getHostelname().equalsIgnoreCase("NULL"))
			{
				viewHolder.hostel_name.setText("" + listData.get(position).getHostelname());
			}
			else
			{
				viewHolder.hostel_name.setVisibility(View.GONE);
			}

			if (listData.get(position).getGender() != null && !listData.get(position).getGender().equalsIgnoreCase("NULL"))
			{
				viewHolder.hostelType.setText("Hostel Type : " + listData.get(position).getGender());
			}
			else
			{
				viewHolder.hostelType.setVisibility(View.GONE);
			}

			if (listData.get(position).getArea() != null && !listData.get(position).getArea().equalsIgnoreCase("NULL"))
			{
				viewHolder.hostelArea.setText("Hostel Area : " + listData.get(position).getArea());
			}
			else
			{
				viewHolder.hostelArea.setVisibility(View.GONE);
			}

			if (listData.get(position).getCity() != null && !listData.get(position).getCity().equalsIgnoreCase("NULL"))
			{
				viewHolder.hostelCity.setText("Hostel City : " + listData.get(position).getCity());
			}
			else
			{
				viewHolder.hostelCity.setVisibility(View.GONE);
			}

			viewHolder.delete.setOnClickListener(onDeleteListener(position, viewHolder));

		}
		catch (Exception e)
		{
		}

	}

	private View.OnClickListener onDeleteListener(final int position, final HostelListAdapter.ViewHolder holder)
	{
		return new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{

				activity.deleteListItem(position);
			}
		};
	}
	/*private View.OnClickListener onDeleteListener(final int position, final HostelListAdapter.ViewHolder holder)
	{
		return new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{

				boolean userDelete = remainderDb.deleteRemainder(listData.get(position).getEventName());
				if (userDelete)
				{
					Toast.makeText(mContext, "Remainder Successfully Deleted.. ", Toast.LENGTH_LONG).show();
					listData.remove(position);
					holder.swipeLayout.close();
					activity.updateAdapter();
				}
			}
		};
	}

	private View.OnClickListener onEditListener(final int position, final HostelListAdapter.ViewHolder holder)
	{
		return new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				showEditDialog(position, holder);
			}
		};
	}*/

	/*private void showEditDialog(final int position, final HostelListAdapter.ViewHolder holder)
	{
		holder.swipeLayout.close();
	}*/

}
