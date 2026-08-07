import java.util.Scanner;
public class Celsiusconversion{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("temp in celsius");
int c = sc.nextInt();
int fahrenheit = ((c*9/5)+32);
System.out.println("temp in fehrenheit:" +fahrenheit);
}
}
