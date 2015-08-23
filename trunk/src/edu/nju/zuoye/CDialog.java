package edu.nju.zuoye;

import java.awt.*;
import com.borland.dx.sql.dataset.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.SQLException;

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

public class CDialog extends JDialog {
	public CDialog(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        try {
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jbInit();
            pack();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public CDialog() {
        this(new Frame(), "Dialog1", false);
    }


    private void jbInit() throws Exception {

        this.getContentPane().setLayout(null);
        jLabel1.setBackground(UIManager.getColor("textHighlight"));
        jLabel1.setFont(new java.awt.Font("楷体_GB2312", Font.PLAIN, 18));
        jLabel1.setBorder(BorderFactory.createEtchedBorder());
        jLabel1.setText("        用 户 管 理 界 面");
        jLabel1.setBounds(new Rectangle(146, 10, 287, 47));
        jLabel4.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel4.setText("用户名");
        jLabel4.setBounds(new Rectangle(314, 105, 50, 25));
        passtext.setText("");
        passtext.setBounds(new Rectangle(388, 144, 114, 26));
        testpasstext.setText("");
        testpasstext.setBounds(new Rectangle(390, 182, 114, 26));
        jLabel5.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel5.setText("密码");
        jLabel5.setBounds(new Rectangle(320, 150, 30, 22));
        jLabel8.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
       jLabel8.setText("密码确认");
       jLabel8.setBounds(new Rectangle(316, 185, 59, 22));

        nametext.setText("");
        nametext.setBounds(new Rectangle(387, 104, 114, 26));
        jLabel6.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel6.setText("帐号类型");
        jLabel6.setBounds(new Rectangle(314, 217, 50, 25));
        jButton1.setBounds(new Rectangle(369, 280, 71, 29));
        jButton1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton1.setBorder(border1);
        jButton1.setText("删 除");
        jButton2.setBounds(new Rectangle(441, 280, 71, 29));
        jButton2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton2.setBorder(border1);
        jButton2.setText("修 改");
        jButton3.setBounds(new Rectangle(512, 280, 71, 29));
        jButton3.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton3.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton3.setText("查 询 ");
        jButton4.setBounds(new Rectangle(298, 280, 71, 29));
        jButton4.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton4.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton4.setText("增 加");
        jButton4.addActionListener(new CDialog_jButton4_actionAdapter(this));
        jLabel7.setBorder(BorderFactory.createLineBorder(Color.black));
        jLabel7.setText(" 图 片");
        jLabel7.setBounds(new Rectangle(297, 310, 286, 122));
        jPanel1.setBorder(BorderFactory.createEtchedBorder());
        jPanel1.setBounds(new Rectangle(10, 67, 285, 369));
        jPanel1.setLayout(null);
        jScrollPane1.setBounds(new Rectangle(2, 2, 280, 364));
        jComboBox1.setBorder(BorderFactory.createEtchedBorder());
        jComboBox1.setBounds(new Rectangle(390, 218, 116, 26));
        this.getContentPane().add(jLabel1);
        this.getContentPane().add(jButton4);
        this.getContentPane().add(jButton1);
        this.getContentPane().add(jButton2);
        this.getContentPane().add(jButton3);
        this.getContentPane().add(nametext);
        this.getContentPane().add(jLabel4);
        this.getContentPane().add(jLabel7);
        this.getContentPane().add(jLabel6);
        this.getContentPane().add(jPanel1);
        jPanel1.add(jScrollPane1);
        jScrollPane1.getViewport().add(jTable2);
        this.getContentPane().add(jComboBox1);
        this.getContentPane().add(jLabel5);
        this.getContentPane().add(jLabel8);
        this.getContentPane().add(passtext);
        this.getContentPane().add(testpasstext);
        chooer.addColumn("用户名");
        chooer.addColumn("密码");
         chooer.addColumn("密码确认");
        chooer.addColumn("帐号类型");
        this.setTitle(" 用 户 管 理 界 面");
        jComboBox1.addItem("Admin");
        jComboBox1.addItem("Guest");
       }




    DefaultTableModel chooer = new DefaultTableModel();
    JLabel jLabel1 = new JLabel();
    JTable jTable1 = new JTable();
    JLabel jLabel4 = new JLabel();
    JTextField passtext = new JPasswordField();
    JTextField testpasstext = new JPasswordField();
    JLabel jLabel5 = new JLabel();
    JTextField nametext = new JTextField();
    JLabel jLabel6 = new JLabel();
     JLabel jLabel8 = new JLabel();
    JButton jButton1 = new JButton();
    Border border1 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
            Color.white, Color.white, new Color(118, 118, 118),
            new Color(169, 169, 169));
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JLabel jLabel7 = new JLabel();
    JPanel jPanel1 = new JPanel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable jTable2 = new JTable(chooer);
    JComboBox jComboBox1 = new JComboBox();
    public void jButton4_actionPerformed(ActionEvent e) {
        UserBean u = new UserBean();
        Means m =new Means();
        String username= u.getName();
        String password=u.getPassword();
        String testpw=u.getTestPassword();
        String type =u.getType();
        nametext.setText(username);
        passtext.setText(password);
        testpasstext.setText(testpw);
        jComboBox1.setActionCommand(type);
        if(password.equals(testpw)){
       try{
         Database database1 = new Database();
         database1.setConnection(new com.borland.dx.sql.dataset.ConnectionDescriptor("jdbc:odbc:xwt", "sa", "", false, "sun.jdbc.odbc.JdbcOdbcDriver"));
         Statement sql1 = database1.createStatement() ;
         sql1.executeUpdate("INSERT INTO [UML_CS].[dbo].[user](username,password , type) VALUES('"+username+"' , '"+password+"' , '"+type+"' )") ;
         JOptionPane.showMessageDialog(null,"填加成功","",JOptionPane.DEFAULT_OPTION);

       }
       catch(SQLException www){www.printStackTrace();}
     }
     else{
       JOptionPane.showMessageDialog(null,"您输入的密码前后不符,请重新输入","",JOptionPane.DEFAULT_OPTION);
     }



    }




class CDialog_jButton4_actionAdapter implements ActionListener {
    private CDialog adaptee;
    CDialog_jButton4_actionAdapter(CDialog adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton4_actionPerformed(e);
       }

}
}
