package in.nic.snt.starbus.roomdemo.roomDataBase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import in.nic.snt.starbus.roomdemo.roomDataBase.entities.UserModel;
import in.nic.snt.starbus.roomdemo.roomDataBase.tableQuries.UserTableDao;

@Database(entities = {
        UserModel.class
},
        version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserTableDao userTableDao();

}