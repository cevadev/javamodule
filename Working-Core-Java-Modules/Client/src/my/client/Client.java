package my.client;

import java.sql.DriverManager;

public class Client {
    public static void main(String[] args) throws Throwable{
        DriverManager.getConnection("etc");
    }
}
