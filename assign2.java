public class Primeno 
{
public static void main(String[] args) //main method
{ 
  int num=27;
  checkPrime(num);
}
private static void checkPrime(int num) 
(//check given number is prime or not)
  {
    int cnt=0;
    if(num<2)
    {
      System.out.println(num + " is not a prime number");
      System.exit(0);
    }
    for(int i=1;i <=n;i++)
      {
        if(n%i==0)
          cnt +=1;
      }
    if(cnt>2)
      System.out.println(num + " is not a prime number");
    else
      System.out.println(num + " is a prime number");
  }
}
