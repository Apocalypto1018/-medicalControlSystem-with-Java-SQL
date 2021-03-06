/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.controladorBD;
import Modelo.modeloDatos;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Copito
 */
public class vistaUnidadMedica extends javax.swing.JDialog {

    /**
     * Creates new form vistaUnidadMedica
     */
    public String auxCase;
    public String auxModal;
    public String auxIdPac;
    public int validaBD = 0;
    public int random1;
    public int random11;
    public int random12;
    public int random13;
    
    controladorBD cb = new controladorBD();
    modeloDatos cd = new modeloDatos();
    public vistaUnidadMedica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        /*Al inciar genero los numeros con que el paciente se va identificar*/
        // Instanciar clase Random
        random1 = (int)(Math.random()*10000000+1);
        random11 = (int)(Math.random()*10000000+2);
        random12 = (int)(Math.random()*10000000+3);
        random13 = (int)(Math.random()*10000000+4);
        
        //cd.setUm_paciente(random1);
        //cd.setUm_folio(Integer.toString(random13));
        //cd.setUm_seguro(Integer.toString(random12));
        //cd.setId_unidadmedica(random11);
        um_foliobd.setText(Integer.toString(random13));
        um_pacientebd.setText(Integer.toString(random1));
        um_segurobd.setText(Integer.toString(random12));
        um_idumedidabd.setText(Integer.toString(random11));
        auxModal = Integer.toString(random11);
        auxIdPac = Integer.toString(random1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        um_pacientebd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        um_foliobd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        um_segurobd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        um_idumedidabd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        um_doctorbd = new javax.swing.JComboBox<>();
        um_consultoriobd = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        jPanel1.setBackground(new java.awt.Color(250, 190, 117));

        jPanel2.setBackground(new java.awt.Color(159, 48, 18));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTRO DE UNIDAD M??DICA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ID. PACIENTE:");

        um_pacientebd.setEditable(false);

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("N??MERO DE FOLIO:");

        um_foliobd.setEditable(false);

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("N??MERO DE SEGURO:");

        um_segurobd.setEditable(false);

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("ESPECIALISTA:");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("CONSULTORIO:");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("ID. UNIDAD M??DICA");

        um_idumedidabd.setEditable(false);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atras/Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        um_doctorbd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Juan Carlos Medina", "Jose Luis Camacho", "Marta Luisa Luca" }));

        um_consultoriobd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jPanel3.setBackground(new java.awt.Color(159, 48, 18));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel3)
                .addContainerGap(814, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(26, 26, 26)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(um_pacientebd, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(um_foliobd))
                                .addGap(149, 149, 149)
                                .addComponent(um_idumedidabd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(um_consultoriobd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(um_doctorbd, 0, 300, Short.MAX_VALUE)
                                            .addComponent(um_segurobd))
                                        .addGap(199, 199, 199)
                                        .addComponent(jLabel16))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(158, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(um_pacientebd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(um_foliobd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(um_idumedidabd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(um_segurobd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(um_doctorbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(um_consultoriobd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*Datos*/
        Date ahora = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat formatoTiempo = new SimpleDateFormat("hh:mm:ss");
        String fechaFormateada = formatoFecha.format(ahora);
        String fechaFormatoTiempo = formatoTiempo.format(ahora);
        System.out.println("formato de fecha " + formatoFecha.toPattern());
        System.out.println("formato de tiempo " + formatoTiempo.toPattern());
        System.out.println("fecha como cadena " + ahora.toString());
        System.out.println("formato de fecha " + formatoFecha.toPattern() + " valor: " + fechaFormateada);
        System.out.println("formato de fecha " + formatoTiempo.toPattern() + " valor: " + fechaFormatoTiempo);
        /**/
        cb.MySQLConnection("root", "sakai", "bdconsultorio"); /*Abrimos conexi??n*/
            auxCase = um_pacientebd.getText();
            //cd.setUm_consultorio((String) um_consultoriobd.getSelectedItem());
            String umConsultorio = (String) um_consultoriobd.getSelectedItem();
            //cd.setUm_folio(um_foliobd.getText());
            String umFolio = um_foliobd.getText();
            //cd.setUm_medico((String) um_doctorbd.getSelectedItem());
            String umMedico = (String) um_doctorbd.getSelectedItem();
            //cd.setUm_paciente(Integer.parseInt(auxCase));
            int umPaciente = Integer.parseInt(auxCase);
            System.out.println(""+auxCase);
            System.out.println(""+(String) um_consultoriobd.getSelectedItem());
            System.out.println(""+um_foliobd.getText());
            System.out.println(""+Integer.parseInt(auxCase));
            System.out.println(""+(String) um_doctorbd.getSelectedItem());
            //Validamos
            //insertDataUsuarioUM
            validaBD = cb.insertDataUsuarioUM("tabla_unidadmedica",random11, random1,umFolio,umMedico,umConsultorio);
            if(validaBD == 1){
                
                System.out.println("Proceso de guardado de Usuario de Unidad M??dica fue correcto");
                validaBD = cb.insertDataUsuarioPAC("tabla_pacientes", random1, "", "", "", 0, "", "", "", "", "", "", fechaFormateada, random11);
                if(validaBD == 1){
                    System.out.println("Proceso de guardado de Usuario de Unidad M??dica fue correcto");
                }
                else{
                    System.out.println("Proceso de guardado de Usuario de PAC fue ERRONEO");
                }
                
            }
            else{
                System.out.println("Proceso de guardado de Usuario de Unidad M??dica fue erroneo");
            }
            
            
        cb.closeConnection(); /*Cerramos conexi??n*/
        this.setVisible(false);
        vistaRegistroPaciente vrp = new vistaRegistroPaciente(true,auxModal,auxIdPac);
        vrp.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(vistaUnidadMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(vistaUnidadMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(vistaUnidadMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(vistaUnidadMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                vistaUnidadMedica dialog = new vistaUnidadMedica(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> um_consultoriobd;
    private javax.swing.JComboBox<String> um_doctorbd;
    private javax.swing.JTextField um_foliobd;
    private javax.swing.JTextField um_idumedidabd;
    private javax.swing.JTextField um_pacientebd;
    private javax.swing.JTextField um_segurobd;
    // End of variables declaration//GEN-END:variables
}
