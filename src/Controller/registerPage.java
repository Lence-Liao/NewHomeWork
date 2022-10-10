package Controller;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.DbConnection;
import Dao.implUserlogin;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class registerPage extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerPage frame = new registerPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public registerPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("帳號:");
		lblNewLabel.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("密碼:");
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		
		username = new JTextField();
		username.setColumns(10);
		
		JButton btnNewButton = new JButton("註冊會員");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = DbConnection.getLogin();
				String Username =username.getText();
				String Password =password.getText();					
				String sql="select username from login ";				
				
				try {
					
					PreparedStatement ps = conn.prepareStatement(sql);										
					ResultSet rs = ps.executeQuery();		
					while(rs.next() ) {
						if(Username.equals(rs.getString("username"))){
							JOptionPane.showMessageDialog(null,"帳號重複重新輸入");
							registerPage rp=new registerPage();
							rp.show();
							break;	
						}
						
					}																				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
				new implUserlogin().addlogin(Username, Password);
				dispose();				
			}
		});
		
		password = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(84)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(password, 139, 139, 139)
						.addComponent(username, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(146, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(65)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
					.addGap(130))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(username, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(password, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)))
					.addGap(47)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(46))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
