import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<News> NewsList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("-----------Menu----------");
            System.out.println("    1. Insert news");
            System.out.println("    2. View list news");
            System.out.println("    3. Average rate");
            System.out.println("    4.Exit");
            int option = input.nextInt();
            if(option >0 && option <=4) {
                switch (option) {
                    case 1: {
                        Main.insertNews(NewsList);
                        break;
                    }
                    case 2: {
                        Main.showListNews(NewsList);
                        break;
                    }
                    case 3: {
                        Main.rateAverage(NewsList);
                        break;
                    }
                    default:
                        return;
                }
            } else {
                break;
            }
        } while (true);

    }
    public static void insertNews(ArrayList<News> NewsList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input news");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Title: ");
        String title = scanner.nextLine();

        System.out.printf("Publish Date: ");
        String date = scanner.nextLine();
        System.out.printf("Author: ");
        String author = scanner.nextLine();

        System.out.printf("Content: ");
        String content = scanner.nextLine();

        System.out.println("Inpute rate: ");
        int[] rate = new int[3];
        System.out.printf("     First rate: ");
        rate[0] = scanner.nextInt();
        System.out.printf("     Second rate: ");
        rate[1] = scanner.nextInt();
        System.out.printf("     Third rate: ");
        rate[2] = scanner.nextInt();

        NewsList.add(new News(id, title, date, author, content, rate));

    }
    public static void showListNews(ArrayList<News> NewsList) {
        System.out.println("List News: ");
        for (int i = 0; i < NewsList.size(); i++) {
            NewsList.get(i).Display();
        }
    }
    public static void rateAverage(ArrayList<News> NewsList) {
        System.out.println("List News after calculating average rate:");
        for (int i = 0; i < NewsList.size(); i++) {
            NewsList.get(i).Calculate();
            NewsList.get(i).Display();
        }
    }
}
