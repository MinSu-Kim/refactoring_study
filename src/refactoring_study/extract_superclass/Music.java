package refactoring_study.extract_superclass;

public class Music extends Media{

	public Music(String data) {
		this.data = data;
	}

	@Override
	public void play() {
		System.out.printf("%s %s%n", data, "play");
	}

	@Override
	public void loop() {
		System.out.printf("%s %s%n", data, "loop");
	}

	@Override
	public void stop() {
		System.out.printf("%s %s%n", data, "stop");
	}
}