import java.util.Scanner;

public class MorseTexto
{
    public static void main(String[] args) {
        char [] letras = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ' ' };
        String [] morse = { ".-" , "-..." , "-.-." , "-.." , "." , "..-." , "--." , "...." , ".." , ".---" , "-.-" , ".-.." , "--" , "-." , "---" , ".--." , "--.-" ,  ".-." , "..." , "-" , "..-" , "...-" , ".--" , "-..-" , "-.--" , "--.." , ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", " " };

        Scanner input = new Scanner (System.in);
        
        System.out.println( "Por favor ingrese un código morse." );
            String codigom = input.nextLine();
            String[] frase = null;
            if(codigom.contains(" ")){
                frase = codigom.split("[ ]");
                }
                else{
                        frase = new String[1];
                        frase[0] = codigom;
                    }
                for (String word: frase )
                    {
                        String[] characters = word.split(" ");
                        for(int h = 0;h < characters.length;h++){
                        for(int i = 0;i < morse.length;i++){
                        if(characters[h].equals(morse[i])){
                            System.out.print(letras[i]);
                          }
                        }
                        }
                        System.out.print(" ");    
                    }
                    
        System.out.println("\nPor favor ingrese una palabra o frase en texto normal.");
        String texto = input.nextLine(); 

        texto = texto.toLowerCase ();

        for ( int x = 0; x < texto.length(); x++ )
            {
                for ( int y = 0; y < letras.length; y++ )
                {
                    if ( letras [ y ] == texto.charAt ( x ) ){
                        System.out.print ( morse [ y ] + " " );
                        }
                    }
                }  
        }
}
