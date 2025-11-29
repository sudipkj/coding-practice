package practice.code.designpatterns.chainOfResponsibility;

public interface RequestHandler {

    void handleRequest(Request request);
    void setNextHandler(RequestHandler requestHandler);
}
