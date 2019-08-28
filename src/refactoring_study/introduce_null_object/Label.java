package refactoring_study.introduce_null_object;

public class Label {
	private final String label;

    public Label(String label) {
        this.label = label;
    }
    
	public static Label newNull() {
		return NullLabel.getInstance();
	}

    public void display() {
        System.out.printf("display : %s%n", label);
    }

    private static class NullLabel extends Label {
        private static final NullLabel instance = new NullLabel();
        
        public static NullLabel getInstance() {
            return instance;
        }

        private NullLabel() {
            super("(none)");
        }

   }    

    @Override
    public String toString() {
        return String.format("\"%s\"", label);
    }

    public String getLabel() {
        return label;
    }
    
    public boolean isNull() {
    	return false;
    }
}
