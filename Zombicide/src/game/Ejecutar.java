package game;

import Superviviente.*;
import Zombies.*;
import java.util.*;


/*
 @author UriiGrao
 */
public class Ejecutar {

    public static ArrayList<Superviviente> Supervivientes = new ArrayList<>();
    public static ArrayList<Zombie> zombies = new ArrayList<>();

    public static ArrayList<Zombie> piso1 = new ArrayList<>();
    public static ArrayList<Zombie> piso2 = new ArrayList<>();
    public static ArrayList<Zombie> piso3 = new ArrayList<>();

    static int numAdañoC;
    static int numAmoveC;
    static int zombieCrear;
    static int numAdañoG;
    static int numAmoveG;
    static int numAdañoU;
    static int numAmoveU;

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("WELCOME TO ZOMBIECIDE!!");
        System.out.println("");
        crearSupervivientes();
        System.out.println("");
        crearPiso1();
        System.out.println("");
        crearPiso2();
        System.out.println("");
        crearPiso3();

        int golpeoM = ((Caminante) (piso1.get(2))).getGolpeoMax(); // Un casteo para desde el padre coger alguna cosa.
    }

    public static void crearSupervivientes() { // para crear 5 supervivientes
        System.out.println("VAMOS A REGISTRAR USUARIOS!");
        System.out.println("");

        int sar = 0;

        for (int j = 0; j < 5; j++) { //for para añadir a PROS
            System.out.println("Superviviente nº " + (j + 1) + " !");
            System.out.println("Nombre o Alias: ");
            String nombre = entrada.next();
            System.out.println("Nivel: ");
            int nivel = entrada.nextInt();
            System.out.println("Vidas: ");
            int vidas = entrada.nextInt();
            System.out.println("Skill: (RAPIDO, BUSCADOR, FORTACHON, ESCURRIDIZO, AMBIDIESTRO)");
            String skill = entrada.next().toUpperCase();
            System.out.println("Arma: (SARTEN, PISTOLA, ESCOPETA, KATANA, HACHA)");
            String arma = entrada.next().toUpperCase();

            if (arma.equals("SARTEN")) { // Para contar las sartenes
                sar++;
            }
            if (sar != 3) { // Para cuando sarten se repita si es 3 como tenemos un -- nunca superara el 3.
                if (isSkill(skill)) { // consulta de si arma y skill estan bien escritos
                    if (isArma(arma)) {
                        Supervivientes.add(new Superviviente(nombre, nivel, vidas, skill));
                        Supervivientes.get(j).setArma(arma);
                    } else {
                        System.out.println("Arma Equivocada");
                        j--;
                    }
                } else {
                    System.out.println("Skill Equivocada");
                    j--;
                }
            } else {
                System.out.println("Sarten Mas de 2 Veces");
                j--;
                sar--;
            }
        }
        for (int i = 0; i < Supervivientes.size(); i++) { // for para ver los Supervivientes.
            System.out.println("Superviviente: " + (i + 1));
            System.out.println("Nombre: " + Supervivientes.get(i).getNombre());
            System.out.println("Nivel: " + Supervivientes.get(i).getNivel());
            System.out.println("Vidas: " + Supervivientes.get(i).getVidas());
            System.out.println("Skills: " + Supervivientes.get(i).getSkill());
            System.out.println("Armas: " + Supervivientes.get(i).getNombreArma());
        }
    }

    public static void crearPiso1() {
        System.out.println("Generando 1r Piso ...loading...");
        for (int i = 0; i < 8; i++) {
            numAdañoC = (int) Math.floor(Math.random() * (3 - 1)) + 1;
            numAmoveC = (int) Math.floor(Math.random() * (5 - 1)) + 1;
            piso1.add(new Caminante(numAdañoC, numAmoveC));
        }
        System.out.println("Mostrando Zombies 1r Piso >.<");
        for (int j = 0; j < piso1.size(); j++) { // for para ver los Zombies.
            System.out.println("Zombie: " + (j + 1));
            System.out.println("Daño: " + piso1.get(j).getDaño());
            System.out.println("Move: " + piso1.get(j).getMovimiento());
            System.out.println("Tipo: " + piso1.get(j).getTipoZombie());
        }
    }

    public static void crearPiso2() {
        System.out.println("Generando 2n Piso ...loading...");
        int countGordo2 = 0;
        int countCaminante2 = 0;

        for (int i = 0; i < 8;) {
            zombieCrear = (int) Math.floor(Math.random() * (2 - 0)) + 0;
            if (zombieCrear == 0 || i >= 6) {
                numAdañoC = (int) Math.floor(Math.random() * (3 - 1)) + 1;
                numAmoveC = (int) Math.floor(Math.random() * (5 - 1)) + 1;
                piso2.add(new Caminante(numAdañoC, numAmoveC)); // crear Caminante
                countCaminante2++;
                i++;
            } else if (zombieCrear == 1) {
                numAdañoG = (int) Math.floor(Math.random() * (6 - 3)) + 3;
                numAmoveG = (int) Math.floor(Math.random() * (2 - 1)) + 1;
                piso2.add(new Gordo(numAdañoG, numAmoveG)); // crear Gordo
                countGordo2++;
                numAdañoC = (int) Math.floor(Math.random() * (3 - 1)) + 1;
                numAmoveC = (int) Math.floor(Math.random() * (5 - 1)) + 1;
                piso2.add(new Caminante(numAdañoC, numAmoveC)); // crear Caminante
                numAdañoC = (int) Math.floor(Math.random() * (3 - 1)) + 1;
                numAmoveC = (int) Math.floor(Math.random() * (5 - 1)) + 1;
                piso2.add(new Caminante(numAdañoC, numAmoveC)); // crear Caminante
                countCaminante2 += 2;
                i += 3;
            }
        }

        System.out.println("Mostrando Zombies 2r Piso >.<");
        for (int j = 0; j < piso2.size(); j++) { // for para ver los Zombies.
            System.out.println("Zombie: " + (j + 1));
            System.out.println("Daño: " + piso2.get(j).getDaño());
            System.out.println("Move: " + piso2.get(j).getMovimiento());
            System.out.println("Tipo: " + piso2.get(j).getTipoZombie());
        }

        System.out.println("Gordos = " + countGordo2);
        System.out.println("Caminantes = " + countCaminante2);
    }

    public static void crearPiso3() {
        System.out.println("Generando 3r Piso ...loading...");
        int countGordo3 = 0;
        int countCaminante3 = 0;
        numAdañoU = (int) Math.floor(Math.random() * (10 - 6)) + 1;
        numAmoveU = (int) Math.floor(Math.random() * (5 - 1)) + 1;
        piso3.add(new Unknown(numAdañoU, numAmoveU)); // crear Unknown

        for (int i = 0; i < 7;) {
            zombieCrear = (int) Math.floor(Math.random() * (2 - 0)) + 0;
            if (zombieCrear == 0 || i >= 5) {
                numAdañoC = (int) Math.floor(Math.random() * (3 - 1)) + 1;
                numAmoveC = (int) Math.floor(Math.random() * (5 - 1)) + 1;
                piso3.add(new Caminante(numAdañoC, numAmoveC)); // crear Caminante
                countCaminante3++;
                i++;
            } else if (zombieCrear == 1) {
                numAdañoG = (int) Math.floor(Math.random() * (6 - 3)) + 3;
                numAmoveG = (int) Math.floor(Math.random() * (2 - 1)) + 1;
                piso3.add(new Gordo(numAdañoG, numAmoveG)); // crear Gordo
                countGordo3++;
                numAdañoC = (int) Math.floor(Math.random() * (3 - 1)) + 1;
                numAmoveC = (int) Math.floor(Math.random() * (5 - 1)) + 1;
                piso3.add(new Caminante(numAdañoC, numAmoveC)); // crear Caminante
                numAdañoC = (int) Math.floor(Math.random() * (3 - 1)) + 1;
                numAmoveC = (int) Math.floor(Math.random() * (5 - 1)) + 1;
                piso3.add(new Caminante(numAdañoC, numAmoveC)); // crear Caminante
                countCaminante3 += 2;
                i += 3;
            }
        }

        System.out.println("Mostrando Zombies 3r Piso >.<");
        for (int j = 0; j < piso3.size(); j++) { // for para ver los Zombies.
            System.out.println("Zombie: " + (j + 1));
            System.out.println("Daño: " + piso3.get(j).getDaño());
            System.out.println("Move: " + piso3.get(j).getMovimiento());
            System.out.println("Tipo: " + piso3.get(j).getTipoZombie());
        }
        System.out.println("Unkown = 1");
        System.out.println("Gordos = " + countGordo3);
        System.out.println("Caminantes = " + countCaminante3);
    }

    public static boolean isSkill(String skill) { // funcion de skill valida
        boolean isSkill = false;
        skill = skill.toUpperCase();
        for (String habilidad : Superviviente.Skills) {
            if (skill.equals(habilidad)) {
                isSkill = true;
                break;
            }
        }
        if (!isSkill) {
            return isSkill;
        } else {
            return isSkill;
        }
    }

    public static boolean isArma(String arma) { // funcion de arma valida
        boolean isArma = false;
        arma = arma.toUpperCase();
        for (String habilidad : Arma.Armas) {
            if (arma.equals(habilidad)) {
                isArma = true;
                break;
            }
        }
        if (!isArma) {
            return isArma;
        } else {
            return isArma;
        }
    }
}
