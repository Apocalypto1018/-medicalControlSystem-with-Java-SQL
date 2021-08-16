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
 * @author joseluis.caamal
 */
public class vistaControlDatos extends javax.swing.JFrame {

    /**
     * Creates new form loginInMedico
     * @param idPaciente
     */
    int verDatos = 0;
    int panelPrincipal = 0;
    public String Sql = "";
    public String nombreCompleto = "";
    public String nombreIDUnidadMedica = "";
    public String nombreFolio = "";
    public String nombreConsultorio = "";
    public String nombreMedico = "";
    public String public_edad = "";
    controladorBD cb = new controladorBD();
    public vistaControlDatos(String idPaciente, int verDatos) {
        //String Sql = "SELECT id_paciente,pac_nombres,pac_apellidopaterno,pac_apellidomaterno,pac_curp,pac_idunidadmedica FROM bdconsultorio.tabla_pacientes";
        Sql = "SELECT * FROM bdconsultorio.tabla_pacientes, bdconsultorio.tabla_unidadmedica";
        Sql += " WHERE id_paciente = '"+idPaciente+"' and um_paciente = '"+idPaciente+"'";
        initComponents();
        if(verDatos == 1){
            setFilas(Sql);
            botonCitas.hide();
           // botonControl.hide();
        }
        if(verDatos == 2){
            setFilas(Sql);}
        //SELECT * FROM bdconsultorio.tabla_pacientes, bdconsultorio.tabla_unidadmedica WHERE id_paciente = 3310004 and um_paciente = 3310004;
    }
    /*
    Jose Luis Caamal Ic
    Ingresa la consulta para mostrar en la ventana
    
    */
    public String returnPac(String idPaciente){
        String newSql = "SELECT * FROM bdconsultorio.tabla_pacientes, bdconsultorio.tabla_unidadmedica";
        newSql += " WHERE id_paciente = '"+idPaciente+"' and um_paciente = '"+idPaciente+"'";
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
                  nombreCompleto = res.getString("pac_nombres") +" "+ res.getString("pac_apellidopaterno") +" "+ res.getString("pac_apellidomaterno");
                  dape_nombre.setText(res.getString("pac_nombres") +" "+ res.getString("pac_apellidopaterno") +" "+ res.getString("pac_apellidomaterno"));
                  dape_curp.setText(res.getString("pac_curp"));
                  public_edad = res.getString("pac_edad");
                  dape_edad.setText(res.getString("pac_edad"));
                  dape_lugar.setText(res.getString("pac_lugar"));
                  dape_direccion.setText(res.getString("pac_direccion"));
                  dape_nomcasa.setText(res.getString("pac_numcasa") );
                  dape_colonia.setText(res.getString("pac_colonia") );
                  dape_sexo.setText(res.getString("pac_sexo"));
                  dape_fechanac.setText(res.getString("pac_fechanac"));
                  dape_idpac.setText(res.getString("id_paciente") );
                  //Datos de tabla Unidad Medica
                  dape_numseguro.setText(res.getString("pac_idunidadmedica"));
                  nombreIDUnidadMedica = res.getString("pac_idunidadmedica");
                  
                  dape_numfolio.setText(res.getString("um_folio"));
                  nombreFolio = res.getString("um_folio");
                  
                  dape_doctor.setText(res.getString("um_medico"));
                  nombreMedico = res.getString("um_medico");
                  
                  dape_consultorio.setText(res.getString("um_consultorio"));
                  nombreConsultorio  = res.getString("um_consultorio");
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
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dape_direccion = new javax.swing.JTextField();
        dape_nombre = new javax.swing.JTextField();
        dape_curp = new javax.swing.JTextField();
        dape_edad = new javax.swing.JTextField();
        dape_lugar = new javax.swing.JTextField();
        dape_sexo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dape_fechanac = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dape_consultorio = new javax.swing.JTextField();
        dape_doctor = new javax.swing.JTextField();
        dape_idpac = new javax.swing.JTextField();
        dape_numfolio = new javax.swing.JTextField();
        dape_numseguro = new javax.swing.JTextField();
        botonCitas = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        dape_nomcasa = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        dape_colonia = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        dape_buscar = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        errorText = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Instituto Médico");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(500, 100));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(250, 190, 117));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(159, 48, 18));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        jLabel5.setBackground(new java.awt.Color(0, 51, 153));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NOMBRE:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CURP:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("EDAD:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("LUGAR:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("GÉNERO:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DIRECCIÓN:");

        dape_direccion.setEditable(false);

        dape_nombre.setEditable(false);

        dape_curp.setEditable(false);

        dape_edad.setEditable(false);

        dape_lugar.setEditable(false);

        dape_sexo.setEditable(false);

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("FECHA DE NACIMIENTO:");

        dape_fechanac.setForeground(new java.awt.Color(0, 0, 0));
        dape_fechanac.setText("Fecha");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ID. PACIENTE:");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("NÚMERO DE FOLIO:");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ID. UNIDAD MÉDICA:");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("ESPECIALISTA:");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("CONSULTORIO:");

        dape_consultorio.setEditable(false);

        dape_doctor.setEditable(false);

        dape_idpac.setEditable(false);

        dape_numfolio.setEditable(false);

        dape_numseguro.setEditable(false);

        botonCitas.setBackground(new java.awt.Color(238, 238, 238));
        botonCitas.setText("Control");
        botonCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCitasActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(238, 238, 238));
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("NÚMERO DE CASA:");

