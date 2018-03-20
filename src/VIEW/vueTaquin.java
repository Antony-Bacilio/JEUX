package VIEW;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class vueTaquin extends JFrame{
	public JTextField textField;
	public JTextField textField_1;
	public JButton btnExit;
	
	public vueTaquin() {
		
		JButton button = new JButton("1");
		
		JButton button_1 = new JButton("2");
		
		JButton button_2 = new JButton("4");
		
		JButton button_3 = new JButton("3");
		
		JButton button_4 = new JButton("5");
		
		JButton button_5 = new JButton("7");
		
		JButton button_6 = new JButton("8");
		
		JButton button_7 = new JButton("");
		
		JButton button_8 = new JButton("6");
		
		JLabel lblLeTaquin = new JLabel("LE TAQUIN");
		lblLeTaquin.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblLeTaquin.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblMouvements = new JLabel("Mouvements :");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblTemps = new JLabel("Temps : ");
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
			}
		});
		
		btnExit = new JButton("Exit");
		/*btnExit.addActionListener(new ActionListener() {
			
			 public void actionPerformed(ActionEvent arg0) {
				 System.exit(0);
			}
		});*/
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblLeTaquin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(button_5, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
								.addComponent(button_2, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
								.addComponent(button, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
									.addGap(7))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(button_6, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
										.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(button_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(button_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(button_3, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnExit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(textField)
								.addComponent(lblTemps)
								.addComponent(textField_1)
								.addComponent(lblMouvements))
							.addGap(61)))
					.addGap(100))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(47)
					.addComponent(lblLeTaquin, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(button_3, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
								.addComponent(button, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblTemps)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(6)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblMouvements)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
						.addComponent(button_8, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
						.addComponent(button_4, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(button_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(button_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(button_5, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(16)
							.addComponent(btnReset)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnExit)))
					.addGap(180))
		);
		getContentPane().setLayout(groupLayout);
	}
	
	public void ejemple(int n){
		
	}
}
