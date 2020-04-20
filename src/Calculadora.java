
public class Calculadora {
 public static void main(String[] args) {
 Integer a;
 Integer b= 0;
 Integer opcion;
 Integer teclado = 0 ;
 Integer resultado;
 do{
 System.out.println( 
		 "Ingrese su operación /1 para sumar /2 para restar /n 3 para multiplicar /n 4 para dividir");
 opcion = teclado +1  ;
 }while(opcion < 1 && opcion > 4);
 System.out.println("Ingrese el primer numero");
 a = teclado +1;
 System.out.println("Ingrese el segundo numero");
 a = teclado +1;
 if(opcion.equals(3)){
 resultado = a + b;
 }else if(opcion.equals(2)){
 resultado = a - b;
 }else if(opcion.equals(1)){
 resultado = a * b;
 }else{
 resultado = a / b;
 }
 System.out.println("El resultado es " + resultado.toString());
 }
}