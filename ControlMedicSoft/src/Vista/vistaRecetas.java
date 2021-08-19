/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.controladorBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Copito
 */
public class vistaRecetas extends javax.swing.JFrame {

    /**
     * Creates new form loginInMedico
     */
    String pac_pacinete = "";
    controladorBD cb = new controladorBD();
    public String Medico ="";
    public String Folio ="";
    public String Sql = "";
    //vistaControlDatos vcd = new vistaControlDatos(pac_paciente, ERROR);
    public vistaRecetas(String vr_nompaciente, String id_paciente, String medico, String folio, String cime_idcita, String cime_idreceta) {
        this.Medico = medico;
        this.Folio = folio;
        initComponents();
        vr_folio.setText(folio);
        vr_nombredoc.setText(medico);
        Sql = returnPac(id_paciente,cime_idreceta,cime_idcita);
        setFilas(Sql);
       
    }
    public String returnPac(String idPaciente, String id_receta, String rec_idcita){
        String newSql = "";
        if(!"".equals(idPaciente) || !"".equals(id_receta) || !"".equals(rec_idcita)){
            newSql = "SELECT * FROM bdconsultorio.tabla_recetas, bdconsultorio.tabla_pacientes, bdconsultorio.tabla_citas";
            newSql += " WHERE id_paciente = '"+idPaciente+"' and rec_idreceta = '"+id_receta+"' and rec_idcita = '"+rec_idcita+"'";
        }
        else{
            newSql ="N";
        }
        /*
        SELECT * FROM bdconsultorio.tabla_recetas, bdconsultorio.tabla_pacientes, bdconsultorio.tabla_citas
        WHERE id_paciente="8894839" and rec_idreceta = 4121926 and rec_idcita = 4699725;
        
        */
        return newSql;
    }
    void setFilas(String Sql){
        try{
          /*  String Sql = "";
            
                 Sql = 
                 //   "SELECT dni_pago,usuario,fecha_pago,total,saldoActual FROM tabla_pagos";
            "SELECT id_paciente,pac_nombres,pac_apellidopaterno,pac_apellidomaterno,pac_curp,pac_idunidadmedica FROM bdconsultorio.tabla_pacientes";
                 
                 id_paciente int(11) PK 
                pac_nombres varchar(45) 
                pac_apellidopaterno varchar(45) 
                pac_apellidomaterno varchar(45) 
                pac_edad int(11) 
                pac_sexo varchar(45) 
                pac_curp varchar(45) 
                pac_lugar varchar(45) 
                pac_direccion varchar(45) 
                pac_numcasa varchar(45) 
                pac_colonia varchar(45) 
                pac_fechanac date 
                pac_idunidadmedica int(11)
                //unimedica
                id_unidadmedica int(11) PK 
                um_paciente int(11) 
                um_folio varchar(45) 
                um_medico varchar(45) 
                um_consultorio varchar(45)
                 */

             System.out.println("Contenido: "+Sql);
            
//            SELECT dni_datos, nombres, apellidos,fecha_nac, telefonocel, tabla_grupo.id_grupo, 
//            tabla_grupo.nombre_encargado  FROM tabla_datosusuarios LEFT JOIN tabla_grupo ON tabla_datosusuarios.grupo = tabla_grupo.id_grupo where tabla_datosusuarios.grupo = '3'
//           
//    
            PreparedStatement us = cb.conex().prepareStatement(Sql);
            ResultSet res = us.executeQuery();
            //Object objDatos[] = new Object[columna.length]; //Siempre debe cconexoincidir con el numero de columnas!
            
            while(res.next()){
//                for (int i = 0; i<columna.length; i++){
//                    objDatos[i] = res.getObject(i+1);
//                    //System.out.println(objDatos[i]);
//                }
//                modeloPacientes.addRow(objDatos);
                  //resultSet.getStringpac_nombres
                  //nombreCompleto = res.getString("pac_nombres") +" "+ res.getString("pac_apellidopaterno") +" "+ res.getString("pac_apellidomaterno");
                  vr_nompac.setText(res.getString("pac_nombres") +" "+ res.getString("pac_apellidopaterno") +" "+ res.getString("pac_apellidomaterno"));
//                  dape_curp.setText(res.getString("pac_curp"));
                  //public_edad = res.getString("pac_edad");
                  vr_edadpac.setText(res.getString("pac_edad"));
//                  dape_lugar.setText(res.getString("pac_lugar"));
//                  dape_direccion.setText(res.getString("pac_direccion"));
//                  dape_nomcasa.setText(res.getString("pac_numcasa") );
//                  dape_colonia.setText(res.getString("pac_colonia") );
                  vr_sexo.setText(res.getString("pac_sexo"));
//                  dape_fechanac.setText(res.getString("pac_fechanac"));
                  vr_idpaciete.setText(res.getString("id_paciente") );
                  rv_descripcion.setText(res.getString("rec_descripcion"));
                  jLabel16.setText(res.getString("cm_idfecha"));
                  rec_alergia.setText(res.getString("rec_alergias"));
                  rec_analisis.setText(res.getString("cm_analisispac"));
                  rec_estatura.setText(res.getString("rec_estatura"));
                  rec_presion.setText(res.getString("rec_presion"));
                  rec_peso.setText(res.getString("rec_peso"));
                  rec_servicio.setText(res.getString("cm_servicio"));
                  //Datos de tabla Unidad Medica
//                  dape_numseguro.setText(res.getString("pac_idunidadmedica"));
//                  nombreIDUnidadMedica = res.getString("pac_idunidadmedica");
//                  
//                  dape_numfolio.setText(res.getString("um_folio"));
//                  nombreFolio = res.getString("um_folio");
//                  
//                  dape_doctor.setText(res.getString("um_medico"));
                    //String nombreMedico = res.getString("um_medico");
//                  jLabel16
//                  dape_consultorio.setText(res.getString("um_consultorio"));
//                  nombreConsultorio  = res.getString("um_consultorio");
//                   String nombreIDUnidadMedica = "";
//                   String nombreFolio = "";
//                   String nombreConsultorio = "";
//                   String nombreMedico = "";
                  
            }
        }
        catch(SQLException ex){
        
        }
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rv_descripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        vr_nompac = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vr_edadpac = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        vr_sexo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        vr_idpaciete = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        vr_nombredoc = new javax.swing.JLabel();
        vr_folio = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rec_alergia = new javax.swing.JLabel();
        rec_analisis = new javax.swing.JLabel();
        rec_peso = new javax.swing.JLabel();
        rec_estatura = new javax.swing.JLabel();
        rec_presion = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rec_servicio = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instituto Médico");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(250, 190, 117));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(159, 48, 18));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RECETA MÉDICA");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fecha:");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel4)
                .addGap(256, 256, 256)
                .addComponent(jLabel15)
                .addGap(29, 29, 29)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        rv_descripcion.setColumns(20);
        rv_descripcion.setRows(5);
        jScrollPane1.setViewportView(rv_descripcion);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE:");

