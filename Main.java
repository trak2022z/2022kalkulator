import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  System.out.println("Podaj co chcesz zrobic:");
  System.out.println("1.Dodawanie:");
  System.out.println("2.Odejmowanie l1-l2:");
  System.out.println("3.Odejmowanie l2-l1:");
  System.out.println("4.Mnożenie:");
  System.out.println("5.Dzielenie l1/l2:");
  System.out.println("6.Dzielenie l2/l1:");
  System.out.println("7.Przeliczanie m/s na km/h:");
  System.out.println("8.Przeliczanie km/h na m/s:");
  Scanner scanner = new Scanner(System.in);
  int x = scanner.nextInt();
  System.out.println("Podaj pierwszą liczbe :");
  double liczba1 = scanner.nextInt();
  System.out.println("Podaj drugą liczbe :");
  double liczba2 = scanner.nextInt();
    switch (x){   
  case 1:  
    double dodawanie;
    dodawanie=liczba1+liczba2;
    System.out.println("Dodawanie "+dodawanie);
  break;
  case 2: 
    double odejmowanie1;
    odejmowanie1=liczba1-liczba2;
    System.out.println("Odejmowanie1od2 "+odejmowanie1);
  break;
  case 3: 
    double odejmowanie2;
    odejmowanie2=liczba2-liczba1; 
    System.out.println("Odejmowanie2od1 "+odejmowanie2); 
  break;
  case 4: 
    double mnozenie;
  mnozenie=liczba1*liczba2; 
  System.out.println("Mnozenie "+mnozenie);
  break;
  case 5: 
    double dzielenie1;
    dzielenie1=liczba1/liczba2;
  System.out.println("Dzielenie1przez2 "+dzielenie1);
  break;
  case 6: 
    double dzielenie2;
    dzielenie2=liczba2/liczba1;
    System.out.println("Dzielenie2przez1 "+dzielenie2); 
  break;
  case 7:
    System.out.println("Podaj wartość prędkości");
    double v1 = scanner.nextDouble();
    double newv1 = v1 / 3.6;
    System.out.println("Twoja prędkość "+v1+"km/h wynosi "+newv1+ "m/s");
  break;
  case 8:
    System.out.println("Podaj wartość prędkości");
    double v2 = scanner.nextDouble();
    double newv2 = v2 * 3.6;
    System.out.println("Twoja prędkość "+v2+"m/s wynosi "+newv2+ "km/h");
  break;
  }
}
}