package in.nic.snt.starbus.roomdemo.roomDataBase.tableQuries;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import in.nic.snt.starbus.roomdemo.roomDataBase.entities.UserModel;

@Dao
public interface UserTableDao {

    @Insert
    void insertRecord(UserModel concessionsModel);

    @Query("SELECT EXISTS(SELECT * FROM user_table WHERE userId= :userId)")
    Boolean is_exist(int userId);

    @Query("SELECT * FROM user_table")
    List<UserModel> getAllUserList();

    @Query("DELETE FROM user_table WHERE userId = :userId")
    void deleteUserBysUserId(int userId);

    @Query("UPDATE user_table SET userName =:userName WHERE emailId = :emailId")
    void updateUserBysUserId(String userName, String emailId);

    @Query("DELETE FROM user_table")
    void deleteUserTableTable();

}