        vr_nompac.setForeground(new java.awt.Color(0, 0, 0));
        vr_nompac.setText("Nombre Paciente");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("EDAD:");

        vr_edadpac.setForeground(new java.awt.Color(0, 0, 0));
        vr_edadpac.setText("Edad_10");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("GÉNERO:");

        vr_sexo.setForeground(new java.awt.Color(0, 0, 0));
        vr_sexo.setText("Sexo:");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("ID. PACIENTE:");

        vr_idpaciete.setForeground(new java.awt.Color(0, 0, 0));
        vr_idpaciete.setText("No. Paciente:");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("DESCRIPCIÓN:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ALERGIAS:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ANÁLISIS:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PESO:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ESTATURA:");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("PRESIÓN:");

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));

        vr_nombredoc.setForeground(new java.awt.Color(0, 0, 0));
        vr_nombredoc.setText("Nombre Doctor");

        vr_folio.setForeground(new java.awt.Color(0, 0, 0));
        vr_folio.setText("Ced. Profesional");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Ced.Profesional:");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ESPECIALISTA:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(87, 87, 87)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vr_nombredoc)
                    .addComponent(vr_folio))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vr_nombredoc)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(vr_folio))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        rec_alergia.setForeground(new java.awt.Color(0, 0, 0));
        rec_alergia.setText("Alergias:");

        rec_analisis.setForeground(new java.awt.Color(0, 0, 0));
        rec_analisis.setText("Análisis:");

        rec_peso.setForeground(new java.awt.Color(0, 0, 0));
        rec_peso.setText("Peso:");

        rec_estatura.setForeground(new java.awt.Color(0, 0, 0));
        rec_estatura.setText("Estatura:");

        rec_presion.setForeground(new java.awt.Color(0, 0, 0));
        rec_presion.setText("Presión");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("SERVICIO:");

        rec_servicio.setForeground(new java.awt.Color(0, 0, 0));
        rec_servicio.setText("Servicio:");

        jPanel11.setBackground(new java.awt.Color(159, 48, 18));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ATRÁS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("IMPRIMIR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vr_edadpac)
                                            .addComponent(vr_nompac))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vr_sexo)
                                            .addComponent(vr_idpaciete)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel6))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(72, 72, 72)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(rec_analisis)
                                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addGap(346, 346, 346)
                                                                        .addComponent(jLabel11)
                                                                        .addGap(55, 55, 55)
                                                                        .addComponent(rec_servicio))
                                                                    .addComponent(rec_peso))
                                                                .addGap(361, 361, 361)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(jButton1)
                                                                    .addComponent(jButton2)))
                                                            .addComponent(rec_estatura)))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(70, 70, 70)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(rec_presion)
                                                            .addComponent(rec_alergia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(90, 90, 90)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGap(292, 292, 292)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vr_nompac)
                        .addComponent(jLabel9)
                        .addComponent(vr_idpaciete)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(vr_sexo)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(vr_edadpac)))
                .addGap(27, 27, 27)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rec_presion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rec_servicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rec_alergia))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(rec_peso))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(rec_estatura)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2))
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rec_analisis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1179, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
//            java.util.logging.Logger.getLogger(loginInMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(loginInMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(loginInMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(loginInMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new loginInMedico().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rec_alergia;
    private javax.swing.JLabel rec_analisis;
    private javax.swing.JLabel rec_estatura;
    private javax.swing.JLabel rec_peso;
    private javax.swing.JLabel rec_presion;
    private javax.swing.JLabel rec_servicio;
    private javax.swing.JTextArea rv_descripcion;
    private javax.swing.JLabel vr_edadpac;
    private javax.swing.JLabel vr_folio;
    private javax.swing.JLabel vr_idpaciete;
    private javax.swing.JLabel vr_nombredoc;
    private javax.swing.JLabel vr_nompac;
    private javax.swing.JLabel vr_sexo;
    // End of variables declaration//GEN-END:variables
}
