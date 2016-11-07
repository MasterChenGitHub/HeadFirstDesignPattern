package facade;

public class HomeTheaterTestDrive {

	public static void main(String[] args) {

		Amplifier amplifier = new Amplifier("amplifier");
		DvdPlayer dvdPlayer = new DvdPlayer("dvd", amplifier);

		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier,
				new Tuner("tuner", amplifier), dvdPlayer, new CdPlayer("cd",
						amplifier), new Projector("projector", dvdPlayer),
				new TheaterLights("light"), new Screen("screen"),
				new PopcornPopper("popcorn popper"));
		
		homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
		homeTheaterFacade.endMovie();
	}

}
