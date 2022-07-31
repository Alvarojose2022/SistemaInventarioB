public class ClassEntry extends  ClasePadre{
   private String date;
   private int bill;
   private int code;
   private String name;
   private int quantity;
   private double price;
   private double total;


    @Override
    public void movemententry(String date, int bill, int code, String name, int quantity) {

        this.bill=bill;
        setCode(code);
        setName(name);
        setStock_quantity(getStock_quantity()+quantity);
        this.quantity=quantity;
        this.date=date;
    }

    @Override
    public void printeEntry() {
        System.out.println("******** ENTRY PRODUCTS ********");
        System.out.println("No bill:" + " " + bill);
        System.out.println("Date:" + " " + date);
        System.out.println("Code:" + " " + getCode());
        System.out.println("Name:" + " " + getName());
        System.out.println("Entry:" + " " + quantity);
        System.out.println("Existence:" + " " + getStock_quantity());
    }

    @Override
    public void movementoutput(String date, int code, String name, int quantity, double precio) {
        setCode(code);
        setName(name);
        this.quantity =quantity;
        setStock_quantity(getStock_quantity() - this.quantity);
        this.price=precio;
        this.date = date;
        total =quantity * precio;
    }

    @Override
    public void printeOutput() {
        System.out.println("******** OUTPUT PRODUCTS ********");
        System.out.println("Date:" + " " + date);
        System.out.println("Code:" + " " + getCode());
        System.out.println("Name:" + " " + getName());
        System.out.println("Output:" + " " + quantity);
        System.out.println("Existence:" + " " + getStock_quantity());
        System.out.println("Precio:" + " " + price);
        System.out.println("El total a pagar es" + " " + total);

    }
}






