import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // solicita ao usuário os comprimentos dos lados do triângulo
        String lado1Str = JOptionPane.showInputDialog("Insira o comprimento do lado 1:");
        double lado1 = Double.parseDouble(lado1Str);

        String lado2Str = JOptionPane.showInputDialog("Insira o comprimento do lado 2:");
        double lado2 = Double.parseDouble(lado2Str);

        String lado3Str = JOptionPane.showInputDialog("Insira o comprimento do lado 3:");
        double lado3 = Double.parseDouble(lado3Str);

        // verifica se os lados fornecidos formam um triângulo válido
        if (verificarValidadeTriangulo(lado1, lado2, lado3)) {
            // para mostrar se os lados formarem um triângulo válido, cria um objeto Triangulo
            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

            // exibe informações sobre o triângulo (tipo, área, perímetro, se é equilátero)
            JOptionPane.showMessageDialog(null, "Tipo de Triângulo: " + triangulo.obterTipoTriangulo());
            JOptionPane.showMessageDialog(null, "Área: " + triangulo.calcularArea());
            JOptionPane.showMessageDialog(null, "Perímetro: " + triangulo.calcularPerimetro());
            JOptionPane.showMessageDialog(null, "É Equilátero? " + triangulo.verificarEquilatero());
        } else {
            // para mostrar se os lados fornecidos não formarem um triângulo válido, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(null, "Os lados fornecidos não formam um triângulo válido!");
        }
    }

    // função para verificar se os comprimentos dos lados formam um triângulo válido
    public static boolean verificarValidadeTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}

