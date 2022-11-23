package test;

import main.java.Visitor;

public interface Element {
    public Element add(Element e);
    public void accept(Visitor2 visitor);
    public String getName();
}
