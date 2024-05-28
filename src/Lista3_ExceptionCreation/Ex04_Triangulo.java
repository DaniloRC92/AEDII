package Lista3_ExceptionCreation;

public class Ex04_Triangulo {
    private final double lado1;
    private final double lado2;
    private final double lado3;

    public Ex04_Triangulo(double lado1, double lado2, double lado3) throws Ex04_TrianguloInvalidoError {

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new Ex04_TrianguloInvalidoError("ERRO: Os lados do triângulo não podem ser negativos ou iguais " +
                    "a zero!!!");
        } else if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new Ex04_TrianguloInvalidoError("ERRO: Os lados do triângulo não atendem à desigualdade " +
                    "triangular!!!");
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int determinarTipo() {
        if (lado1 == lado2 && lado2 == lado3) { 
            return 0; // Triângulo Equilatero
        }
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            return 1; // Triângulo Isóscele
        }
        else {
            return 2; // Triângulo Escaleno
        }
    }
}
