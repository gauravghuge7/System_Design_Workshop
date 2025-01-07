package Factory;

import DB.DB;
import UserType.Admin;
import UserType.SuperAdmin;
import UserType.User;

public class Factory {

    public DB createDB(String usertype) {

        DB database = null;

        if(usertype.equals("user")) {
            database = new User();
        }
        else if(usertype.equals("admin")) {
            database = new Admin();
        }
        else if(usertype.equals("superAdmin")) {
            database = new SuperAdmin();
        }

        return database;
    }
}
