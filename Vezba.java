package dedomraz;

class nigg {

 private int num;
 public int num2;
 
 public nigg() {
	 
	 num=0;
	 num2=100;
 }
 
 int getNum() {
	 
	 return num;
 }
 
 void setNum(int i) {
	 
	 num=i;
	 num2=10*i;
 
}
}
 public class babamrazica {
	 public static void main(String[] args) {
	nigg A = new nigg();
	System.out.println(A.getNum());
	A.setNum(10);
	System.out.println(A.getNum());
	System.out.println(A.num2);
		 
		 
	 }
 }

