/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package id.ac.unpas.tubes.aut;

//import app.service.AppSession;
import dao.UserDao;
import id.ac.unpas.tubes.Home;
import id.ac.unpas.tubes.aut.Register;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import app.model.User;
import app.service.AppSession;

/**
 *
 * @author ridho
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loginEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loginPassword = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        loginRegisBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setLabelFor(loginEmail);
        jLabel2.setText("Email");

        loginEmail.setBackground(new java.awt.Color(0, 102, 102));
        loginEmail.setForeground(new java.awt.Color(255, 255, 255));
        loginEmail.setText("admin@gmail.com");
        loginEmail.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                loginEmailInputMethodTextChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setLabelFor(loginPassword);
        jLabel3.setText("Password");

        loginPassword.setBackground(new java.awt.Color(0, 102, 102));
        loginPassword.setText("admin123");
        loginPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        loginPassword.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                loginPasswordInputMethodTextChanged(evt);
            }
        });
        loginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPasswordActionPerformed(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(0, 153, 153));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("- or -");

        loginRegisBtn.setBackground(new java.awt.Color(0, 153, 153));
        loginRegisBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginRegisBtn.setText("Register");
        loginRegisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginRegisBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(loginPassword)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginRegisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginRegisBtn)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Form Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(293, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(346, 346, 346))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginRegisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginRegisBtnActionPerformed
        // TODO add your handling code here:
        // Ketika tombol "Register" ditekan, buat objek Register
        Register registerPanel = new Register();

        // Mengakses frame yang mengelilingi panel ini
        JFrame frame = (JFrame) this.getTopLevelAncestor();

        // Mengganti panel saat ini dengan panel Register
        frame.setContentPane(registerPanel);
        frame.revalidate();
        frame.repaint();
    }//GEN-LAST:event_loginRegisBtnActionPerformed

    private void loginEmailInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_loginEmailInputMethodTextChanged
        // TODO add your handling code here:
        loginEmail.setText("admin@gmail.com");
    }//GEN-LAST:event_loginEmailInputMethodTextChanged

    private void loginPasswordInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_loginPasswordInputMethodTextChanged
        // TODO add your handling code here:
        loginPassword.setText("admin123");
    }//GEN-LAST:event_loginPasswordInputMethodTextChanged

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String email = loginEmail.getText();
        String password = new String(loginPassword.getPassword());

        // Pendefinisian
        UserDao userDao = new UserDao();
        User user = userDao.select("email_user", email);

        // Periksa apakah pengguna ditemukan
        String user2 = user.getUserEmail();
        if (user2 != null && user2.equals(email)) {
            // Pengguna ditemukan, periksa kata sandi
            String storedPassword = user.getUserPassword();
            if (storedPassword != null && storedPassword.equals(password)) {
                JOptionPane.showMessageDialog(this, "Login berhasil",
                        "Success", JOptionPane.INFORMATION_MESSAGE);

                // Setel data pengguna yang login ke AppSession
                AppSession.getInstance().setLoggedInUser(user);
                Home homePanel = new Home();

                JFrame frame = (JFrame) this.getTopLevelAncestor();

                frame.setContentPane(homePanel);
                frame.revalidate();
                frame.repaint();
            } else {
                JOptionPane.showMessageDialog(this, "Login gagal. Password salah.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Login gagal. Email tidak terdaftar.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPasswordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField loginEmail;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JButton loginRegisBtn;
    // End of variables declaration//GEN-END:variables
}
