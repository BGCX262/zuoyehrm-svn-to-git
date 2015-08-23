package edu.nju.zuoye;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2010</p>
 *
 * <p>Company: </p>
 *
 * @author 单升升
 * @version 1.0
 */


public class MainFrm extends JFrame {
	JMenuBar jMenuBar1 = new JMenuBar();
    JMenu jMenu1 = new JMenu();
    JMenuItem jMenuItem1 = new JMenuItem();
    JMenuItem jMenuItem2 = new JMenuItem();
    JMenuItem jMenuItem3 = new JMenuItem();
    JMenu jMenu2 = new JMenu();
    JMenuItem jMenuItem4 = new JMenuItem();
    JMenuItem jMenuItem5 = new JMenuItem();
    JMenu jMenu3 = new JMenu();
    JMenuItem jMenuItem6 = new JMenuItem();
    JMenuItem jMenuItem7 = new JMenuItem();
    JMenuItem jMenuItem8 = new JMenuItem();
    JMenu jMenu4 = new JMenu();
    JMenuItem jMenuItem9 = new JMenuItem();
    JMenuItem jMenuItem10 = new JMenuItem();
    JButton jButton1 = new JButton();
    Border border1 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
            new Color(97, 255, 255), new Color(68, 195, 255),
            new Color(23, 66, 98), new Color(33, 95, 141));
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    Border border2 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
            new Color(97, 255, 255), new Color(68, 195, 255),
            new Color(23, 66, 98), new Color(33, 95, 141));
    JLabel jLabel2 = new JLabel();
    JButton jButton5 = new JButton();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel5 = new JLabel();
    Border border3 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
            new Color(97, 255, 255), new Color(68, 195, 255),
            new Color(23, 66, 98), new Color(33, 95, 141));
    JButton jButton6 = new JButton();
    Border border4 = new MatteBorder(null);
    Border border5 = BorderFactory.createMatteBorder(6, 6, 6, 6, Color.white);
    Border border6 = BorderFactory.createMatteBorder(6, 6, 6, 6, Color.white);
    Border border7 = BorderFactory.createEtchedBorder(EtchedBorder.RAISED,
            Color.white, new Color(169, 169, 169));
    Border border8 = BorderFactory.createMatteBorder(6, 6, 6, 6, Color.black);
    Border border9 = BorderFactory.createBevelBorder(BevelBorder.RAISED,
            Color.white, Color.white, new Color(118, 118, 118),
            new Color(169, 169, 169));
    Border border10 = BorderFactory.createEmptyBorder();
    TitledBorder titledBorder1 = new TitledBorder("");
    String username;
    /*public main() {
        try {
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }*/
    public MainFrm(String name) {
        try {
            jbInit();
            this.username = name;
            jLabel4.setText("欢迎" + this.username + "登陆企业人事管理系统");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }


    private void jbInit() throws Exception {
        System.out.println(username);
        getContentPane().setLayout(null);
        this.setJMenuBar(jMenuBar1);
        this.setTitle(" 欢 迎 光 临 前 途 企 业 管 理 中 心");
        jMenu1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenu1.setText("系统设置");
        jMenuItem1.setToolTipText(" 欢 迎 光 临 前 途 企 业 管 理 中 心");
        jMenuItem1.setText("用户设置");
        jMenuItem1.addActionListener(new main_jMenuItem1_actionAdapter(this));
        jMenuItem2.setText("重新登陆");
        jMenuItem2.addActionListener(new main_jMenuItem2_actionAdapter(this));
        jMenuItem3.setToolTipText(" 欢 迎 光 临 前 途 企 业 人 事 管 理 中 心");
        jMenuItem3.setText("安全退出");
        jMenuItem3.addActionListener(new main_jMenuItem3_actionAdapter(this));
        jMenu2.setText("人事管理");
        jMenuItem4.setText("人事档案查询");
        jMenuItem4.addActionListener(new main_jMenuItem4_actionAdapter(this));
        jMenuItem5.setText("人事档案管理");
        jMenuItem5.addActionListener(new main_jMenuItem5_actionAdapter(this));
        jMenu3.setText("常用工具");
        jMenuItem6.setText("计算机");
        jMenuItem6.addActionListener(new main_jMenuItem6_actionAdapter(this));
        jMenuItem7.setText("记事本");
        jMenuItem8.setText("人事资料统计");
        jMenuItem8.addActionListener(new main_jMenuItem8_actionAdapter(this));
        jMenuBar1.setFont(new java.awt.Font("Dialog", Font.BOLD, 12));
        jMenuBar1.setToolTipText("");
        jMenu4.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenu4.setText("帮助");
        jMenuItem9.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenuItem9.setText("帮助文档");
        jMenuItem10.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenuItem10.setText("关于程序");
        jButton1.setBackground(SystemColor.control);
        jButton1.setBounds(new Rectangle(108, 3, 102, 39));
        jButton1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        jButton1.setForeground(UIManager.getColor("List.selectionBackground"));
        jButton1.setBorder(border1);
        jButton1.setText("人事档案查询");
        jButton1.addActionListener(new main_jButton1_actionAdapter(this));
        jButton2.setBackground(SystemColor.control);
        jButton2.setBounds(new Rectangle(520, 3, 103, 39));
        jButton2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        jButton2.setForeground(UIManager.getColor("List.selectionBackground"));
        jButton2.setBorder(border1);
        jButton2.setText("退出系统");
        jButton2.addActionListener(new main_jButton2_actionAdapter(this));
        jButton3.setBackground(SystemColor.control);
        jButton3.setBounds(new Rectangle(313, 3, 103, 39));
        jButton3.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        jButton3.setForeground(UIManager.getColor("List.selectionBackground"));
        jButton3.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton3.setText("人事资料统计");
        jButton3.addActionListener(new main_jButton3_actionAdapter(this));
        jButton4.setBackground(UIManager.getColor("ToolBar.floatingBackground"));
        jButton4.setBounds(new Rectangle(3, 3, 104, 39));
        jButton4.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        jButton4.setForeground(UIManager.getColor("List.selectionBackground"));
        jButton4.setBorder(border3);
        jButton4.setText("用户管理");
        jButton4.addActionListener(new main_jButton4_actionAdapter(this));
        jLabel2.setBackground(UIManager.getColor("Button.foreground"));
        jLabel2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel2.setForeground(SystemColor.textHighlight);
        jLabel2.setBorder(BorderFactory.createRaisedBevelBorder());
        jLabel2.setText(
                " 欢 迎   张 三   使 用 前 途 企 业 人 事 管 理 系 统 ， 您 是 超 级 管 理 员 可 以 修 改 或 则 " +
                "加 任 何 数 据  ");
        jLabel2.setBounds(new Rectangle(2, 514, 558, 23));
        jButton5.setBackground(SystemColor.control);
        jButton5.setBounds(new Rectangle(210, 3, 103, 39));
        jButton5.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        jButton5.setForeground(SystemColor.textHighlight);

        jButton5.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton5.setText("人事档案管理");
        jButton5.addActionListener(new main_jButton5_actionAdapter(this));
        jLabel4.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel4.setBorder(border10);
        jLabel4.setText("欢 迎  张 三  登 陆   企 业 人 事 管 理 系 统");
        jLabel4.setBounds(new Rectangle(624, 29, 241, 18));
        jLabel5.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel5.setBorder(border7);
        jLabel5.setText("今 天 是  2007-10-17 号      星期三");
        jLabel5.setBounds(new Rectangle(624, 7, 213, 18));
        jButton6.setBackground(SystemColor.control);
        jButton6.setBounds(new Rectangle(416, 3, 103, 39));
        jButton6.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14));
        jButton6.setForeground(UIManager.getColor("List.selectionBackground"));
        jButton6.setBorder(BorderFactory.createRaisedBevelBorder());
        jButton6.setText("部门职务管理");
        jButton6.addActionListener(new main_jButton6_actionAdapter(this));
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);
        jMenuBar1.add(jMenu3);
        jMenuBar1.add(jMenu4);
        jMenu1.add(jMenuItem1);
        jMenu1.add(jMenuItem2);
        jMenu1.add(jMenuItem3);
        jMenu2.add(jMenuItem4);
        jMenu2.add(jMenuItem5);
        jMenu2.add(jMenuItem8);
        jMenu3.add(jMenuItem6);
        jMenu3.add(jMenuItem7);
        jMenu4.add(jMenuItem9);
        jMenu4.add(jMenuItem10);
        this.getContentPane().add(jButton4);
        this.getContentPane().add(jButton1);
        this.getContentPane().add(jButton5);
        this.getContentPane().add(jButton3);
        this.getContentPane().add(jButton6);
        this.getContentPane().add(jButton2);
        this.getContentPane().add(jLabel4);
        this.getContentPane().add(jLabel5);
        this.getContentPane().add(jLabel2);
        jMenuItem7.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenuItem6.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenu3.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenuItem8.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenuItem5.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenuItem4.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenu2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenuItem3.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenuItem2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jMenuItem1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));

    }

    public void jMenuItem2_actionPerformed(ActionEvent e) {
        LoginFrm l = new LoginFrm();
        l.setLocation(350, 220);
        l.show();
        this.dispose();
    }

    public void jMenuItem1_actionPerformed(ActionEvent e) {
    	LoginFrm d = new LoginFrm();
        d.setLocation(180, 180);
        d.setSize(700, 510);
        d.show();
    }

    public void jMenuItem3_actionPerformed(ActionEvent e) {
        this.dispose();
    }

    public void jButton4_actionPerformed(ActionEvent e) {
    	LoginFrm d = new LoginFrm();
        d.setLocation(180, 180);
        d.setSize(600, 520);
        d.show();

    }

    public void jMenuItem6_actionPerformed(ActionEvent e) {

//        try {
//            Runtime.getRuntime().exec("cmd.exe /ealc.exe");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

    }

    public void jButton1_actionPerformed(ActionEvent e) {
        Persel_F f = new Persel_F();
        f.setSize(850, 600);
        f.setLocation(this.getX(), this.getY());
        f.show();
    }

    public void jButton5_actionPerformed(ActionEvent e) {
//        Persel_F f = new Persel_F();
//        f.setSize(850, 600);
//        f.setLocation(this.getX(), this.getY());
//        f.show();
        WorkerSetFrm w = new WorkerSetFrm();
        w.setSize(850, 600);
        w.setLocation(this.getX(), this.getY());
        w.show();
    }

    public void jButton3_actionPerformed(ActionEvent e) {
        WorkCountFrm w = new WorkCountFrm();
        w.setSize(850, 600);
        w.setLocation(this.getX(), this.getY());
        w.show();

    }

    public void jMenuItem4_actionPerformed(ActionEvent e) {
        Persel_F f = new Persel_F();
        f.setSize(850, 600);
        f.setLocation(this.getX(), this.getY());
        f.show();
    }

    public void jMenuItem5_actionPerformed(ActionEvent e) {
    	WorkerSetFrm w = new WorkerSetFrm();
        w.setSize(850, 600);
        w.setLocation(this.getX(), this.getY());
        w.show();
    }

    public void jMenuItem8_actionPerformed(ActionEvent e) {
    	WorkCountFrm w = new WorkCountFrm();
        w.setSize(850, 600);
        w.setLocation(this.getX(), this.getY());
        w.show();
    }

    public void jButton2_actionPerformed(ActionEvent e) {
        this.dispose();
    }

    public void jButton6_actionPerformed(ActionEvent e) {
        WorkFrm w = new WorkFrm();
        w.setSize(850, 600);
        w.setLocation(this.getX(), this.getY());
        w.show();

    }
}


