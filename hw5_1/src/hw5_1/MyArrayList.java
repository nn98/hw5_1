package hw5_1;

public class MyArrayList<T> {
	private int[] array;
	private int number;
	public MyArrayList() {
		array=new int[10];
		number=0;
	}
	public boolean add(int n) {
		if (number>=array.length) {
			int[] expand=new int[array.length*2];
			for(int i=0;i<array.length;i++) expand[i]=array[i];
			array=expand;
			return true;
		}
		else {
			array[number]=n;
			number++;
			return true;
		}
	}
	public void add(int index, int n) {
		if(index>number)
			try {
				throw new Exception("IndexOutOfBoundsException");
			} catch (Exception e) {
			}
		if (number>=array.length) {
			int[] expand=new int[array.length*2];
			for(int i=0;i<array.length;i++) expand[i]=array[i];
			array=expand;
		}
		else {
			array[index]=n;
			number++;
		}
	}
	public int get(int index) {
		if(index>number)
			try {
				throw new Exception("IndexOutOfBoundsException");
			} catch (Exception e) {
			}
		return array[index];
	}
	public int size() {
		return array.length;
	}
	public int remove(int index) {
		if(index>number)
			try {
				throw new Exception("IndexOutOfBoundsException");
			} catch (Exception e) {
			}
		int n=array[index];
		for (int i=index;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		return n;
	}
	@Override
	public String toString() {
		StringBuffer s=new StringBuffer();
		for(int i=0;i<number;i++) 
			s.append(array[i]);
		return s.toString();
	}
}
