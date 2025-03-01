/*Q1.Write a Java program with a Car class having private fields (make, model), a
parameterized constructor, getter, and setter methods. In the CarTester class,
instantiate myCar1 with values and myCar2 with null. Print their initial details,
update myCar2 using setters, and print the updated details */


class car{
    private String make;
    private String model;
    car(String make, String model){
        this.make = make;
        this.model = model;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    
}
public class Q1_CarTester {
    public static void main(String[] args) {
        car mycar1=new car("Audi","A4");
        car mycar2=new car(null,null);
        System.out.println("Initial Details of myCar1 & MyCar2: "+mycar1.getMake()+" "+mycar1.getModel()+" "+mycar2.getMake()+" "+mycar2.getModel());
        mycar2.setMake("BMW");
        mycar2.setModel("X5");
        System.out.println("Updated Details of myCar2: "+mycar2.getMake()+" "+mycar2.getModel());
    }
}
