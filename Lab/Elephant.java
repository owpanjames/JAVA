
public class Elephant extends Animal{
	
		private String name;
	
		public void speak(){
			super.speak();
			System.out.println("¦W¦r:"+name);
		}
			
			
		public Elephant (int age , float weight , String name ) {
          super(age, weight);
          this.name = name ;
    }
    public String getName(){
//    	String name = super.getData();
    	return name;
    }
}