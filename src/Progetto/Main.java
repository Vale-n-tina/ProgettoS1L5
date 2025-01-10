package Progetto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("scegli il tipo di elemento multimediale, numero" + (i + 1));
			System.out.println("1:audio");
			System.out.println("2:video");
			System.out.println("3:immagine");
			int scelta = scanner.nextInt();
			scanner.nextLine();
			System.out.println("inserisci il titolo");
			String nomeTitolo = scanner.nextLine();



			switch (scelta) {
				case 1:
					System.out.println("inserisci la durata dell'audio");
					int durataAudio = scanner.nextInt();
					System.out.println("scegli il volume");
					int volumeAudio = scanner.nextInt();
					scanner.nextLine();
					break;
				case 2:
					System.out.println("inserisci la durata del video");
					int durataVideo = scanner.nextInt();
					System.out.println("scegli il volume");
					int volumeVideo = scanner.nextInt();
					System.out.println("inserisci la luminosità");
					int luminosita = scanner.nextInt();
					scanner.nextLine();
					break;
			}


		}
	}
}