package refactoring_study.extract_superclass;

public abstract class Media {

	protected String data;

	public abstract void stop();

	public abstract void loop();

	public abstract void play();

	public Media() {
		super();
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}