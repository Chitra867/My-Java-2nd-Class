//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class Main {
    public static void main(String[] args) {
        Bike bike1 = new Bike();
        bike1.name = "CBZ";
        bike1.model = "Xyz";
        bike1.makeyear = 1994;

        System.out.println("Bike1:" + bike1.name);
        System.out.println("Bike1:" + bike1.model);
        System.out.println("Bike1:" + bike1.makeyear);

    }
}
        class Bike {
    String name;
    String model;
    int makeyear;
        }

