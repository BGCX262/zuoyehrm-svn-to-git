package edu.nju.zuoye;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import com.borland.jbcl.layout.PaneLayout;
//import com.borland.jbcl.layout.*;

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

public class Persel_F extends JFrame {
	public Persel_F() {
        try {
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        getContentPane().setLayout(null);
        jComboBox1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jComboBox1.setBorder(BorderFactory.createEtchedBorder());
        jComboBox1.setBounds(new Rectangle(10, 9, 128, 25));
        jComboBox1.addActionListener(new Persel_F_jComboBox1_actionAdapter(this));
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel1.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
        jPanel1.setBounds(new Rectangle(4, 70, 823, 428));
        jTable1.setBackground(UIManager.getColor( "CheckBoxMenuItem.selectionBackground"));
        jTable1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jTable1.setBorder(BorderFactory.createEtchedBorder());
        jTable1.setToolTipText("");
        this.getContentPane().add(jComboBox1);
        jButton1.setBounds(new Rectangle(140, 34, 78, 26));
        jButton1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton1.setBorder(border1);
        jButton1.setText("查询");
        this.getContentPane().add(jTextField1);
        this.getContentPane().add(jButton1);
        this.getContentPane().add(jPanel1);
        jPanel1.add(jScrollPane1, null);
        jScrollPane1.getViewport().add(jTable1);
        jTextField1.setBounds(new Rectangle(9, 35, 129, 25));
        jComboBox1.addItem("请选择");
        jComboBox1.addItem("姓名");
        jComboBox1.addItem("部门");
        jComboBox1.addItem("职务");
        df.addColumn("编号");
        df.addColumn("姓名");
        df.addColumn("年龄");
        df.addColumn("性别");
        df.addColumn("文化程度");
        df.addColumn("联系电话");
        df.addColumn("家庭住址");
        df.addColumn("身份证号码");
        df.addColumn("政治面貌 ");
        df.addColumn("职务");

    }
    DefaultTableModel df=new DefaultTableModel();
    JComboBox jComboBox1 = new JComboBox();
    JTextField jTextField1 = new JTextField();
    JButton jButton1 = new JButton();
    Border border1 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
            Color.white, Color.white, new Color(118, 118, 118),
            new Color(169, 169, 169));
    JPanel jPanel1 = new JPanel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable jTable1 = new JTable(df);
    GridLayout gridLayout1 = new GridLayout();
    public void jComboBox1_actionPerformed(ActionEvent e) {

    }
}


class Persel_F_jComboBox1_actionAdapter implements ActionListener {
    private Persel_F adaptee;
    Persel_F_jComboBox1_actionAdapter(Persel_F adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jComboBox1_actionPerformed(e);
    }
}
