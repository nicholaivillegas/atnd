package com.villegapps.attendance;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.villegapps.attendance.model.UserInfo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private List<UserInfo> userInfo;
    protected Context context;

    public RecyclerViewAdapter(Context context, List<UserInfo> userInfo) {
        this.userInfo = userInfo;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewHolder viewHolder = null;
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_attendance, parent, false);
        viewHolder = new RecyclerViewHolder(layoutView, userInfo);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.textName.setText(userInfo.get(position).getFirstName() + " " + userInfo.get(position).getLastName());
        DateFormat df1 = new SimpleDateFormat("dd", Locale.US);
        String dateNow = df1.format(Calendar.getInstance().getTime());
        if (!userInfo.get(position).getLastOnline().equals(dateNow)) {
            holder.cardAttendance.setCardBackgroundColor(Color.GRAY);
            holder.imageStatus.setBackgroundColor(Color.RED);
        }
        holder.textIn.setText(userInfo.get(position).getTimeIn());
        holder.textOut.setText(userInfo.get(position).getTimeOut());
    }

    @Override
    public int getItemCount() {
        return this.userInfo.size();
    }
}