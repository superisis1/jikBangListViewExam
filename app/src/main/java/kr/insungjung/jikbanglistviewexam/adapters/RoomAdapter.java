package kr.insungjung.jikbanglistviewexam.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import kr.insungjung.jikbanglistviewexam.R;
import kr.insungjung.jikbanglistviewexam.datas.Room;

public class RoomAdapter extends ArrayAdapter<Room> {

    Context mContext;
    List<Room> mList;
    LayoutInflater inf;

    public RoomAdapter(Context context, List<Room> list) {
        super(context, R.layout.room_list_item, list); //마지막 인자인 list 빼먹는 경우가 많다. 주의!!!

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.room_list_item, null);
        }

        Room roomData = mList.get(position);

//        그냥 findViewById 가 아니고, row.findViewById 인 것이 매우 중요!!!
        TextView paymentTxt = row.findViewById(R.id.paymentTxt);
        TextView locationAndFloorTxt = row.findViewById(R.id.locationAndFloorTxt);
        TextView desriptionTxt = row.findViewById(R.id.descriptionTxt);

        paymentTxt.setText(String.format("%d/%d", roomData.deposit, roomData.month_pay));
        locationAndFloorTxt.setText(String.format("%s, %d층", roomData.location, roomData.floor));
        desriptionTxt.setText(roomData.description);

        return row;
    }
}
