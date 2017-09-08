package TypeCasting;
//program to implement type casting between different variables
import java.util.Scanner; //importing scanner class

public class TypeCasting {

	public static void main(String[] args) //Start of main class
	{
		// TODO Auto-generated method stub
		byte byte_num;short short_num;int int_num;float float_num;long long_num;double double_num;
		Scanner sc=new Scanner(System.in);//creating objects of scanner class
		System.out.println("Enter value of byte datatype");//user input for Byte data type
		byte_num=sc.nextByte();
		System.out.println("Enter value of short datatype ");//user input for Short data type
		short_num=sc.nextShort();
		sc.close();
		int_num = (int)((int)byte_num + (int)short_num);
		System.out.println("Sum of numbers of byte "+ byte_num+" and short "+short_num+" datatype typecasted to int is : "+int_num);
		float_num = (float)((float)short_num + (float)int_num);
		System.out.println("Sum of numbers of short "+ short_num+" and int "+ int_num+" datatype typecasted to float is : "+float_num);
		long_num = (long)((long)int_num + (long)float_num);
		System.out.println("Sum of numbers of int "+ int_num+" and float "+ float_num+" datatype typecasted to long is : "+long_num);
		double_num = (double)((double)float_num + (double)long_num);
		System.out.println("Sum of numbers of float "+ float_num+" and long "+ long_num+" datatype typecasted to double is : "+double_num);
			
	}

}
