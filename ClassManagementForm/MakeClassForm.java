/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassManagementForm;

import ClassManagement.AddClass;
import ClassManagement.AddOpenClass;
import ClassManagement.FindClassNumber;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 순범
 */
public class MakeClassForm extends javax.swing.JFrame {

    /**
     * Creates new form MakeClass
     */
    public MakeClassForm() {
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

        jTextField4 = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ClassNumber = new javax.swing.JTextField();
        jTextField_Prof = new javax.swing.JTextField();
        jTextField_Min = new javax.swing.JTextField();
        jTextField_Max = new javax.swing.JTextField();
        jButton_OpenClass = new javax.swing.JButton();
        jButton2_Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextField4.setEditable(false);
        jTextField4.setText("개설할 강좌번호");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("수강 담당자-강좌 개설");

        jButton1.setText("강좌검색");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ClassNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassNumberActionPerformed(evt);
            }
        });

        jButton_OpenClass.setText("강좌 개설");
        jButton_OpenClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OpenClassActionPerformed(evt);
            }
        });

        jButton2_Back.setText("뒤로가기");
        jButton2_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_BackActionPerformed(evt);
            }
        });

        jLabel2.setText("개설할 강좌번호");

        jLabel3.setText("담당교수 지정");

        jLabel4.setText("최소학생 지정");

        jLabel5.setText("최대학생 지정");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_OpenClass)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Prof, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Min, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Max, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2_Back, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ClassNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(61, 61, 61))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton2_Back)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(ClassNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Prof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_OpenClass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String cn=ClassNumber.getText();
       FindClassNumber fc=new FindClassNumber();
       fc.Find();
       
       if(cn.isBlank() == true){
           
            JOptionPane aaa;
              aaa = new JOptionPane();   
              JOptionPane.showMessageDialog(null, "개설할 강좌번호를 입력하세요.");
       }
       
       else if(fc.FindLine(cn)) {
           
           JOptionPane aa=new JOptionPane();
            aa.showMessageDialog(null, "등록된 강좌가 있습니다."); 
       }
       
       else {
            
           JOptionPane aa=new JOptionPane();
           aa.showMessageDialog(null, "등록된 강좌가 없습니다.");
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton_OpenClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OpenClassActionPerformed
        // TODO add your handling code here:
        
        FindClassNumber gc = new FindClassNumber();
        gc.Find();
        
        String Classnum = ClassNumber.getText();
       // String result = gc.GetLine(Classnum);
         // jTextfield를 그대로 받을 수 없으므로 스트링 변수 만들고 스트링 변수 파라미터로 사용.
         
         String Prof = jTextField_Prof.getText();
         String Min =  jTextField_Min.getText();
         String Max = jTextField_Max.getText();
         
         String Form = gc.GetLine(Classnum) + " " + Prof + " " + Min + " " + Max + " ";
         //System.out.println(Form);
          AddOpenClass a = new AddOpenClass();
          
          if(Classnum.isBlank()== true || Prof.isBlank() == true || Min.isBlank() == true || Max.isBlank() == true){
           // 입력해야 할 텍스트박스들이 모두 채워지지 않았다면 모든 정보를 입력하라는 메시지를 출력한다.
              JOptionPane aaa;
              aaa = new JOptionPane();   
              JOptionPane.showMessageDialog(null, "모든 정보를 입력하세요.");
            } // if 끝
          
          else {
          
                try {
                     a.Add(Form);

                     JOptionPane aaa;
                     aaa = new JOptionPane();
                     JOptionPane.showMessageDialog(null, "추가 성공");

                     ClassNumber.setText(null);
                      jTextField_Prof.setText(null);
                     jTextField_Min.setText(null);
                     jTextField_Max.setText(null);

                 } catch (IOException ex) {
                     Logger.getLogger(AddClass.class.getName()).log(Level.SEVERE, null, ex);
                 }
            
          }// else문 끝
         //String Form = gc.GetLine(Classnum) + Prof + " " + Min + " " + Max + " ";
         //System.out.println(gc.GetLine(Classnum));
    }//GEN-LAST:event_jButton_OpenClassActionPerformed

    private void ClassNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassNumberActionPerformed

    private void jButton2_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_BackActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jButton2_BackActionPerformed

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
            java.util.logging.Logger.getLogger(MakeClassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeClassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeClassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeClassForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeClassForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClassNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2_Back;
    private javax.swing.JButton jButton_OpenClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField_Max;
    private javax.swing.JTextField jTextField_Min;
    private javax.swing.JTextField jTextField_Prof;
    // End of variables declaration//GEN-END:variables
}