package com.villegapps.attendance;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.villegapps.attendance.model.UserInfo;

import java.util.List;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    private static final String TAG = RecyclerViewHolder.class.getSimpleName();
    public ImageView imageProfile;
    public TextView textName;
    public TextView textIn;
    public TextView textOut;
    public ImageView imageStatus;
    public CardView cardAttendance;
    private List<UserInfo> userInfos;

    public RecyclerViewHolder(final View itemView, final List<UserInfo> userInfos) {
        super(itemView);
        this.userInfos = userInfos;
        textName = itemView.findViewById(R.id.text_name);
        textIn = itemView.findViewById(R.id.text_in);
        textOut = itemView.findViewById(R.id.text_out);
        imageProfile = itemView.findViewById(R.id.image_profile);
        imageStatus = itemView.findViewById(R.id.image_status);
        cardAttendance = itemView.findViewById(R.id.card_attendace);
        imageProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Image Profile has been clicked", Toast.LENGTH_LONG).show();
//                String taskTitle = taskObject.get(getAdapterPosition()).getTask();
//                Log.d(TAG, "Task Title " + taskTitle);
//                DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
//                Query applesQuery = ref.orderByChild("task").equalTo(taskTitle);
//                applesQuery.addListenerForSingleValueEvent(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(DataSnapshot dataSnapshot) {
//                        for (DataSnapshot appleSnapshot : dataSnapshot.getChildren()) {
//                            appleSnapshot.getRef().removeValue();
//                        }
//                    }
//
//                    @Override
//                    public void onCancelled(DatabaseError databaseError) {
//                        Log.e(TAG, "onCancelled", databaseError.toException());
//                    }
//                });
            }
        });
    }
}
