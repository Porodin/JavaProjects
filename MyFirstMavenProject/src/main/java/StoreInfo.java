import org.sqlite.SQLiteException;

import java.sql.*;
import java.sql.SQLException;
public class StoreInfo {
    private static Connection connection;
    private static Statement stmt;

    public static void main(String[] args) throws SQLiteException, NullPointerException{
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:store.db");
            stmt = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }

        addGood(10, "Samsung", "Orange", 1, 10000);
        updateGoods(1, "Iphone", "Orange", 2, 10000);
        //deleteGoods();
        //alterGoods();
    }

    public static void addGood(int id, String name, String color, int amount, int price) throws NullPointerException, SQLiteException{

        try {
            Statement stmt = connection.createStatement();

            String preparedStatement1 = "INSERT INTO goods(IdOfGoods, NameOfGoods, ColorOfGoods, AmountOfGoods, PriceOfGoods) VALUES (1, 'Iphone', 'Pink', 1, 10000)";
            stmt.executeUpdate(preparedStatement1);

            System.out.println("Successfuly add");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateGoods(int id, String name, String color, int amount, int price){

           try {
               Statement stmt = connection.createStatement();
               stmt.execute("UPDATE goods SET IdOfGoods=" + id +
                                             ", NameOfGoods='" + name + "', ColorOfGoods='" + color + "', AmountOfGoods=" + amount + ",PriceOfGoods=" + price + "  where IdOfGoods = 1");

               System.out.println("Successfuly update");

                ResultSet rs = stmt.executeQuery("SELECT * FROM goods");
                System.out.println(rs.getString("ColorOfGoods"));


        } catch (SQLException  e) {
            e.printStackTrace();
        }
    }

    public static void deleteGoods() {
        try {
            Statement stmt = connection.createStatement();
            stmt.execute("DELETE FROM goods WHERE goods.IdOfGoods >= 1");
            System.out.println("Successfully delete");
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public static void alterGoods(){
        try {
            Statement stmt = connection.createStatement();
            stmt.execute("Alter table goods RENAME COLUMN id to IdOfGoods");
            stmt.execute("Alter table goods RENAME COLUMN name to NameOfGoods");
            stmt.execute(" Alter table goods RENAME COLUMN color to ColorOfGoods");
            stmt.execute(" Alter table goods RENAME COLUMN amount to AmountOfGoods");
            stmt.execute("Alter table goods RENAME COLUMN price to PriceOfGoods");

            System.out.println("Succsessfuly alter");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

        public static void disconnect() {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
