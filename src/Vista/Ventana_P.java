/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ventana_P.java
 *
 * Created on 22/08/2011, 10:59:21 AM
 */

/*
 * Autores:
 * Luis Alfonso Velez Santos
 * Carlos Yesid Hernandez Herrera
 * Jose Esteban Betin Diaz
 */

package Vista;

import GenaracionNumeros.NumerosRectangulares;
import auxiliares.ModVentana;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


import javax.swing.UIManager;
import simulaciones.distribuciones.Distribuciones;



/**
 *
 * @author Warlock
 */
public class Ventana_P extends javax.swing.JFrame {

    JPanelSimulacionesEjercicios_6 jPanelSimulacionesEjercicios6;
    JPanelGenerador jPanelGenerador;
    JPanelPrueba_Est jPanelPrueba_Est;
    JPanelInformacion jPanelInformacion;
    JPanelJuegoVolados jPanelJuegoVolados;
    JPanelSimulacionInventario jPanelSimulacionInventario;
    JPanelSevenEleven jPanelSevenEleven;
    JPanelRentaAutos jPanelRentaAutos;
    JPanelRuleta jPanelRuleta;
    JPanelEjercicio4 jPanelEjercicio4;
    ArrayList<Float> numeros;
    /** Creates new form Ventana_P */


    
    public Ventana_P() {

         try
        {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e)
        {
          e.printStackTrace();
        }

        jPanelRentaAutos = new JPanelRentaAutos();
        jPanelGenerador = new JPanelGenerador();
        jPanelPrueba_Est = new JPanelPrueba_Est();
        jPanelInformacion = new JPanelInformacion();
        jPanelJuegoVolados = new JPanelJuegoVolados();
        jPanelSimulacionInventario = new JPanelSimulacionInventario();
        jPanelSevenEleven = new JPanelSevenEleven();
        jPanelRuleta = new JPanelRuleta();
        jPanelEjercicio4 = new JPanelEjercicio4();
        jPanelSimulacionesEjercicios6 = new JPanelSimulacionesEjercicios_6();
       
        numeros = new ArrayList<Float>();
        initComponents();
        this.setSize(800, 700);
        this.setResizable(false);
        NumerosRectangulares n = new NumerosRectangulares();
        
        ModVentana.centrar(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuExp_Arc = new javax.swing.JMenuItem();
        jMenuItemImportar = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();
        jMenuGenerador = new javax.swing.JMenu();
        jMenuNum_A = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemPruebas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemJuegoVolados = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemRuleta = new javax.swing.JMenuItem();
        jMenuItemRentaAutos = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItemInventario = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemEjercicio6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenuArchivo.setText("Archivo");

        jMenuExp_Arc.setText("Exportar Archivo");
        jMenuExp_Arc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExp_ArcActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuExp_Arc);

        jMenuItemImportar.setText("Importar Archivo");
        jMenuItemImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemImportarActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemImportar);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuGenerador.setText("Generador");

