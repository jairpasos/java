import java.util.Scanner;

public class Romanos 
{
    public static String IntegerToRoman(int n){
        String romanos="";
        int repeat;
        int reglas[]={1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String symbol[]={"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
         
        for(int x=0; x<reglas.length; x++){
            repeat=n/reglas[x];
            for(int i=1; i<=repeat; i++){
                romanos=romanos + symbol[x];
            }
            n=n%reglas[x];
        }
        return romanos;
    }
 
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un número normal:");
        int integer = input.nextInt();
        System.out.println(integer + "= " + IntegerToRoman(integer));
    }
}