package refactoring_study.replace_type_code_with_class;

public class Main {

	public static void main(String[] args) {
		Item book = new Item(Item.TYPECODE_BOOK, "¼¼°è ¿ª»ç", 4800);
		Item dvd = new Item(Item.TYPECODE_DVD, "´º¿åÀÇ ²Þ Æ¯º°ÆÇ", 3000);
		Item soft = new Item(Item.TYPECODE_SOFTWARE, "Æ©¸µ ¸Ó½Å", 3200);

		System.out.printf("%5s = %s%n", "book", book);
		System.out.printf("%5s = %s%n", "dvd", dvd);
		System.out.printf("%5s = %s%n", "soft", soft);
	}

}
