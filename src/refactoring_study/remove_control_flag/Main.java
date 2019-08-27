package refactoring_study.remove_control_flag;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();

			SimpleDatabase db = new SimpleDatabase(new FileReader(fileUrl));
//        	SimpleDatabase db = new SimpleDatabase(new FileReader("dbfile.txt"));
			Iterator<String> iterator = db.iterator();
			while (iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n", key, db.getValue(key));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		loadProperties();
	}

	private static void loadProperties() {
		//SimpleDatabase--> Properties·Î º¯°æ
		String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();

		Properties properties = new Properties();
		try (FileReader reader = new FileReader(fileUrl)) {
			properties.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Entry<Object, Object> e : properties.entrySet()) {
			System.out.printf("KEY : %s%nVALUE : %s%n%n", e.getKey(), e.getValue());
		}
	}

}
