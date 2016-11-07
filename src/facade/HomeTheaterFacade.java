package facade;

import log.Log;

public class HomeTheaterFacade {

	Amplifier mAmplifier;
	Tuner mTuner;
	DvdPlayer mDvdPlayer;
	CdPlayer mCdPlayer;
	Projector mProjector;
	TheaterLights mTheaterLights;
	Screen mScreen;
	PopcornPopper mPopcornPopper;

	public HomeTheaterFacade(Amplifier amplifier, Tuner tuner,
			DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector,
			TheaterLights theaterLights, Screen screen,
			PopcornPopper popcornPopper) {
		super();
		this.mAmplifier = amplifier;
		this.mTuner = tuner;
		this.mDvdPlayer = dvdPlayer;
		this.mCdPlayer = cdPlayer;
		this.mProjector = projector;
		this.mTheaterLights = theaterLights;
		this.mScreen = screen;
		this.mPopcornPopper = popcornPopper;
	}

	public void watchMovie(String movie) {
		Log.i("Get ready to watch a movie...");
		mPopcornPopper.on();
		mPopcornPopper.pop();

		mTheaterLights.dim(10);
		mScreen.down();

		mProjector.on();
		mProjector.wideScreenMode();

		mAmplifier.on();
		mAmplifier.setDvd(mDvdPlayer);
		mAmplifier.setStereoSound();
		mAmplifier.setVolume(5);

		mDvdPlayer.on();
		mDvdPlayer.play(movie);

	}

	public void endMovie() {

		Log.i("Shutting down theater down...");
		mPopcornPopper.off();
		mTheaterLights.on();
		mScreen.up();
		mProjector.off();
		mAmplifier.off();
		mDvdPlayer.stop();
		mDvdPlayer.eject();
		mDvdPlayer.off();
		
	}

}
