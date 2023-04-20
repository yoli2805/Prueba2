import java.util.Scanner;

public class Trabajo_Login {
	public static void main(String[] args) {
		System.out.println("Introduce tu nombre de usuario y contraseña");
		String usuariotrue = "DAM1";
		String contrasennatrue = "clasejava";
		Scanner leer = new Scanner(System.in);
		boolean usuariocorrecto = false;
		do {
			String usuario = leer.nextLine();
			if (usuario.equals(usuariotrue)) {
				System.out.println("Usuario correcto, introduce tu contraseña");
				usuariocorrecto = true;
			} else {
				System.out.println("Usuario no existente, intente de nuevo");
			}
		} while (usuariocorrecto == false);
		boolean contrasennacorrecta = false;
		do {
			String contrasenna = leer.nextLine();
			if (contrasenna.equals(contrasennatrue)) {
				System.out.println("Contraseña correcta, entrando en el sistema");
				contrasennacorrecta = true;
			} else {
				System.out.println("Contraseña incorrecta, intente de nuevo");
			}
		} while (contrasennacorrecta == false);
	}
}