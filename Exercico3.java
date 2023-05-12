public class Exercicio3 {

    public static void main(String[] args) {
        compararPalavras("Hello", "Hello");
        compararPalavras("Hello", "hello");
        compararPalavras("Java", "java");
        compararPalavras("Geovana", "Geovana");
        compararPalavras("geovana", "geovana");
    }
    

    public static void compararPalavras(String palavra1, String palavra2) {
        System.out.println("Palavra 1: " + palavra1);
        System.out.println("Palavra 2: " + palavra2);
        
        
        boolean equalsResult = palavra1.equals(palavra2);
        System.out.println("Resultado da comparação usando equals: " + equalsResult);
        
        
        boolean equalsIgnoreCaseResult = palavra1.equalsIgnoreCase(palavra2);
        System.out.println("Resultado da comparação usando equalsIgnoreCase: " + equalsIgnoreCaseResult);
        
        System.out.println("-------------------------");

    }


}
