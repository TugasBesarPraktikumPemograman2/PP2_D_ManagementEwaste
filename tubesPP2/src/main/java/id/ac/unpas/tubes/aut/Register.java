/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package id.ac.unpas.tubes.aut;

import dao.UserDao;
import java.util.UUID;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import app.model.User;
import id.ac.unpas.tubes.aut.Login;
import javax.swing.SwingUtilities;

/**
 *
 * @author ridho
 */
public class Register extends javax.swing.JPanel {

    /**
     * Creates new form Register
     */
    public Register() {
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
        passwordError = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        regisAlamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regisBtn = new javax.swing.JButton();
        regisName = new javax.swing.JTextField();
        regisEmail = new javax.swing.JTextField();
        regisPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        regisTelp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        passwordError.setBackground(new java.awt.Color(0, 204, 204));
        passwordError.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordError.setForeground(new java.awt.Color(204, 0, 0));

        regisAlamat.setBackground(new java.awt.Color(0, 102, 102));
        regisAlamat.setColumns(20);
        regisAlamat.setRows(5);
        regisAlamat.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                regisAlamatInputMethodTextChanged(evt);
            }
        });
        jScrollPane2.setViewportView(regisAlamat);

        jLabel5.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setLabelFor(regisAlamat);
        jLabel5.setText("Alamat:");

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setLabelFor(regisName);
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setLabelFor(regisTelp);
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setLabelFor(regisEmail);
        jLabel4.setText("No Telp:");

        regisBtn.setBackground(new java.awt.Color(0, 153, 153));
        regisBtn.setText("Register");
        regisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisBtnActionPerformed(evt);
            }
        });

        regisName.setBackground(new java.awt.Color(0, 102, 102));
        regisName.setToolTipText("");
        regisName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                regisNameInputMethodTextChanged(evt);
            }
        });

        regisEmail.setBackground(new java.awt.Color(0, 102, 102));
        regisEmail.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                regisEmailInputMethodTextChanged(evt);
            }
        });
        regisEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisEmailActionPerformed(evt);
            }
        });

        regisPassword.setBackground(new java.awt.Color(0, 102, 102));
        regisPassword.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                regisPasswordInputMethodTextChanged(evt);
            }
        });
        regisPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisPasswordActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");

        regisTelp.setBackground(new java.awt.Color(0, 102, 102));
        regisTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisTelpActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("jLabel7");
        jLabel7.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 0));
        jLabel8.setText("jLabel7");
        jLabel8.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("jLabel7");
        jLabel9.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("jLabel7");
        jLabel10.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("jLabel7");
        jLabel11.setEnabled(false);

        javax.swing.GroupLayout passwordErrorLayout = new javax.swing.GroupLayout(passwordError);
        passwordError.setLayout(passwordErrorLayout);
        passwordErrorLayout.setHorizontalGroup(
            passwordErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordErrorLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(regisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(passwordErrorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(passwordErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(passwordErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passwordErrorLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(passwordErrorLayout.createSequentialGroup()
                        .addGroup(passwordErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regisEmail)
                            .addGroup(passwordErrorLayout.createSequentialGroup()
                                .addComponent(regisPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordErrorLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(regisName, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(passwordErrorLayout.createSequentialGroup()
                                .addGroup(passwordErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(regisTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(155, 155, 155)))
                        .addGap(166, 166, 166))))
        );
        passwordErrorLayout.setVerticalGroup(
            passwordErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordErrorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(passwordErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regisName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(passwordErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passwordErrorLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22))
                    .addGroup(passwordErrorLayout.createSequentialGroup()
                        .addComponent(regisEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(passwordErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passwordErrorLayout.createSequentialGroup()
                        .addComponent(regisPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(passwordErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(passwordErrorLayout.createSequentialGroup()
                        .addComponent(regisTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(passwordErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        jLabel1.setFont(new java.awt.Font("UD Digi Kyokasho NK-B", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Form Register");

        backBtn.setBackground(new java.awt.Color(0, 153, 153));
        backBtn.setText("Back to login");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordError, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(323, 323, 323))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordError, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    // Metode untuk membersihkan input field setelah registrasi berhasil
    private void clearInputFields() {
        regisName.setText("");
        regisTelp.setText("");
        regisEmail.setText("");
        regisAlamat.setText("");
    }

    private void regisNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_regisNameInputMethodTextChanged
        // TODO add your handling code here:
//        // Validasi jika nama kosong
//        if (regisName.getText().isEmpty()) {
//            // Tampilkan pesan kesalahan jika nama kosong
//            nameError.setText("Nama harus diisi");
//        } else {
//            // Jika tidak ada kesalahan, hapus pesan kesalahan
//            nameError.setText("");
//        }
    }//GEN-LAST:event_regisNameInputMethodTextChanged

    private void regisEmailInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_regisEmailInputMethodTextChanged
        // TODO add your handling code here:
//        // Validasi jika nomor telepon kosong atau tidak valid
//        String telp = regisTelp.getText();
//        if (telp.isEmpty() || !telp.matches("\\d+")) {
//            // Tampilkan pesan kesalahan jika nomor telepon kosong atau tidak valid
//            telpError.setText("Nomor telepon tidak valid");
//        } else {
//            // Jika tidak ada kesalahan, hapus pesan kesalahan
//            telpError.setText("");
//        }
    }//GEN-LAST:event_regisEmailInputMethodTextChanged

    private void regisAlamatInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_regisAlamatInputMethodTextChanged
        // TODO add your handling code here:
//        // Validasi jika alamat kosong
//        if (regisAlamat.getText().isEmpty()) {
//            // Tampilkan pesan kesalahan jika alamat kosong
//            alamatError.setText("Alamat harus diisi");
//        } else {
//            // Jika tidak ada kesalahan, hapus pesan kesalahan
//            alamatError.setText("");
//        }
    }//GEN-LAST:event_regisAlamatInputMethodTextChanged

    private void regisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisBtnActionPerformed
        // TODO add your handling code here:

        // Ambil nilai dari komponen-komponen UI
        String nama = regisName.getText();
        String email = regisEmail.getText();
        String password = new String(regisPassword.getPassword());
        String telp = regisTelp.getText();
        String alamat = regisAlamat.getText();

        // Validasi data sebelum disimpan
        if (nama.isEmpty() || password.length() < 6 || telp.isEmpty() || !telp.matches("\\d+") || alamat.isEmpty()) {
            // Tampilkan pesan kesalahan jika ada validasi yang gagal
            JOptionPane.showMessageDialog(this, "Data yang dimasukkan tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Buat objek User
        User newUser = new User();
        newUser.setUserName(nama);
        newUser.setUserEmail(email);
        newUser.setUserPassword(password);
        newUser.setUserTelp(telp);
        newUser.setUserAlamat(alamat);
        newUser.setIsKurir(false);
        newUser.setIsAdmin(false);  // Atur sesuai kebutuhan

        // Panggil DAO untuk menyimpan data ke dalam database
        UserDao UserDao = new UserDao();
        int result = UserDao.insert(newUser);

        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Registrasi berhasil", "Success", JOptionPane.INFORMATION_MESSAGE);

            Login loginPanel = new Login();

            // Dapatkan frame yang terkait dengan komponen ini
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);

            // Ganti panel konten pada frame dengan panel login
            frame.setContentPane(loginPanel);

            // Perbarui tampilan frame
            frame.revalidate();
            frame.repaint();
        } else {
            JOptionPane.showMessageDialog(this, "Registrasi gagal", "Error", JOptionPane.ERROR_MESSAGE);

        }
        clearInputFields();
    }//GEN-LAST:event_regisBtnActionPerformed

    private void regisPasswordInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_regisPasswordInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_regisPasswordInputMethodTextChanged

    private void regisPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regisPasswordActionPerformed

    private void regisEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regisEmailActionPerformed

    private void regisTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regisTelpActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel passwordError;
    private javax.swing.JTextArea regisAlamat;
    private javax.swing.JButton regisBtn;
    private javax.swing.JTextField regisEmail;
    private javax.swing.JTextField regisName;
    private javax.swing.JPasswordField regisPassword;
    private javax.swing.JTextField regisTelp;
    // End of variables declaration//GEN-END:variables
}
