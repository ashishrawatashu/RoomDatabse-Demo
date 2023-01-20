package in.nic.snt.starbus.roomdemo.roomDataBase.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class UserModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "userId")
    int userId;

    @ColumnInfo(name = "userName")
    String userName;

    @ColumnInfo(name = "emailId")
    String emailId;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
