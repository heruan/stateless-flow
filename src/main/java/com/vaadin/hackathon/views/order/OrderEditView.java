package com.vaadin.hackathon.views.order;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.hackathon.stateless.ComboBox;
import com.vaadin.hackathon.stateless.ComputedProperty;
import com.vaadin.hackathon.stateless.IntegerField;
import com.vaadin.hackathon.stateless.ModelProperty;
import com.vaadin.hackathon.stateless.Span;
import com.vaadin.hackathon.stateless.Stateless;
import com.vaadin.hackathon.stateless.Template;

@Template
public class OrderEditView extends VerticalLayout implements Stateless {

    public OrderEditView(OrderEditState orderEditState) {
        var statusBox = new ComboBox<OrderStatus>();
        statusBox.bindValue(orderEditState.status);

        var productLine = new ProductLine(orderEditState.product,
                orderEditState.quantity, orderEditState.price);

        add(statusBox, productLine);
    }

    static class ProductLine extends HorizontalLayout {

        public ProductLine(ModelProperty<Product> product,
                ModelProperty<Integer> quantity,
                ComputedProperty<String> price) {
            var productBox = new ComboBox<Product>();
            productBox.bindValue(product);

            var quantityField = new IntegerField();
            quantityField.bindValue(quantity);

            var totalPriceSpan = new Span();
            totalPriceSpan.bindText(price);

            add(productBox, quantityField, totalPriceSpan);
        }
    }
}
