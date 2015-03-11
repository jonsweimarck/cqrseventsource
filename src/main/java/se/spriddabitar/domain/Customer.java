package se.spriddabitar.domain;

import org.apache.commons.lang3.Validate;
import se.spriddabitar.eventsource.AggregateEventSource;
import se.spriddabitar.eventsource.ChangeNameCommand;
import se.spriddabitar.eventsource.NameChangedEvent;

public class Customer extends AggregateEventSource {
    private String firstname;
    private String lastname;
    private Address address;

    public Customer(String firstname, String lastname, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public void changeName(ChangeNameCommand c){
        Validate.notNull(c);
        Validate.notNull(c.getFirstname());
        apply(new NameChangedEvent(c));
    }

    @Override
    protected void doApply(NameChangedEvent nameChangedEvent) {
        firstname = nameChangedEvent.getFirstname();
    }
}
