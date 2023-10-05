package _09_Genericite;

public class MyGeneric<T> { // Par convtion 'T' symbolise le type généric

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public MyGeneric(T data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "MyGeneric [data=" + data + "]";
	}
	
	boolean egal(MyGeneric<T> other) {
		return this.data.equals(other.data);
	}
}
