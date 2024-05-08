public class Doors {
    private boolean isOpen;
    private String material;
    private int height;
    private int width;
    private String color;

    public Doors() {
    }

    public Doors(boolean b, String wood, int i, int i1, String brown) {
    }

    // Конструктор
    public void Doors (boolean isOpen, String material, int height, int width, String color) {
        this.isOpen = isOpen;
        this.material = material;
        this.height = height;
        this.width = width;
        this.color = color;
    }

    // Методи доступу
    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Метод для відкриття дверей
    public void open() {
        isOpen = true;
        System.out.println("The " + color + " door is now open.");
    }

    // Метод для закриття дверей
    public void close() {
        isOpen = false;
        System.out.println("The " + color + " door is now closed.");
    }
}

