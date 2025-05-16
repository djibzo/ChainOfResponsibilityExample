public class Main {
    public static void main(String[] args) {
        Handler manager = new Manager();
        Handler director = new Director();
        Handler ceo = new CEO();

        manager.setNext(director);
        director.setNext(ceo);

        Request req1 = new Request("transport", 500);
        Request req2 = new Request("achat matériel", 3000);
        Request req3 = new Request("budget projet", 15000);

        manager.handle(req1);
        manager.handle(req2);
        manager.handle(req3);
    }
}