package com.qa.ims.controller;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class OrderController implements CrudController<Order> {
    public static final Logger LOGGER = LogManager.getLogger();

    private OrderDAO orderDAO;
    private Utils utils;

    public OrderController(OrderDAO orderDAO, Utils utils) {
        super();
        this.orderDAO = orderDAO;
        this.utils = utils;
    }

    @Override
    public List<Order> readAll() {
        List<Order> orders = orderDAO.readAll();
        for (Order order : orders) {
            LOGGER.info(order);
        }
        return orders;
    }

    @Override
    public Order create() {
        LOGGER.info("Please enter an order id");
        Long order_id = utils.getLong();
        LOGGER.info("Please enter a customer id");
        Long customer_id = utils.getLong();
        Order order = orderDAO.create(new Order(order_id, customer_id));
        LOGGER.info("Order created");
        return order;
    }

    @Override
    public Order update() {
        return null;
    }

    @Override
    public int delete() {
        return 0;
    }
}
