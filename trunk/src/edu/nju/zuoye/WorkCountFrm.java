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

public class WorkCountFrm extends JFrame {
	public WorkCountFrm() {
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
        jLabel1.setText("      人 事 统 计 报 表");
        jLabel1.setBounds(new Rectangle(291, 12, 269, 44));
        jComboBox1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel2.setText("<－－－请选择需要统计的方式默认为全部");
        jLabel2.setBounds(new Rectangle(210, 72, 252, 22));
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel1.setBounds(new Rectangle(10, 112, 825, 381));
        this.getContentPane().add(jComboBox1);
        this.getContentPane().add(jPanel1);
        this.getContentPane().add(jLabel2);
        this.getContentPane().add(jLabel1);
        jComboBox1.setBorder(BorderFactory.createEtchedBorder());
        jComboBox1.setBounds(new Rectangle(29, 72, 178, 22));
        jComboBox1.addItem("默认");
    }

    JLabel jLabel1 = new JLabel();
    JComboBox jComboBox1 = new JComboBox();
    JPanel jPanel1 = new JPanel();
    JLabel jLabel2 = new JLabel();
}
