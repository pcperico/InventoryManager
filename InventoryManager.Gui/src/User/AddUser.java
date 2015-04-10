/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Data.Configuration.StringsKeysHelper;
import Data.Dao.Interfaces.IUserRepository;
import Data.Entities.User;
import General.JInternalFrameCenter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author GlobalDev
 */
public class AddUser extends JInternalFrameCenter {

    /**
     * Creates new form AddUser
     */
    IUserRepository _userRepository;
    public AddUser() {
        initComponents();
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(StringsKeysHelper.applicationContextFile);
        _userRepository = (IUserRepository)ctx.getBean(StringsKeysHelper.UserRepository);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_UName = new javax.swing.JTextField();
        txt_ULastName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_UPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_UAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_UUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dc_UBirthDate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_UPassword = new javax.swing.JPasswordField();
        txt_URePassword = new javax.swing.JPasswordField();
        bnt_acept = new javax.swing.JButton();
        btn_clean = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_UEmail = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Agregar Usuario");

        Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Fecha Nac.:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Direccion: ");

        jLabel6.setText("Username:");

        jLabel7.setText("Password:");

        jLabel8.setText("Confirme Password:");

        bnt_acept.setText("Aceptar");
        bnt_acept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_aceptActionPerformed(evt);
            }
        });

        btn_clean.setText("Limpiar");
        btn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleanActionPerformed(evt);
            }
        });

        btn_exit.setText("Salir");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        jLabel9.setText("Email:");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(bnt_acept)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_clean)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_exit))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_ULastName, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(dc_UBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(txt_UPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(txt_UAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(txt_UUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(txt_UName, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addComponent(txt_UPassword)
                                .addComponent(txt_URePassword))
                            .addComponent(txt_UEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dc_UBirthDate, txt_UAddress, txt_ULastName, txt_UName, txt_UPhone, txt_UUserName});

        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_UName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ULastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dc_UBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_UPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_UAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_UEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_UUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_UPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_URePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt_acept)
                    .addComponent(btn_clean)
                    .addComponent(btn_exit)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed
        this.clearFields(this.Panel);
    }//GEN-LAST:event_btn_cleanActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void bnt_aceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_aceptActionPerformed
        try {
            User u = _userRepository.createUser(this.txt_UName.getText().trim(), this.txt_ULastName.getText().trim(), this.dc_UBirthDate.getDate(), this.txt_UPhone.getText().trim(), this.txt_UEmail.getText().trim(), this.txt_UAddress.getText().trim(), this.txt_UUserName.getText().trim(), new String(this.txt_UPassword.getPassword()));
            if (u != null && u.getId() > 0) {
                JOptionPane.showMessageDialog(rootPane, "Usuario insertado correctamente!!!");
                this.clearFields(this.Panel);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al insertar el usuario, favor revisar los datos ingresados, intente de nuevo, si el problema persiste contactar al administrador del sistema");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());

        }
    }//GEN-LAST:event_bnt_aceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton bnt_acept;
    private javax.swing.JButton btn_clean;
    private javax.swing.JButton btn_exit;
    private com.toedter.calendar.JDateChooser dc_UBirthDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_UAddress;
    private javax.swing.JTextField txt_UEmail;
    private javax.swing.JTextField txt_ULastName;
    private javax.swing.JTextField txt_UName;
    private javax.swing.JPasswordField txt_UPassword;
    private javax.swing.JTextField txt_UPhone;
    private javax.swing.JPasswordField txt_URePassword;
    private javax.swing.JTextField txt_UUserName;
    // End of variables declaration//GEN-END:variables
}
