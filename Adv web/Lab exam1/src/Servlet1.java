import javax.jws.WebService;
import javax.servlet.annotation.WebServlet;
import java.applet.Applet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

@WebService(name = "servlet1")
public class Servlet1 extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;

    public Servlet1 () {
        super();
    PrintWriter out = response.getWriter();
    String username = request.getParameter("username");
    private Applet request;
    String password = request.getParameter("password");

    final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    final String DB_URL="jdbc:mysql://localhost/bitambita";

    final String USER = "root";
    final String PASS = "";

    Connection conn = null;
    Statement stmt = null;


        String name = "(";
        String[] values = request.getParameterValues("name");

        for (int i = 0; i < values.length; i++) {
            name += "'" + values[i] + "'";
            if (i < values.length - 1) {
                name += ",";
            }
        }
        name += ")";
        string name,grade,= String.nameString(request.getParameter("name"));


        String grade = "(";
        String[] values = request.getParameterValues("grade");

        for (int k = 0; k < values.length; k++) {
            name += "'" + values[k] + "'";
            if (k < values.length - 1) {
                grade += ",";
            }
        }
        phonenumber += ")";

        Double = double.phonenumber(request.getParameter("phonenumber"));


        double phonenumber = Double.parseDouble(request.getParameter("phonenumber"));



        try
    {
        Class.forName(JDBC_DRIVER);

        Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS );

        Statement stmt = conn.createStatement();

        String sql = "INSERT INTO bitam(name,registrationnumber,grade,phonenumber,email,male,female,semisterinformation) VALUES('name','registrationnumber','grade','phonenumber','email','male','female',semisterinformation)";
        int outi = stmt.executeUpdate(sql);

    }


   catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
