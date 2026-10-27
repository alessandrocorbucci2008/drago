public class Cavaliere {
    private String nome;
    public Cavaliere(String nome) {
        this.nome = nome;
    }

    public void lanciaDardi(Thread d){
        for (int i = 0; i <=20; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
