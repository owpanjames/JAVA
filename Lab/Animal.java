
public class Animal{
	private int age;
	private float weight;
	
			public	void	setAge(int age){
					this.age = age;
			}
			
			public	int	  getAge(){
						return age;	
			}
			
			public	void	setWeight(float weight){
						this.weight = weight;
			}
			
			public	float	  getWeight(){
						return weight	;
			}
			
			public void speak(){
						System.out.println("�~��:"+age+"��");
						System.out.println("�魫:"+weight+"����");	
			}
			
			public Animal(){
				
			}
			public Animal(int age,float weight){
						this.age = age;
						this.weight = weight;
			}
			
			public String getName(){return "";}
}