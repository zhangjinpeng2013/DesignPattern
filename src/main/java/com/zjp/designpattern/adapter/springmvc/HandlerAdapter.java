package com.zjp.designpattern.adapter.springmvc;

public interface HandlerAdapter {
    public boolean supports(Object handler);

    public void handle(Object handler);
}

class SimpleHandlerAdapter implements HandlerAdapter {

    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    public void handle(Object handler) {
        ((SimpleController) handler).doSimpleHandler();
    }
}

class HttpHandlerAdapter implements HandlerAdapter {
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }
}

class AnnotationHandlerAdapter implements HandlerAdapter {
    public boolean supports(Object handler) {
        return handler instanceof AnnotationController;
    }

    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }
}