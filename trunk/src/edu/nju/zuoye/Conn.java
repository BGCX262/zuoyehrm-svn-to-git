package edu.nju.zuoye;

import java.sql.*;

public class Conn {
	Connection conn=null;
	   Statement stmt=null;
	   ResultSet rs=null;

	    public Conn() {
	        try {
	            jbInit();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }

	    public Connection getcon() {
	        try {
	            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	            Connection conn = DriverManager.getConnection("jdbc:odbc:zuoyehrm");
	            return conn;
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	            return null;
	        } catch (ClassNotFoundException ex) {
	            ex.printStackTrace();
	            return null;
	        }
	    }

	    private void jbInit() throws Exception {
	    }
}