        jMenuNum_A.setText("Numeros Aleatorios");
        jMenuNum_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNum_AActionPerformed(evt);
            }
        });
        jMenuGenerador.add(jMenuNum_A);

        jMenuBar1.add(jMenuGenerador);

        jMenu1.setText("Pruebas");

        jMenuItemPruebas.setText("P. Estadisticas");
        jMenuItemPruebas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPruebasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemPruebas);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Simulaciones 1-5");

        jMenuItemJuegoVolados.setText("Juego de los Volados");
        jMenuItemJuegoVolados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJuegoVoladosActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemJuegoVolados);

        jMenuItem1.setText("Seven Eleven");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItemRuleta.setText("Ruleta");
        jMenuItemRuleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRuletaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemRuleta);

        jMenuItemRentaAutos.setText("Renta de Autos");
        jMenuItemRentaAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRentaAutosActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemRentaAutos);

        jMenuItem3.setText("Ejercicio 4");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItemInventario.setText("Inventario");
        jMenuItemInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInventarioActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItemInventario);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Simulaciones 6-10");

        jMenuItemEjercicio6.setText("Ejercicio 6");
        jMenuItemEjercicio6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEjercicio6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemEjercicio6);

        jMenuBar1.add(jMenu6);

        jMenu2.setText("Ayuda");

        jMenuItemAyuda.setText("Ayuda");
        jMenuItemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAyudaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemAyuda);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuSalirActionPerformed

    private void jMenuNum_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNum_AActionPerformed
        setPanel(jPanelGenerador);
        jPanelGenerador.setNumeros(numeros);
    }//GEN-LAST:event_jMenuNum_AActionPerformed

    private void jMenuItemPruebasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPruebasActionPerformed
        if(!numeros.isEmpty()){
            jPanelPrueba_Est.setNumeros(numeros);
            jPanelPrueba_Est.llenarLista();
            setPanel(jPanelPrueba_Est);
        }else
            JOptionPane.showMessageDialog(this, "Debe generar Primero los numeros aleatorios");
    }//GEN-LAST:event_jMenuItemPruebasActionPerformed

    private void jMenuItemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAyudaActionPerformed
        setPanel(jPanelInformacion); 
    }//GEN-LAST:event_jMenuItemAyudaActionPerformed

    private void jMenuExp_ArcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExp_ArcActionPerformed
        if(!numeros.isEmpty()){
            JFileChooser jf = new JFileChooser();

            jf.setMultiSelectionEnabled(false);
            int r =jf.showSaveDialog(jf); 
            if(r == JFileChooser.APPROVE_OPTION){
                try {
                    FileOutputStream bs = new FileOutputStream(jf.getSelectedFile());
                    ObjectOutputStream os;
                    System.out.println("Serializando");
                    os = new ObjectOutputStream(bs);
                    os.writeObject(numeros);  // this es de tipo DatoUdp
                    os.close();
                    JOptionPane.showMessageDialog(null, "El archivo se ha exportado exitosamente");
                } catch (IOException ex) {
                    Logger.getLogger(Ventana_P.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }else{
            JOptionPane.showMessageDialog(null, "No se han generado numeros aleatorios\nDebe generarlos para poder "
                    + "exportarlos a un archivo");
        }


    }//GEN-LAST:event_jMenuExp_ArcActionPerformed

    private void jMenuItemImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemImportarActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.setMultiSelectionEnabled(false);
        int r =jf.showOpenDialog(jf);
        if(r == JFileChooser.APPROVE_OPTION){
             ObjectInputStream entrada;
            try {
                entrada = new ObjectInputStream(new FileInputStream(jf.getSelectedFile()));                
                numeros = (ArrayList<Float>) entrada.readObject();
                System.out.println(numeros.size());
                if(!numeros.isEmpty()){
                    jPanelGenerador.setNumeros(numeros);
                    jPanelPrueba_Est.setNumeros(numeros);
                    jPanelGenerador.llenarLista();
                    jPanelPrueba_Est.llenarLista();
                    JOptionPane.showMessageDialog(null, "Lista de números importado con éxito");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null , "Error al escoger el archivo");
            }


        }
    }//GEN-LAST:event_jMenuItemImportarActionPerformed

    private void jMenuItemJuegoVoladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJuegoVoladosActionPerformed
        if(!numeros.isEmpty()){
            jPanelJuegoVolados.setNumeros(numeros);
            jPanelJuegoVolados.llenarLista();
            setPanel(jPanelJuegoVolados);
        }else{
           JOptionPane.showMessageDialog(this, "Debe generar Primero los numeros aleatorios");
        }
    }//GEN-LAST:event_jMenuItemJuegoVoladosActionPerformed

    private void jMenuItemInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInventarioActionPerformed
        setPanel(jPanelSimulacionInventario);
    }//GEN-LAST:event_jMenuItemInventarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        setPanel(jPanelSevenEleven);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemRentaAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRentaAutosActionPerformed
        setPanel(jPanelRentaAutos); 
    }//GEN-LAST:event_jMenuItemRentaAutosActionPerformed

    private void jMenuItemRuletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRuletaActionPerformed
        setPanel(jPanelRuleta);
    }//GEN-LAST:event_jMenuItemRuletaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       setPanel(jPanelEjercicio4);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemEjercicio6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEjercicio6ActionPerformed
       setPanel(jPanelSimulacionesEjercicios6);
    }//GEN-LAST:event_jMenuItemEjercicio6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_P().setVisible(true);
            }
        });
    }

    private void setPanel(JPanel panel){
        jScrollPane1.setViewportView(panel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuExp_Arc;
    private javax.swing.JMenu jMenuGenerador;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JMenuItem jMenuItemEjercicio6;
    private javax.swing.JMenuItem jMenuItemImportar;
    private javax.swing.JMenuItem jMenuItemInventario;
    private javax.swing.JMenuItem jMenuItemJuegoVolados;
    private javax.swing.JMenuItem jMenuItemPruebas;
    private javax.swing.JMenuItem jMenuItemRentaAutos;
    private javax.swing.JMenuItem jMenuItemRuleta;
    private javax.swing.JMenuItem jMenuNum_A;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
