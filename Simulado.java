import java.util.Scanner;
public class Simulado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] energias = new double[10];

        double soma = 0;
        double maior = 0;
        int indiceMaior = 0;
        int altissimaEnergia = 0;

        System.out.println("SISTEMA DE MONITORAMENTO DE NEUTRINOS - ICECUBE");
        System.out.println("Informe os níveis de energia registrados (em TeV):");

        for (int i = 0; i < 10; i++) {
            System.out.print("Sensor [" + i + "]: ");
            energias[i] = entrada.nextDouble();

            soma = soma + energias[i];

            if (i == 0 || energias[i] > maior) {
                maior = energias[i];
                indiceMaior = i;
            }

            if (energias[i] > 100.0) {
                altissimaEnergia++;
            }
        }

        double media = soma / 10;

        System.out.println();
        System.out.println("=== RELATÓRIO DE DETECÇÃO DE PARTÍCULAS FANTASMA ===");
        System.out.println("Média de energia capturada: " + media + " TeV");
        System.out.println("Maior pico de energia: " + maior + " TeV (registrado no Sensor [" + indiceMaior + "])");
        System.out.println("Total de sensores com evento > 100 TeV: " + altissimaEnergia);


        entrada.close();
    }
}
