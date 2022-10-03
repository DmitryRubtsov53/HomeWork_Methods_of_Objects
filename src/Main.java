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

 /*       // код ДЗ урока "Объекты и классы", заменённый новым с испольхованием toString() и ...

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
*/
        System.out.println("Список наших книг:");
        System.out.println(book1 + " Код (hash) " + book1.hashCode());
        System.out.println(book2 + " Код (hash) " + book2.hashCode());
        System.out.println();

        System.out.println("Проверим написаны ли книги одним автором:");
        if (autor1.equals(autor2)) { System.out.println("автор у книг один"); }
        else System.out.println("Авторы у книг разные");
        System.out.println();
        System.out.println("Проверим являются ли книги одинаковыми:");
        if (book1.equals(book2)) { System.out.println("Книги идентичны"); }
           else System.out.println("Книги разные");

    }   // скобка  main
}       // скобка класса
