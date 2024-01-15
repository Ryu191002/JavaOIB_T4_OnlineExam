import java.util.Scanner;

class Registration {
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();

    void register() {
        System.out.println("\nEnter your Name:");
        String name = scanner.next();
        System.out.println("Enter your Mail:");
        String mail = scanner.next();
        System.out.println("Enter your Password:");
        int password = scanner.nextInt();
        System.out.println("\n   Registration Successful!!");
        System.out.println("\n    --- Login ----");
        while (true) {
            System.out.println("Enter your Mail");
            String enteredMail = scanner.next();
            System.out.println("Enter your Password");
            int enteredPassword = scanner.nextInt();

            if (enteredMail.equals(mail) && enteredPassword == password) {
                menu.showMenu();
                break;
            } else {
                System.out.println("Incorrect Mail or Password. Try again.");
            }
        }
    }
}

class Menu {
    DSA dsa = new DSA();
    Scanner scanner = new Scanner(System.in);

    void showMenu() {
        System.out.println("\nLogin successful");
        while (true) {
            System.out.println("\n1. Start Exam\n2. Logout\n3. Exit");
            System.out.println("\nEnter your option");
            int option = scanner.nextInt();
            if (option == 1) {
                dsa.startDSAExam();
                System.out.println("\n1. Back   2. Logout   3. Exit");
                int choice = scanner.nextInt();
                if (choice == 2) {
                    break;
                } else if (choice == 3) {
                    System.exit(0);
                }
            } else if (option == 2) {
                System.out.println("Logged out successfully.");
                break;
            } else if (option == 3) {
                System.exit(0);
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

class DSA {
    Scanner scanner = new Scanner(System.in);

    void startDSAExam() {
        int count = 0;
        System.out.println("\nThere are 10 questions, each question carries 2 marks");

        // Questions and answers for Science exam
        String[] questions = {
                "Push() and Pop() functions are found in",
                "Which of the following is a linear data structure?",
                "What is the worst-case time complexity of the linear search algorithm?",
                "Which data structure allows efficient insertion and deletion at both ends? ",
                "Which algorithm is used to find the shortest path in a weighted graph?",
                "What is the best-case time complexity of the binary search algorithm?",
                "Which data structure is used for implementing recursion?",
                "What is the purpose of hash functions in hash tables?",
                "In a binary tree, the node that has no children is called?",
                "Which data structure is based on the Last-In-First-Out (LIFO) principle?"
        };

        String[] options = {
                "1. Queues\n2. Lists\n3.Stacks \n4. Trees",
                "1. Array\n2. AVL Trees\n3. Binary Trees\n4. Graphs",
                "1. O(1)\n2. O(log n)\n3. O(n)\n4. O(n^2)",
                "1. Queue\n2. Stack\n3. Tree\n4. Linked List",
                "1. Linear search\n2. Binary Search\n3. Depth-first search\n4. Dijkstra's algorithm",
                "1. O(1)\n2. O(log n)\n3. O(n)\n4. O(n^2)",
                "1. Array\n2. Queue\n3. List\n4. Stack",
                "1. To sort the elements\n2. To search for elements\n3. To map elements to fixed-size arrays\n4. To delete elements",
                "1. Root\n2. Leaf\n3. Parent\n4. Sibling",
                "1. Queue\n2. Stack\n3. Linked List\n4. Tree"
        };

        int[] correctAnswers = {3, 1, 3, 4, 4, 2, 4, 3, 2, 2};

        for (int i = 0; i < 10; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("Your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswers[i]) {
                count++;
            }
        }

        displayExamSummary(count);
    }

    private void displayExamSummary(int count) {
        System.out.println("\n--------------------------------------");
        System.out.println("Your total Score is: " + count * 2);
        System.out.println("--------------------------------------");
        System.out.println("No.of questions you did correct are: " + count);
    }
}

public class OnlineExam_OIB{
    public static void main(String[] args) {
        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to Online Examination Portal!!");
            System.out.println("\n1. Login\n2. SignUp\n3. Exit");
            System.out.println("\nEnter your option ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("\nWelcome back! \n--- Login ---");
                registration.register();
            } else if (choice == 2) {
                System.out.println("\n--- SignUp ---");
                registration.register();
            } else if (choice == 3) {
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
