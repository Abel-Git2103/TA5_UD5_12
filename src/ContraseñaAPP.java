import javax.swing.JOptionPane;

public class ContraseñaAPP {

	public static void main(String[] args) {
		
		String contraseña = "cursojava";		
		boolean acierto = false;
		String introduccion;
		
		for (int i = 0; i < 3 && !acierto; i++) {
			introduccion = JOptionPane.showInputDialog("Introduce la contraseña");
			
			if (introduccion.equals(contraseña)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				acierto = true;
			}else {
				JOptionPane.showMessageDialog(null, "La contraseña introducida es incorrecta");
							
			}
		}
	}
}
