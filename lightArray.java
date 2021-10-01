import java.util.Arrays;
import java.util.Scanner;
public class lightArray{
	public static void main(String[] args){
		int[][] matrix = 
			{{0, 0},
			{0, 0},
			{0, 0}};
		Scanner in = new Scanner(System.in);
		printArray(matrix);
		
		System.out.println("Enter which light you would like to turn on");
		int row = in.nextInt();
		int col = in.nextInt();	
		System.out.println();
		System.out.println("updated lights \n");
		matrix[row][col] = 1;
		printArray(matrix);
		
		System.out.println("Which row/col would you like to turn on or off");
		printArraySwitches(matrix);
		char input3 = in.next().charAt(0);
		switchPos(matrix, input3);
		printArray(matrix);
		boolean flag = false;
		do{
		System.out.println("Which row/col would you like to turn on or off, press X to exit");
		printArraySwitches(matrix);
		input3 = in.next().charAt(0);
		if(input3 == 'X'){
			flag = true;
		}
		switchPos(matrix, input3);

		}while(!flag);
	
	}

	public static void printArray(int[][] matrix){
	for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){

			System.out.print(" " + matrix[i][j] + " ");

			}
			System.out.println();
		}
	}
	public static void printArraySwitches(int[][] matrix){
		String[] labels = {"A: ", "B: ", "C: ", "D: "};
		String[] cols = {"E: ", "F: "};
		for(int x = 0; x < cols.length; x++){
		if(x < 1){
		System.out.print("   " + cols[x] + " "); 

		}else{
			System.out.print(cols[x]); 
		}
		}
		System.out.println();
		for(int i = 0; i < matrix.length; i++){
			System.out.print(labels[i]);
			for(int j = 0; j < matrix[i].length; j++){	
			System.out.print(" " + matrix[i][j] + " ");

			}
			System.out.println();
		}
	}
	public static void switchPos(int[][] matrix, char input){
		char input2 = input;
		int j = 0;
		int k = 0;
		switch(input2) {
			case 'A': 
				for(int i = 0; i < matrix[i].length; i++){
					if(matrix[j][i] == 0){
						matrix[j][i] = 1;
					}else{
						matrix[j][i] = 0;
					}
				}
				break;
			case 'B': 
				j = 1;
				for(int i = 0; i < matrix[i].length; i++){
					if(matrix[j][i] == 0){
						matrix[j][i] = 1;
					}else{
						matrix[j][i] = 0;
					}
				}
				break;

			case 'C': 
				j = 2;
				for(int i = 0; i < matrix[i].length; i++){
					if(matrix[j][i] == 0){
						matrix[j][i] = 1;
					}else{
						matrix[j][i] = 0;
					}
				}
				break;

			case 'E': 
				for(int i = 0; i < matrix.length; i++){
					if(matrix[i][k] == 0){
						matrix[i][k] = 1;
					}else{
						matrix[i][k] = 0;
					}
				}
				break;


			case 'F': 
				k = 1;
				for(int i = 0; i < matrix.length; i++){
					if(matrix[i][k] == 0){
						matrix[i][k] = 1;
					}else{
						matrix[i][k] = 0;
					}
				}
				break;
			default: System.out.println("Invalid Row/Col");
				 break;


		}	
	}
}

