package se.spriddabitar.eventsource;

public class NameChangedEvent implements InternalEvent{
    private String firstname;

    public NameChangedEvent(ChangeNameCommand c) {
        firstname = c.getFirstname();
    }

    public String getFirstname() {
        return firstname;
    }
}
