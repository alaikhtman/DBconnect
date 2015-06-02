import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Student on 02.06.2015.
 */
public class Main
{
    public static void main(String[] args)
    {
        JDBCConector connector = new JDBCConector();

        try {
            connector.connect();
            //connector.insert("matre", "96980", "kr35@ru");
            //connector.selectByphone("156");
            //connector.selectByName("dasha");

            ArrayList<String> emails = connector.getAllemails();
            for(String e: emails)
            {
                System.out.println(e);
            }
            connector.disconnect();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
