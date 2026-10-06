import java.util.Scanner;

public class Simulado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] energias = new double[10];

        double soma = 0;
        double maiorEnergia = 0;
        int sensorMaior = 0;
        int quantidadeAcima100 = 0;

        System.out.println("SISTEMA DE MONITORAMENTO DE NEUTRINOS - ICECUBE");
        System.out.println("Informe os níveis de energia registrados (em TeV):");

        for (int i = 0; i < 10; i++) {

            System.out.print("Sensor [" + i + "]: ");
            energias[i] = entrada.nextDouble();

            soma = soma + energias[i];

            if (i == 0 || energias[i] > maiorEnergia) {
                maiorEnergia = energias[i];
                sensorMaior = i;
            }

            if (energias[i] > 100.0) {
                quantidadeAcima100++;
            }
        }

        double media = soma / 10;

        System.out.println();
        System.out.println("=== RELATÓRIO DE DETECÇÃO DE PARTÍCULAS FANTASMA ===");

        System.out.println("Média de energia capturada: " + media + " TeV");

        System.out.println("Maior pico de energia: " + maiorEnergia
                + " TeV (registrado no Sensor [" + sensorMaior + "])");

        System.out.println("Total de sensores com evento > 100 TeV: "
                + quantidadeAcima100);

        entrada.close();
    }
}