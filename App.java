public class Exercicio1 {

    public static void main(String[] args) {
        verificar("Hoje tem aula de POOI");
        verificar("verdade");
        verificar("aeiou");
    }
    
    
    public static void verificar(String frase) {
        int tam = frase.length();
        int qtde = 0;
        
        System.out.println("Total de caracteres da string \"" + frase + "\": " + tam);
        
        for (int i = 0; i < tam; i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                qtde++;
            }
        }
        
        System.out.println("Quantidade de vogais: " + qtde);

    }


}
