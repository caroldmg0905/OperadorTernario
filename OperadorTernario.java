    import java.util.Scanner;

public class OperadorTernario {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();

        String indicacao = (idade >= 18)? "adulto"
        : "criança/adolescente";
        System.out.println("Resultado: " + indicacao);
    }
}
