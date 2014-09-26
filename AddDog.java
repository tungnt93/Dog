package Dog;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.dgc.DGC;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddDog extends JFrame {

	private DogCage dogCage;
	private JTextField txtAge;

	public AddDog(DogCage dogCage) {
		this.dogCage = dogCage;
		doShow();
	}

	public void doShow() {
		setSize(300, 200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		// setVisible(true);
		addControl();

	}

	public void addControl() {
		Container c = getContentPane();
		JPanel pane = new JPanel();
		pane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.CENTER));

		JLabel lblName = new JLabel("Tên");
		p1.add(lblName);
		JTextField txtName = new JTextField(10);
		p1.add(txtName);
		pane.add(p1);

		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel lblAge = new JLabel("Tuổi");
		p2.add(lblAge);
		txtAge = new JTextField(10);
		p2.add(txtAge);
		pane.add(p2);

		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel lblHeight = new JLabel("Chiều cao");
		p3.add(lblHeight);
		JTextField txtHeight = new JTextField(10);
		p3.add(txtHeight);
		pane.add(p3);

		JPanel p4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel lblWeight = new JLabel("Cân nặng");
		p4.add(lblWeight);
		JTextField txtWeight = new JTextField(10);
		p4.add(txtWeight);
		pane.add(p4);

		lblName.setPreferredSize(lblHeight.getPreferredSize());
		lblAge.setPreferredSize(lblHeight.getPreferredSize());
		lblWeight.setPreferredSize((lblHeight.getPreferredSize()));
		
		JComboBox cbbDog = new JComboBox();

		JButton btnAdd = new JButton("Thêm");
		pane.add(btnAdd);
		JLabel lblResult = new JLabel();
		pane.add(lblResult);

		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Dog dog = new Husky();
				dog.setAge(Integer.parseInt(txtAge.getText()));
				dogCage.AddDog(dog);
			}
		});

		c.add(pane);

	}

<<<<<<< HEAD
	
=======

>>>>>>> origin/master
}
