package edu.nju.zuoye;

import java.sql.*;

public class Means {
	public Means() {
        try {
            jbInit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public boolean login(String username, String password) {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        Conn c = new Conn();
        try {
            con = c.getcon();
            st = con.prepareStatement(
                    "select * from userInfo where name=? and password=?");
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public UserBean userinfo() {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        Conn c = new Conn();
        UserBean u = new UserBean();
        con = c.getcon();
        try {
            st = con.prepareStatement("select * from userInfo");
            rs = st.executeQuery();
            if (rs != null) {
                u.setName(rs.getString(1));
                u.setPassword(rs.getString(2));
                u.setType(rs.getString(3));
                return u;
            } else {
                return null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

    private void jbInit() throws Exception {
    }
}
