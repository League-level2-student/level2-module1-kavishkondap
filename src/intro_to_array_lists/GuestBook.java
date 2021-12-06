package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	ArrayList <String> stuff = new ArrayList<String>();
	JFrame frame = new JFrame ();
	JPanel panel = new JPanel ();
	JButton add = new JButton ();
	JButton view = new JButton ();
	public static void main(String[] args) {
		GuestBook guest = new GuestBook ();
		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	GuestBook (){

		frame.add(panel);
		panel.add(add);
		panel.add(view);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		view.addActionListener(this);
		add.addActionListener(this);
		add.setText("Add a name to the Guest Book");
		view.setText("View the guest book");
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) arg0.getSource();
			if (buttonClicked == add) {
				String name1 = 	JOptionPane.showInputDialog(null, "What name do you want to add?");
				stuff.add(name1);
				}
			if (buttonClicked == view) {
				String empty = "";
				for (int i = 0; i < stuff.size(); i++) {
					empty+="Guest #" + (i+1) + ": " + stuff.get(i);
				}
				JOptionPane.showMessageDialog(null, empty);
			}
	}
}
