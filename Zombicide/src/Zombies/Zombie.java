package Zombies;

/**
 * @author UriiGrao
 */
public class Zombie { // classe zombie

    private int daño;
    private int movimiento;
    private final String tipoZombie;
    public static String[] tiposZombies = {"CAMINANTE", "GORDO", "UNKNOWN"};
    private Horda horda = new Horda();

    public Zombie(int daño, int move, String tipoZombie) { // generar un zombie pasandole daño y move
        this.daño = daño;
        this.movimiento = move;
        this.tipoZombie = tipoZombie;

        horda.camina();
    }

    public int getDaño() {
        return this.daño;
    }

    public int getMovimiento() {
        return this.movimiento;
    }

    public String getTipoZombie() {
        return this.tipoZombie;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public void setMovimiento(int move) {
        this.movimiento = move;
    }

    public int calcularGolpeo(String skill) { // para calcular el golpeo maximo
        int dañoA = 0;
        switch (skill) {
            case "RAPIDO":
                dañoA = 5;
                break;
            case "BUSCADOR":
                dañoA = 3;
                break;
            case "FORTACHON":
                dañoA = 7;
                break;
            case "AMBIDIESTRO":
                dañoA = 8;
                break;
            case "ESCURRIDIZO":
                dañoA = 9;
                break;
        }
        int golpe = (int) Math.floor(Math.random() * (11 - 1)) + 1;

        int golpeMax = 10 * dañoA + golpe;

        return golpeMax;
    }

    public Horda getHorda() {
        return horda;
    }
}
