package Progetto;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5];

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
					elementiMultimediali[i] = new Audio(nomeTitolo, durataAudio, volumeAudio);
					break;
				case 2:
					System.out.println("inserisci la durata del video");
					int durataVideo = scanner.nextInt();
					System.out.println("scegli il volume");
					int volumeVideo = scanner.nextInt();
					System.out.println("inserisci la luminosità");
					int luminosita = scanner.nextInt();
					scanner.nextLine();
					elementiMultimediali[i] = new Video(nomeTitolo, durataVideo, luminosita, volumeVideo);
					break;
				case 3:
					System.out.println("inserisci la luminosità");
					int luminositaImg = scanner.nextInt();
					scanner.nextLine();
					elementiMultimediali[i] = new Immagine(nomeTitolo, luminositaImg);
					break;
				default:
					System.out.println("Orrore in corso");
			}
		}

		int sceltaVoce;
		do {
			System.out.println("che vuoi fare?");

			System.out.println(" digita da 1 a 5 fai partire un elemento multimediale");
			System.out.println(" digita 6 se vuoi modificare il volume di un elemento ");
			System.out.println(" digita7 se vuoi modificare la luminosità di un elemento");
			System.out.println("digita 8  per visualizzare tutti gli elementi");
			System.out.println("digita 0 per uscire dal programma");

			sceltaVoce = scanner.nextInt();

			if (sceltaVoce >= 1 && sceltaVoce <= 5) {
				elementiMultimediali[sceltaVoce - 1].esegui();
			} else if (sceltaVoce == 6) {
				System.out.println("scegli l'elemento di cui vuoi modificare il volume tra 1 e 5");
				int elementoModificareV = scanner.nextInt();
				if (elementoModificareV >= 1 && elementoModificareV <= 5) {
					ElementoMultimediale elemento = elementiMultimediali[elementoModificareV - 1];
					if (elemento instanceof Audio) {
						Audio audio = (Audio) elemento;
						System.out.println("il volume attuale è: " + audio.getVolume());
						System.out.println("inserisci il nuovo volume");
						int nuovoV = scanner.nextInt();
						audio.setVolume(nuovoV);
						System.out.println("il volume attuale è " + audio.getVolume());
					} else if (elemento instanceof Video) {
						Video video = (Video) elemento;
						System.out.println("il volume attuale è: " + video.getVolume());
						System.out.println("inserisci il nuovo volume");
						int nuovoV = scanner.nextInt();
						video.setVolume(nuovoV);
						System.out.println("il volume attuale è " + video.getVolume());
					} else {
						System.out.println("Emily, Hai scelto un immagine");
					}
				}else if (sceltaVoce == 7) {
					System.out.println("scegli l'elemento di cui vuoi modificare la luminosità tra 1 e 5");
					int elementoModificareL = scanner.nextInt();
					if (elementoModificareL >= 1 && elementoModificareL <= 5) {
						ElementoMultimediale elemento = elementiMultimediali[elementoModificareL - 1];
						if (elemento instanceof Audio) {
							Video video = (Video) elemento;
							System.out.println("la luminosità attuale è: " + video.getVolume());
							System.out.println("inserisci la nuova luminosità");
							int nuovaL = scanner.nextInt();
						   video.setVolume(nuovaL);
							System.out.println("la luminosità auttuale è  " + video.getVolume());
						} else if (elemento instanceof Immagine) {
							Immagine immagine = (Immagine) elemento;
							System.out.println("il volume attuale è: " + immagine.getVolume());
							System.out.println("inserisci il nuovo volume");
							int nuovoV = scanner.nextInt();
							immagine.setVolume(nuovoV);
							System.out.println("la luminosità attuale è  " + immagine.getVolume());
						} else {
							System.out.println("Emily, Hai scelto un immagine");
						}
					}
			} else if (sceltaVoce == 8) {
				System.out.println("Ecco tutti gli elementi che hai creato");
				for(int i=0; i<elementiMultimediali.length; i++){
					if(elementiMultimediali[i]!= null){
						System.out.println(elementiMultimediali[i]);
					}
				}
			}
		}
		while (sceltaVoce != 0);
	}
}