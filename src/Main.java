import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner inTastiera = new Scanner(System.in);
        System.out.println("inserisci numero di battiti");
        int count = inTastiera.nextInt();

        Thread argo = new Thread(new Drago(count, "Argo"));
        argo.start();
        Cavaliere sangiorgio = new Cavaliere("Giorgio");
        sangiorgio.lanciaDardi(argo);
        for (int i = 0; i < count; i++) {
            System.out.println("main sta osservando il drago...i" + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}
