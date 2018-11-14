/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Thor
 */


public class citra extends javax.swing.JFrame {

    private BufferedImage gambar;
    private BufferedImage anothergambar;
    /**
     * Creates new form citra
     */
    public citra() {
        initComponents();
        pilihgambar = new JFileChooser();
        pilihgambar.setFileFilter(new FileNameExtensionFilter("Jpg Image","jpg"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pilihgambar = new javax.swing.JFileChooser();
        tombolpilihgambar = new javax.swing.JButton();
        filelabel = new javax.swing.JLabel();
        filelabel2 = new javax.swing.JLabel();
        tombolgrayscale = new javax.swing.JButton();
        filtercombo = new javax.swing.JComboBox<>();
        labelfilter = new javax.swing.JLabel();
        tombolfilter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tugas Citra");

        tombolpilihgambar.setText("Choose Image...");
        tombolpilihgambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolpilihgambarActionPerformed(evt);
            }
        });

        filelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        filelabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        tombolgrayscale.setText("Grayscale");
        tombolgrayscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolgrayscaleActionPerformed(evt);
            }
        });

        filtercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low Pass", "High Pass", "Median" }));
        filtercombo.setEnabled(false);
        filtercombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtercomboActionPerformed(evt);
            }
        });

        labelfilter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelfilter.setText("Filtering :");

        tombolfilter.setText("Apply Filter");
        tombolfilter.setEnabled(false);
        tombolfilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolfilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tombolpilihgambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tombolgrayscale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filtercombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelfilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tombolfilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(filelabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filelabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tombolpilihgambar)
                        .addGap(18, 18, 18)
                        .addComponent(tombolgrayscale)
                        .addGap(18, 18, 18)
                        .addComponent(labelfilter)
                        .addGap(14, 14, 14)
                        .addComponent(filtercombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tombolfilter))
                    .addComponent(filelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolpilihgambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolpilihgambarActionPerformed
        int returnvalue = pilihgambar.showOpenDialog(this);
        
        if (returnvalue == JFileChooser.APPROVE_OPTION){
            try{
            File imgdisplay = pilihgambar.getSelectedFile();
            Image rescaled = ImageIO.read(imgdisplay);
            filelabel.setIcon(new ImageIcon(rescaled.getScaledInstance(450, 450, 450)));
            
            }catch(IOException ioe){
                filelabel.setText ("Gambar gagal di load !");
            }
        } 
        else{
            filelabel.setText("Tak ada file dipilih !");
        }
        
    }//GEN-LAST:event_tombolpilihgambarActionPerformed

    private void tombolgrayscaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolgrayscaleActionPerformed
        int returnvalue = JFileChooser.APPROVE_OPTION;
        
        if (returnvalue == JFileChooser.APPROVE_OPTION){
            try{
            gambar = ImageIO.read(pilihgambar.getSelectedFile());
            
            int width = gambar.getWidth();
            int height = gambar.getHeight();
            
            for (int y=0;y<height;y++){
                for (int x=0;x<width;x++){
                int p = gambar.getRGB(x, y);
                
                
                int a = (p>>24)&0xff;
                int r = (p>>16)&0xff;
                int g = (p>>8)&0xff;
                int b = p&0xff;
                int avg = (r+g+b)/3;
                p = (a<<24) | (avg<<16) | (avg<<8) | avg;
                gambar.setRGB(x, y, p);
                anothergambar = gambar;
                }
                
            }
            Image rescaled = gambar;
                filelabel2.setIcon(new ImageIcon(rescaled.getScaledInstance(450,450,450)));
                
            filtercombo.setEnabled(true);
            tombolfilter.setEnabled(true);
            
            
            }catch(IOException ioe){
            filelabel2.setText(ioe+"");
            }
            
        }
        else{
        filelabel2.setText("Tak ada image untuk di convert :( ");
        }
        
    }//GEN-LAST:event_tombolgrayscaleActionPerformed

    private void filtercomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtercomboActionPerformed
        
    }//GEN-LAST:event_filtercomboActionPerformed

    private void tombolfilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolfilterActionPerformed
        String filter = (String)filtercombo.getSelectedItem();
        
        if (filter == "Median"){
        
        Color[] pixel=new Color[9];
        int width = gambar.getWidth();
        int height = gambar.getHeight();
        int[] R=new int[9];
        int[] B=new int[9];
        int[] G=new int[9];
        for(int i=1;i<width-1;i++){
            for(int j=1;j<height-1;j++){
               pixel[0]=new Color(gambar.getRGB(i-1,j-1));
               pixel[1]=new Color(gambar.getRGB(i-1,j));
               pixel[2]=new Color(gambar.getRGB(i-1,j+1));
               pixel[3]=new Color(gambar.getRGB(i,j+1));
               pixel[4]=new Color(gambar.getRGB(i+1,j+1));
               pixel[5]=new Color(gambar.getRGB(i+1,j));
               pixel[6]=new Color(gambar.getRGB(i+1,j-1));
               pixel[7]=new Color(gambar.getRGB(i,j-1));
               pixel[8]=new Color(gambar.getRGB(i,j));
               for(int k=0;k<9;k++){
                   R[k]=pixel[k].getRed();
                   B[k]=pixel[k].getBlue();
                   G[k]=pixel[k].getGreen();
               }
               Arrays.sort(R);
               Arrays.sort(G);
               Arrays.sort(B);
               anothergambar.setRGB(i,j,new Color(R[4],B[4],G[4]).getRGB());
                }
            }
        Image sukses = anothergambar;
        filelabel.setIcon(new ImageIcon(sukses.getScaledInstance(450,450,450)));
            
        }
        else if (filter == "Low Pass"){
        
         
        }
    }//GEN-LAST:event_tombolfilterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(citra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(citra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(citra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(citra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new citra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel filelabel;
    private javax.swing.JLabel filelabel2;
    private javax.swing.JComboBox<String> filtercombo;
    private javax.swing.JLabel labelfilter;
    private javax.swing.JFileChooser pilihgambar;
    private javax.swing.JButton tombolfilter;
    private javax.swing.JButton tombolgrayscale;
    private javax.swing.JButton tombolpilihgambar;
    // End of variables declaration//GEN-END:variables
}
