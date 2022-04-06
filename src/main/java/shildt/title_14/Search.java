package shildt.title_14;

public class Search {
    public static void main(String[] args) {
        int num = 10;
        NumSearch numSearch = (n) -> (n > 9 && n < 21);

        System.out.println(numSearch.search(num));
    }
}
