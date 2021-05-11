package com.vijay.shopapi.service;

import com.vijay.shopapi.entity.Cart;
import com.vijay.shopapi.entity.ProductInOrder;
import com.vijay.shopapi.entity.User;

import java.util.Collection;

/**
 * Created By Zhu Lin on 3/10/2018.
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
