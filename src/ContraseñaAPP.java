import javax.swing.JOptionPane;

public class Contrase�aAPP {

	public static void main(String[] args) {
		
		String contrase�a = "cursojava";		
		boolean acierto = false;
		String introduccion;
		
		for (int i = 0; i < 3 && !acierto; i++) {
			introduccion = JOptionPane.showInputDialog("Introduce la contrase�a");
			
			if (introduccion.equals(contrase�a)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				acierto = true;
			}else {
				JOptionPane.showMessageDialog(null, "La contrase�a introducida es incorrecta");
							
			}
		}
	}
}
