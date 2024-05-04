package developers;

public class PHPDeveloper implements IDeveloper{
    @Override
    public void writesCode() {
        System.out.println("Я php-разработчик. Пишу php-код...");
    }
}
