package test;

import java.util.ArrayList;
import java.util.List;

public class Grupa extends An{

    private String name;
    private List<Element> subgrupe = new ArrayList<>();
    public Grupa(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public Element add(Element e) {
        subgrupe.add(e);
        return this;
    }


    @Override
    public void accept(Visitor2 visitor) {
        visitor.visitGrupa(this);
        for(Element e:subgrupe) {
            e.accept(visitor);
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
