/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumebuilder;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.awt.*;

/**
 *
 * @author DELL
 */
public class LoginUI extends javax.swing.JFrame implements ActionListener{
	public JLabel l,l1,l2,l3;
	public JTextField t1;
	public JPasswordField t2;
	public JButton b1;	
	public Font f;
	
	public LoginUI() {
		f = new Font("SansSerif", Font.BOLD, 20);
		l = new JLabel("Login");
		l.setFont(f);
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		l3=new JLabel("");
		t1=new JTextField();
		t2=new JPasswordField();
		b1=new JButton("Login");
		l.setBounds(150, 1, 100, 100);
		l1.setBounds(50,100,100,40);
		l2.setBounds(50,140,100,40);
		l3.setBounds(160,5,300,150);
		t1.setBounds(150,100,200,40);
		t2.setBounds(150,140,200,40);
		b1.setBounds(160,200,100,50);
		b1.addActionListener(this);
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(b1);
		add(t1);
		add(t2);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
        @Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			try {
				String fileName = "C:\\Users\\DELL\\Desktop"+ t1.getText().trim()+ ".txt";
				File f = new File(fileName);
				Scanner s = new Scanner(f);
				String pass = s.next();
				s.close();
				if(f.exists()) {
					String password = new String(t2.getPassword());
					if(password.equals(pass)) {
						new ResumeUI();
					}else {
						JOptionPane optionPane = new JOptionPane(l3,JOptionPane.WARNING_MESSAGE);
					    optionPane.showMessageDialog(l3,"Please provide a valid username and password.");
					}
				}
			}catch(Exception w) {
				System.out.println(w);
				JOptionPane optionPane = new JOptionPane(l3,JOptionPane.WARNING_MESSAGE);
			    optionPane.showMessageDialog(l3,"Please provide a valid username and password.");
			}
		}
	}
    /**
     * Creates new form LoginUI
     */
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
