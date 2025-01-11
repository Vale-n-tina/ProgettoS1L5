package Progetto;

public class Audio extends ElementoMultimediale implements Riproducibile, Volume {

	private int durata;
	private int volume;

	public Audio(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}


	@Override
	public void alzaVolume() {
		volume++;
	}

	@Override
	public void abbassaVolume() {
		if (volume > 0) {
			volume--;
		} else {
			System.out.println("volume già al minimo");
		}

	}

	@Override
	public void play() {


	}

	@Override
	public void esegui() {
		play();

	}
}
