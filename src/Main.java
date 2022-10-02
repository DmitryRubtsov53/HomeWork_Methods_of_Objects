public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание Урока Методы Объектов  *************************************************");
        System.out.println();
        // 1-я книга
        Autor autor1 = new Autor("Лев", "Толстой");
        Book book1 = new Book("Война и мир", autor1 , 1970);
        // 2-я книга
        Autor autor2 = new Autor("Джек", "Лондон");
        Book book2 = new Book("Мартин Иден", autor2 , 1985);
        // Выводим на консоль 1-ю книгу

        System.out.print("Книга: " + book1.getBookName() + ". ");

        System.out.print("Автор: " + book1.getAutor().getFirstName() + " " + book1.getAutor().getLastName() + ". ");
        System.out.print("Год издания: " + book1.getYearPublishing());
        // Выводим на консоль 2-ю книгу
        System.out.println();

        System.out.print("Книга: " + book2.getBookName() + ". ");
        System.out.print("Автор: " + book2.getAutor().getFirstName() + " " + book2.getAutor().getLastName() + ". ");
        System.out.print("Год издания: " + book2.getYearPublishing());

        System.out.println();
        book1.setYearPublishing(2000);
        System.out.print("Новое издание книги " + book1.getBookName() + ", год " + book1.getYearPublishing());

    }
}
