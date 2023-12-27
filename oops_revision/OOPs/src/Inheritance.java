
class vehicle {
    public int year;
    public String category;
    public vehicle(int year, String category) {
        this.year = year;
        this.category = category;
    }
    public String show()
    {
        return (" Vehicle year is " + year + "\n"
                + "Category of Vehicle is " + category);
    }
}

class Model extends vehicle {
    public String type;
    public Model(int year, String category,
                        String type)
    {
        super(year, category);
        this.type = type;
    }
    public void input_type(String newValue)
    {
        type = newValue;
    }
    
    public String show()
    {
        return (super.show() + "\n Type of the vehicle is: "
                + type);
    }
}

public class Inheritance {
    public static void main(String args[])
    {
        Model m1 = new Model(1988, "Car", "Sedan");
        m1.input_type("SUV");
        System.out.println(m1.show());
        Model m2 = new Model(2008, "Bike", "Racing");
        System.out.println(m2.show());
    }
}
