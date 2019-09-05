package refactoring_study.duplicate_observed_data;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Graph extends JPanel implements ValueListener {
	public enum GraphType {
		RECTANGLE, CIRCLE
	}

	protected int graphValue;

	@Override
	public void valueChanger(ValueChangeEvent e) {
		graphValue = e.getSource().getValue();
		repaint(); /// paintComponent() 자동 호출
	}

	public static Graph createGraph(GraphType type, int width, int height) {
		switch (type) {
		case RECTANGLE:
			return RectangleGraph.getInstance(width, height);
		case CIRCLE:
			return CircleGraph.getInstance(width, height);
		default:
			throw new RuntimeException("Unknown Graph type");
		}
	}

}
