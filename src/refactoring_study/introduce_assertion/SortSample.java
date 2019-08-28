package refactoring_study.introduce_assertion;

import java.util.Arrays;

public class SortSample {
	private final int[] data;
    private static boolean ASSERT = false; //����� ���� �Ϸ��� false

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
//			System.out.println(Arrays.toString(data) + " m = " + m);
			if (ASSERT) {
				assert isMin(m, x, data.length-1) : this + ", x = " + x; // data[m]�� data[x] ~ data[data.length-1]�� �ּҰ�
			}
			int v = data[m]; 
			data[m] = data[x];
			data[x] = v;
			if (ASSERT) {
				assert isSorted(0, x+1): this + ", x = " + x;// ���⼭ data[0] ~ data[x + 1]�� �̹� ���� �Ǿ� �־�� ��
			}
//			System.out.println(Arrays.toString(data));
		}
	}

    private boolean isMin(int pos, int start, int end) {
        for (int i=start ; i<end+1; i++) {
            if (data[pos] > data[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isSorted(int start, int end) {
        for (int i=start ; i<end; i++) {
            if (data[i] > data[i+1]) {
                return false;
            }
        }
        return true;
    }

    
	public String toString() {
		return String.format("%s", Arrays.toString(data));
	}

	public int[] getData() {
		return data;
	}
}