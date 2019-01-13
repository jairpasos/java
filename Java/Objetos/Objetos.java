import java.util.Scanner;

 class Cuadrado 
 {
      public static Scanner input = new Scanner(System.in);
      
      public int length = input.nextInt();
      
      void calcularArea()  
      { 
           int area = length * length;  
   
           System.out.println("Area de Cuadrado = " + area);  
      }
      void calcularPerimetro() {
          int per = 4 * length;
          System.out.println("Perimetro del Cuadrado = " + per);
      }
 }  
   
 class Cubo extends Cuadrado  
 {  
      void calcularVolumen()  
      {
           int vol = length * length * length;  
   
           System.out.println("Volumen de Cubo : " + vol);  
      }
      void calcularPerimetroC() {
          int per = 6 * (length * length);
          System.out.println("Perimetro de Cubo = " + per);
      }
 }  

 class Objetos  
 {  
      public static void main(String[] args)  
      {
        Scanner in = new Scanner(System.in);
        Cubo sq = new Cubo();
        Cuadrado cd = new Cuadrado();
           
            System.out.println("1. Volumen de Cubo\n"
                    + "2. Perímetro de Cubo\n"
                    + "3. Perímetro de Cuadrado\n"
                    + "4. Área de Cuadrado\n"
                    + "0. Salir");
            
            boolean salir = false;
            int menuItem;
            do {
                  System.out.print("Elija un elemento del menú: ");
                  menuItem = in.nextInt();
                  switch (menuItem) {
                  case 1:
                        sq.calcularVolumen();
                        break;
                  case 2:
                        sq.calcularPerimetroC();
                        break;
                  case 3:
                        cd.calcularPerimetro();
                        break;
                  case 4:
                        cd.calcularArea(); 
                        break;
                  case 0:
                        salir = true;
                        break;
                  default:
                        System.out.println("Opción no válida.");
                  }
            } while (!salir);
            System.out.println("Gracias!");
      }  
 } 