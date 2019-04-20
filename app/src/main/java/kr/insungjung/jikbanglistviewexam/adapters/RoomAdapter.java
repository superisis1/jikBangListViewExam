package kr.insungjung.jikbanglistviewexam.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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

        return row;
    }
}
