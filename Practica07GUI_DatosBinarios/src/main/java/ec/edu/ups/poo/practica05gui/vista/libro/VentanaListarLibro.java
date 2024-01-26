package ec.edu.ups.poo.practica05gui.vista.libro;

import ec.edu.ups.poo.practica05gui.controlador.LibroControlador;
import ec.edu.ups.poo.practica05gui.modelo.Libro;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class VentanaListarLibro extends javax.swing.JInternalFrame {
    FondoVentana fondo = new FondoVentana();
    private LibroControlador libroControlador;
    /**
     * Creates new form VentanaListarLibro
     */
    public VentanaListarLibro(LibroControlador libroControlador) {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosLibro = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Listar Libros");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tablaDatosLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Autor", "Anio", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaDatosLibro);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarDatos(){
    List<Libro> libros = libroControlador.toList();
    DefaultTableModel modelo = (DefaultTableModel) tablaDatosLibro.getModel();
    modelo.setNumRows(0);
    for (Libro libro : libros){
        Object[] rowData ={libro.getCodigo(), libro.getTitulo(), libro.getAutor(), libro.getAnio(), libro.isDisponible()};
        modelo.addRow(rowData);
    }
}
    
public void limpiarTabla(){
        try{
            DefaultTableModel modelo = (DefaultTableModel) tablaDatosLibro.getModel();
                int a =modelo.getRowCount()-1;
                for(int i=0; i<a; i++)
                        modelo.removeRow(0);
            }catch(Exception e){
                System.out.println(e);
            }
}    
    public void cambiarIdioma(Locale locale)
    {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes",locale); 
        String codigo = (mensajes.getString("codigoLibro"));
        String titulo = (mensajes.getString("tituloLibro"));
        String autor = (mensajes.getString("autor"));
        String anio = (mensajes.getString("anio"));
        String disponibilidad = (mensajes.getString("disponibilidadLibro"));
        DefaultTableModel tabla = (DefaultTableModel) tablaDatosLibro.getModel();
        tabla.setColumnIdentifiers(new String [] {codigo, titulo, autor, anio, disponibilidad});
        this.setTitle(mensajes.getString("listarLibro"));
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatosLibro;
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
