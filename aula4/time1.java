package aula4;

public class time1 {

    private int hora;
    private int minuto;
    private int segundos;

    public void setTime(int h, int m, int s) {

        hora = ((h >= 0 && h < 24) ? h : 0);
        minuto = ((m >= 0 && m < 60) ? m : 0);
        segundos = ((s >= 0 && s < 60) ? s : 0);

    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundos);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hora == 0 || hora == 12) ? 12 : hora % 12), minuto, segundos,
                (hora < 12 ? "AM" : "PM"));
    }

}
