import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Resume resume1 = new Resume();
        String name;
        String email;
        String sdate;
        String edate;
        String description;
        String company;
        String title;
        String userInput;
        int counter = 1;
        ArrayList<String> jobsList = new ArrayList<>();

        System.out.println("We are creating a resume!");
        System.out.println("Please provide your name: ");
        name = key.nextLine();
        resume1.setName(name);

        System.out.println("Please provide your email address: ");
        email = key.nextLine();
        resume1.setEmail(email);

        System.out.println("Now we will add your previous employment.");
        System.out.println("Please provide previous employment:");
        company = key.nextLine();
        resume1.setCompany(company);

        System.out.println("Please provide the job title at this company: ");
        title = key.nextLine();
        resume1.setTitle(title);

        System.out.println("Please provide the start date:");
        sdate = key.nextLine();
        resume1.setSdate(sdate);

        System.out.println("Please provide the end date: ");
        edate = key.nextLine();
        resume1.setEdate(edate);

        System.out.println("Please provide the description");
        description = key.nextLine();
        resume1.setDescription(description);

        System.out.println("Do you want to add another job? (y/n)");
        userInput = key.nextLine();
        if (userInput.equalsIgnoreCase("n")){
            break;
        }
        counter = counter + 1;

    }

}
