package FOR;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Jeremy","Dilshad","Irina"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};
for (int i:numbers) {
	if (i%2==0)
		if(i%2==0) {
			//odd numbers
			//update odd number values with 999 here
			
			System.out.println("before" +numbers[i]);
			numbers[i]=999;
			System.out.println("after" + numbers[i]);
		}
	}


int[][] multiArray = {{1,2,3},{4,5,6}};
System.out.println(multiArray[0][2]);
System.out.println(multiArray[1][2]);

for(int i=0;i<multiArray.length; i++) {
	System.out.println(multiArray[i]);
	for(int y=0;y<multiArray[i].length; y++) {
		System.out.println(multiArray[i][y]);
		
		for(int x=0;x<multiArray.length; x++) {
			System.out.println(X); 
			
		for(int y =0; y<multiArray[x].length;y++) {
			System.out.println();
		}
		}
		String[][ usernames = {{"root","admin"},{"guest","user"}};
		for (int x=0;x<usernames.length; x++) {
			System.out.println(x);
			for(int y=0;y<usernames[x].length;y++) {
				System.out.println(x +":" +y);;
				System.out.println(usernames[x][y]);
			}
		}
	}
	
}
}
	
	
	
	
	
	}


