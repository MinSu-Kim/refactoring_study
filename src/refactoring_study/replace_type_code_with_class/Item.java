package refactoring_study.replace_type_code_with_class;

public class Item {
	private ItemType itemType;
	private final String title;
	private final int price;

	public Item(ItemType typecode, String title, int price) {
		this.itemType = typecode;
		this.title = title;
		this.price = price;
	}

	public ItemType getTypecode() {
		return itemType;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", itemType.ordinal(), title, price);
	}
}
