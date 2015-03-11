package se.spriddabitar.eventsource;

import java.util.ArrayList;
import java.util.List;

public abstract class AggregateEventSource {

    private List<InternalEvent> events = new ArrayList<InternalEvent>();

    protected abstract void doApply(NameChangedEvent nameChangedEvent);

    protected void apply(NameChangedEvent nameChangedEvent) {
        doApply(nameChangedEvent);
        events.add(nameChangedEvent);
    }
}
