package com.zjp.designpattern.adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

public class DispatcherServlet {
    public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    public DispatcherServlet() {
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
    }

    public void doDispatcher() {
        HttpController httpController = new HttpController();
        HandlerAdapter adapter = getHandler(httpController);
        adapter.handle(httpController);
    }

    public HandlerAdapter getHandler(Controller controller) {
        for (HandlerAdapter adapter : this.handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }

}
