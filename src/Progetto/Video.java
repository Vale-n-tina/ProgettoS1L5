package Progetto;

public class Video extends ElementoMultimediale implements Riproducibile, Luminosita, Volume {
	private int durata;
	private int luminosita;
	private int volume;

	public Video(String titolo, int durata, int luminosita, int volume) {
		super(titolo);
		this.durata = durata;
		this.luminosita = luminosita;
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
		for(int i=0; i<durata;i++){
			System.out.println(titolo + "" + "!".repeat(volume)+""+"*".repeat(luminosita));
		}

	}


	@Override
	public void esegui() {
		play();

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int nuovoV) {
		this.volume=nuovoV;
	}

	@Override
	public String toString() {
		return "Video{" +
				  "durata=" + durata +
				  ", luminosita=" + luminosita +
				  ", volume=" + volume +
				  '}';
	}
}

