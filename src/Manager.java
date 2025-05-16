public class Manager extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getAmount() <= 1000) {
            System.out.println("Ndiaga dolei a approuve la requette de" + request.getAmount() + " CFA.");
        } else if (next != null) {
            next.handle(request);
        }
    }
}