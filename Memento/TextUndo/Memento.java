package TextUndo;

public class Memento {

	private String article;
	
	public Memento(String articleSave) { article = articleSave; }

	public String getArticle() {
		return article;
	}

	
}
