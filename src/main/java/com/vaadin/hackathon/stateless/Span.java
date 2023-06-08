package com.vaadin.hackathon.stateless;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasText;

public class Span extends Component implements HasText, Stateless {

    public Span() {
    }

    public <T> Span(String string, Object... args) {
        setText(String.format(string, args));
    }

    public void bindText(ComputedProperty<String> price) {

    }

}
