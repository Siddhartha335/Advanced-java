import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetAdditionalProperties {
    private Database db;
    private Statement st;
    public ResultSetAdditionalProperties() throws SQLException {
        db = new Database();
        Connection connection = db.getConnection();
        st = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet set = st.executeQuery("SELECT * from Employee;");
        set.absolute(1);
        set.updateString("first_name","Siddhartha");
        set.updateRow();

//        set.first();
//        set.relative()

    }

    public static void main(String[] args) throws SQLException {
        new ResultSetAdditionalProperties();
    }
}
