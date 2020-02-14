
package ejercicio40;


public class App {
 
    public static void main(String[] args) {
        try { 
            // Null pointer exception ....
         //   String text = null;
         
         //   System.out.println(text.length());
         
            // Arithmetic exception ... (divide by zero)
         //   int value = 7/0;
 
            // You can actually handle RuntimeExceptions if you want to;
            // for example, here we handle an ArrayIndexOutOfBoundsException
            String[] texts = { "one", "two", "three" };
 
        
            System.out.println(texts[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.toString());
                System.out.println("error!!!");
            } catch (NullPointerException n){
                System.out.println("Variable no inicializada");
            } catch (ArithmeticException a){
                System.out.println("No se puede dividir por cero");
            }
    }
}
