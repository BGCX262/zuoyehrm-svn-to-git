package edu.nju.zuoye;
/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2007</p>
 *
 * <p>Company: </p>
 *
 * @author not attributable
 * @version 1.0
 */
public class UserBean {
	private String username;
    private String password;
     private String testpassword;
    private String type;
    public UserBean() {
        try {
            jbInit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
    }

    public void setName(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void setTestPassword(String testpassword) {
           this.testpassword = testpassword;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    public String getTestPassword() {
           return testpassword;
    }
    public String getType() {
        return type;
    }
}
