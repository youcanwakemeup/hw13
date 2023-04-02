package homework13;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Author ivanTurgenev = new Author("Ivan", "Turgenev");
        Book fathersAndChildren = new Book("Fathers and Children", ivanTurgenev, 1862);
        Book warAndPiece = new Book("War and Piece", levTolstoy, 1867);
        warAndPiece.setYearOfBook(1866);
        System.out.println(warAndPiece.toString());
    }
}