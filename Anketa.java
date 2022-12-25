import java.util.Scanner;
class Main {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Введите имя:");
String name = scanner.nextLine();
System.out.println("Введите опыт работы:");
String exp = scanner.nextLine();
System.out.println("Введите вашу кулинарию:");
String kitchen = scanner.nextLine();
String anketa = "Анкета заполнена " + name + " сохранено. Мы свяжемся с вами если будем нуждаться в услугах повора который готовит " + kitchen + " блюда и имеет " + exp + " лет опыта работы";
System.out.println(anketa); 
}
} 
