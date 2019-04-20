package kr.insungjung.jikbanglistviewexam;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kr.insungjung.jikbanglistviewexam.adapters.RoomAdapter;
import kr.insungjung.jikbanglistviewexam.databinding.ActivityMainBinding;
import kr.insungjung.jikbanglistviewexam.datas.Room;

public class MainActivity extends AppCompatActivity {

    RoomAdapter mRoomAdapter;

    List<Room> roomList = new ArrayList<>(); // 리스트를 멤버변수로 생성

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

        act.cleanRoomCountTxt.setText("32개");

        fillRooms();

        mRoomAdapter = new RoomAdapter(MainActivity.this, roomList);
        act.roomListView.setAdapter(mRoomAdapter);

    }

    void fillRooms() {
        roomList.add(new Room(500, 35, "서구 둔산동", 3, "타임월드 인근~~"));
        roomList.add(new Room(500, 45, "동구 둔산동", 7, "갤러리아 백화점 인근"));
        roomList.add(new Room(500, 35, "북구 둔산동", 20, "저렴"));
        roomList.add(new Room(500, 35, "남구 둔산동", 2, "롯데월드"));
        roomList.add(new Room(500, 40, "동구 둔산동", 127, "시청근처"));
        roomList.add(new Room(500, 35, "서구 둔산동", -2, "타임스퀘어 인근"));

    }
}
