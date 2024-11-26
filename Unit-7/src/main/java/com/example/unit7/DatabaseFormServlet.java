package com.example.unit7;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "DatabaseForm", value = "/database-form")
public class DatabaseFormServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private Database db;
    Connection con;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name=request.getParameter("sname");
        String email=request.getParameter("semail");
        String address=request.getParameter("saddress");


        try {
            db = new Database();
            con = db.getConnection();
            String insert = "INSERT INTO Students (sname, semail, saddress) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.executeUpdate();

            // Query the database to get all students
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Students");

            // Print the results in an HTML table
            out.print("<table border='1'>");
            out.print("<tr><th>Name</th><th>Email</th><th>Address</th></tr>");
            while(rs.next()) {
                out.print("<tr>");
                out.print("<td>" + rs.getString("sname") + "</td>");
                out.print("<td>" + rs.getString("semail") + "</td>");
                out.print("<td>" + rs.getString("saddress") + "</td>");
                out.print("</tr>");
            }
            out.print("</table>");

        } catch ( SQLException e) {
            e.printStackTrace();  // Print the error message for debugging
            out.print("<h3>Error occurred: " + e.getMessage() + "</h3>");
        } finally {
            try {
                if (con != null) {
                    con.close();  // Close the connection if it's open
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
