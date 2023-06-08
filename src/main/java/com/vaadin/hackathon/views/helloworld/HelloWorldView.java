package com.vaadin.hackathon.views.helloworld;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.hackathon.stateless.Span;
import com.vaadin.hackathon.stateless.Stateless;
import com.vaadin.hackathon.stateless.Template;

@Route
@Template
public class HelloWorldView extends VerticalLayout implements Stateless {

    public HelloWorldView(GlobalCounterService counter) {
        add(new Button("Update counter",
                clickEvent -> HelloWorldState.counterValueList
                        .add(counter.getAndIncrement())));

        addForEach(HelloWorldState.counterValueList,
                counterState -> new Span("Counter updated at %d",
                        counterState));
    }
}