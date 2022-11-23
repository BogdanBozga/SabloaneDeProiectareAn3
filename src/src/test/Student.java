package test;

public class Student extends Semigrupa implements Element{
    private String name;
    private String email;

    public Student(String name, String email) {
        super(name);
        this.name = name;
        this.email = email;
    }

    @Override
    public Element add(Element e) {
        super.add(e);
        return this;
    }

    @Override
    public void accept(Visitor2 visitor) {
        visitor.visitStudenst(this);


    }

    @Override
    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
}
