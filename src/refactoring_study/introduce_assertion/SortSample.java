package refactoring_study.introduce_assertion;

import java.util.Arrays;

public class SortSample {
	private final int[] data;

	public SortSample(int[] data) {
		this.data = new int[data.length];
		System.arraycopy(data, 0, this.data, 0, data.length);
	}

//  선택 정렬
	public void sort() {
		for (int x = 0; x < data.length - 1; x++) {
			int m = x;
			for (int y = x + 1; y < data.length; y++) {
				if (data[m] > data[y]) {
					m = y;
				}
			}
			int v = data[m]; // data[m]는 data[x] ~ data[data.length-1]의 최소값
			data[m] = data[x];
			data[x] = v;
			// 여기서 data[0] ~ data[x + 1]은 이미 정렬 되어 있어야 함
		}
	}

	public String toString() {
		return String.format("%s", Arrays.toString(data));
	}

	public int[] getData() {
		return data;
	}
}
