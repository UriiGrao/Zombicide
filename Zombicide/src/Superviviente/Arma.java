package Superviviente;

/**
 * Aqui generamos las armas que usaremos en el juego.
 *
 * @author UriiGrao
 */
public final class Arma {

    /**
     * Aqui guardamos las armas para ponerle daño, alcance, Nombre.
     */
    private int Damage;
    private int Alcance;
    private String Nombre;
    public static final String[] Armas = {"SARTEN", "PISTOLA", "ESCOPETA", "KATANA", "HACHA"};
    // ArrayList<String> nombre array  new ArrayList<>(Arrays.asList("SARTEN", "PISTOLA", "ESCOPETA", "KATANA"));

    /**
     * Generador de arma SARTEN por defecto de los noobs. 
     */
    public Arma() { // tipica arma de noob
        
        this.Nombre = "SARTEN";
        this.Alcance = 0;
        this.Damage = 1;
        armarse();
    }

    /**
     *
     * @param alcance
     * @param damage
     */
    public Arma(int alcance, int damage) {
        // arma para sarten modificando parametros

        this.Nombre = "SARTEN";
        this.Alcance = alcance;
        this.Damage = damage;
        armarse();
    }
    
    /**
     * mensaje al generar arma. soy el oriol y me gustan los cargols  y los mussols 
     */
    public void armarse() {
        //mensaje al generar armas.

        System.out.print("Al Ataquer!");
    }

    public void setArma(String Nombre) {
        //set arma tipico de cada arma

        switch (Nombre) {
            case "SARTEN":
                this.Nombre = Armas[0];
                this.Alcance = 1;
                this.Damage = 1;
                break;
            case "PISTOLA":
                this.Nombre = Armas[1];
                this.Alcance = 2;
                this.Damage = 1;
                break;
            case "ESCOPETA":
                this.Nombre = Armas[2];
                this.Alcance = 2;
                this.Damage = 7;
                break;
            case "KATANA":
                this.Nombre = Armas[3];
                this.Alcance = 1;
                this.Damage = 4;
                break;
            case "HACHA":
                this.Nombre = Armas[4];
                this.Alcance = 1;
                this.Damage = 2;
                break;
        }
    }

    public int getDamage() {
        // para coger el daño de cada arma.

        return this.Damage;
    }

    public int getAlcance() {
        //
        return this.Alcance;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setDamage(int damage) {
        this.Damage = damage;
    }

    public void setAlcance(int alcance) {
        this.Alcance = alcance;
    }
}
