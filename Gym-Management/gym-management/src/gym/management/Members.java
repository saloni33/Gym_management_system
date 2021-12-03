/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class Members extends javax.swing.JFrame {

    /**
     * Creates new form Members
     */
    public Members() {
        initComponents();
        DisplayMembers();
        GetCoach();
        CountMember();
    }
    
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    ResultSet Rs1 = null;
    Statement St = null , St1 = null;
    private void DisplayMembers() {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
            St = (Statement) Con.createStatement();
            Rs = St.executeQuery("select * from MemberTbl");
            MembersTable.setModel(DbUtils.resultSetToTableModel(Rs));   
        } catch (Exception e) {
                
        }
    }
    private void GetCoach()
    {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
            St = Con.createStatement();
            String Query = "Select * from Coachtbl";
            Rs = St.executeQuery(Query);
            while(Rs.next())
            {
                String CoachName = Rs.getString("CName");
                CoachCb.addItem(CoachName);
            }
        } catch (Exception e) {
                
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MNameTb = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PhoneTb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        AgeTb = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        GenCb = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        AmountTb = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TimingCb = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        CoachCb = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MembersTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setBackground(new java.awt.Color(102, 102, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Logout");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 102, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Coaches");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(102, 102, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Payment");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 102, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Equipment");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(102, 102, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Exercise");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))))
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel7)
                .addGap(54, 54, 54)
                .addComponent(jLabel5)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Manage Members");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Member Name");

        MNameTb.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        MNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNameTbActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Phone Number");

        PhoneTb.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        PhoneTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTbActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Age");

        AgeTb.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        AgeTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTbActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Gender");

        GenCb.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        GenCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        GenCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenCbActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Amount");

        AmountTb.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        AmountTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountTbActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Timing");

        TimingCb.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        TimingCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8am - 10am", "4pm - 6pm", "6pm - 8pm" }));
        TimingCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimingCbActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Coach");

        CoachCb.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        CoachCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoachCbActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(204, 255, 204));
        AddBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(0, 102, 102));
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(204, 255, 204));
        EditBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(0, 102, 102));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(204, 255, 204));
        DeleteBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 21)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(0, 102, 102));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("Members List");

        MembersTable.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        MembersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        MembersTable.setRowHeight(28);
        MembersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MembersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MembersTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(366, 366, 366))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(561, 561, 561)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CoachCb, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(38, 38, 38)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TimingCb, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addComponent(GenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(208, 208, 208)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TimingCb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CoachCb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel17)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MNameTbActionPerformed

    private void PhoneTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTbActionPerformed

    private void AgeTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTbActionPerformed

    private void GenCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenCbActionPerformed

    private void AmountTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountTbActionPerformed

    private void TimingCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimingCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimingCbActionPerformed

    private void CoachCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoachCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoachCbActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new Coaches().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new Payments().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(null , "Logged Out Successfully");
    }//GEN-LAST:event_jLabel3MouseClicked
    
    int MNum = 0;
    private void CountMember()
    {
        try {
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select MAX(MId) from MemberTbl");
            Rs1.next();
            MNum = Rs1.getInt(1)+1;
        } catch (Exception e) {

        }   
    }
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(MNameTb.getText().isEmpty() || PhoneTb.getText().isEmpty() || AgeTb.getText().isEmpty() || AmountTb.getText().isEmpty() || GenCb.getSelectedIndex() == -1 || CoachCb.getSelectedIndex() == -1 || TimingCb.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this , "Missing Information");
        }else{
            try{
                CountMember();
                Class.forName("com.mysql.jdbc.Driver");
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into Membertbl values(?,?,?,?,?,?,?,?)");
                Add.setInt(1, MNum);
                Add.setString(2, MNameTb.getText());
                Add.setString(3, PhoneTb.getText());
                Add.setInt(4, Integer.valueOf(AgeTb.getText()));
                Add.setInt(5, Integer.valueOf(AmountTb.getText()));
                Add.setString(6, TimingCb.getSelectedItem().toString());
                Add.setString(7, CoachCb.getSelectedItem().toString());
                Add.setString(8, GenCb.getSelectedItem().toString());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Member Saved");
                Con.close();
                DisplayMembers();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_AddBtnMouseClicked
    
    int Key = 0;
    private void MembersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MembersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)MembersTable.getModel();
        int MyIndex = MembersTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        MNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        PhoneTb.setText(model.getValueAt(MyIndex, 2).toString());
        AgeTb.setText(model.getValueAt(MyIndex, 3).toString());
        AmountTb.setText(model.getValueAt(MyIndex, 4).toString());
        TimingCb.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
        CoachCb.setSelectedItem(model.getValueAt(MyIndex, 6).toString());
        GenCb.setSelectedItem(model.getValueAt(MyIndex, 7).toString());
    }//GEN-LAST:event_MembersTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(Key == 0){
            JOptionPane.showMessageDialog(this, "Select the Member to delete");
        }else{
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
                String Query = "Delete from MemberTbl where MId="+Key;
                Statement Del = Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Member Deleted");
                DisplayMembers();
            }  catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(Key == 0){
            JOptionPane.showMessageDialog(this, "Select the Member to Edit");
        }else{
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
                String Query = "Update MemberTbl set MName=?,MPhone=?,MAge=?,MAmount=?,MTiming=?,MCoach=?,MGen=? where MId=?";
                PreparedStatement Edit = Con.prepareStatement(Query);
                Edit.setString(1, MNameTb.getText());
                Edit.setString(2, PhoneTb.getText());
                Edit.setInt(3, Integer.valueOf(AgeTb.getText()));
                Edit.setInt(4, Integer.valueOf(AmountTb.getText()));
                Edit.setString(5, TimingCb.getSelectedItem().toString());
                Edit.setString(6, CoachCb.getSelectedItem().toString());
                Edit.setString(7, GenCb.getSelectedItem().toString());
                Edit.setInt(8, Key);
                int row = Edit.executeUpdate();
                JOptionPane.showMessageDialog(this, "Member Updated");
                Con.close();
                DisplayMembers();
            }  catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new Equipment().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        new Exercise().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Members.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Members().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField AgeTb;
    private javax.swing.JTextField AmountTb;
    private javax.swing.JComboBox<String> CoachCb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> GenCb;
    private javax.swing.JTextField MNameTb;
    private javax.swing.JTable MembersTable;
    private javax.swing.JTextField PhoneTb;
    private javax.swing.JComboBox<String> TimingCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
