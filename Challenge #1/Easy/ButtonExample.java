import javax.swing.*;    
public class ButtonExample
{  
	public static void main(String[] args)
		{  
    		JFrame f=new JFrame("Button Example"); 
			final JTextField tf=new JTextField();
			tf.setBounds(50,50,150,20);
    		JButton b=new JButton("Click Here");  
    		b.setBounds(100,100,95,30); 
			b.addActionListener(new ActionListener)
			{
				public void actionPerformed(ActionEvent e) 
				{
					tf.setText("lskdjfkls");
				}
			}
    		f.add(b);  
    		f.setSize(400,400);  
    		f.setLayout(null);  
    		f.setVisible(true);   
		}  
}  