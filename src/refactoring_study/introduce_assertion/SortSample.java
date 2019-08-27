package refactoring_study.introduce_assertion;

import java.util.Arrays;

public class SortSample {
	private final int[] data;

	public SortSample(int[] data) {
		this.data = new int[data.length];
		System.arraycopy(data, 0, this.data, 0, data.length);
	}

//  ���� ����
	public void sort() {
		for (int x = 0; x < data.length - 1; x++) {
			int m = x;
			for (int y = x + 1; y < data.length; y++) {
				if (data[m] > data[y]) {
					m = y;
				}
			}
			int v = data[m]; // data[m]�� data[x] ~ data[data.length-1]�� �ּҰ�
			data[m] = data[x];
			data[x] = v;
			// ���⼭ data[0] ~ data[x + 1]�� �̹� ���� �Ǿ� �־�� ��
		}
	}

	public String toString() {
		return String.format("%s", Arrays.toString(data));
	}

	public int[] getData() {
		return data;
	}
}
