package test;

import main.java.Visitor;

import java.util.ArrayList;
import java.util.List;

public class An implements Element{
    private String an;
    private List<Element> elementList = new ArrayList<>();
    public An(String an) {
        this.an = an;
    }

    @Override
    public Element add(Element e) {
        elementList.add(e);
        return this;
    }

    @Override
    public void accept(Visitor2 visitor) {
        visitor.visitAn(this);
        for(Element e:elementList) {
            e.accept(visitor);
        }
    }

    @Override
    public String getName() {
        return an;
    }

}
