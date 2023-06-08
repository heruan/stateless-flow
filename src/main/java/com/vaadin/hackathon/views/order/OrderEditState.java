package com.vaadin.hackathon.views.order;

import java.math.BigDecimal;

import com.vaadin.hackathon.stateless.ComputedProperty;
import com.vaadin.hackathon.stateless.ModelProperty;

public class OrderEditState {

    final ModelProperty<OrderStatus> status = null;

    final ModelProperty<Product> product = null;

    final ModelProperty<Integer> quantity = null;

    final ComputedProperty<String> price = ComputedProperty
            .biFunction(product, quantity, (p, q) -> {
                return p.price.multiply(BigDecimal.valueOf(q)).toString()
                        + " €";
            });
}
