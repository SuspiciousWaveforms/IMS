package com.qa.ims.controller;

import com.qa.ims.persistence.dao.CustomerDAO;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ItemController implements CrudController<Item> {
    public static final Logger LOGGER = LogManager.getLogger();

    private ItemDAO itemDAO;
    private Utils utils;

    public ItemController(ItemDAO itemDAO, Utils utils) {
        super();
        this.itemDAO = itemDAO;
        this.utils = utils;
    }

    @Override
    public List<Item> readAll() {
        return null;
    }

    @Override
    public Item create() {
        LOGGER.info("Please enter the name of the item you wish to add");
        String itemName = utils.getString();
        LOGGER.info("Please enter the price of the item you wish to add");
        double itemPrice = utils.getDouble();
        Item item = itemDAO.create(new Item(itemName, itemPrice));
        LOGGER.info("Item created");
        return item;
    }

    @Override
    public Item update() {
        return null;
    }

    @Override
    public int delete() {
        return 0;
    }
}
