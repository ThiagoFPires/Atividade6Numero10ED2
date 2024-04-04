public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    // utilizado construtor para inicializar os comprimentos dos lados do triângulo
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // função para calcular a área do triângulo
    public double calcularArea() {
        double s = (this.lado1 + this.lado2 + this.lado3) / 2.0;
        double area = Math.sqrt(s * (s - this.lado1) * (s - this.lado2) * (s - this.lado3));
        return area;
    }

    // função para calcular o perímetro do triângulo
    public double calcularPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    // função para determinar o tipo do triângulo (Equilátero, Isósceles, Escaleno)
    public String tipoTriangulo() {
        if (this.lado1 == this.lado2 && this.lado1 == this.lado3) {
            return "Equilátero";
        } else if (this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3) {
            return "Escaleno";
        } else {
            return "Isósceles";
        }
    }

    // função para verificar se o triângulo é equilátero
    public String ehEquilatero() {
        return this.lado1 == this.lado2 && this.lado1 == this.lado3 ? "Sim" : "Não";
    }
}