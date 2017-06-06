
public class FizzBuzzPlazz {

	public String compare(int var) {
		// TODO Auto-generated method stub
		String ret = new String();
		
		for (int i=1;i<=var;i++)
		{
			String j = String.valueOf(i);
			if (i % 3 == 0)
				j="Fizz";
			if(i%5 == 0)
				j="Buzz";
			if (i%7 == 0)
				j = "Plazz";
			if(i==1){
				ret = j;
			}
			else{
				 ret = ret +","+ j ;				
			}		
		}
		return ret;	
	}

}
