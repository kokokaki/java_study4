interface Downloadable {
    void download();
}

interface Readable extends Downloadable {
    void readBook();
}

abstract class Book implements Readable {
    @Override
    public void readBook() {
        System.out.println("Read Book");
    }
}

class EBook extends Book {

    @Override
    public void download() {

    }

    @Override
    public void readBook() {
        System.out.println("Read E-Book");
    }
}

public class Test {

    public static void main(String[] args) {

        Book book = new EBook();
        book.readBook();
    }
}
