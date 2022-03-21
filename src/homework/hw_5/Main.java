package homework.hw_5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lesson_java_4", "root", "rootroot");

//        // Заповнення таблиці
//        PreparedStatement preparedStatement = connection.prepareStatement("insert into user (name) values ('Igor'),('Sasha')");
//        preparedStatement.executeUpdate();

        // Виборка данних
        PreparedStatement sellectPreparedStatement = connection.prepareStatement("select * from user");
        ResultSet resultSet = sellectPreparedStatement.executeQuery();

        List<User> users = new ArrayList<>();
        while (resultSet.next()){
//            int id = resultSet.getInt("id");
//            String name = resultSet.getString("name");
//            User user = new User(
//                    resultSet.getInt("id"),
//                    resultSet.getString("name"
//                    );
            users.add(new User(
                    resultSet.getInt("id"),
                    resultSet.getString("name")
                    ));
        }

        connection.close();

        System.out.println(users);
    }
}
