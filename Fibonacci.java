package Fibonacci;
import java.math.BigInteger;
import java.util.*;
public class Fibonacci {
	public static BigInteger of(int num)
    {
          BigInteger firstNumber=new BigInteger("1");        
          BigInteger secondNumber = new BigInteger("1");
          BigInteger middleNumber; 
          for(int i = 3;i<= num;i++){
              middleNumber = secondNumber;
        	  secondNumber =   firstNumber. add(secondNumber);
              firstNumber = middleNumber;
           }
           return  secondNumber;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("打印输出1-200的Fibonacci数列");
         BigInteger value;
         Fibonacci fibonacci=new Fibonacci();
         for(int i=1;i<=200;i++)
         {
           value=fibonacci.of(i);
           System.out.println("Fibonacci.of("+i+") == "+value);
         }
	}
}
