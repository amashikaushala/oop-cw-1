class Customer{
	int code;
	String name;
	String address;
	double salary;
}

//—----------------------------------------------------------------Demo.java—-------------------------------------------------------------------------------
class Demo{
	public static void main(String args[]){
		int[] ar=new int[3];
		ar[0]=100;
		System.out.println(ar[0]); //100
		
		Customer c1=new Customer();
		c1.code=1111;
		System.out.println(c1.code);//1111
	}
}
