public class OperacaoBasica {

    public static double sqrt(double numero) {
        return Math.sqrt(numero);
    }

    public static String numero_primo (int num) {
        if(num <= 1) {
            return "Número invalido. Numero menor ou igual a 1 não é primo";
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return "Número válido, mas o numero não é primo" ;
            }
        }

        return "Numero válido, o numero é primo";
    }

}