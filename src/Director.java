public class Director extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getAmount() <= 5000) {
            System.out.println("M. Fatah a approuve la requette de " + request.getAmount() + " CFA.");
        } else if (next != null) {
            next.handle(request);
        }
    }
}