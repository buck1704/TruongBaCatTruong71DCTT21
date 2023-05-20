package View;

import Controller.bookControl;
import Model.bookModel;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class QuanLySach extends javax.swing.JFrame {

    List<bookModel> arrBookList = new ArrayList<>();
    DefaultTableModel tbl_Book;
    String Id, TenSach, TheLoai, NamXuatBan, GiaTien;
    Date NgayNhap;
    String sWhere, sValueString;
    private static boolean check;

    public QuanLySach() {
        initComponents();
        LayNguonSach("", "");
        txt_Id.setEditable(false);
        btn_Ghi.setEnabled(false);
        btn_Xoa.setEnabled(false);
    }

    private void LayNguonSach(String where, String search) {
        try {
            tbl_Book = (DefaultTableModel) tb_Sach.getModel();
            arrBookList = bookControl.NguonSach(where, search);
            tbl_Book.setRowCount(0);
            arrBookList.forEach((KQ) -> {
                tbl_Book.addRow(new Object[]{KQ.getId(), KQ.getTensach(), KQ.getTheloai(), KQ.getNamxuatban(), KQ.getNgaynhap(), KQ.getGiatien()});
            });
        } catch (IOException ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void KhoaMo(boolean b) {
        txt_TenSach.setEditable(b);
        txt_TheLoai.setEditable(b);
        txt_NamXuatBan.setEditable(b);
        txt_GiaTien.setEditable(b);
        txt_NgayNhap.setEnabled(b);

        btn_Them.setEnabled(!b);
        btn_Sua.setEnabled(!b);
        btn_Xoa.setEnabled(!b);
        btn_Thoat.setEnabled(!b);

        btn_Ghi.setEnabled(b);
        btn_LamMoi.setEnabled(b);
    }

    public void refresh(boolean b) {
        txt_TenSach.setEditable(b);
        txt_TheLoai.setEditable(b);
        txt_NamXuatBan.setEditable(b);
        txt_GiaTien.setEditable(b);
        txt_NgayNhap.setEnabled(b);
        txt_find.setEnabled(b);

        btn_Them.setEnabled(b);
        btn_Sua.setEnabled(b);
        btn_Xoa.setEnabled(b);
        btn_Thoat.setEnabled(b);
        btn_Ghi.setEnabled(b);
        btn_LamMoi.setEnabled(b);

    }

    public void XoaTrang() {
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        txt_Id.setText("");
        txt_TenSach.setText("");
        txt_TheLoai.setText("");
        txt_GiaTien.setText("");
        txt_NgayNhap.setDate(currentDate);
        txt_NamXuatBan.setText("");
        txt_find.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_find = new javax.swing.JTextField();
        cb_find = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn_LamMoi = new javax.swing.JButton();
        btn_Ghi = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_TenSach = new javax.swing.JTextField();
        txt_NamXuatBan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_TheLoai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_GiaTien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_NgayNhap = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Sach = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1114, 620));

        jPanel1.setBackground(new java.awt.Color(120, 168, 252));
        jPanel1.setPreferredSize(new java.awt.Dimension(1114, 50));

        jLabel1.setBackground(new java.awt.Color(120, 168, 252));
        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGER BOOK FORM");

        cb_find.setBackground(new java.awt.Color(255, 255, 255));
        cb_find.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Tên Sách", "Thể Loại", "Năm Xuất Bản" }));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_18px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(txt_find, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_find, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txt_find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(300, 515));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(71, 120, 197));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 150));

        jPanel6.setBackground(new java.awt.Color(71, 120, 197));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điều Khiển", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        btn_LamMoi.setText("Làm Mới");
        btn_LamMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LamMoiMouseClicked(evt);
            }
        });

        btn_Ghi.setText("Ghi");
        btn_Ghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GhiActionPerformed(evt);
            }
        });

        btn_Thoat.setText("Thoát");
        btn_Thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ThoatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Ghi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Thoat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Ghi)
                    .addComponent(btn_LamMoi)
                    .addComponent(btn_Thoat))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(71, 120, 197));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức Năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        btn_Them.setText("Thêm");
        btn_Them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ThemMouseClicked(evt);
            }
        });

        btn_Sua.setText("Sửa");
        btn_Sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SuaMouseClicked(evt);
            }
        });
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Xoa.setText("Xoá");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them)
                    .addComponent(btn_Sua)
                    .addComponent(btn_Xoa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setBackground(new java.awt.Color(84, 127, 206));
        jPanel5.setPreferredSize(new java.awt.Dimension(308, 131));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id:");

        txt_Id.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên Sách:");

        txt_TenSach.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txt_NamXuatBan.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Năm xuất bản:");

        txt_TheLoai.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txt_TheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TheLoaiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Thể Loại:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Giá tiền:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ngày nhập:");

        txt_GiaTien.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Thông Tin Sách");

        txt_NgayNhap.setBackground(new java.awt.Color(255, 255, 255));
        txt_NgayNhap.setDateFormatString("yyyy, MM, dd");
        txt_NgayNhap.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Id)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_TenSach, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_TheLoai)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_NamXuatBan, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_GiaTien, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(txt_NgayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(txt_TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(txt_TheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(txt_NamXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(2, 2, 2)
                .addComponent(txt_NgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(txt_GiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        tb_Sach.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tb_Sach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Tên Sách", "Thể Loại", "Năm Xuất Bản", "Ngày Nhập", "Giá Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_Sach.setRowHeight(25);
        tb_Sach.setRowMargin(5);
        tb_Sach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_SachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Sach);
        if (tb_Sach.getColumnModel().getColumnCount() > 0) {
            tb_Sach.getColumnModel().getColumn(0).setPreferredWidth(15);
            tb_Sach.getColumnModel().getColumn(1).setPreferredWidth(175);
            tb_Sach.getColumnModel().getColumn(2).setPreferredWidth(50);
            tb_Sach.getColumnModel().getColumn(3).setPreferredWidth(50);
            tb_Sach.getColumnModel().getColumn(4).setPreferredWidth(35);
            tb_Sach.getColumnModel().getColumn(5).setPreferredWidth(35);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_SachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_SachMouseClicked
        try {
            KhoaMo(false);
            XoaTrang();
            btn_LamMoi.setEnabled(true);
            int index = tb_Sach.getSelectedRow();
            TableModel model = tb_Sach.getModel();
            Id = model.getValueAt(index, 0).toString();
            TenSach = model.getValueAt(index, 1).toString();
            TheLoai = model.getValueAt(index, 2).toString();
            NamXuatBan = model.getValueAt(index, 3).toString();
            NgayNhap = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(index, 4).toString());
            GiaTien = model.getValueAt(index, 5).toString();
            txt_Id.setText(Id);
            txt_TenSach.setText(TenSach);
            txt_TheLoai.setText(TheLoai);
            txt_NamXuatBan.setText(NamXuatBan);
            txt_NgayNhap.setDate(NgayNhap);
            txt_GiaTien.setText(GiaTien);
        } catch (ParseException ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tb_SachMouseClicked

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_GhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GhiActionPerformed
        try {
            if (txt_TenSach.getText().length() <= 0 || txt_TheLoai.getText().length() <= 0) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ thông tin.", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Id = txt_Id.getText();
            TenSach = txt_TenSach.getText();
            TheLoai = txt_TheLoai.getText();
            NamXuatBan = txt_NamXuatBan.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String sNgayNhap = sdf.format(txt_NgayNhap.getDate());
            GiaTien = txt_GiaTien.getText();

            if (NamXuatBan.length() != 4 || !NamXuatBan.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Năm xuất bản không hợp lệ. Vui lòng nhập lại!", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                txt_NamXuatBan.requestFocus();
                return;
            }
            try {
                int giaTien = Integer.parseInt(GiaTien);
                if (giaTien < 10000) {
                    JOptionPane.showMessageDialog(this, "Giá tiền không hợp lệ. Vui lòng nhập lại!", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                    txt_GiaTien.requestFocus();
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Giá tiền phải là số. Vui lòng nhập lại!", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                txt_GiaTien.requestFocus();
                return;
            }

            if (check == true) {
                bookModel cn = new bookModel(TenSach, TheLoai, NamXuatBan, sNgayNhap, GiaTien);
                bookControl.ThemSach(cn);
                JOptionPane.showMessageDialog(this, "Thêm sách thành công.", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                bookModel cn = new bookModel(Id, TenSach, TheLoai, NamXuatBan, sNgayNhap, GiaTien);
                bookControl.CapNhatSach(cn);
                JOptionPane.showMessageDialog(this, "Cập nhật sách thành công.", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            }
            LayNguonSach("", "");
            KhoaMo(false);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_GhiActionPerformed

    private void btn_ThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemMouseClicked
        check = true;
        KhoaMo(true);
        XoaTrang();
        txt_TenSach.requestFocus();
    }//GEN-LAST:event_btn_ThemMouseClicked

    private void btn_SuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuaMouseClicked
        check = false;
        KhoaMo(true);
        txt_TenSach.requestFocus();
    }//GEN-LAST:event_btn_SuaMouseClicked

    private void btn_LamMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LamMoiMouseClicked
        KhoaMo(false);
        XoaTrang();
        LayNguonSach("", "");
    }//GEN-LAST:event_btn_LamMoiMouseClicked

    private void btn_ThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThoatMouseClicked
        int choice = JOptionPane.showOptionDialog(this, "Bạn chắc chắn muốn thoát ?", "Thông Báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Thoát", "Tiếp tục"}, "Thoát");
        if (choice == JOptionPane.YES_OPTION) {
            dispose();
        } else if (choice == JOptionPane.NO_OPTION) {
        }
    }//GEN-LAST:event_btn_ThoatMouseClicked

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        Id = txt_Id.getText();
        int kq = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xoá nó ?", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (kq == JOptionPane.YES_OPTION) {
            bookControl.XoaSach(Id);
            XoaTrang();
            LayNguonSach("", "");
        }
        return;
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int selectedIndex = cb_find.getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                sWhere = "Id";
                sValueString = "  = '" + txt_find.getText() + "'";
                break;
            case 1:
                sWhere = "tensach";
                sValueString = " like N'%" + txt_find.getText() + "%'";
                break;
            case 2:
                sWhere = "TheLoai";
                sValueString = " like N'%" + txt_find.getText() + "%'";
                break;
            case 3:
                sWhere = "Namxuatban";
                sValueString = " = '" + txt_find.getText() + "'";
                break;
            default:
                break;
        }
        LayNguonSach(sWhere, sValueString);

    }//GEN-LAST:event_jLabel9MouseClicked

    private void txt_TheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TheLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TheLoaiActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ghi;
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JComboBox<String> cb_find;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_Sach;
    private javax.swing.JTextField txt_GiaTien;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_NamXuatBan;
    private com.toedter.calendar.JDateChooser txt_NgayNhap;
    private javax.swing.JTextField txt_TenSach;
    private javax.swing.JTextField txt_TheLoai;
    private javax.swing.JTextField txt_find;
    // End of variables declaration//GEN-END:variables
}
