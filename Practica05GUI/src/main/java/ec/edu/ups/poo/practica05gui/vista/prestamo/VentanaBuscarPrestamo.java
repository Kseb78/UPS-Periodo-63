/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.poo.practica05gui.vista.prestamo;

import ec.edu.ups.poo.practica05gui.controlador.PrestamoControlador;
import ec.edu.ups.poo.practica05gui.modelo.Prestamo;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sebas
 */
public class VentanaBuscarPrestamo extends javax.swing.JInternalFrame {
    FondoVentana fondo = new FondoVentana();
    private PrestamoControlador prestamoControlador;
    public VentanaBuscarPrestamo(PrestamoControlador prestamoControlador) {
        this.setContentPane(fondo);
        initComponents();
        this.prestamoControlador = prestamoControlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new FondoVentana();
        datoFechaPrestamo = new com.toedter.calendar.JDateChooser();
        fechaPrestamo = new javax.swing.JLabel();
        btnBuscarPrestamo = new javax.swing.JButton();
        fechaDevPrestamo = new javax.swing.JLabel();
        libroPrestamo = new javax.swing.JLabel();
        identificaionPrestamo = new javax.swing.JLabel();
        txtLibroPrestamo = new javax.swing.JTextField();
        txtUsuarioPrestamo = new javax.swing.JTextField();
        datoFechaDevolucion = new com.toedter.calendar.JDateChooser();
        codigoPrestamo = new javax.swing.JLabel();
        txtCodigoPrestamo = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar Prestamo");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos"));

        datoFechaPrestamo.setEnabled(false);

        fechaPrestamo.setText("Fecha Prestamo");

        btnBuscarPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BuscarIcon.png"))); // NOI18N
        btnBuscarPrestamo.setText("Buscar");
        btnBuscarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrestamoActionPerformed(evt);
            }
        });

        fechaDevPrestamo.setText("Fecha Devolucion");

        libroPrestamo.setText("Libro");

        identificaionPrestamo.setText("Usuario Identificacion");

        txtLibroPrestamo.setEditable(false);

        txtUsuarioPrestamo.setEditable(false);

        datoFechaDevolucion.setEnabled(false);

        codigoPrestamo.setText("Codigo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(libroPrestamo)
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLibroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuarioPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaPrestamo)
                                    .addComponent(fechaDevPrestamo))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(datoFechaPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                        .addComponent(datoFechaDevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscarPrestamo))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(identificaionPrestamo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(codigoPrestamo)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(libroPrestamo)
                    .addComponent(txtLibroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identificaionPrestamo)
                    .addComponent(txtUsuarioPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaPrestamo)
                    .addComponent(datoFechaPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaDevPrestamo)
                    .addComponent(datoFechaDevolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoPrestamo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarPrestamo)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrestamoActionPerformed
    int codigo = Integer.parseInt(txtCodigoPrestamo.getText());
    
    if(txtCodigoPrestamo.getText().isBlank())
    {
        JOptionPane.showMessageDialog(this, "No ha ingresado un codigo");
    }else
    {
        Prestamo prestamo =  prestamoControlador.read(codigo);
        if(prestamo!=null)
        {
            txtLibroPrestamo.setText(prestamo.getLibro().getTitulo());
            txtUsuarioPrestamo.setText(prestamo.getUsuario().getNombre());
            datoFechaDevolucion.setDate(prestamo.getFechaDevolucion());
            datoFechaPrestamo.setDate(prestamo.getFechaPrestamo());
        }else
        {
            JOptionPane.showMessageDialog(this, "No hay prestamo con tal codigo");
        }        
    }
    }//GEN-LAST:event_btnBuscarPrestamoActionPerformed
    public void cambiarIdioma(Locale locale)
    {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes",locale); 
        libroPrestamo.setText(mensajes.getString("libroPrestamo"));
        identificaionPrestamo.setText(mensajes.getString("identificaionPrestamo"));
        fechaPrestamo.setText(mensajes.getString("fechaPrestamo"));
        fechaDevPrestamo.setText(mensajes.getString("fechaDevPrestamo"));  
        codigoPrestamo.setText(mensajes.getString("codigoPrestamo"));
        btnBuscarPrestamo.setText(mensajes.getString("btnBuscarPrestamo"));
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPrestamo;
    private javax.swing.JLabel codigoPrestamo;
    private com.toedter.calendar.JDateChooser datoFechaDevolucion;
    private com.toedter.calendar.JDateChooser datoFechaPrestamo;
    private javax.swing.JLabel fechaDevPrestamo;
    private javax.swing.JLabel fechaPrestamo;
    private javax.swing.JLabel identificaionPrestamo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel libroPrestamo;
    private javax.swing.JTextField txtCodigoPrestamo;
    private javax.swing.JTextField txtLibroPrestamo;
    private javax.swing.JTextField txtUsuarioPrestamo;
    // End of variables declaration//GEN-END:variables

    class FondoVentana extends JPanel      
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon (getClass().getResource("/imagenes/fondoSecundario.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            super.paint(g); 
        }
    }
}
