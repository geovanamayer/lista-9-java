public class Exercicio2 {

    public static void main(String[] args) {
        formarNovaPalavra("abcdefgh");
        formarNovaPalavra("geovanna");
        formarNovaPalavra("abc");
    }
    

    public static void formarNovaPalavra(String palavra) {
        if (palavra.length() < 8) {
            System.out.println("A palavra deve ter no mínimo 8 caracteres.");
            return;
        }
        
        String novaPalavra = palavra.substring(0, 2) + palavra.substring(palavra.length() - 2);
        
        System.out.println("Palavra original: " + palavra);
        System.out.println("Nova palavra formada: " + novaPalavra);
    
    }


}
