public class Array{

	public static void main (String[] args){
		
	int[][] x ={
								{((int)(30*(Math.random()))),((int)(30*(Math.random()))),((int)(30*(Math.random())))},
								{((int)(30*(Math.random()))),((int)(30*(Math.random()))),((int)(30*(Math.random())))},
								{((int)(30*(Math.random()))),((int)(30*(Math.random()))),((int)(30*(Math.random())))},
								}; 	
	int[][] y ={
								{((int)(30*(Math.random()))),((int)(30*(Math.random()))),((int)(30*(Math.random())))},
								{((int)(30*(Math.random()))),((int)(30*(Math.random()))),((int)(30*(Math.random())))},
								{((int)(30*(Math.random()))),((int)(30*(Math.random()))),((int)(30*(Math.random())))},
								}; 	
	int[][] z=x;
	for(int i =0; i<x.length;i++){
			for(int j = 0 ;j<x[i].length;j++){
				z[i][j] = x[i][j]+y[i][j];
				System.out.print(z[i][j]+" ");
				}
				System.out.println();
		}
	}
}