package test;

import java.util.ArrayList;
import java.util.List;

public class Semigrupa implements Element{
    private String name;

    private List<Element> studenti = new ArrayList<>();
    public Semigrupa(String name) {
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public Element add(Element e) {
        studenti.add(e);
        return this;
    }

    @Override
    public void accept(Visitor2 visitor) {
        visitor.visitSemigrupa(this);
        for(Element e:studenti) {
            e.accept(visitor);
        }

    }
}
