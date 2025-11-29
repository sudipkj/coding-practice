package practice.code.designpatterns.chainOfResponsibility;

public class Level3Handler implements RequestHandler{

    private RequestHandler nextHandler;
    @Override
    public void handleRequest(Request request) {
        if(request.getPriority().equalsIgnoreCase("Level2")){
            System.out.println("The request is handled at level 3");
        }else{
            System.out.println("request cannot be handled");
        }
    }

    @Override
    public void setNextHandler(RequestHandler requestHandler) {
//        requestHandler.setNextHandler(nextHandler);
    }
}
