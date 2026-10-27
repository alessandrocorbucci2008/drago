import static java.lang.Thread.sleep;

public class Drago implements Runnable {
    private String nome;
    int numBattiti;

    public Drago(int numBattiti, String nome) {
        this.numBattiti = numBattiti;
        this.nome = nome;


    }

    @Override
    public void run() {


        for (int i = 0; i < numBattiti; i++) {
            System.out.println(nome + " si libera nell aria Gioia immensa al battiti");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }


}
