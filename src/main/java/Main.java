import ru.netology.sqr.sqrcalc.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int result = service.calcSqrRoot(100, 300);
        System.out.println(result);
    }
}
