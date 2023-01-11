/*Online Java Paper Test*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OnlineTest extends JFrame implements ActionListener {
	JLabel l;
	JRadioButton jb[] = new JRadioButton[5];
	JButton b1, b2;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];

	OnlineTest(String s) {
		super(s);
		l = new JLabel();
		add(l);
		bg = new ButtonGroup();
		for (int i = 0; i < 5; i++) {
			jb[i] = new JRadioButton();
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1 = new JButton("Next");
		b2 = new JButton("Bookmark");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);
		set();
		l.setBounds(30, 40, 450, 20);
		jb[0].setBounds(50, 80, 100, 20);
		jb[1].setBounds(50, 110, 100, 20);
		jb[2].setBounds(50, 140, 100, 20);
		jb[3].setBounds(50, 170, 100, 20);
		b1.setBounds(100, 240, 100, 30);
		b2.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(600, 350);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			if (check())
				count = count + 1;
			current++;
			set();
			if (current == 9) {
				b1.setEnabled(false);
				b2.setText("Result");
			}
		}
		if (e.getActionCommand().equals("Bookmark")) {
			JButton bk = new JButton("Bookmark" + x);
			bk.setBounds(480, 20 + 30 * x, 100, 30);
			add(bk);
			bk.addActionListener(this);
			m[x] = current;
			x++;
			current++;
			set();
			if (current == 9)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for (int i = 0, y = 1; i < x; i++, y++) {
			if (e.getActionCommand().equals("Bookmark" + y)) {
				if (check())
					count = count + 1;
				now = current;
				current = m[y];
				set();
				((JButton) e.getSource()).setEnabled(false);
				current = now;
			}
		}

		if (e.getActionCommand().equals("Result")) {
			if (check())
				count = count + 1;
			current++;
			// System.out.println("correct ans="+count);
			JOptionPane.showMessageDialog(this, "correct ans=" + count);
			System.exit(0);
		}
	}

	void set() {
		jb[4].setSelected(true);
		if (current == 0) {
			l.setText("Que1: Which is the type of page orientation in LibreOffice Writer?");
			jb[0].setText("Portrait");
			jb[1].setText("Landscape");
			jb[2].setText("Slide");
			jb[3].setText(" Both Portrait & Landscape");
		}
		if (current == 1) {
			l.setText("Que2:Which function key is used for spell check?");
			jb[0].setText("F7");
			jb[1].setText("Ctrl+C");
			jb[2].setText("Sift+C");
			jb[3].setText("Ctrl+F7");
		}
		if (current == 2) {
			l.setText("Que3: Shortcut key for manage template in LibreOffice Writer ........... ");
			jb[0].setText("Ctrl+V");
			jb[1].setText("Ctrl+Shift+N");
			jb[2].setText("Ctrl+Shift+O");
			jb[3].setText("None of the above");
		}
		if (current == 3) {
			l.setText(
					"Que4:   ............ key is used to go to select to the beginning of the line in LibreOffice writer.  ");
			jb[0].setText("Home+Shift");
			jb[1].setText("Ctrl+Home");
			jb[2].setText("Alt+Home");
			jb[3].setText("Shift+C");
		}
		if (current == 4) {
			l.setText("Que5:  Shortcut key used for line break in LibreOffice writer is .............");
			jb[0].setText(" Ctrl+M");
			jb[1].setText("Ctrl+P");
			jb[2].setText("Shift + Enter");
			jb[3].setText("Ctrl+O");
		}
		if (current == 5) {
			l.setText("Que6: Which key is used to go to beginning of the line in LibreOffice Writer? ");
			jb[0].setText("Ctrl+Home");
			jb[1].setText("Home");
			jb[2].setText("Alt+Home");
			jb[3].setText("Shift+Home");
		}
		if (current == 6) {
			l.setText("Que7: Which of the following key is used for align left of the text in LibreOffice Writer? ");
			jb[0].setText("Ctrl+M");
			jb[1].setText("Ctrl+P");
			jb[2].setText("Ctrl+L");
			jb[3].setText("Ctrl+)");
		}
		if (current == 7) {
			l.setText("Que8: Which of the following is not a component of the LibreOffice Suite? ");
			jb[0].setText("Writer");
			jb[1].setText("Impress");
			jb[2].setText("Base");
			jb[3].setText(" Internet Explorer");
		}
		if (current == 8) {
			l.setText("Que9:  In LibreOffice writer which of the following shortcut is used to justify the document? ");
			jb[0].setText("Ctrl+J");
			jb[1].setText("Ctrl+P");
			jb[2].setText("Ctrl+Z");
			jb[3].setText("Ctrl+O");
		}
		if (current == 9) {
			l.setText("Que10:  Which key is used for exit applications in LibreOffice writer? ");
			jb[0].setText("Ctrl+O");
			jb[1].setText("Ctrl+T");
			jb[2].setText("Ctrl+F1");
			jb[3].setText("Ctrl+Q");
		}
		l.setBounds(30, 40, 450, 20);
		for (int i = 0, j = 0; i <= 90; i += 30, j++)
			jb[j].setBounds(50, 80 + i, 200, 20);
	}

	boolean check() {
		if (current == 0)
			return (jb[3].isSelected());
		if (current == 1)
			return (jb[0].isSelected());
		if (current == 2)
			return (jb[1].isSelected());
		if (current == 3)
			return (jb[0].isSelected());
		if (current == 4)
			return (jb[3].isSelected());
		if (current == 5)
			return (jb[1].isSelected());
		if (current == 6)
			return (jb[2].isSelected());
		if (current == 7)
			return (jb[3].isSelected());
		if (current == 8)
			return (jb[0].isSelected());
		if (current == 9)
			return (jb[3].isSelected());
		return false;
	}

	public static void main(String s[]) {
		new OnlineTest("Online Test Of Java");
	}

}
