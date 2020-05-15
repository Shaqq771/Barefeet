
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Stack;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainView extends javax.swing.JFrame {
int mesh, canvas, leather, hargacl, hargaunyel, hargapaint, hargarepair;
int belicl, hargacle, totalcl, bayarcl, e;
    
    public MainView() {
        initComponents();
        
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        BodyPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        btnhome = new javax.swing.JButton();
        btnproducts = new javax.swing.JButton();
        btncart = new javax.swing.JButton();
        btnlocation = new javax.swing.JButton();
        btncontacts = new javax.swing.JButton();
        btnabout = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        homepanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menunumberPanel = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        submainPanel = new javax.swing.JPanel();
        gambar1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        gambar2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        gambar3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        gambar4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        gambar5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        gambar6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        gambar7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        productspanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btncl = new javax.swing.JButton();
        btnunyel = new javax.swing.JButton();
        btnrepaint = new javax.swing.JButton();
        btnrepair = new javax.swing.JButton();
        panelproduk = new javax.swing.JPanel();
        prdctspanel = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        unyelpanel = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        repaintpanel = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel64 = new javax.swing.JLabel();
        repairpanel = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel65 = new javax.swing.JLabel();
        clpanel = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel61 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cartpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        typecl = new javax.swing.JComboBox<>();
        rbmesh = new javax.swing.JRadioButton();
        rbcanvas = new javax.swing.JRadioButton();
        rbleather = new javax.swing.JRadioButton();
        txthargacl = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtjumlahcl = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtjumlahunyel = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txthargaunyel = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txtjumlahrepaint = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txthargapaint = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txthargarepair = new javax.swing.JTextField();
        rblight = new javax.swing.JRadioButton();
        rbheavy = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txttelepon = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txttotalsemua = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtsumup = new javax.swing.JTextArea();
        bthitung = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txtdigit = new javax.swing.JTextField();
        btnproses = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        locationpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        contactspanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        aboutpanel = new javax.swing.JPanel();
        exitpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BareFoot.ID");

        BodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        menuPanel.setBackground(new java.awt.Color(2, 78, 104));

        btnhome.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\House1.png")); // NOI18N
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        btnproducts.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        btnproducts.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Product.png")); // NOI18N
        btnproducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductsActionPerformed(evt);
            }
        });

        btncart.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Cart.png")); // NOI18N
        btncart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncartActionPerformed(evt);
            }
        });

        btnlocation.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Location.png")); // NOI18N
        btnlocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlocationActionPerformed(evt);
            }
        });

        btncontacts.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Contacts.png")); // NOI18N
        btncontacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontactsActionPerformed(evt);
            }
        });

        btnabout.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Info.png")); // NOI18N
        btnabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaboutActionPerformed(evt);
            }
        });

        btnexit.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Exit.png")); // NOI18N
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("F:\\Download\\barefeet.ID (5).png")); // NOI18N

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnabout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(menuPanelLayout.createSequentialGroup()
                                    .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1))
                                .addComponent(btnproducts, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btncart, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btncontacts, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(btnhome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnproducts, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncart, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncontacts, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnabout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        homepanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 78, 104));
        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\Download\\barefeet.ID (6).png")); // NOI18N

        menunumberPanel.setBackground(new java.awt.Color(255, 255, 255));

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menunumberPanelLayout = new javax.swing.GroupLayout(menunumberPanel);
        menunumberPanel.setLayout(menunumberPanelLayout);
        menunumberPanelLayout.setHorizontalGroup(
            menunumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menunumberPanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn7)
                .addContainerGap())
        );
        menunumberPanelLayout.setVerticalGroup(
            menunumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menunumberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menunumberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btn7))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        submainPanel.setLayout(new java.awt.CardLayout());

        gambar1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\1.jpg")); // NOI18N

        jLabel57.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jLabel57.setText("\"Selamat datang di aplikasi yang memudahkan pekerjaan anda barefeet.id\"");

        javax.swing.GroupLayout gambar1Layout = new javax.swing.GroupLayout(gambar1);
        gambar1.setLayout(gambar1Layout);
        gambar1Layout.setHorizontalGroup(
            gambar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(gambar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        gambar1Layout.setVerticalGroup(
            gambar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        submainPanel.add(gambar1, "card2");

        gambar2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\2.jpg")); // NOI18N

        jLabel21.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jLabel21.setText("\"barefeet.id adalah sebuah perusahaan yang bergerak di bidang jasa\"");

        javax.swing.GroupLayout gambar2Layout = new javax.swing.GroupLayout(gambar2);
        gambar2.setLayout(gambar2Layout);
        gambar2Layout.setHorizontalGroup(
            gambar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(gambar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        gambar2Layout.setVerticalGroup(
            gambar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        submainPanel.add(gambar2, "card3");

        gambar3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\3.jpg")); // NOI18N

        jLabel58.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jLabel58.setText("\"barefeet.id membantu anda untuk memberikan treatment terbaik pada sepatu anda\"");

        javax.swing.GroupLayout gambar3Layout = new javax.swing.GroupLayout(gambar3);
        gambar3.setLayout(gambar3Layout);
        gambar3Layout.setHorizontalGroup(
            gambar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(gambar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        gambar3Layout.setVerticalGroup(
            gambar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel58)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        submainPanel.add(gambar3, "card4");

        gambar4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\4.jpg")); // NOI18N

        jLabel59.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jLabel59.setText("\"Kurir kami menjemput sepatu anda, lalu anda akan terima sepatu anda dalam kepuasan\"");

        javax.swing.GroupLayout gambar4Layout = new javax.swing.GroupLayout(gambar4);
        gambar4.setLayout(gambar4Layout);
        gambar4Layout.setHorizontalGroup(
            gambar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar4Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(gambar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        gambar4Layout.setVerticalGroup(
            gambar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel59)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        submainPanel.add(gambar4, "card5");

        gambar5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\5.jpg")); // NOI18N

        jLabel63.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jLabel63.setText("\"Dengan berbagai macam treatment seperti cleaning, unyellowing, repaint dan repair\"");

        javax.swing.GroupLayout gambar5Layout = new javax.swing.GroupLayout(gambar5);
        gambar5.setLayout(gambar5Layout);
        gambar5Layout.setHorizontalGroup(
            gambar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar5Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(gambar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        gambar5Layout.setVerticalGroup(
            gambar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel63)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        submainPanel.add(gambar5, "card6");

        gambar6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel25.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\new 6.jpg")); // NOI18N

        jLabel60.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jLabel60.setText("\"Dikerjakan oleh para ahli kami yang telah lama bergerak di bidang ini\"");

        javax.swing.GroupLayout gambar6Layout = new javax.swing.GroupLayout(gambar6);
        gambar6.setLayout(gambar6Layout);
        gambar6Layout.setHorizontalGroup(
            gambar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar6Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(gambar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        gambar6Layout.setVerticalGroup(
            gambar6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel60)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        submainPanel.add(gambar6, "card7");

        gambar7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\7.jpg")); // NOI18N

        jLabel62.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jLabel62.setText("\"Dengan harga yang kompetitif dan pelayan yang maksimal \"");

        javax.swing.GroupLayout gambar7Layout = new javax.swing.GroupLayout(gambar7);
        gambar7.setLayout(gambar7Layout);
        gambar7Layout.setHorizontalGroup(
            gambar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar7Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(gambar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        gambar7Layout.setVerticalGroup(
            gambar7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gambar7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel62)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        submainPanel.add(gambar7, "card8");

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menunumberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(submainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menunumberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainPanel.add(homepanel, "card2");

        productspanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 78, 104));
        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\Download\\barefeet.ID (7).png")); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        btncl.setIcon(new javax.swing.ImageIcon("F:\\Download\\Read More.png")); // NOI18N
        btncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclActionPerformed(evt);
            }
        });

        btnunyel.setIcon(new javax.swing.ImageIcon("F:\\Download\\Read More.png")); // NOI18N
        btnunyel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnunyelActionPerformed(evt);
            }
        });

        btnrepaint.setIcon(new javax.swing.ImageIcon("F:\\Download\\Read More.png")); // NOI18N
        btnrepaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrepaintActionPerformed(evt);
            }
        });

        btnrepair.setIcon(new javax.swing.ImageIcon("F:\\Download\\Read More.png")); // NOI18N
        btnrepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrepairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btncl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnunyel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(btnrepaint, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btnrepair, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnunyel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrepaint, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrepair, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        panelproduk.setLayout(new java.awt.CardLayout());

        prdctspanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\clean 7.jpg")); // NOI18N

        jLabel43.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\clean 5.jpg")); // NOI18N

        jLabel44.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\repain 2.jpg")); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon("F:\\Download\\clean61.jpg.png")); // NOI18N

        jLabel53.setIcon(new javax.swing.ImageIcon("F:\\Download\\Read More (7).png")); // NOI18N

        jLabel54.setIcon(new javax.swing.ImageIcon("F:\\Download\\Read More (4).png")); // NOI18N

        jLabel55.setIcon(new javax.swing.ImageIcon("F:\\Download\\Read More (5).png")); // NOI18N

        jLabel56.setIcon(new javax.swing.ImageIcon("F:\\Download\\Read More (6).png")); // NOI18N

        javax.swing.GroupLayout prdctspanelLayout = new javax.swing.GroupLayout(prdctspanel);
        prdctspanel.setLayout(prdctspanelLayout);
        prdctspanelLayout.setHorizontalGroup(
            prdctspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prdctspanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(prdctspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prdctspanelLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel43))
                    .addGroup(prdctspanelLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel54)))
                .addGap(18, 18, 18)
                .addGroup(prdctspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(jLabel55))
                .addGap(18, 18, 18)
                .addGroup(prdctspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel45))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        prdctspanelLayout.setVerticalGroup(
            prdctspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(prdctspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(prdctspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(jLabel42)
                    .addComponent(jLabel44)
                    .addGroup(prdctspanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(prdctspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(prdctspanelLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel52))
                    .addComponent(jLabel54)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelproduk.add(prdctspanel, "card2");

        unyelpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel50.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\clean 3.jpg")); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Yellowing adalah proses penguningan pada bahan sepatu yang berbahan karet karna adanya oksidasi alami,\numumnya terjadi pada sepatu sneakers. Proses unyellowing dapat menghilangkan warna kuning pada sepatu\nanda ,emggunakan bahan yang aman dan tidak berbahaya.\nHarga Unyellowing : Rp. 50.000");
        jTextArea2.setBorder(null);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel11.setText("Unyellowing");

        javax.swing.GroupLayout unyelpanelLayout = new javax.swing.GroupLayout(unyelpanel);
        unyelpanel.setLayout(unyelpanelLayout);
        unyelpanelLayout.setHorizontalGroup(
            unyelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unyelpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(unyelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(unyelpanelLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 466, Short.MAX_VALUE)
                        .addComponent(jLabel50))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        unyelpanelLayout.setVerticalGroup(
            unyelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unyelpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(unyelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelproduk.add(unyelpanel, "card4");

        repaintpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\repaint 3.jpg")); // NOI18N

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Repaint adalah proses pewarnaan sepatu untuk sepatu anda yang telah pudar atau ingin mengganti warna.\nRepaint kami menggunakan bahan yang aman, tidak merusak bahan sepatu dan tidak menindih benang\njahitan sepatu anda.\nHarga Repaint : Rp. 50.000 (/color)");
        jScrollPane4.setViewportView(jTextArea3);

        jLabel64.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel64.setText("Repaint");

        javax.swing.GroupLayout repaintpanelLayout = new javax.swing.GroupLayout(repaintpanel);
        repaintpanel.setLayout(repaintpanelLayout);
        repaintpanelLayout.setHorizontalGroup(
            repaintpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repaintpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(repaintpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(repaintpanelLayout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel49))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
                .addContainerGap())
        );
        repaintpanelLayout.setVerticalGroup(
            repaintpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repaintpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(repaintpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel64))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelproduk.add(repaintpanel, "card5");

        repairpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Service\\6.jpg")); // NOI18N

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("Repair adalah proses perbaikan sepatu anda yang mengalami kerusakan, baik itu pada bagian upper maupun\nsole. Repair sepatu anda dapat masuk ke 2 golongan yaitu light repair ataupun heavy repair.\nLight Repair : Rp. 50.000\nHeavy Repair : Rp. 100.000");
        jScrollPane5.setViewportView(jTextArea4);

        jLabel65.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel65.setText("Repair");

        javax.swing.GroupLayout repairpanelLayout = new javax.swing.GroupLayout(repairpanel);
        repairpanel.setLayout(repairpanelLayout);
        repairpanelLayout.setHorizontalGroup(
            repairpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(repairpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(repairpanelLayout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel51))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
                .addContainerGap())
        );
        repairpanelLayout.setVerticalGroup(
            repairpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repairpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(repairpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jLabel65))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelproduk.add(repairpanel, "card6");

        clpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Baham Sepatu\\Canvas.jpg")); // NOI18N

        jLabel47.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Baham Sepatu\\leather.jpg")); // NOI18N

        jLabel48.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Baham Sepatu\\Mesh.jpg")); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Ebrima", 0, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Cleaning adalah proses pencucian sepatu yang aman baik bagian luar sepatu maupun dalam sepatu. Cleaning\nmenggunakan bahan yang aman untuk sepatu, tidak merusak bahan sepatu, tidak membuat warna asli pudar\natau luntur. Dapat menghilangkan bau tidak sedap yang menempel pada sepatu. Proses cleaning dapat \ndilakukan di 3 bahan sepatu yaitu mesh, leather dan canvas. Terdapat 2 macam yaitu fast cleaning dan deep \ncleaning. ");
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel61.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel61.setText("Cleaning");

        javax.swing.GroupLayout clpanelLayout = new javax.swing.GroupLayout(clpanel);
        clpanel.setLayout(clpanelLayout);
        clpanelLayout.setHorizontalGroup(
            clpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(clpanelLayout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46)))
                .addContainerGap())
        );
        clpanelLayout.setVerticalGroup(
            clpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel48)
                    .addComponent(jLabel47)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelproduk.add(clpanel, "card3");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productspanelLayout = new javax.swing.GroupLayout(productspanel);
        productspanel.setLayout(productspanelLayout);
        productspanelLayout.setHorizontalGroup(
            productspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productspanelLayout.createSequentialGroup()
                .addGroup(productspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(productspanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelproduk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        productspanelLayout.setVerticalGroup(
            productspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productspanelLayout.createSequentialGroup()
                .addGroup(productspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(productspanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelproduk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        mainPanel.add(productspanel, "card3");

        cartpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\Download\\barefeet.ID (8).png")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cleaning"));

        jLabel27.setText("Type :");

        jLabel28.setText("Material :");

        typecl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Fast Cleaning", "Deep Cleaning" }));
        typecl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeclActionPerformed(evt);
            }
        });

        rbmesh.setText("Mesh");
        rbmesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmeshActionPerformed(evt);
            }
        });

        rbcanvas.setText("Canvas");
        rbcanvas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcanvasActionPerformed(evt);
            }
        });

        rbleather.setText("Leather");
        rbleather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbleatherActionPerformed(evt);
            }
        });

        txthargacl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthargaclKeyReleased(evt);
            }
        });

        jLabel30.setText("Jumlah :");

        txtjumlahcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahclActionPerformed(evt);
            }
        });
        txtjumlahcl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlahclKeyReleased(evt);
            }
        });

        jLabel37.setText("Harga :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbmesh)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtjumlahcl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbcanvas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbleather, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(typecl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addComponent(txthargacl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(typecl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30)
                        .addComponent(txtjumlahcl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txthargacl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbmesh)
                        .addComponent(rbcanvas)
                        .addComponent(rbleather)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Unyellowing"));

        txtjumlahunyel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahunyelActionPerformed(evt);
            }
        });
        txtjumlahunyel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlahunyelKeyReleased(evt);
            }
        });

        jLabel31.setText("Jumlah :");

        jLabel32.setText("Harga :");

        txthargaunyel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaunyelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtjumlahunyel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txthargaunyel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel31)
                .addComponent(txtjumlahunyel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel32)
                .addComponent(txthargaunyel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Repaint"));

        jLabel33.setText("Jumlah Warna :");

        txtjumlahrepaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahrepaintActionPerformed(evt);
            }
        });
        txtjumlahrepaint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtjumlahrepaintKeyReleased(evt);
            }
        });

        jLabel34.setText("Harga :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtjumlahrepaint, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txthargapaint, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtjumlahrepaint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel34)
                .addComponent(txthargapaint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Repair"));

        jLabel35.setText("Type :");

        jLabel36.setText("Harga :");
        jLabel36.setToolTipText("");

        txthargarepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargarepairActionPerformed(evt);
            }
        });
        txthargarepair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthargarepairKeyReleased(evt);
            }
        });

        rblight.setText("Light Repair");
        rblight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rblightActionPerformed(evt);
            }
        });

        rbheavy.setText("Heavy Repair");
        rbheavy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbheavyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbheavy)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rblight)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(txthargarepair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36)
                    .addComponent(txthargarepair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rblight))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                .addComponent(rbheavy)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel29.setText("Nama :");

        jLabel38.setText("Alamat :");

        jLabel40.setText("Nomor Telepon :");

        txttelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtteleponActionPerformed(evt);
            }
        });

        jLabel41.setText("Total Harga :");

        txttotalsemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalsemuaActionPerformed(evt);
            }
        });
        txttotalsemua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttotalsemuaKeyReleased(evt);
            }
        });

        txtsumup.setColumns(20);
        txtsumup.setRows(5);
        jScrollPane1.setViewportView(txtsumup);

        bthitung.setText("hitung");
        bthitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthitungActionPerformed(evt);
            }
        });

        jLabel39.setText("Pilih 3 digit angka :");

        txtdigit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdigitActionPerformed(evt);
            }
        });
        txtdigit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdigitKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel40)
                            .addGap(10, 10, 10))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addGap(55, 55, 55)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txttotalsemua, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdigit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txttelepon, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtalamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bthitung))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(txttelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdigit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttotalsemua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(bthitung))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnproses.setText("Proses");
        btnproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprosesActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnproses)
                .addGap(236, 236, 236))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnproses))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cartpanelLayout = new javax.swing.GroupLayout(cartpanel);
        cartpanel.setLayout(cartpanelLayout);
        cartpanelLayout.setHorizontalGroup(
            cartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        cartpanelLayout.setVerticalGroup(
            cartpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartpanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 412, Short.MAX_VALUE))
            .addGroup(cartpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(cartpanel, "card4");

        locationpanel.setBackground(new java.awt.Color(2, 78, 104));

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("F:\\Download\\barefeet.ID (9).png")); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon("F:\\Download\\barefeet.ID (14).png")); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon("F:\\Download\\barefeet.ID (15).png")); // NOI18N

        javax.swing.GroupLayout locationpanelLayout = new javax.swing.GroupLayout(locationpanel);
        locationpanel.setLayout(locationpanelLayout);
        locationpanelLayout.setHorizontalGroup(
            locationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locationpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(locationpanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(61, 61, 61))
        );
        locationpanelLayout.setVerticalGroup(
            locationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locationpanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addGroup(locationpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(0, 96, Short.MAX_VALUE))
        );

        mainPanel.add(locationpanel, "card5");

        contactspanel.setBackground(new java.awt.Color(2, 78, 104));

        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("F:\\Download\\barefeet.ID (10).png")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\WhatsApp.png")); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Facebookk.png")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\email 1.png")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("F:\\KULYAH\\NEW ICON\\Recorded media-WF.png")); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon("F:\\Download\\barefeet.ID (12).png")); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon("F:\\Download\\barefeet.ID (121).png")); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon("F:\\Download\\barefeet.ID (13).png")); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon("F:\\Download\\barefeet.ID (11).png")); // NOI18N

        javax.swing.GroupLayout contactspanelLayout = new javax.swing.GroupLayout(contactspanel);
        contactspanel.setLayout(contactspanelLayout);
        contactspanelLayout.setHorizontalGroup(
            contactspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactspanelLayout.createSequentialGroup()
                .addGroup(contactspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contactspanelLayout.createSequentialGroup()
                        .addGroup(contactspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contactspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(contactspanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(contactspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel14)))
                    .addGroup(contactspanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel17)))
                .addGap(0, 380, Short.MAX_VALUE))
            .addGroup(contactspanelLayout.createSequentialGroup()
                .addGroup(contactspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactspanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel12))
                    .addGroup(contactspanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(647, Short.MAX_VALUE))
        );
        contactspanelLayout.setVerticalGroup(
            contactspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactspanelLayout.createSequentialGroup()
                .addGroup(contactspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactspanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE))
                    .addGroup(contactspanelLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel20)))
                .addGroup(contactspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactspanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, Short.MAX_VALUE))
                    .addGroup(contactspanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel19)
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addGroup(contactspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactspanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contactspanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(17, 17, 17))
        );

        mainPanel.add(contactspanel, "card6");

        aboutpanel.setBackground(new java.awt.Color(2, 78, 104));

        javax.swing.GroupLayout aboutpanelLayout = new javax.swing.GroupLayout(aboutpanel);
        aboutpanel.setLayout(aboutpanelLayout);
        aboutpanelLayout.setHorizontalGroup(
            aboutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        aboutpanelLayout.setVerticalGroup(
            aboutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        mainPanel.add(aboutpanel, "card7");

        exitpanel.setBackground(new java.awt.Color(2, 78, 104));

        javax.swing.GroupLayout exitpanelLayout = new javax.swing.GroupLayout(exitpanel);
        exitpanel.setLayout(exitpanelLayout);
        exitpanelLayout.setHorizontalGroup(
            exitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        exitpanelLayout.setVerticalGroup(
            exitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        mainPanel.add(exitpanel, "card8");

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BodyPanelLayout.createSequentialGroup()
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(menuPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnproductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductsActionPerformed
        // TODO add your handling code here:
        
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
                
        
        // add panel
        mainPanel.add(productspanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnproductsActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        // TODO add your handling code here:
        
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
                
        
        // add panel
        mainPanel.add(homepanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btncartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncartActionPerformed
        // TODO add your handling code here:
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
                
        
        // add panel
        mainPanel.add(cartpanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btncartActionPerformed

    private void btnlocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlocationActionPerformed
        // TODO add your handling code here:
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
                
        
        // add panel
        mainPanel.add(locationpanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnlocationActionPerformed

    private void btncontactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontactsActionPerformed
        // TODO add your handling code here:
        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
                
        
        // add panel
        mainPanel.add(contactspanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btncontactsActionPerformed

    private void btnaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaboutActionPerformed
        // TODO add your handling code here:
       AboutView n = new AboutView();
       n.setVisible(true);
       
    }//GEN-LAST:event_btnaboutActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Anda yakin akan keluar?", "Warning!", dialogBtn);
        
        if (dialogResult==0){
            //true
            System.exit(0);
        } else {
            //true
        }
        
    }//GEN-LAST:event_btnexitActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        
        // remove panel
        submainPanel.removeAll();
        submainPanel.repaint();
        submainPanel.revalidate();
                
        
        // add panel
        submainPanel.add(gambar1);
        submainPanel.repaint();
        submainPanel.revalidate();
        
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        
        submainPanel.removeAll();
        submainPanel.repaint();
        submainPanel.revalidate();
                
        
        // add panel
        submainPanel.add(gambar2);
        submainPanel.repaint();
        submainPanel.revalidate();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        
        submainPanel.removeAll();
        submainPanel.repaint();
        submainPanel.revalidate();
                
        
        // add panel
        submainPanel.add(gambar3);
        submainPanel.repaint();
        submainPanel.revalidate();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        
        submainPanel.removeAll();
        submainPanel.repaint();
        submainPanel.revalidate();
                
        
        // add panel
        submainPanel.add(gambar4);
        submainPanel.repaint();
        submainPanel.revalidate();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        
        submainPanel.removeAll();
        submainPanel.repaint();
        submainPanel.revalidate();
                
        
        // add panel
        submainPanel.add(gambar5);
        submainPanel.repaint();
        submainPanel.revalidate();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        
        submainPanel.removeAll();
        submainPanel.repaint();
        submainPanel.revalidate();
                
        
        // add panel
        submainPanel.add(gambar6);
        submainPanel.repaint();
        submainPanel.revalidate();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        
        submainPanel.removeAll();
        submainPanel.repaint();
        submainPanel.revalidate();
                
        
        // add panel
        submainPanel.add(gambar7);
        submainPanel.repaint();
        submainPanel.revalidate();
    }//GEN-LAST:event_btn7ActionPerformed

    private void txthargaclKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargaclKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaclKeyReleased

    private void typeclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeclActionPerformed
        // TODO add your handling code here:
        // membuat kondisi untuk menentukan Cleaning
        if(typecl.getSelectedItem().equals("Pilih Type")){
            buttonGroup1.clearSelection();
            txthargacl.setText("");
        }
        else if(typecl.getSelectedItem().equals("Fast Cleaning")){
            mesh=20000;
            canvas=30000;
            leather=50000;
        }
        else if(typecl.getSelectedItem().equals("Deep Cleaning")){
            mesh=50000;
            canvas=75000;
            leather=100000;
        }
    }//GEN-LAST:event_typeclActionPerformed

    private void rbmeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmeshActionPerformed
        // TODO add your handling code here:
        //menampilkan harga setelah pilih type
        if(rbmesh.isSelected()){
            txthargacl.setText(String.valueOf(mesh));
            rbcanvas.setSelected(false);
            rbleather.setSelected(false);
        }                                    
    }//GEN-LAST:event_rbmeshActionPerformed

    private void rbcanvasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcanvasActionPerformed
        // TODO add your handling code here:
        if(rbcanvas.isSelected()){
            txthargacl.setText(String.valueOf(canvas));
            rbmesh.setSelected(false);
            rbleather.setSelected(false);
        }
    }//GEN-LAST:event_rbcanvasActionPerformed

    private void rbleatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbleatherActionPerformed
        // TODO add your handling code here:
        if(rbleather.isSelected()){
            txthargacl.setText(String.valueOf(leather));
            rbmesh.setSelected(false);
            rbcanvas.setSelected(false);
        }
    }//GEN-LAST:event_rbleatherActionPerformed

    private void txtjumlahclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahclActionPerformed
        // TODO add your handling code here:
        //input jumlah cl
        belicl=Integer.parseInt(txtjumlahcl.getText());
        hargacl=Integer.parseInt(txthargacl.getText());
        totalcl=belicl*hargacl;
        txthargacl.setText(String.valueOf(totalcl));
        
    }//GEN-LAST:event_txtjumlahclActionPerformed

    private void txtjumlahclKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahclKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a=Integer.valueOf(txthargacl.getText());
        b=Integer.valueOf(txtjumlahcl.getText());
        c=a*b;
        txthargacl.setText(""+c);
    }//GEN-LAST:event_txtjumlahclKeyReleased

    private void txtjumlahunyelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahunyelKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a=50000;
        b=Integer.valueOf(txtjumlahunyel.getText());
        c=a*b;
        txthargaunyel.setText(""+c);
    }//GEN-LAST:event_txtjumlahunyelKeyReleased

    private void txtjumlahrepaintKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjumlahrepaintKeyReleased
        // TODO add your handling code here:
        int a, b, c;
        a=50000;
        b=Integer.valueOf(txtjumlahrepaint.getText());
        c=a*b;
        txthargapaint.setText(""+c);
    }//GEN-LAST:event_txtjumlahrepaintKeyReleased

    private void txthargarepairKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargarepairKeyReleased

    }//GEN-LAST:event_txthargarepairKeyReleased

    private void txthargarepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargarepairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargarepairActionPerformed

    private void txtjumlahrepaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahrepaintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahrepaintActionPerformed

    private void rblightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rblightActionPerformed
        // TODO add your handling code here:
        int z;
        z=50000;
        if(rblight.isSelected()){
            txthargarepair.setText(String.valueOf(z));
            rbheavy.setSelected(false);
        }
    }//GEN-LAST:event_rblightActionPerformed

    private void rbheavyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbheavyActionPerformed
        // TODO add your handling code here:
        int z;
        z=100000;
        if(rbheavy.isSelected()){
            txthargarepair.setText(String.valueOf(z));
            rblight.setSelected(false);   
        }
    }//GEN-LAST:event_rbheavyActionPerformed

    private void btnprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprosesActionPerformed
        // TODO add your handling code here:
        txtsumup.setText(
                "Nama :"+txtnama.getText()+"\n"+
                "Nomor Telepon :"+txttelepon.getText()+"\n"+
                "Alamat :"+txtalamat.getText()+"\n"+
                "Total Harga :"+txttotalsemua.getText()+"\n\nMohon Transfer Sesuai Hingga 3 digit Terakhir\nKurir Kami Akan Segera Menjemput Barang Anda\n");
    }//GEN-LAST:event_btnprosesActionPerformed

    private void txttotalsemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalsemuaActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_txttotalsemuaActionPerformed

    private void txthargaunyelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaunyelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaunyelActionPerformed

    private void txtjumlahunyelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahunyelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahunyelActionPerformed

    private void txttotalsemuaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttotalsemuaKeyReleased
        // TODO add your handling code here:
        int a, b, c, d, e;
        a=Integer.valueOf(txthargacl.getText());
        b=Integer.valueOf(txthargaunyel.getText());
        c=Integer.valueOf(txthargapaint.getText());
        d=Integer.valueOf(txthargarepair.getText());
        e=a+b+c+d;
        txttotalsemua.setText(""+e);
    }//GEN-LAST:event_txttotalsemuaKeyReleased

    private void bthitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthitungActionPerformed
        // TODO add your handling code here:
        int a, b, c, d, f;
        a=Integer.valueOf(txthargacl.getText());
        b=Integer.valueOf(txthargaunyel.getText());
        c=Integer.valueOf(txthargapaint.getText());
        d=Integer.valueOf(txthargarepair.getText());
        f=a+b+c+d+e;
        txttotalsemua.setText(""+f);
    }//GEN-LAST:event_bthitungActionPerformed

    private void txtdigitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdigitActionPerformed
        // TODO add your handling code here:
        int data;
        data = 123;
        Queue<Integer> antrian = new LinkedList<Integer>();
        Stack result = new Stack();
        data=Integer.valueOf(txtdigit.getText());
        antrian.add(data);
        e=antrian.peek();
        
        
    }//GEN-LAST:event_txtdigitActionPerformed

    private void txtteleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtteleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtteleponActionPerformed

    private void txtdigitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdigitKeyReleased
        // TODO add your handling code here:
        
        int data;
        data = 123;
        data=Integer.valueOf(txtdigit.getText());
        Queue<Integer> antrian = new LinkedList<Integer>();
        Stack result = new Stack();
        antrian.add(data);
        e=antrian.peek();

     
    }//GEN-LAST:event_txtdigitKeyReleased

    private void btnclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclActionPerformed
        // TODO add your handling code here:
        
        // remove panel
        panelproduk.removeAll();
        panelproduk.repaint();
        panelproduk.revalidate();
                
        
        // add panel
        panelproduk.add(clpanel);
        panelproduk.repaint();
        panelproduk.revalidate();
    }//GEN-LAST:event_btnclActionPerformed

    private void btnunyelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnunyelActionPerformed
        // TODO add your handling code here:
        
        // remove panel
        panelproduk.removeAll();
        panelproduk.repaint();
        panelproduk.revalidate();
                
        
        // add panel
        panelproduk.add(unyelpanel);
        panelproduk.repaint();
        panelproduk.revalidate();
    }//GEN-LAST:event_btnunyelActionPerformed

    private void btnrepaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrepaintActionPerformed
        // TODO add your handling code here:
        
        // remove panel
        panelproduk.removeAll();
        panelproduk.repaint();
        panelproduk.revalidate();
                
        
        // add panel
        panelproduk.add(repaintpanel);
        panelproduk.repaint();
        panelproduk.revalidate();
    }//GEN-LAST:event_btnrepaintActionPerformed

    private void btnrepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrepairActionPerformed
        // TODO add your handling code here:
        
        // remove panel
        panelproduk.removeAll();
        panelproduk.repaint();
        panelproduk.revalidate();
                
        
        // add panel
        panelproduk.add(repairpanel);
        panelproduk.repaint();
        panelproduk.revalidate();
    }//GEN-LAST:event_btnrepairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // remove panel
        
        panelproduk.removeAll();
        panelproduk.repaint();
        panelproduk.revalidate();
                
        
        // add panel
        panelproduk.add(prdctspanel);
        panelproduk.repaint();
        panelproduk.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        buttonGroup1.clearSelection();
        txtjumlahcl.setText("");
        typecl.setSelectedItem("Pilih");
        txtjumlahrepaint.setText("");
        txtjumlahunyel.setText("");
        txttotalsemua.setText("");
        txttelepon.setText("");
        txtsumup.setText("");
        txtalamat.setText("");
        txtnama.setText("");
        txthargacl.setText("");
        txthargapaint.setText("");
        txthargaunyel.setText("");
        txtdigit.setText("");
        rbcanvas.setSelected(false);
        rbheavy.setSelected(false);
        rbleather.setSelected(false);
        rblight.setSelected(false);
        rbmesh.setSelected(false);

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel aboutpanel;
    private javax.swing.JButton bthitung;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btnabout;
    private javax.swing.JButton btncart;
    private javax.swing.JButton btncl;
    private javax.swing.JButton btncontacts;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnlocation;
    private javax.swing.JButton btnproducts;
    private javax.swing.JButton btnproses;
    private javax.swing.JButton btnrepaint;
    private javax.swing.JButton btnrepair;
    private javax.swing.JButton btnunyel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JPanel cartpanel;
    private javax.swing.JPanel clpanel;
    private javax.swing.JPanel contactspanel;
    private javax.swing.JPanel exitpanel;
    private javax.swing.JPanel gambar1;
    private javax.swing.JPanel gambar2;
    private javax.swing.JPanel gambar3;
    private javax.swing.JPanel gambar4;
    private javax.swing.JPanel gambar5;
    private javax.swing.JPanel gambar6;
    private javax.swing.JPanel gambar7;
    private javax.swing.JPanel homepanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JPanel locationpanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel menunumberPanel;
    private javax.swing.JPanel panelproduk;
    private javax.swing.JPanel prdctspanel;
    private javax.swing.JPanel productspanel;
    private javax.swing.JRadioButton rbcanvas;
    private javax.swing.JRadioButton rbheavy;
    private javax.swing.JRadioButton rbleather;
    private javax.swing.JRadioButton rblight;
    private javax.swing.JRadioButton rbmesh;
    private javax.swing.JPanel repaintpanel;
    private javax.swing.JPanel repairpanel;
    private javax.swing.JPanel submainPanel;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtdigit;
    private javax.swing.JTextField txthargacl;
    private javax.swing.JTextField txthargapaint;
    private javax.swing.JTextField txthargarepair;
    private javax.swing.JTextField txthargaunyel;
    private javax.swing.JTextField txtjumlahcl;
    private javax.swing.JTextField txtjumlahrepaint;
    private javax.swing.JTextField txtjumlahunyel;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextArea txtsumup;
    private javax.swing.JTextField txttelepon;
    private javax.swing.JTextField txttotalsemua;
    private javax.swing.JComboBox<String> typecl;
    private javax.swing.JPanel unyelpanel;
    // End of variables declaration//GEN-END:variables
}