class main_jButton6_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jButton6_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton6_actionPerformed(e);
    }
}


class main_jButton2_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jButton2_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}


class main_jMenuItem8_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jMenuItem8_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jMenuItem8_actionPerformed(e);
    }
}


class main_jMenuItem5_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jMenuItem5_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jMenuItem5_actionPerformed(e);
    }
}


class main_jMenuItem4_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jMenuItem4_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jMenuItem4_actionPerformed(e);
    }
}


class main_jButton3_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jButton3_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton3_actionPerformed(e);
    }
}


class main_jButton5_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jButton5_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton5_actionPerformed(e);
    }
}


class main_jButton1_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jButton1_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton1_actionPerformed(e);
    }
}


class main_jMenuItem6_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jMenuItem6_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jMenuItem6_actionPerformed(e);
    }
}


class main_jButton4_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jButton4_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton4_actionPerformed(e);
    }
}


class main_jMenuItem3_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jMenuItem3_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jMenuItem3_actionPerformed(e);
    }
}


class main_jMenuItem2_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jMenuItem2_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jMenuItem2_actionPerformed(e);
    }
}


class main_jMenuItem1_actionAdapter implements ActionListener {
    private MainFrm adaptee;
    main_jMenuItem1_actionAdapter(MainFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jMenuItem1_actionPerformed(e);
    }
}
