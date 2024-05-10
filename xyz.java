package demo; 

public class Xyz{
	private String name; 
	@Override 
	public String toString(){
		return name; 
	}
	public static void main(String[] args){
		Xyz obj = new Xyz();
		obj.name = "Welcome"; 
		System.out.println(obj); 
	}
}
