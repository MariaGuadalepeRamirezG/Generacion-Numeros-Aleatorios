/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Informacion.java
 *
 * Created on 31/08/2011, 10:43:43 AM
 */

 /*
 * Autores:
 * Luis Alfonso Velez Santos
 * Carlos Yesid Hernandez Herrera
 * Jose Esteban Betin Diaz
 */

package Vista;


public class JPanelInformacion extends javax.swing.JPanel {

    /** Creates new form Informacion */
    public JPanelInformacion() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        S_Metodos = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        Infromacion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel1.setText("Ayuda");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12));
        jLabel2.setText("Seleccionar metodo:");

        S_Metodos.setMaximumRowCount(6);
        S_Metodos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Fibonacci", "Green", "Cuadratico", "Multiplicativo", "Mixto", "Mitchell-Moore", "MezclaI", "MezclaII", "Promedios", "Distancias", "Frecuencias", "Kolmogorov", "Series", "Poker", "Corridas", "Corridas II" }));
        S_Metodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_MetodosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Cuadro de Información");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S_Metodos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(Infromacion, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(S_Metodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Infromacion, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void S_MetodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_MetodosActionPerformed
        if(S_Metodos.getSelectedIndex()==1){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/fibonacci.JPG")));
        }else if(S_Metodos.getSelectedIndex()==2){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/green.JPG")));
        }else if(S_Metodos.getSelectedIndex()==3){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/cuadratico.JPG")));
        }else if(S_Metodos.getSelectedIndex()==4){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/multiplicativo.JPG")));
        }else if(S_Metodos.getSelectedIndex()==5){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/mixto.JPG")));
        }else if(S_Metodos.getSelectedIndex()==6){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/mitchell.JPG")));
        }else if(S_Metodos.getSelectedIndex()==7){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/mezcla_I.JPG")));
        }else if(S_Metodos.getSelectedIndex()==8){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/mezcla_II.JPG")));
        }else if(S_Metodos.getSelectedIndex()==9){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/Promedios.JPG")));
        }else if(S_Metodos.getSelectedIndex()==10){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/distancia.JPG")));
        }else if(S_Metodos.getSelectedIndex()==11){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/frecuencia.JPG")));
        }else if(S_Metodos.getSelectedIndex()==12){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/kolmogorov.JPG")));
        }else if(S_Metodos.getSelectedIndex()==13){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/series.JPG")));
        }else if(S_Metodos.getSelectedIndex()==14){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/poker.JPG")));
        }else if(S_Metodos.getSelectedIndex()==15){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/corrida.JPG")));
        }else if(S_Metodos.getSelectedIndex()==16){
            Infromacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ayuda/corrida2.JPG")));
        }
}//GEN-LAST:event_S_MetodosActionPerformed
//public static void main(String args[]){
//    JFrame v=new JFrame();
//    Informacion i=new Informacion();
//    i.setSize(600, 600);
//    v.setSize(600, 600);
//    v.add(i);
//    v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    v.setVisible(true);
//}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Infromacion;
    private javax.swing.JComboBox S_Metodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
