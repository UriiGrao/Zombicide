package Zombies;

/**
 * @author UriiGrao
 */
public class Unknown extends Zombie {

    private static int golpeoMax = 0;

    public Unknown(int daño, int move) {
        super(daño, move, tiposZombies[2]);
    }

    @Override
    public int calcularGolpeo(String skill) {
        int golpe = super.calcularGolpeo(skill) * getDaño();

        if (golpe > golpeoMax) {
            golpeoMax = golpe;
        }
        return golpe;
    }

    public static int getGolpeoMax() {
        return golpeoMax;
    }

    public void zarpazo() {

    }
}
