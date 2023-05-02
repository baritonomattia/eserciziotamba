import java.util.Objects;

public class Pc {
    protected String processore;
    protected int ram;
    protected int memoriaDiMassa;
    protected String marca;
    protected String modello;
    protected String sistemaOperativo;

    public Pc(String processore, int ram, int memoriaDiMassa, String marca, String modello, String sistemaOperativo) {
        this.processore = processore;
        this.ram = ram;
        this.memoriaDiMassa = memoriaDiMassa;
        this.marca = marca;
        this.modello = modello;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcessore() {
        return processore;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemoriaDiMassa() {
        return memoriaDiMassa;
    }

    public void setMemoriaDiMassa(int memoriaDiMassa) {
        this.memoriaDiMassa = memoriaDiMassa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String toString() {
        return "PC{" +
                "processore='" + processore + '\'' +
                ", ram=" + ram +
                ", memoriaDiMassa=" + memoriaDiMassa +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PC pc = (PC) o;
        return ram == pc.ram &&
                memoriaDiMassa == pc.memoriaDiMassa &&
                Objects.equals(processore, pc.processore) &&
                Objects.equals(marca, pc.marca) &&
                Objects.equals(modello, pc.modello) &&
                Objects.equals(sistemaOperativo, pc.sistemaOperativo);
    }

    public int hashCode() {
        return Objects.hash(processore, ram, memoriaDiMassa, marca, modello, sistemaOperativo);
    }
}