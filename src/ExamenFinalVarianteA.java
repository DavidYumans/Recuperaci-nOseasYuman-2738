public class ExamenFinalVarianteA {
    private double numero1;
    private double numero2;
    private char operador;
    private double resultado;

    public ExamenFinalVarianteA(double numero1, double numero2, char operadora) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operadora;
    }

    public void verificar() {
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("El resultado de esta división será 0");
                    return;
                }
                break;
            default:
                System.out.println("La operación seleccionada no es valida");
                return;
        }
        System.out.println("El resultado es : " + resultado);
    }
}
