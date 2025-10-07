package hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class atches {


    Connection connection;
    Statement statement;


    public atches(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_system", "root", "Editza786");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
