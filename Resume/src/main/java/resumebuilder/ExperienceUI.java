    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumebuilder;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.*;

/**
 *
 * @author DELL
 */
public class ExperienceUI extends javax.swing.JFrame implements ActionListener {
	public String Name, DOB, FatherName, Nationality,email,PhoneNo,School,College,University,SchoolFrom,SchoolTo,CollegeFrom,CollegeTo,UniversityFrom,UniversityTo,imagePath,English,German,French,Hindi;
	public JLabel l,l1,l2,l3,l4;
	public JTextField t1,t2,t3;
	public JButton b1;
	public JComboBox j1;
	public Font f;
	
	public ExperienceUI(String Name, String DOB, String FatherName, String Nationality ,String PhoneNo, String email,String School, String College, String University,String SchoolFrom, String SchoolTo, String CollegeFrom, String CollegeTo, String UniversityFrom, String UniversityTo,String imagePath,String English, String German, String French,String Hindi) {
		this.Name = Name;
		this.DOB = DOB;
		this.FatherName = FatherName;
		this.Nationality = Nationality;
		this.PhoneNo = PhoneNo;
		this.email = email;
		this.College = College;
		this.School=School;
		this.University = University;
		this.SchoolFrom =SchoolFrom;
		this.SchoolTo = SchoolTo;
		this.UniversityFrom = UniversityFrom;
		this.UniversityTo = UniversityTo;
		this.CollegeFrom = CollegeFrom;
		this.CollegeTo=CollegeTo;
		this.imagePath =imagePath;
		this.English=English;
		this.German=German;
		this.French=French;
		this.Hindi=Hindi;
		f = new Font("SansSerif", Font.BOLD, 20);
		l = new JLabel("Experience");
		l.setFont(f);
		l1 = new JLabel("Company");
		l2 = new JLabel("Designation");
		l3 = new JLabel("Salary");
		l4 = new JLabel("Years");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		j1 = new JComboBox();
		b1 = new JButton("Save");
		for(int i=1;i<=30;i++){
	        j1.addItem(i);
		}
		l.setBounds(150, 10, 250,50);
		l1.setBounds(50, 90, 250,40);
		l2.setBounds(50, 130, 250,40);
		l3.setBounds(50, 170, 250,40);
		l4.setBounds(50,210,250,40);
		t1.setBounds(150, 90, 200,40);
		t2.setBounds(150, 130, 200,40);
		t3.setBounds(150, 170, 200,40);
		j1.setBounds(150,210,100,40);
		b1.setBounds(300,300, 100,50);
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(j1);
		b1.addActionListener((ActionListener) this);
		setLayout(null);
		setSize(640,400);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Saved your details");
		new Resume(Name, DOB, FatherName, Nationality,email,PhoneNo,School,College,University,SchoolFrom,SchoolTo,CollegeFrom,CollegeTo,UniversityFrom,UniversityTo,t1.getText(), t2.getText(),t3.getText(),j1.getSelectedItem().toString(),imagePath,English,German,French,Hindi);
		String s = new String("PriyamCv");
	}
    /**
     * Creates new form ExperienceUI
     */
    public ExperienceUI() {
        initComponents();
    }

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
            java.util.logging.Logger.getLogger(ExperienceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExperienceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExperienceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExperienceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExperienceUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
