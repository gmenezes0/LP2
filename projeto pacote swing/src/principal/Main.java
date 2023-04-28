package principal;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame tela = new JFrame("LP2");
		JLabel texto = new JLabel("Aula de LP2");
		tela.setLayout(null);
		tela.getContentPane().add(texto);
		texto.setBounds(70, 25, 200, 20);
		tela.setSize(280,100);
		tela.setLocationRelativeTo(null);
		tela.setVisible(true);
	}

}
