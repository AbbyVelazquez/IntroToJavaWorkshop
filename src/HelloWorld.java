import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	String A= "Abby";
	JOptionPane.showMessageDialog(null,"Hello "+A);
	String ans=JOptionPane.showInputDialog("Enter Your Fav Color");
	JOptionPane.showMessageDialog(null, ans);
	if(ans.equals("Green")){
		JOptionPane.showMessageDialog(null,"You Have Poor Taste");
	
	}
	else{
		JOptionPane.showMessageDialog(null, "Good Choice");
	}
	
}
}
