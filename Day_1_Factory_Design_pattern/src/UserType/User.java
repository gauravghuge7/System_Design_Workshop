package UserType;

import DB.DB;

public class User implements DB {

    @Override
    public void createDB() {
        System.out.println("Creating User");
    }
}
