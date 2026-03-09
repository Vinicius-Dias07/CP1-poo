package br.com.fiapride.model;

public class Veiculo {
    private String individuo;
    private String pl;
    private double gas;

    public Veiculo(String individuo, String pl, double gas) {
        this.setIndividuo(individuo);
        this.setPl(pl);
        this.setGas(gas);
    }

    public void adicionarGas(double v) {
        if (v >0) {
            this.gas += v;
            System.out.println("Adicionando gas...");
            System.out.printf("Gás atual: %.2f\n", getGas());
        } else {
            System.out.println("para adicionar digite um valor maior que zero");
        }
    }

    public void gastarGas(double v) {
        if (v > 0) {
            this.gas -= v;
            System.out.println("gastando gas...");
            System.out.printf("Gás atual: %.2f\n", getGas());
        } else {
            System.out.println("para gastar digite um valor maior que zero");
        }
    }

    public String getIndividuo() {
        return individuo;
    }

    private void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPl() {
        return pl;
    }

    private void setPl(String pl) {
        this.pl = pl;
    }

    public double getGas() {
        return gas;
    }

    private void setGas(double gas) {
        this.gas = gas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "individuo='" + individuo + '\'' +
                ", pl='" + pl + '\'' +
                ", gas=" + gas +
                '}';
    }
}
