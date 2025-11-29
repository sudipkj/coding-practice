package practice.code.designpatterns.chainOfResponsibility;

public class Level2Handler implements RequestHandler{

    private RequestHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority().equalsIgnoreCase("Level2")){
            System.out.println("The request is handled at level 2");
        }else{
            nextHandler.handleRequest(request);
        }

    }

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
