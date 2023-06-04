/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jasatitipanbarang;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Swift
 */
public class MainJastip extends javax.swing.JFrame {

    /**
     * Creates new form MainJastip
     */
    Queue<String> Antrean = new LinkedList<>();
    
    public MainJastip() {
        initComponents();
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
        mainpanel = new javax.swing.JPanel();
        distribution = new javax.swing.JPanel();
        txtTerpilih = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        bhitung = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        JumlahAntrian = new javax.swing.JLabel();
        Antri = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListMenu = new javax.swing.JList<>();
        Tracking = new javax.swing.JPanel();
        History = new java.awt.TextArea();
        JumlahAntrian2 = new javax.swing.JLabel();
        poll = new java.awt.Button();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 205, 141));

        mainpanel.setBackground(new java.awt.Color(55, 187, 236));

        distribution.setBackground(new java.awt.Color(55, 187, 236));
        distribution.setPreferredSize(new java.awt.Dimension(542, 323));

        txtTerpilih.setEditable(false);
        txtTerpilih.setBackground(new java.awt.Color(255, 255, 255));
        txtTerpilih.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        txtTerpilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerpilihActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Stock Tersedia :");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipe Terpilih :");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga Barang :");

        txtHarga.setEditable(false);
        txtHarga.setBackground(new java.awt.Color(255, 255, 255));
        txtHarga.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jumlah Bayar :");

        txtBayar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });

        bhitung.setBackground(new java.awt.Color(248, 130, 20));
        bhitung.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bhitung.setForeground(new java.awt.Color(255, 255, 255));
        bhitung.setText("Hitung");
        bhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhitungActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kembalian     :");

        txtKembalian.setEditable(false);
        txtKembalian.setBackground(new java.awt.Color(255, 255, 255));
        txtKembalian.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        txtKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembalianActionPerformed(evt);
            }
        });

        JumlahAntrian.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        JumlahAntrian.setForeground(new java.awt.Color(255, 255, 255));
        JumlahAntrian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JumlahAntrian.setText("0");
        JumlahAntrian.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jumlah Antrian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        Antri.setBackground(new java.awt.Color(248, 130, 20));
        Antri.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Antri.setForeground(new java.awt.Color(255, 255, 255));
        Antri.setText("Queue");
        Antri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AntriMouseClicked(evt);
            }
        });
        Antri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AntriActionPerformed(evt);
            }
        });

        ListMenu.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        ListMenu.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Nike Air Force", "Nike Air Jordan", "Gucci Bag GG", "Janksport Backpacker", "Laptop ROG Air Flow", "Laptop Acer Concept D", "Iphone 16 Pro Max", "Poor Supply T-shirt", "Gundam Bandai", "BMX TDR-3000", "Cube Puzzle", "Swallow", "VR Asus", "Hat Machine", "Drone DJI 100" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListMenu.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListMenuValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListMenu);

        javax.swing.GroupLayout distributionLayout = new javax.swing.GroupLayout(distribution);
        distribution.setLayout(distributionLayout);
        distributionLayout.setHorizontalGroup(
            distributionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(distributionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(distributionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(distributionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(distributionLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(distributionLayout.createSequentialGroup()
                        .addComponent(txtTerpilih)
                        .addGap(14, 14, 14))
                    .addGroup(distributionLayout.createSequentialGroup()
                        .addGroup(distributionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(distributionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtHarga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBayar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bhitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(distributionLayout.createSequentialGroup()
                        .addComponent(txtKembalian)
                        .addContainerGap())
                    .addGroup(distributionLayout.createSequentialGroup()
                        .addComponent(JumlahAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Antri, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        distributionLayout.setVerticalGroup(
            distributionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(distributionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(distributionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addGroup(distributionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(distributionLayout.createSequentialGroup()
                        .addComponent(txtTerpilih, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(distributionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(distributionLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bhitung, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(distributionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(distributionLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(JumlahAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(distributionLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Antri, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        Tracking.setBackground(new java.awt.Color(55, 187, 236));

        History.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HistoryKeyTyped(evt);
            }
        });

        JumlahAntrian2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        JumlahAntrian2.setForeground(new java.awt.Color(255, 255, 255));
        JumlahAntrian2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JumlahAntrian2.setText("0");
        JumlahAntrian2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jumlah Antrian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        poll.setActionCommand("Done");
        poll.setBackground(new java.awt.Color(248, 130, 20));
        poll.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        poll.setForeground(new java.awt.Color(255, 255, 255));
        poll.setLabel("Done");
        poll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pollActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jasatitipanbarang/postman GG.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DELIVERED");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Antrian  :");

        javax.swing.GroupLayout TrackingLayout = new javax.swing.GroupLayout(Tracking);
        Tracking.setLayout(TrackingLayout);
        TrackingLayout.setHorizontalGroup(
            TrackingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrackingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addGroup(TrackingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrackingLayout.createSequentialGroup()
                        .addGroup(TrackingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TrackingLayout.createSequentialGroup()
                                .addComponent(JumlahAntrian2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(poll, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrackingLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
            .addGroup(TrackingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TrackingLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(History, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(310, Short.MAX_VALUE)))
        );
        TrackingLayout.setVerticalGroup(
            TrackingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrackingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TrackingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TrackingLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrackingLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel6)
                .addGap(13, 13, 13)
                .addGroup(TrackingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JumlahAntrian2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(poll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(TrackingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TrackingLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(History, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(distribution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tracking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addComponent(distribution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainpanelLayout.createSequentialGroup()
                    .addComponent(Tracking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jButton3.setBackground(new java.awt.Color(246, 75, 58));
        jButton3.setFont(new java.awt.Font("Calibri", 3, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(84, 186, 185));
        jButton4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Distribution");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4))
        );

        jButton5.setBackground(new java.awt.Color(84, 186, 185));
        jButton5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Tracking Queues");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton5))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?", "Terima Kasih", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhitungActionPerformed
        // TODO add your handling code here:
        int harga, bayar, kembalian;
        harga=Integer.parseInt(txtHarga.getText());
        bayar=Integer.parseInt(txtBayar.getText());

        kembalian = bayar - harga;
        txtKembalian.setText(Integer.toString(kembalian));
    }//GEN-LAST:event_bhitungActionPerformed

    private void txtKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembalianActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void AntriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AntriMouseClicked
    
    }//GEN-LAST:event_AntriMouseClicked

    private void txtTerpilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerpilihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTerpilihActionPerformed

    private void ListMenuValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListMenuValueChanged
        // TODO add your handling code here:
        String menu;
        menu=(String)ListMenu.getSelectedValue();
        txtTerpilih.setText(menu);
        switch (menu){
            case "Nike Air Force" : txtHarga.setText("2600000");
            break;
            case "Nike Air Jordan" : txtHarga.setText("2800000");
            break;
            case "Gucci Bag GG" : txtHarga.setText("2700000");
            break;
            case "Janksport Backpacker" : txtHarga.setText("1400000");
            break;
            case "Laptop ROG Air Flow" : txtHarga.setText("1252000");
            break;
            case "Laptop Acer Concept D" : txtHarga.setText("1570000");
            break;
            case "Iphone 16 Pro Max" : txtHarga.setText("1255000");
            break;
            case "Poor Supply T-shirt" : txtHarga.setText("2200000");
            break;
            case "Gundam Bandai" : txtHarga.setText("999000");
            break;
            case "BMX TDR-3000" : txtHarga.setText("1500000");
            break;
            case "Cube Puzzle" : txtHarga.setText("1580000");
            break;
            case "Swallow" : txtHarga.setText("1550000");
            break;
            case "VR Asus" : txtHarga.setText("1160000");
            break;
            case "Hat Machine" : txtHarga.setText("1690000");
            break;
            case "Drone DJI 100" : txtHarga.setText("1660000");
            break;
        }
    }//GEN-LAST:event_ListMenuValueChanged

    private void AntriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AntriActionPerformed
        if (txtTerpilih.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih Menu Dulu Yaa!");
        }else{
        String input = txtTerpilih.getText().toString();
        Antrean.add(input);
        String ukuran = String.valueOf(Antrean.size());
        JumlahAntrian.setText(ukuran);
        JumlahAntrian2.setText(ukuran);
        txtTerpilih.setText("");
        txtHarga.setText("");
        txtBayar.setText("");
        txtKembalian.setText("");
        History.append(input + "\n");
        }
    }//GEN-LAST:event_AntriActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        distribution.setVisible(true);
        Tracking.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Tracking.setVisible(true);
        distribution.setVisible(false);

    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void HistoryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HistoryKeyTyped

    }//GEN-LAST:event_HistoryKeyTyped

    private void pollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pollActionPerformed
        History.setText("");
        Antrean.poll();
        String ukuran = String.valueOf(Antrean.size());
        JumlahAntrian.setText(ukuran);
        JumlahAntrian2.setText(ukuran);
        Antrean.forEach((Object element) -> {
            History.append(element + "\n");
        });
    }//GEN-LAST:event_pollActionPerformed

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJastip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Antri;
    private java.awt.TextArea History;
    private javax.swing.JLabel JumlahAntrian;
    private javax.swing.JLabel JumlahAntrian2;
    private javax.swing.JList<String> ListMenu;
    private javax.swing.JPanel Tracking;
    private javax.swing.JButton bhitung;
    private javax.swing.JPanel distribution;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainpanel;
    private java.awt.Button poll;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtTerpilih;
    // End of variables declaration//GEN-END:variables
}