        dape_nomcasa.setEditable(false);

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("COLONIA:");

        dape_colonia.setEditable(false);

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));

        botonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("BUSCAR DATOS DE OTRO PACIENTE:");

        dape_buscar.setText("0");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("ID:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dape_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dape_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(botonBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Alerta:");

        errorText.setForeground(new java.awt.Color(0, 0, 0));
        errorText.setText("___________________________________________________");

        jPanel4.setBackground(new java.awt.Color(159, 48, 18));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("DATOS PERSONALES");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(262, 262, 262))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 361, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dape_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dape_curp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dape_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dape_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dape_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dape_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel10)))))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dape_fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dape_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dape_nomcasa, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dape_numseguro, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dape_numfolio, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dape_idpac, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dape_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dape_consultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(105, 105, 105)
                        .addComponent(errorText)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dape_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(dape_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(dape_fechanac))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(dape_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(dape_nomcasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dape_curp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dape_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(dape_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(dape_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dape_idpac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(dape_numfolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dape_numseguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(dape_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(dape_consultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(errorText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        dape_buscar.getText();
        if(dape_buscar.getText().equals("0"))
        errorText.setText("No existe el paciente. Prueba otro codigo");
        else
        errorText.setText("Actualización exitosa");
        //vistaControlDatos(dape_buscar.getText(),2);
        Sql = returnPac(dape_buscar.getText());
        setFilas(Sql);
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCitasActionPerformed
        // TODO add your handling code here:
        //        public String nombreCompleto = "";
        //        public String nombreIDUnidadMedica = "";
        //        public String nombreFolio = "";
        //        public String nombreConsultorio = "";
        //        public String nombreMedico = "";
        if(dape_buscar.getText().equals("0") && dape_idpac.getText().equals("")){
            errorText.setText("No existe el paciente o el id es invalido.");
        }
        else{
            vistaCitas vc = new vistaCitas(dape_idpac.getText(), nombreCompleto, nombreIDUnidadMedica,nombreFolio,nombreConsultorio,nombreMedico); //Ingreso el id del paciente para hacer la consulta
            vc.show();
            //errorText.setText("Verifica tu codigo");
        }//this.show();

        //}
        //this.dispose();
    }//GEN-LAST:event_botonCitasActionPerformed

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
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCitas;
    private javax.swing.JTextField dape_buscar;
    private javax.swing.JTextField dape_colonia;
    private javax.swing.JTextField dape_consultorio;
    private javax.swing.JTextField dape_curp;
    private javax.swing.JTextField dape_direccion;
    private javax.swing.JTextField dape_doctor;
    private javax.swing.JTextField dape_edad;
    private javax.swing.JLabel dape_fechanac;
    private javax.swing.JTextField dape_idpac;
    private javax.swing.JTextField dape_lugar;
    private javax.swing.JTextField dape_nombre;
    private javax.swing.JTextField dape_nomcasa;
    private javax.swing.JTextField dape_numfolio;
    private javax.swing.JTextField dape_numseguro;
    private javax.swing.JTextField dape_sexo;
    private javax.swing.JLabel errorText;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
