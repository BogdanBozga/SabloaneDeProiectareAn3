package test;

public class Main {
        public static void main(String[] args) throws Exception {
            Element info3 = new An("Informatica 3")
                    .add(new Grupa("Grupa 1")
                            .add(new Semigrupa("Semigrupa 1.1")
                                    .add(new Student("Popescu I","popescu@acme.edu"))
                                    .add(new Student("Ionescu E","ionescu@acme.edu")))
                            .add(new Semigrupa("Semigrupa 1.2")
                                    .add(new Student("Vasilescu I","vasilescu@acme.edu"))
                                    .add(new Student("Popescu I","georgescu@acme.edu"))))
                    .add(new Grupa("Grupa 2"));

            Visitor2 printVisitor = new VisitorAfisare();
            info3.accept(printVisitor);


}}
