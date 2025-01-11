import java.util.HashMap;
import java.util.Map;

/**
 * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
 * • SP – R$67.836,43
 * • RJ – R$36.678,66
 * • MG – R$29.229,88
 * • ES – R$27.165,48
 * • Outros – R$19.849,53
 *
 * Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  
 */
public class PercentualBackend {
    public static void main(String[] args) {
        Map<String, Double> faturamentoEstados = new HashMap<>();
        faturamentoEstados.put("SP", 67836.43);
        faturamentoEstados.put("RJ", 36678.66);
        faturamentoEstados.put("MG", 29229.88);
        faturamentoEstados.put("ES", 27165.48);
        faturamentoEstados.put("Outros", 19849.53);
        double faturamentoTotal = faturamentoEstados.values().stream().mapToDouble(Double::doubleValue).sum();
        for (Map.Entry<String, Double> entry : faturamentoEstados.entrySet()) {
            double percentual = (entry.getValue() / faturamentoTotal) * 100;
            System.out.printf("%s: %.2f%%\n", entry.getKey(), percentual);
        }
    }
}

