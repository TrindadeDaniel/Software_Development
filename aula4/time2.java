package aula4;

public class time2 {

    private int hora;
    private int minuto;
    private int segundos;

    public void setTime(int h, int m, int s) {

        hora = ((h >= 0 && h < 24) ? h : 0);
        minuto = ((m >= 0 && m < 60) ? m : 0);
        segundos = ((s >= 0 && s < 60) ? s : 0);

    }

    // Construtor padrão (sem argumentos)
    public time2() {
        this(0, 0, 0);
    }

    // Construtor com um argumento (hora)
    public time2(int h) {
        this(h, 0, 0);
    }

    // Construtor com dois argumentos (hora e minuto)
    public time2(int h, int m) {
        this(h, m, 0);
    }

    // Construtor com três argumentos
    public time2(int h, int m, int s) {
        setTime(h, m, s);
    }

    // Construtor de cópia
    public time2(time2 time) {
        this(time.getHora(), time.getMinuto(), time.getSegundos());

    }

    public int getHora() {
        return hora;
    
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundos() {
        return segundos;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundos);
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s", ((hora == 0 || hora == 12) ? 12 : hora % 12), minuto, segundos,
                (hora < 12 ? "AM" : "PM"));
    }

    
}
