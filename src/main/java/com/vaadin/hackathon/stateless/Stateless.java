package com.vaadin.hackathon.stateless;

import com.vaadin.flow.function.SerializableFunction;

public interface Stateless {

    default <T> void addForEach(StreamProperty<T> property,
            SerializableFunction<T, Stateless> generator) {

    }

}
