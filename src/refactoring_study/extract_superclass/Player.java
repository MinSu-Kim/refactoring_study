package refactoring_study.extract_superclass;

public class Player {
	private boolean isMusic;
	private String musicData = "좋니";
	private String videoData = "효리네 민박";

	public void setCurrentMedia(boolean isMusic) {
		this.isMusic = isMusic;
	}

	public void play() {
		if (isMusic) {
			playMusic();
		} else {
			playVideo();
		}
	}

	public void loop() {
		if (isMusic) {
			loopMusic();
		} else {
			loopVideo();
		}
	}

	public void stop() {
		if (isMusic) {
			stopMusic();
		} else {
			stopVideo();
		}
	}

	private void playMusic() {
		System.out.printf("%s %s%n", musicData, "play");
	}

	private void loopMusic() {
		System.out.printf("%s %s%n", musicData, "loop");
	}

	private void stopMusic() {
		System.out.printf("%s %s%n", musicData, "stop");
	}

	private void playVideo() {
		System.out.printf("%s %s%n", videoData, "play");
	}

	private void loopVideo() {
		System.out.printf("%s %s%n", videoData, "loop");
	}

	private void stopVideo() {
		System.out.printf("%s %s%n", videoData, "stop");
	}
}
