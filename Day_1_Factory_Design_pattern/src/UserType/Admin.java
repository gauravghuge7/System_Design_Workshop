package UserType;

import DB.DB;

public class Admin implements DB {


    @Override
    public void createDB() {
        System.out.println("Creating Admin");
    }
}
