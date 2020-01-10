import java.io.File;
import java.util.Scanner;

public class UF1ACT1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introdueix el nom del directori o del fitxer que es vol consultar:");

		String nomFitxer = teclado.nextLine();

		File f = new File(nomFitxer);

		if (f.exists()) {

			if (f.isDirectory()) {
				String[] arxius = f.list();
				for (int i = 0; i < arxius.length; i++) {
					File d = new File(nomFitxer + File.separator + arxius[i]);
					if (d.isHidden()) {
						System.out.println(arxius[i] + " (OCULT) (Ultima modificacio: " + d.lastModified() + ")" );
					} else {
						System.out.println(arxius[i] + " (Ultima modificacio: " + d.lastModified() + ")");
					}
				}

			} else if (f.isFile()) {

				System.out.println("Nom del fitxer : " + f.getName());

				if (f.isHidden()) {

					System.out.println("Fitxer ocult   : SI");
				} else {
					System.out.println("Fitxer ocult   : NO");
				}

				
				System.out.println("Ruta               : " + f.getPath());
				System.out.println("Ruta absoluta      : " + f.getAbsolutePath());
				System.out.println("Ultima modificacio : " + f.lastModified());
				System.out.println("Es pot escriure    : " + f.canRead());
				System.out.println("Es pot llegir      : " + f.canWrite());
				System.out.println("Grandaria          : " + f.length());
				System.out.println("Es un directori    : " + f.isDirectory());
				System.out.println("Es un fitxer       : " + f.isFile());
			}

		}

	}

}
