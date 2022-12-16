class Box<T>
{
	private T obj;	

	public Box()
	{
		obj = null;
	}
	
	public Box(T obj)
	{
		this.obj = obj;
		
	}			
	
	public void set(T obj)
	{
		this.obj = obj;
	}
	
	public T get()
	{
		return obj;
	
	}

}

class BoxFactroy
{
	public static <T> Box<T> makeBox()
	{
		Box<T> box = new Box<T>();
		return box;
		
	}
	
	public static <T> Box<T> makeBox(T obj)
	{
		Box<T> box = new Box<T>(obj);
		return box;
		
	}
	
}


public class Example02 {

	public static void main(String[] args) {
		
		// Target-type이 정해지지 않는 구형 자바. (JAVA5 이하)
		Box<Integer> aBox = BoxFactroy.<Integer>makeBox(20);
		
		// Target-type이 만들어진 자바. (JAVA-7 이상)
		Box<Integer> iBox = BoxFactroy.makeBox(20);	
		
		// parameter 없이도 Target-type을 찾을 수 있음. (최신 자바)
		Box<Double> dBox = BoxFactroy.makeBox();
		
		
		
		dBox.set(3.4);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());
		
		
	}

}
