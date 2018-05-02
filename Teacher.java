/*
 * Teacher.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import database.ModelFactory;
import database.result;
import database.score;
import database.student;
import database.teacher;

/**
 *
 * @author  __USER__
 */
public class Teacher extends javax.swing.JFrame {
	private teacher tea;
	/** Creates new form Teacher */
	public Teacher(teacher tea) {
		this.tea=tea;
		try {
			initComponents();
			this.setLocationRelativeTo(null);
			getTable();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	
public void getTable() throws SQLException, ClassNotFoundException {
		
		Object title[] = { "学号", "姓名", "班别", "专业" };
		ArrayList<student> managestudents = ModelFactory.managestudent(tea);
		Object detail[][] = new Object[managestudents.size()][4];
		for (int i = 0; i < managestudents.size(); i++) {
			detail[i][0] = managestudents.get(i).getSid();
			detail[i][1] = managestudents.get(i).getSname();
			detail[i][2] = managestudents.get(i).getSclass();
			detail[i][3] = managestudents.get(i).getMajor();
		}
		this.jTable3.setModel(new DefaultTableModel(detail, title));
		Object title2[] = { "课程编号", "课程名称", "课程学分", "任课老师" };
		ArrayList<score> managecourses = ModelFactory.managecourse(tea);
		Object detail2[][] = new Object[managecourses.size()][4];
		for (int i = 0; i < managecourses.size(); i++) {
			detail2[i][0] = managecourses.get(i).getId();
			detail2[i][1] = managecourses.get(i).getKname();
			detail2[i][2] = managecourses.get(i).getXuefen();
			detail2[i][3] = managecourses.get(i).getTname();
		}
		this.jTable1.setModel(new DefaultTableModel(detail2, title2));
	}
	
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jTabbedPane2 = new javax.swing.JTabbedPane();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel2 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel1
				.setText("\u6b22\u8fce\u6559\u5e08\u4f7f\u7528\u6210\u7ee9\u7ba1\u7406\u7cfb\u7edf");

		jTabbedPane1.setToolTipText("");
		jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jTabbedPane1.setName("");
		jTabbedPane1.setOpaque(true);

		jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

		jTable3.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { "0001", "小红", "16计算机3班", "计算机" },
						{ "0002", "小明", "16计算机3班", "计算机" },
						{ "0003", "小狗", "16计算机3班", "计算机" },
						{ "0004", "小贱", "16计算机3班", "计算机" } }, new String[] {
						"学号", "姓名", "班别", "专业" }));
		jTable3.setToolTipText("\u5b66\u751f\u7ba1\u7406");
		jScrollPane3.setViewportView(jTable3);

		jTabbedPane2.addTab("\u5b66\u751f\u7ba1\u7406", jScrollPane3);

		jTabbedPane1.addTab("\u5b66\u751f\u7ba1\u7406", jTabbedPane2);
		jTabbedPane2.getAccessibleContext().setAccessibleName("");

		jTable1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14));
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { "10001", "Java", "3", "温司机" },
						{ "10002", "高等数学", "3", "洪维恩" },
						{ "10003", "大学英语", "4", "余亚晶" },
						{ "10004", "C++", "3", "苑俊英" } }, new String[] {
						"课程编号", "课程名称", "课程学分", "任课老师" }));
		jTable1.setToolTipText("\u8bfe\u7a0b\u7ba1\u7406");
		jTable1.setName("");
		jTable1.setUpdateSelectionOnSort(false);
		jScrollPane1.setViewportView(jTable1);
		jTable1.getAccessibleContext().setAccessibleName("\u53cd\u5bf9\u6cd5");

		jTabbedPane1.addTab("\u8bfe\u7a0b\u7ba1\u7406", jScrollPane1);

		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton1.setText("\u6dfb\u52a0\u8bfe\u7a0b");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton2.setText("\u67e5\u627e\u8bfe\u7a0b");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton3.setText("\u5220\u9664\u8bfe\u7a0b");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton3ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton4.setText("\u4fee\u6539\u8bfe\u7a0b");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton5.setText("\u6dfb\u52a0\u5b66\u751f");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton6.setText("\u67e5\u627e\u5b66\u751f");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton7.setText("\u5237\u65b0\u7cfb\u7edf");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jButton8.setText("\u9000\u51fa\u767b\u9646");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap(67, Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																115,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																115,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(59, 59, 59)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton6,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																115,
																Short.MAX_VALUE))
										.addGap(65, 65, 65)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton7,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																115,
																Short.MAX_VALUE))
										.addGap(48, 48, 48)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jButton8,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																115,
																Short.MAX_VALUE))
										.addGap(80, 80, 80)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(32, 32, 32)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																53,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																53,
																Short.MAX_VALUE)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																53,
																Short.MAX_VALUE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																54,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												22, Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																53,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																53,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																53,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																53,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addGap(243, 243, 243)
						.addComponent(jLabel1).addContainerGap()).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 794,
				Short.MAX_VALUE).addGroup(
				jPanel1Layout.createSequentialGroup().addComponent(jPanel2,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGap(29, 29, 29)
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												29,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												jTabbedPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												261,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(30, 30, 30)
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(31, 31, 31)));

		jTabbedPane1.getAccessibleContext().setAccessibleName(
				"\u8bfe\u7a0b\u7ba1\u7406");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			getTable();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		new Changecourse().setVisible(true);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
		String msg = JOptionPane.showInputDialog("请输入要删除的课程编号：");
		score sc=null;
		new score(msg, "", "", "").Deledecourse(sc);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		new Addcourse().setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		String msg = JOptionPane.showInputDialog("请输入课程编号：");
		for (int i = 0; i < this.jTable1.getRowCount(); i++) {
			if (this.jTable1.getValueAt(i, 0).equals(msg)) {
				this.jTabbedPane1.setSelectedIndex(1);
				this.jTable1.setRowSelectionInterval(i, i);
				this.jTable1.setSelectionBackground(Color.blue);
			}
		}
		this.jTabbedPane1.setSelectedIndex(0);
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		String msg = JOptionPane.showInputDialog("请输入学生学号：");
		for (int i = 0; i < this.jTable3.getRowCount(); i++) {
			if (this.jTable3.getValueAt(i, 0).equals(msg)) {
				this.jTabbedPane2.setSelectedIndex(0);
				this.jTable3.setRowSelectionInterval(i, i);
				this.jTable3.setSelectionBackground(Color.blue);
			}
		}
		this.jTabbedPane2.setSelectedIndex(0);
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new Addstudent(tea).setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTabbedPane jTabbedPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable3;
	// End of variables declaration//GEN-END:variables

}