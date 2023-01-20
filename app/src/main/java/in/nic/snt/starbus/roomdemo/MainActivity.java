package in.nic.snt.starbus.roomdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import in.nic.snt.starbus.roomdemo.roomDataBase.AppDatabase;
import in.nic.snt.starbus.roomdemo.roomDataBase.entities.UserModel;
import in.nic.snt.starbus.roomdemo.roomDataBase.tableQuries.UserTableDao;

public class MainActivity extends AppCompatActivity {

    private AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "UserDB").allowMainThreadQueries().build();


        insertData();

        getAllData();

//        deleteTable();

        updateTable();

    }

    private void updateTable() {
        UserTableDao userTableDao = db.userTableDao();
        userTableDao.updateUserBysUserId("Rawat","ashishrawat6677@gmail.com");
    }

    private void deleteTable() {
        UserTableDao userTableDao = db.userTableDao();
        userTableDao.deleteUserTableTable();
    }

    private void getAllData() {
        UserTableDao userTableDao = db.userTableDao();
        List<UserModel> userModelList = userTableDao.getAllUserList();
        Log.e("SIZE", String.valueOf(userModelList.size()));

    }

    private void insertData() {

        UserTableDao userTableDao = db.userTableDao();
        UserModel userModel = new UserModel();
        userModel.setUserName("Ashish Rawat");
        userModel.setEmailId("ashishrawat6677@gmail.com");

        userTableDao.insertRecord(userModel);

    }
}