import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LiveScore station = new LiveScore();
        LiveScoreSubcriber sub1 = new LiveScoreSubcriber();
        LiveScoreSubcriber sub2 = new LiveScoreSubcriber();
        station.add(sub1);
        station.add(sub2);

        while(true){
            System.out.print("Enter Score: ");
            String result = sc.nextLine();
            if (result.equals("")) {
                break;
            }
            station.setResult(result);
        }

        sc.close();
    }
}
