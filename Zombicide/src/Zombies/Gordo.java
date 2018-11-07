package Zombies;

/**
 * @author UriiGrao
 */
public class Gordo extends Zombie {

    private static int golpeoMax = 0;

    public Gordo(int daño, int move) {
        super(daño, move, tiposZombies[1]);
    }

    @Override
    public int calcularGolpeo(String skill) {
        int golpe = super.calcularGolpeo(skill) + (getMovimiento() * 2);

        if (golpe > golpeoMax) {
            golpeoMax = golpe;
        }
        return golpe;
    }

    public static int getGolpeoMax() {
        return golpeoMax;
    }

}
