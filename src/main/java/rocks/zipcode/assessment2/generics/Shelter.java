package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */

public class Shelter<T extends Ageable> implements Iterable<T>{

    List<T> shell;

    public Shelter() {
        shell = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        if(shell != null)
            return shell.size();
        return (Integer) null;
    }

    public void add(T object) {
        shell.add(object);
    }

    public Boolean contains(T object) {
        return shell.contains(object);
    }

    public void remove(T object) {
        if(shell != null)
            shell.remove(object);
    }

    public T get(Integer index) {
        if(shell != null)
            return shell.get(index);
        return null;
    }

    public Integer getIndexOf(T ageable) {
        if(shell != null)
            return shell.indexOf(ageable);
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return shell.iterator();
    }
}