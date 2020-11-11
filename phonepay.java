class phonepay{
	public static void payment(int PhoneNo){
	System.out.println(" recharged your prepaid no");
	}
	public static void payment(String DTH){
	System.out.println(" Your DTH recharged successfully " + DTH);
	}
	public static void payment(String id,String Name,int amount){
	System.out.println("  Electricity bill of " + id + " Name:" + Name+ " amount of "+amount);
	}
	public static void payment(int creditno,int amount){
	System.out.println("  bill paid successfully " );
	}
	public static void main(String args[]){
	phonepay.payment( 123456789 );
	phonepay.payment("123XAY");
	phonepay.payment( "12zx"," kiran sir",566);
	phonepay.payment(789525 , 10000);
	}
	}