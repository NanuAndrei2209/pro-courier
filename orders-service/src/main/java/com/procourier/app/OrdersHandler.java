package com.procourier.app;

import com.procourier.model.Order;
import spark.Request;
import spark.Response;
import spark.Route;

public class OrdersHandler implements Route {
    private OrdersHandler(){};

    public static final OrdersHandler Instance = new OrdersHandler();

    public Object handle(Request request, Response response) throws Exception {
        return null;
    }
}
