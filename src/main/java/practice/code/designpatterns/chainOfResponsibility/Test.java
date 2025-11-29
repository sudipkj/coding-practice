package practice.code.designpatterns.chainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        Request request = new Request("Level3");

        RequestHandler requestHandler1 = new Level1Handler();
        RequestHandler requestHandler2 = new Level2Handler();
        RequestHandler requestHandler3 = new Level3Handler();

        requestHandler1.setNextHandler(requestHandler2);
        requestHandler2.setNextHandler(requestHandler3);

        requestHandler1.handleRequest(request);
    }
}
