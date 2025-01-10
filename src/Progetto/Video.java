package Progetto;

public class Video extends ElementoMultimediale implements Riproducibile{
	private int durata;
	private int luminosita;

	public Video(String titolo ,int durata, int luminosita){
		super(titolo);
		this.durata=durata;
		this.luminosita=luminosita;

	}

	@Override
	public void play() {

	}
}
