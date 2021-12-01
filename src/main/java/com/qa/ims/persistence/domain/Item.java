package com.qa.ims.persistence.domain;

public class Item {
    private Long itemId;
    private String itemName;
    private double itemPrice;

    public Item(String itemName, double itemPrice) {
        this.setItemName(itemName);
        this.setItemPrice(itemPrice);
    }

    public Item(Long itemId, String itemName, double itemPrice) {
        this.setItemId(itemId);
        this.setItemName(itemName);
        this.setItemPrice(itemPrice);
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "item_id:" + itemId + " item_name:" + itemName + " item_price:" + itemPrice;
    }
}
