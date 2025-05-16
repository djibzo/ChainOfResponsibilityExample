public class CEO extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getAmount() <= 10000) {
            System.out.println("M. Khoussa a approuve la requette de " + request.getAmount() + " FCFA.");
        } else {
            System.out.println("La requette de " + request.getAmount() + " CFA a ete rejetee: montant trop grand.");
        }
    }
}