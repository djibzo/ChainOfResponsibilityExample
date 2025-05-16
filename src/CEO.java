public class CEO extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getAmount() <= 10000) {
            System.out.println("M. Khoussa a approuve la requette de " + request.getAmount() + " FCFA.");
        }else if (next != null) {
            next.handle(request);
        }
    }
}