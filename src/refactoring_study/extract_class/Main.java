package refactoring_study.extract_class;

public class Main {

	public static void main(String[] args) {
        Book refactoring = new Book(
                "Refactoring: improving the desgin of existing code", 
                "ISBN0201485672", 
                "$4495",
                "Martin Fowler", 
                "fowler@acm.org");
        
        System.out.println(refactoring.toXml());

	}

}
