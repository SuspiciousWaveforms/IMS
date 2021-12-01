package com.qa.ims.persistence.domain;

public class Order {

    private Long order_id;
    private Long customer_id;

    public Order(Long order_id, Long customer_id) {
        this.setOrderId(order_id);
        this.setCustomerId(customer_id);
    }

    public Long getOrderId() {
        return order_id;
    }

    public void setOrderId(Long id) {
        this.order_id = id;
    }

    public Long getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(Long customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "order_id:" + order_id + "customer_id:" + customer_id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((order_id == null) ? 0 : order_id.hashCode());
        result = prime * result + ((customer_id == null) ? 0 : customer_id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (getOrderId() == null) {
            if (other.getOrderId() != null)
                return false;
        } else if (!getOrderId().equals(other.getOrderId()))
            return false;
        if (getCustomerId() == null) {
            if (other.getCustomerId() != null)
                return false;
        } else if (!getCustomerId().equals(other.getCustomerId()))
            return false;
        return true;
    }
}
