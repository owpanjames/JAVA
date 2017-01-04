
public class PolyAnimal{

	public static void main(String[] args){
		Animal[] a = new Animal[2];
		a[0]= new Animal(2,5.0f);
		a[1]= new Elephant(8 ,1200.0f, "¤j¶H" );
		for(int i=0;i<a.length;i++){
			System.out.println(a[i].getName());
			}
		
	}



}