package ec.edu.ups.poo.practica05gui.vista.libro;

import ec.edu.ups.poo.practica05gui.controlador.LibroControlador;
import ec.edu.ups.poo.practica05gui.modelo.Libro;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VentanaBuscarLibro extends javax.swing.JInternalFrame {
    FondoVentana fondo = new FondoVentana();
    private LibroControlador libroControlador;
    /**
     * Creates new form VentanaCrearLibro
     */
    public VentanaBuscarLibro(LibroControlador libroControlador) {
        this.setContentPane(fondo);
        initComponents();
        this.libroControlador = libroControlador;
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
        codigoLibro = new javax.swing.JLabel();
        tituloLibro = new javax.swing.JLabel();
        autorLibro = new javax.swing.JLabel();
        anioLibro = new javax.swing.JLabel();
        txtCodigoLibro = new javax.swing.JTextField();
        txtAutorLibro = new javax.swing.JTextField();
        txtTituloLibro = new javax.swing.JTextField();
        txtAnioLibro = new javax.swing.JTextField();
        btnBuscarLibro = new javax.swing.JButton();
        disponibilidadLibro = new javax.swing.JLabel();
        txtDisponible = new javax.swing.JTextField();
        btnLimpiarLibro = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Buscar Libro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Datos"));

        codigoLibro.setText("Codigo");

        tituloLibro.setText("Titulo");

        autorLibro.setText("Autor");

        anioLibro.setText("Anio Publicacion");

        txtAutorLibro.setEditable(false);

        txtTituloLibro.setEditable(false);

        txtAnioLibro.setEditable(false);

        btnBuscarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BuscarIcon.png"))); // NOI18N
        btnBuscarLibro.setText("Buscar");
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });

        disponibilidadLibro.setText("Disponibilidad");

        txtDisponible.setEditable(false);

        btnLimpiarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiarIcon.png"))); // NOI18N
        btnLimpiarLibro.setText("Limpiar");
        btnLimpiarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiarLibro)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(codigoLibro)
                                    .addComponent(tituloLibro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(autorLibro, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(anioLibro)
                                    .addComponent(disponibilidadLibro))
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarLibro))
                            .addComponent(txtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDisponible, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAnioLibro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLibro)
                    .addComponent(txtCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarLibro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLibro)
                    .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autorLibro)
                    .addComponent(txtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anioLibro)
                    .addComponent(txtAnioLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disponibilidadLibro)
                    .addComponent(txtDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiarLibro)
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed
        if (txtCodigoLibro.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "No ha ingresado un codigo");
        }else
        {
        int codigo = Integer.parseInt(txtCodigoLibro.getText());
        Libro libro = libroControlador.read1(codigo);
        if (libro!=null)
        {
        txtTituloLibro.setText(libro.getTitulo());
        txtAutorLibro.setText(libro.getAutor());
        String anio = String.valueOf(libro.getAnio());
        txtAnioLibro.setText(anio);
        if (libro.isDisponible())
        {
            String disponible = "Disponible";
            txtDisponible.setText(disponible);
        }else
            {
                String disponible = "No disponible";
                txtDisponible.setText(disponible);
            }
        }else
            {
                JOptionPane.showMessageDialog(this, "No existe un Libro con tal codigo");
            }
        }
    }//GEN-LAST:event_btnBuscarLibroActionPerformed

    private void btnLimpiarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarLibroActionPerformed
        txtCodigoLibro.setText("");
        txtAnioLibro.setText("");
        txtAutorLibro.setText("");
        txtDisponible.setText("");
        txtTituloLibro.setText("");
    }//GEN-LAST:event_btnLimpiarLibroActionPerformed
    public void cambiarIdioma(Locale locale)
    {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes",locale); 
        codigoLibro.setText(mensajes.getString("codigoLibro"));
        tituloLibro.setText(mensajes.getString("tituloLibro"));
        autorLibro.setText(mensajes.getString("autorLibro"));
        anioLibro.setText(mensajes.getString("anioLibro"));  
        disponibilidadLibro.setText(mensajes.getString("disponibilidadLibro"));
        btnBuscarLibro.setText(mensajes.getString("btnBuscarLibro"));
        btnLimpiarLibro.setText(mensajes.getString("btnLimpiarLibro"));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anioLibro;
    private javax.swing.JLabel autorLibro;
    private javax.swing.JButton btnBuscarLibro;
    private javax.swing.JButton btnLimpiarLibro;
    private javax.swing.JLabel codigoLibro;
    private javax.swing.JLabel disponibilidadLibro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tituloLibro;
    private javax.swing.JTextField txtAnioLibro;
    private javax.swing.JTextField txtAutorLibro;
    private javax.swing.JTextField txtCodigoLibro;
    private javax.swing.JTextField txtDisponible;
    private javax.swing.JTextField txtTituloLibro;
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
