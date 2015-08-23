package edu.nju.zuoye;

import java.awt.*;

import javax.swing.*;

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

public class WorkFrm extends JFrame {
	public WorkFrm() {
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
        jLabel1.setText("    职 业 与 部 门 管 理 ");
        jLabel1.setBounds(new Rectangle(290, 19, 275, 47));
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel1.setBounds(new Rectangle(388, 109, 264, 394));
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel2.setBounds(new Rectangle(75, 112, 264, 394));
        jPanel2.setLayout(null);
        jLabel2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel2.setText(" 以 下 是 数 据 库 中 的 所 有 部 门 类 型");
        jLabel2.setBounds(new Rectangle(391, 87, 262, 19));
        jLabel3.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel3.setText(" 以 下 是 数 据 库 中 的 所 有 职 业 类 型");
        jLabel3.setBounds(new Rectangle(77, 91, 262, 19));
        jComboBox1.setBounds(new Rectangle(665, 194, 101, 23));
        jComboBox2.setBounds(new Rectangle(664, 135, 101, 23));
        this.getContentPane().add(jLabel1);
        this.getContentPane().add(jPanel1);
        this.getContentPane().add(jLabel3);
        this.getContentPane().add(jLabel2);
        this.getContentPane().add(jComboBox2);
        this.getContentPane().add(jComboBox1);
        this.getContentPane().add(jPanel2);
    }

    JLabel jLabel1 = new JLabel();
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JComboBox jComboBox1 = new JComboBox();
    JComboBox jComboBox2 = new JComboBox();
}
