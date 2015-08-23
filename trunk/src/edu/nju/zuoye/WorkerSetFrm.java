package edu.nju.zuoye;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;
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

public class WorkerSetFrm extends JFrame {
	public WorkerSetFrm() {
        try {
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        getContentPane().setLayout(null);
        jLabel1.setFont(new java.awt.Font("楷体_GB2312", Font.PLAIN, 18));
        jLabel1.setBorder(BorderFactory.createLineBorder(Color.black));
        jLabel1.setText("       人 事 档 案 管 理");
        jLabel1.setBounds(new Rectangle(268, 3, 266, 45));
        jLabel2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel2.setText("职 务");
        jLabel2.setBounds(new Rectangle(232, 44, 33, 21));
        jLabel3.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel3.setText("编 号");
        jLabel3.setBounds(new Rectangle(13, 44, 34, 24));
        jTextField1.setBounds(new Rectangle(278, 75, 173, 23));
        jTextField2.setText("");
        jTextField2.setBounds(new Rectangle(221, 140, 91, 23));
        jLabel4.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel4.setText("年 龄");
        jLabel4.setBounds(new Rectangle(15, 112, 29, 19));
        jLabel5.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel5.setText("姓 名");
        jLabel5.setBounds(new Rectangle(15, 80, 30, 18));
        jRadioButton1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jRadioButton1.setText("女 ");
        jRadioButton1.setBounds(new Rectangle(197, 112, 40, 18));
        jLabel6.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel6.setText("文化程度");
        jLabel6.setBounds(new Rectangle(0, 143, 53, 26));
        jRadioButton2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("男");
        jRadioButton2.setBounds(new Rectangle(159, 114, 38, 16));
        jTextField3.setBounds(new Rectangle(54, 109, 65, 23));
        jComboBox1.setBorder(BorderFactory.createLineBorder(Color.black));
        jComboBox1.setBounds(new Rectangle(278, 42, 171, 22));
        jLabel7.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel7.setText("身份证号");
        jLabel7.setBounds(new Rectangle(211, 79, 53, 21));
        jTextField4.setBounds(new Rectangle(54, 77, 134, 23));
        jLabel8.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel8.setText("政治面貌");
        jLabel8.setBounds(new Rectangle(161, 143, 53, 21));
        jTextField5.setText("");
        jTextField5.setBounds(new Rectangle(55, 173, 263, 23));
        jLabel9.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel9.setText("联系电话");
        jLabel9.setBounds(new Rectangle(241, 110, 53, 21));
        jTextField6.setBounds(new Rectangle(54, 43, 173, 23));
        jLabel10.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel10.setText("性 别");
        jLabel10.setBounds(new Rectangle(123, 111, 33, 21));
        jComboBox2.setBorder(BorderFactory.createLineBorder(Color.black));
        jComboBox2.setBounds(new Rectangle(55, 143, 99, 22));
        jLabel11.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel11.setText("家庭住址");
        jLabel11.setBounds(new Rectangle(2, 175, 53, 21));
        jTextField7.setBounds(new Rectangle(301, 108, 142, 23));
        jButton1.setBounds(new Rectangle(541, 501, 72, 31));
        jButton1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton1.setBorder(border5);
        jButton1.setText("删 除");
        jButton2.setBounds(new Rectangle(319, 503, 72, 29));
        jButton2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton2.setBorder(border6);
        jButton2.setText("修 改");
        jButton3.setBounds(new Rectangle(467, 502, 72, 30));
        jButton3.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton3.setBorder(border7);
        jButton3.setText("退 出");
        jButton4.setBounds(new Rectangle(392, 502, 72, 30));
        jButton4.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton4.setBorder(border4);
        jButton4.setText("增 加");
        jPanel1.setLayout(gridLayout1);
        this.setTitle(" 人 事 档 案 管 理 界 面");
        jPanel2.setBorder(BorderFactory.createEtchedBorder());
        jPanel2.setBounds(new Rectangle(3, 303, 459, 199));
        jPanel2.setLayout(null);
        jTextField8.setText("jTextField8");
        jTextField8.setBounds(new Rectangle(400, 441, 263, 23));
        jLabel12.setFont(new java.awt.Font("Dialog", Font.PLAIN, 20));
        jLabel12.setBorder(BorderFactory.createEtchedBorder());
        jLabel12.setText("人  事  卡  片");
        jLabel12.setBounds(new Rectangle(156, 4, 133, 27));
        jPanel3.setBorder(BorderFactory.createEtchedBorder());
        jPanel3.setBounds(new Rectangle(468, 303, 362, 198));
        jPanel3.setLayout(null);
        jLabel13.setFont(new java.awt.Font("Dialog", Font.PLAIN, 20));
        jLabel13.setText("社 会 关 系");
        jLabel13.setBounds(new Rectangle(120, 2, 105, 28));
        jLabel14.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel14.setText("关系人");
        jLabel14.setBounds(new Rectangle(4, 43, 46, 22));
        jTextField9.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jTextField9.setBounds(new Rectangle(47, 43, 123, 24));
        jLabel15.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel15.setText("关系描述");
        jLabel15.setBounds(new Rectangle(170, 43, 54, 23));
        jComboBox3.setBorder(BorderFactory.createEtchedBorder());
        jComboBox3.setBounds(new Rectangle(228, 42, 118, 23));
        jLabel16.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel16.setText("备注");
        jLabel16.setBounds(new Rectangle(6, 78, 38, 25));
        jTextArea1.setBorder(BorderFactory.createEtchedBorder());
        jTextArea1.setBounds(new Rectangle(47, 79, 231, 114));
        jPanel1.setInputVerifier(null);
        this.getContentPane().add(jPanel1);
        jPanel1.add(jScrollPane1);
        jScrollPane1.getViewport().add(jTable1);
        this.getContentPane().add(jLabel1);
        jPanel2.add(jTextField5);
        jPanel2.add(jLabel11);
        jPanel2.add(jComboBox2);
        jPanel2.add(jLabel6);
        jPanel2.add(jTextField2);
        jPanel2.add(jLabel8);
        jPanel2.add(jTextField3);
        jPanel2.add(jLabel4);
        jPanel2.add(jLabel10);
        jPanel2.add(jRadioButton2);
        jPanel2.add(jRadioButton1);
        jPanel2.add(jLabel9);
        jPanel2.add(jTextField7);
        jPanel2.add(jTextField4);
        jPanel2.add(jLabel5);
        jPanel2.add(jLabel7);
        jPanel2.add(jTextField1);
        jPanel2.add(jTextField6);
        jPanel2.add(jLabel3);
        jPanel2.add(jLabel2);
        jPanel2.add(jComboBox1);
        jPanel2.add(jLabel12);
        this.getContentPane().add(jPanel3);
        jPanel3.add(jLabel13);
        jPanel3.add(jLabel14);
        jPanel3.add(jTextField9);
        jPanel3.add(jLabel15);
        jPanel3.add(jComboBox3);
        jPanel3.add(jLabel16);
        jPanel3.add(jTextArea1);
        this.getContentPane().add(jButton1);
        this.getContentPane().add(jButton4);
        this.getContentPane().add(jButton2);
        this.getContentPane().add(jButton3);
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel1.setBounds(new Rectangle(9, 72, 820, 211));
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
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton1);
        this.getContentPane().add(jPanel2);
        jComboBox1.addItem(" ");
        jComboBox1.addItem("董事长");
        jComboBox1.addItem("经理");
        jComboBox1.addItem("部长");
        jComboBox2.addItem(" ");
        jComboBox2.addItem("博士生");
        jComboBox2.addItem("研究生");
        jComboBox2.addItem("本科");

    }

