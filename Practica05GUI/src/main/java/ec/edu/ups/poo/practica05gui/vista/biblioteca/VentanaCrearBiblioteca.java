package ec.edu.ups.poo.practica05gui.vista.biblioteca;

import ec.edu.ups.poo.practica05gui.controlador.*;
import ec.edu.ups.poo.practica05gui.modelo.Biblioteca;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaCrearBiblioteca extends javax.swing.JInternalFrame{
    FondoVentana fondo = new FondoVentana();
    private BibliotecaControlador bibliotecaControlador;
    
    /**
     * Creates new form VentanaCrearBiblioteca
     */
    public VentanaCrearBiblioteca(BibliotecaControlador bibliotecaControlador) {
        this.setContentPane(fondo);
        initComponents();
        this.bibliotecaControlador=bibliotecaControlador;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoVentana();
        codigoBiblioteca = new javax.swing.JLabel();
        txtCodigoBiblioteca = new javax.swing.JTextField();
        nombreBiblioteca = new javax.swing.JLabel();
        txtNombreBiblioteca = new javax.swing.JTextField();
        direccionBiblioteca = new javax.swing.JLabel();
        txtDireccionBiblioteca = new javax.swing.JTextField();
        telefonoBiblioteca = new javax.swing.JLabel();
        txtTelefonoBiblioteca = new javax.swing.JTextField();
        btncrearBiblioteca = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crear nueva Biblioteca");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos"));

        codigoBiblioteca.setText("Codigo");

        nombreBiblioteca.setText("Nombre");

        direccionBiblioteca.setText("Direccion");

        telefonoBiblioteca.setText("Telefono");

        btncrearBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardarIcon.png"))); // NOI18N
        btncrearBiblioteca.setText("Guardar");
        btncrearBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearBibliotecaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(codigoBiblioteca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodigoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nombreBiblioteca)
                                .addGap(42, 42, 42)
                                .addComponent(txtNombreBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(direccionBiblioteca)
                                    .addComponent(telefonoBiblioteca))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDireccionBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(txtTelefonoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btncrearBiblioteca)))
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoBiblioteca)
                    .addComponent(txtCodigoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreBiblioteca)
                    .addComponent(txtNombreBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionBiblioteca)
                    .addComponent(txtDireccionBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoBiblioteca)
                    .addComponent(txtTelefonoBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btncrearBiblioteca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearBibliotecaActionPerformed
        if(txtCodigoBiblioteca.getText().isBlank()||txtNombreBiblioteca.getText().isBlank()||txtDireccionBiblioteca.getText().isBlank()||txtTelefonoBiblioteca.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "Rellene todos los atributos");
        }else
        {
            int codigo = Integer.parseInt(txtCodigoBiblioteca.getText());
            Biblioteca biblioteca = bibliotecaControlador.read(codigo);
            if (biblioteca!=null)
            {
                JOptionPane.showMessageDialog(this, "Ya existe una biblioteca con ese codigo");
                limpiarDatos();
            }else
            {
                String nombre = txtNombreBiblioteca.getText();
                String direccion = txtDireccionBiblioteca.getText();
                String telefono = txtTelefonoBiblioteca.getText();

                bibliotecaControlador.create(codigo, nombre, direccion, telefono);
                JOptionPane.showMessageDialog(this, "Se han guardado los datos");

                limpiarDatos();
            }

        }
    }//GEN-LAST:event_btncrearBibliotecaActionPerformed
    
    private void limpiarDatos()
    {
        txtCodigoBiblioteca.setText("");
        txtNombreBiblioteca.setText("");
        txtDireccionBiblioteca.setText("");
        txtTelefonoBiblioteca.setText("");
    }
    
    public void cambiarIdioma(Locale locale)
    {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes",locale); 
        codigoBiblioteca.setText(mensajes.getString("codigoBiblioteca"));
        nombreBiblioteca.setText(mensajes.getString("nombreBiblioteca"));
        direccionBiblioteca.setText(mensajes.getString("direccionBiblioteca"));
        telefonoBiblioteca.setText(mensajes.getString("telefonoBiblioteca"));
        btncrearBiblioteca.setText(mensajes.getString("btncrearBiblioteca"));
              
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncrearBiblioteca;
    private javax.swing.JLabel codigoBiblioteca;
    private javax.swing.JLabel direccionBiblioteca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreBiblioteca;
    private javax.swing.JLabel telefonoBiblioteca;
    private javax.swing.JTextField txtCodigoBiblioteca;
    private javax.swing.JTextField txtDireccionBiblioteca;
    private javax.swing.JTextField txtNombreBiblioteca;
    private javax.swing.JTextField txtTelefonoBiblioteca;
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
