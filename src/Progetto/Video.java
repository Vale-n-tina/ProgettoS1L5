package Progetto;

public class Video extends ElementoMultimediale implements Riproducibile, Luminosita {
	private int durata;
	private int luminosita;
	private int volume;

	public Video(String titolo, int durata, int luminosita, int volume) {
		super(titolo);
		this.durata = durata;
		this.luminosita = luminosita;
		this.volume = volume;

	}

	public void alzaVolume() {
		volume++;
	}

	public void abbassaVolume() {
		if (volume > 0) {
			volume--;
		} else {
			System.out.println("volume gia al minimo");
		}
	}

	@Override
	public void alzaLuminosita() {
		luminosita++;
	}

	@Override
	public void abbassaLuminosita() {
		if (luminosita > 0) {
			luminosita--;
		} else {
			System.out.println("luminosità gia al minimo");
		}
	}

	@Override
	public void play() {

	}


}
