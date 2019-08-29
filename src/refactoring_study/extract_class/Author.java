package refactoring_study.extract_class;

public class Author {
	private String authorName;
	private String authorMail;

	public Author() {
	}

	public Author(String authorName, String authorMail) {
		super();
		this.authorName = authorName;
		this.authorMail = authorMail;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorMail() {
		return authorMail;
	}

	public void setAuthorMail(String authorMail) {
		this.authorMail = authorMail;
	}
}