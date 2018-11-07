;package Superviviente;

import java.util.Scanner;

/**
 * @author UriiGrao
 */
public class Superviviente {

    Scanner entrada = new Scanner(System.in);

    private String Nombre;
    private int Nivel;
    private int Vidas;
    private String Skill;
    private Arma arma;

    public static final String[] Skills = {"RAPIDO", "BUSCADOR", "FORTACHON", "ESCURRIDIZO", "AMBIDIESTRO"};

    public Superviviente(String nombre) { // generar superviviente noob
        this.Nombre = nombre;
        this.Nivel = 0;
        this.Vidas = 3;
        this.Skill = Skills[0];
    }

    public Superviviente(String nombre, int nivel, int vidas, String skill) { // generar superviviente PRO
        this.Nombre = nombre;
        this.Nivel = nivel;
        this.Vidas = vidas;
        this.Skill = skill;
    }

    public String getNombreArma() {
        return arma.getNombre();
    }

    public void setArma(String arma) {
        this.arma = new Arma();
        this.arma.setArma(arma);
    }

    public Arma getArma() {
        return this.arma;
    }

    public void deleteArma() {
        this.arma = null;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public int getNivel() {
        return this.Nivel;
    }

    public int getVidas() {
        return this.Vidas;
    }

    public String getSkill() {
        return this.Skill;
    }

    public void setNivel(int nivel) {
        this.Nivel = nivel;
    }

    public void setVidas(int vidas) {
        this.Vidas = vidas;
    }

    public void setSkill(String skill) { 
        boolean isSkill = false;
        skill = skill.toUpperCase();
        for (String habilidad : Skills) {
            if (Skills.equals(habilidad)) {
                this.Skill = skill;
                isSkill = true;
                break;
            }
        }
        if (!isSkill) {
            System.out.println("No existe La Habilidad");
        }
    }

}
