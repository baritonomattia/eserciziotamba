import java.util.Objects;

public class PC {
    protected String processore;
    protected int ram;
    protected String memoriaDiMassa;
    protected String marca;
    protected String modello;
    protected String sistemaOperativo;

    public PC(String processore, int ram, String memoriadimassa, String marca, String modello, String sistemaOperativo) {
        this.processore = processore;
        this.ram = ram;
        this.memoriaDiMassa = memoriadimassa;
        this.marca = marca;
        this.modello = modello;
        this.sistemaOperativo = sistemaOperativo;
    }

    public PC(String marca2, String modello2, String sistemaOperativo2, double memoriaRAM, double memoriaDiMassa2) {
	}

	public PC(String marca2, String modello2, String processore2, int ram2, int memoriaDiMassa2,
            String sistemaOperativo2) {
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

    public String getMemoriaDiMassa() {
        return memoriaDiMassa;
    }

    public void setMemoriaDiMassa(String memoriaDiMassa) {
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