package edu.nju.zuoye;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <p>Title: 登录窗体</p>
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

public class LoginFrm extends JFrame {
	JPanel contentPane;
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JLabel jLabel3 = new JLabel();
    JTextField nametext = new JTextField();
    JPasswordField passtext = new JPasswordField();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    public LoginFrm() {
        try {
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            jbInit();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * Component initialization.
     *
     * @throws java.lang.Exception
     */
    private void jbInit() throws Exception {
        contentPane = (JPanel) getContentPane();
        contentPane.setLayout(null);
        setSize(new Dimension(385, 286));
        setTitle("Frame Title");
        jLabel1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 20));
        jLabel1.setBorder(BorderFactory.createEtchedBorder());
        jLabel1.setText("     前 途 企 业 人 事 管 理 系 统");
        jLabel1.setBounds(new Rectangle(36, 13, 321, 40));
        jLabel2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel2.setText("密 码");
        jLabel2.setBounds(new Rectangle(80, 135, 39, 23));
        jLabel3.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jLabel3.setText("用户名");
        jLabel3.setBounds(new Rectangle(77, 90, 43, 22));
        nametext.setText("");
        nametext.setBounds(new Rectangle(144, 89, 128, 25));
        passtext.setText("");
        passtext.setBounds(new Rectangle(143, 132, 132, 25));
        jButton1.setBounds(new Rectangle(204, 190, 77, 31));
        jButton1.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton1.setText("取 消");
        jButton2.setBounds(new Rectangle(94, 191, 78, 30));
        jButton2.setFont(new java.awt.Font("Dialog", Font.PLAIN, 12));
        jButton2.setText("登 陆");
        jButton2.addActionListener(new LoginFrm_jButton2_actionAdapter(this));
        contentPane.add(jLabel1);
        contentPane.add(jLabel3);
        contentPane.add(nametext);
        contentPane.add(passtext);
        contentPane.add(jLabel2);
        contentPane.add(jButton1);
        contentPane.add(jButton2);
    }

    public void jButton2_actionPerformed(ActionEvent e) {
        String username = nametext.getText();
        String password = passtext.getText();
        Means m = new Means();
        if (username == null || username.equals("") || password == null ||
            password.equals("")) {
            JOptionPane.showMessageDialog(this, "请输入用户名和密码", "用户名和密码不能为空",
                                          JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            if (m.login(username, password)) {
//                System.out.println(username);
                MainFrm mm = new MainFrm(username);

                mm.setLocation(120, 85);
                mm.setSize(850, 600);
                mm.show();
                this.dispose();
                return;
            } else {
                JOptionPane.showMessageDialog(this, "用户名或密码错误", "用户名或密码错误",
                                              JOptionPane.ERROR_MESSAGE);
                return;
            }

        }
    }
}


class LoginFrm_jButton2_actionAdapter implements ActionListener {
    private LoginFrm adaptee;
    LoginFrm_jButton2_actionAdapter(LoginFrm adaptee) {
        this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
        adaptee.jButton2_actionPerformed(e);
    }
}
