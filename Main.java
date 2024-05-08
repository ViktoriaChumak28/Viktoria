public class Main {
    public static void main(String[] args) {
        // Створення об'єкта дверей
        Doors door = new Doors (false, "Wood", 200, 80, "Brown");

        // Виведення інформації про двері
        System.out.println("Door material: " + door.getMaterial());
        System.out.println("Door height: " + door.getHeight() + " cm");
        System.out.println("Door width: " + door.getWidth() + " cm");
        System.out.println("Door color: " + door.getColor());

        // Відкриття дверей
        door.open();

        // Закриття дверей
        door.close();
    }
}


