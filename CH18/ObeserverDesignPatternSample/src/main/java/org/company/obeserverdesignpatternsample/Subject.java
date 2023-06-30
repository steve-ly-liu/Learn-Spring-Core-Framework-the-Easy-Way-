package org.company.obeserverdesignpatternsample;
/**
 * In Observer Design Pattern multiple observer objects registers with a subject for any change in notification.
 * When the state of subject changes, it notifies the observers.
 * Objects that listen or watch for change are called OBSERVERS.
 * Object that is being watched is called a SUBJECT.
 *
 * The Observer Design Pattern:
 * 1. The Subject provides an interface for observers to register and unregister themselves with the subject.
 * 2. The Subject knows what its subscribers are.
 * 3. Multiple Observers can subscribe for notifications.
 * 4. Subject publishes the notifications.
 * 5. The Subject just sends the notification saying the state has changed. It does not pass any state information.
 * 6. Once the notification is received from Subject, Observers call the Subject and get data is changed.
 *
 * Participants in the Observer Pattern:
 * 1. Subject, to register Observers. Objects use this interface to register as Observers and also to remove themselves
 *    from being Observers.
 * 2. Observer defines an updating interface for objects that should be notified of changes in a subject.
 *    However, All observers need to implement the Observer interface. This interface has a method update(),
 *    which gets called when the Subject's state changes.
 * 3. ConcreteSubject, stores the state of interest to ConcreteObserver objects. It sends a notification to its observers
 *    when its state changes. Further, A concrete subject always implements the Subject interface.
 *    We use the notifyObserver() method to update all the current observers whenever the state changes.
 * 4. ConcreteObserver, it maintains a reference to a ConcreteSubject object and implements the Observer interface.
 *    Each observer registers with a concrete subject to receive updates.
 *
 *
 * */
public interface Subject {
    public void registerObserver(Observer observer) throws Exception;
    public void notifyObserver();
    public void unregisterObserver(Observer observer);

    /**
     * After Observers receive the Subject's state changing notification, observer will call the method to get
     * the Subject's state information as the returned object.
     * */
    public Object getUpdate();
}
