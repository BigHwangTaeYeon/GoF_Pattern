public class App {
    public static void main(String[] args) throws Exception {

        String title = "복원된 지구";
        String author = "김형준";
        String[] content = {
              "AAAAAAAAAAAA  AAAAA"
            , "BBB BBBBBBBBBBB BB"
            , "CCCCCCC CCCCC  CCCCD"
        };

        Draft draft = new Draft(title, author, content);
        Display display = new SimpleDisplay();
        // draft.print(display);

        Display display2 = new CaptionDisplay();
        // draft.print(display2);

        String publisher = "북악출판";
        int cost = 100;

        // Publication 추가
        Publication publication = new Publication(title, author, content, publisher, cost);
        // publication.print(display);
        publication.print(display2);

    }
}
