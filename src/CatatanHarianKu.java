
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class CatatanHarianKu extends javax.swing.JFrame {
    
    private DefaultTableModel tableModel;

    /**
     * Creates new form CatatanHarianKu
     */
    public CatatanHarianKu() {
        initComponents();
        initTable();
        setLocationRelativeTo(null); // Menempatkan frame di tengah layar
        
    }

    private void initTable() {
        tableModel = new DefaultTableModel(
            new String[]{"Judul Catatan", "Tanggal", "Isi Catatan"}, 0
        );
        tableCatatan.setModel(tableModel);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jSimpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jEdit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCatatan = new javax.swing.JTable();
        jHapus = new javax.swing.JButton();
        jEkspor = new javax.swing.JButton();
        jImpor = new javax.swing.JButton();
        jKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Catatan Harian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Judul Catatan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Tanggal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Isi Catatan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jLabel3, gridBagConstraints);

        jTextField1.setColumns(40);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jTextField1, gridBagConstraints);

        jTextArea1.setColumns(40);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        jDateChooser1.setDateFormatString("EEEE, dd MMMM yyyy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jDateChooser1, gridBagConstraints);

        jSimpan.setBackground(new java.awt.Color(0, 153, 153));
        jSimpan.setText("Simpan");
        jSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jSimpan, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hello Welcome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(jLabel4, gridBagConstraints);

        jEdit.setBackground(new java.awt.Color(255, 204, 51));
        jEdit.setText("Edit");
        jEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel2.add(jEdit, gridBagConstraints);

        jTabbedPane2.addTab("Tambah Catatan", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 255, 153));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        tableCatatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Judul Catatan", "Tanggal", "Isi Catatan"
            }
        ));
        tableCatatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCatatanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableCatatan);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jScrollPane2, gridBagConstraints);

        jHapus.setBackground(new java.awt.Color(255, 51, 51));
        jHapus.setText("Hapus");
        jHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHapusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jHapus, gridBagConstraints);

        jEkspor.setBackground(new java.awt.Color(0, 153, 153));
        jEkspor.setText("Ekspor");
        jEkspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEksporActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel3.add(jEkspor, gridBagConstraints);

        jImpor.setBackground(new java.awt.Color(0, 204, 153));
        jImpor.setText("Impor");
        jImpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jImporActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        jPanel3.add(jImpor, gridBagConstraints);

        jTabbedPane2.addTab("CatatanKu", jPanel3);

        jKeluar.setBackground(new java.awt.Color(255, 0, 51));
        jKeluar.setText("Keluar");
        jKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jKeluar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKeluarActionPerformed
        System.exit(0);  //kode tombol keluar
    }//GEN-LAST:event_jKeluarActionPerformed

    private void jSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSimpanActionPerformed
        // kode tombol simpan untuk menambah ke tabel
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        String tanggal = sdf.format(jDateChooser1.getDate());
        String judul = jTextField1.getText();
        String catatan = jTextArea1.getText();

        if (judul.isEmpty() || catatan.isEmpty() || jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!");
            return;
        }

        // Tambahkan data ke tabel
        tableModel.addRow(new Object[]{judul, tanggal, catatan});
        
         // Tampilkan pesan berhasil
        JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
    
        clearFields();
    }//GEN-LAST:event_jSimpanActionPerformed

    private void jEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableCatatan.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diedit!");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        String tanggal = sdf.format(jDateChooser1.getDate());
        String judul = jTextField1.getText();
        String catatan = jTextArea1.getText();

        tableModel.setValueAt(judul, selectedRow, 0);
        tableModel.setValueAt(tanggal, selectedRow, 1);
        tableModel.setValueAt(catatan, selectedRow, 2);
        
         // Tampilkan pesan berhasil
        JOptionPane.showMessageDialog(this, "Data berhasil diedit!");
        
        clearFields();
    }//GEN-LAST:event_jEditActionPerformed

    private void jHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHapusActionPerformed
        // kode tombol hapus data
        int selectedRow = tableCatatan.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus!");
            return;
        }
        
         // Tampilkan pesan berhasil
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
        
        // Menghapus baris data
        tableModel.removeRow(selectedRow);
    }//GEN-LAST:event_jHapusActionPerformed

    private void tableCatatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCatatanMouseClicked
        // Listener untuk mendeteksi baris yang dipilih
        tableCatatan.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) { 
                int selectedRow = tableCatatan.getSelectedRow();
                if (selectedRow != -1) {
                    // Ambil data dari tabel
                    String judul = tableModel.getValueAt(selectedRow, 0).toString();
                    String tanggal = tableModel.getValueAt(selectedRow, 1).toString();
                    String catatan = tableModel.getValueAt(selectedRow, 2).toString();

                    // Tampilkan data ke form
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                        jDateChooser1.setDate(sdf.parse(tanggal));
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, "Format tanggal tidak valid!");
                    }
                    jTextField1.setText(judul);
                    jTextArea1.setText(catatan);
                }
            }
         });
    }//GEN-LAST:event_tableCatatanMouseClicked

    private void jEksporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEksporActionPerformed
        // Mengekspor data tabel menjadi file
       JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Simpan File");
        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                int rowCount = tableModel.getRowCount();
                int colCount = tableModel.getColumnCount();

                for (int i = 0; i < rowCount; i++) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < colCount; j++) {
                        sb.append(tableModel.getValueAt(i, j).toString());
                        if (j < colCount - 1) {
                            sb.append("\t"); 
                        }
                    }
                    bw.write(sb.toString());
                    bw.newLine();
                }

                JOptionPane.showMessageDialog(this, 
                    "Data berhasil disimpan ke file: " + file.getName());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, 
                    "Terjadi kesalahan saat menyimpan file: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jEksporActionPerformed

    private void jImporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jImporActionPerformed
        // Mengekspor data tabel menjadi file
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pilih File untuk Diimpor");
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                int lineCount = 0;

                while ((line = br.readLine()) != null) {
                    lineCount++;

                    String[] data = line.split("\t"); 
                    if (data.length == 3) {
                        // Tambahkan data ke tabel
                        tableModel.addRow(new Object[]{data[0], data[1], data[2]});
                    } else {
                        JOptionPane.showMessageDialog(this, 
                            "Format data tidak valid pada baris: " + lineCount);
                    }
                }

                JOptionPane.showMessageDialog(this, 
                    "Data berhasil diimpor dari file: " + file.getName());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, 
                    "Terjadi kesalahan saat membaca file: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jImporActionPerformed

    private void clearFields(){
        //Untuk mengosongkan kolom inputan
        jTextField1.setText("");
        jTextArea1.setText("");
        jDateChooser1.setDate(null);
        
    }
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
            java.util.logging.Logger.getLogger(CatatanHarianKu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatatanHarianKu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatatanHarianKu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatatanHarianKu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatatanHarianKu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JButton jEdit;
    private javax.swing.JButton jEkspor;
    private javax.swing.JButton jHapus;
    private javax.swing.JButton jImpor;
    private javax.swing.JButton jKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jSimpan;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableCatatan;
    // End of variables declaration//GEN-END:variables
}
