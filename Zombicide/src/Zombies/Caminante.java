package Zombies;

/**
 * @author UriiGrao
 */
public class Caminante extends Zombie {

    private int golpeoMax = 0;

    public Caminante(int daño, int move) {
        super(daño, move, tiposZombies[0]);
    }

    @Override
    public int calcularGolpeo(String skill) {
        int golpe = super.calcularGolpeo(skill) + 5;
        if (golpe > golpeoMax) {
            golpeoMax = golpe;
        }
        return golpe;
    }

    public int getGolpeoMax() {
        return golpeoMax;
    }

}
