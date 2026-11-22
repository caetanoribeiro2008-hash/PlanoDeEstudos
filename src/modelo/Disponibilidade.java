
package modelo;
import java.util.LinkedHashMap;
import java.util.Map;

public class Disponibilidade {

    private Map<String, Integer> horasPorDia;

    public Disponibilidade() {
        horasPorDia = new LinkedHashMap<>();

        horasPorDia.put("Segunda-feira", 0);
        horasPorDia.put("Terça-feira", 0);
        horasPorDia.put("Quarta-feira", 0);
        horasPorDia.put("Quinta-feira", 0);
        horasPorDia.put("Sexta-feira", 0);
        horasPorDia.put("Sábado", 0);
        horasPorDia.put("Domingo", 0);
    }

    public void definirHoras(String dia, int horas) {
        horasPorDia.put(dia, horas);
    }

    public int getHoras(String dia) {
        return horasPorDia.get(dia);
    }

    public Map<String, Integer> getHorasPorDia() {
        return horasPorDia;
    }

    public int getTotalHoras() {
        int total = 0;

        for (int horas : horasPorDia.values()) {
            total += horas;
        }

        return total;
    }
}