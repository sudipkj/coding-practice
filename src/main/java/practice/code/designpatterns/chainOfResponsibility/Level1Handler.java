package practice.code.designpatterns.chainOfResponsibility;

public class Level1Handler implements RequestHandler {

    private RequestHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority().equalsIgnoreCase("Level1")) {
            System.out.println("Level 1 handled the request");
        } else {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
