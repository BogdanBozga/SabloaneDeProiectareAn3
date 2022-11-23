package test;

public class VisitorAfisare implements Visitor2 {
    @Override
    public void visitAn(An an) {
        System.out.println("Anul "+ an.getName());
    }

    @Override
    public void visitGrupa(Grupa grupa) {
        System.out.println("    Grupa "+ grupa.getName());
    }

    @Override
    public void visitSemigrupa(Semigrupa semigrupa) {
        System.out.println("        Semigrupa "+ semigrupa.getName());
    }

    @Override
    public void visitStudenst(Student student) {
        System.out.println("            Student  "+ student.getName()+", "+student.getEmail());
    }
}
