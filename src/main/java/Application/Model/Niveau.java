package Application.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Classe représentant le niveau d'un utilisateur (condition Min et Max) dans une activité.
 */
@Entity
public class Niveau {
    private int id;
    private int vagueMax;
    private int vagueMin;
    private int ventMax;
    private int ventMin;
    private Faire faire;

    //<editor-fold desc="get/set">
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVagueMax() {
        return vagueMax;
    }

    public void setVagueMax(int vagueMax) {
        this.vagueMax = vagueMax;
    }

    public int getVagueMin() {
        return vagueMin;
    }

    public void setVagueMin(int vagueMin) {
        this.vagueMin = vagueMin;
    }

    public int getVentMax() {
        return ventMax;
    }

    public void setVentMax(int ventMax) {
        this.ventMax = ventMax;
    }

    public int getVentMin() {
        return ventMin;
    }

    public void setVentMin(int ventMin) {
        this.ventMin = ventMin;
    }

    @OneToOne
    public Faire getFaire() {
        return faire;
    }

    public void setFaire(Faire faire) {
        this.faire = faire;
    }
    //</editor-fold>
}
