package tareaacademica02;

import javax.swing.JOptionPane;

public class FrmTablaValores extends javax.swing.JFrame {

    public FrmTablaValores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgOpciones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rdbNumeros = new javax.swing.JRadioButton();
        rdbMinusculas = new javax.swing.JRadioButton();
        rdbMayusculas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResultado = new javax.swing.JTextArea();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tabla de Valores");

        bgOpciones.add(rdbNumeros);
        rdbNumeros.setText("Numeros");
        rdbNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbNumerosActionPerformed(evt);
            }
        });

        bgOpciones.add(rdbMinusculas);
        rdbMinusculas.setText(" Minúsculas");

        bgOpciones.add(rdbMayusculas);
        rdbMayusculas.setText("Mayusculas");

        taResultado.setColumns(20);
        taResultado.setRows(5);
        jScrollPane1.setViewportView(taResultado);

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rdbNumeros)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbMinusculas)
                                .addGap(26, 26, 26)
                                .addComponent(rdbMayusculas))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbMayusculas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbMinusculas)
                        .addComponent(rdbNumeros)))
                .addGap(18, 18, 18)
                .addComponent(btnMostrar)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rdbNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbNumerosActionPerformed
    }//GEN-LAST:event_rdbNumerosActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        taResultado.setText("");
        if(rdbNumeros.isSelected()){
            byte[] numeros = {0,1,2,3,4,5,6,7,8,9};
            byte[] ascii = {48,49,50,51,52,53,54,55,56,57};
            taResultado.append("ASCII    VALOR\n");
            for(int i=0; i<numeros.length; i++){
                taResultado.append("   "+ascii[i]+"            "+numeros[i]+"\n");
            }
        } else if(rdbMinusculas.isSelected()){
            char[] minusculas = {'a','b','c','d','e','f','g','h','i','j',
            'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            byte[] ascii = {97,98,99,100,101,102,103,104,105,106,107,108,109,
            110,111,112,113,114,115,116,117,118,119,120,121,122};
            taResultado.append("ASCII    VALOR\n");
            for(int i=0; i<minusculas.length; i++){
                taResultado.append("   "+ascii[i]+"            "+minusculas[i]+"\n");
            }
        } else if(rdbMayusculas.isSelected()){
            char[] mayusculas = {'A','B','C','D','E','F','G','H','I','J','K',
                'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            byte[] ascii = {65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,
            81,82,83,84,85,86,87,88,89,90};
            taResultado.append("ASCII    VALOR\n");
            for(int i=0; i<mayusculas.length; i++){
                taResultado.append("   "+ascii[i]+"            "+mayusculas[i]+"\n");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Error, debe selecionar una opción");
        }
        bgOpciones.clearSelection();  
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    
    public static void main(String args[]) {       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTablaValores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOpciones;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbMayusculas;
    private javax.swing.JRadioButton rdbMinusculas;
    private javax.swing.JRadioButton rdbNumeros;
    private javax.swing.JTextArea taResultado;
    // End of variables declaration//GEN-END:variables
}
