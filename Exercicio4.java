public class Exercicio4 {

    public static void main(String[] args) {
        String resultado1 = processar(null);
        System.out.println("Resultado 1: " + resultado1);
        
        String resultado2 = processar("Hello World");
        System.out.println("Resultado 2: " + resultado2);
        
        String resultado3 = processar("Geovana");
        System.out.println("Resultado 3: " + resultado3);
    }
    

    public static String processar(String s) {
        if (s == null) {
            return null;
        }
        
        String resultado = s.toUpperCase();
        return resultado;

    }


}
