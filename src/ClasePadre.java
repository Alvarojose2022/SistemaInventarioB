import java.awt.image.BufferedImage;

public class ClasePadre {

    private int code;
    private String name;
    private BufferedImage image_url;
    private int stock_quantity;


    public void movemententry(String date, int bill, int code, String name, int quantity) {}

    public void movementoutput(String date,int code, String name, int quantity,double price) {}

    public void printeEntry() {}

    public void printeOutput() {}

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BufferedImage getImage_url() {
        return image_url;
    }

    public void setImage_url(BufferedImage image_url) {
        this.image_url = image_url;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

}
