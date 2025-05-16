public class Dieu extends Handler{
    @Override
    public void handle(Request request) {
        if(request.getAmount()<=20000){
            System.out.println("Dieu a approuve la requette de " + request.getAmount() + " FCFA.");
        } else {
            System.out.println("La requette de " + request.getAmount() + " CFA a ete rejetee: montant trop grand.");
        }

    }
}
