import DB.DB;
import Factory.Factory;
import UserType.Admin;
import UserType.SuperAdmin;
import UserType.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Accpeting Input from User
         */

        Scanner scan = new Scanner(System.in);
        String usertype = scan.nextLine();

        Factory f = new Factory();
        DB database = f.createDB(usertype);


        /**
         * which user create the DB
         */
        database.createDB();
    }
}