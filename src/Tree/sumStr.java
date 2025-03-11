package Tree;

public class sumStr {

	public static void main(String[] args) {
		

String s = "12345678";

//int output = 20

char[] Array=s.toCharArray();

int sum=0;
//System.out.println(Array);

for(int i=0;i<Array.length;i++){
	//System.out.println(Array[i]);
	int temp=(Array[i])-'0';
	System.out.println(temp);
	
  sum =  sum + temp;
 // System.out.println(sum);

}
System.out.print(sum);

		// TODO Auto-generated method stub

	}

}
