public class Main {
    public static void main(String[] args) {
        String[] strings = {"1", "2", "3", "1", "4", "2"};
        CountingDuplicateItems<String> arryForCheck = new CountingDuplicateItems<>();
        System.out.println(arryForCheck.countDublicate(strings));
    }
}
