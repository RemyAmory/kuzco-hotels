package domain.entity;

public class Chambre {
    private int etage;
    private String numero;
    private String description;
    private int capacité;

    public Chambre(int etage, String numero, String description, int capacité) {
        this.etage = etage;
        this.numero = numero;
        this.description = description;
        this.capacité = capacité;
    }

    @Override
    public String toString() {
        return "|" +
                "etage=" + etage +
                ", numero='" + numero + '\'' +
                ", description='" + description + '\'' +
                ", capacité=" + capacité +
                '|';
    }
}
