package UserType;

import DB.DB;

public class SuperAdmin implements DB {


    @Override
    public void createDB() {
        System.out.println("Creating Super Admin");
    }

}
