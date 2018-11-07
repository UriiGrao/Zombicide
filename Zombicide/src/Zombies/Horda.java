package Zombies;

/**
 * @author UriiGrao
 */
public class Horda {

    int respawn = 3;

    public void camina() {
        this.respawn--;
    }

    public void resetRespawn() {
        this.respawn = 3;
    }

    public int getRespawn() {
        return respawn;
    }

}