    DefaultTableModel df = new DefaultTableModel();
    JLabel jLabel1 = new JLabel();
    JPanel jPanel1 = new JPanel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel5 = new JLabel();
    JRadioButton jRadioButton1 = new JRadioButton();
    JLabel jLabel6 = new JLabel();
    JRadioButton jRadioButton2 = new JRadioButton();
    JTextField jTextField3 = new JTextField();
    JComboBox jComboBox1 = new JComboBox();
    JLabel jLabel7 = new JLabel();
    JTextField jTextField4 = new JTextField();
    JLabel jLabel8 = new JLabel();
    JTextField jTextField5 = new JTextField();
    JLabel jLabel9 = new JLabel();
    JTextField jTextField6 = new JTextField();
    JLabel jLabel10 = new JLabel();
    JComboBox jComboBox2 = new JComboBox();
    JLabel jLabel11 = new JLabel();
    JTextField jTextField7 = new JTextField();
    JButton jButton1 = new JButton();
    Border border1 = BorderFactory.createMatteBorder(6, 6, 6, 6, Color.white);
    Border border2 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
            Color.white, Color.white, new Color(118, 118, 118),
            new Color(169, 169, 169));
    Border border3 = BorderFactory.createLineBorder(Color.white, 2);
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    Border border4 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
            Color.white, Color.white, new Color(118, 118, 118),
            new Color(169, 169, 169));
    Border border5 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
            Color.white, Color.white, new Color(118, 118, 118),
            new Color(169, 169, 169));
    Border border6 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
            Color.white, Color.white, new Color(118, 118, 118),
            new Color(169, 169, 169));
    Border border7 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
            Color.white, Color.white, new Color(118, 118, 118),
            new Color(169, 169, 169));
    ButtonGroup buttonGroup1 = new ButtonGroup();
    JPanel jPanel2 = new JPanel();
    JTextField jTextField8 = new JTextField();
    JLabel jLabel12 = new JLabel();
    JPanel jPanel3 = new JPanel();
    JLabel jLabel13 = new JLabel();
    JLabel jLabel14 = new JLabel();
    JTextField jTextField9 = new JTextField();
    JLabel jLabel15 = new JLabel();
    JComboBox jComboBox3 = new JComboBox();
    JLabel jLabel16 = new JLabel();
    JTextArea jTextArea1 = new JTextArea();
    GridLayout gridLayout1 = new GridLayout();
    JScrollPane jScrollPane1 = new JScrollPane();
    JTable jTable1 = new JTable(df);
}
