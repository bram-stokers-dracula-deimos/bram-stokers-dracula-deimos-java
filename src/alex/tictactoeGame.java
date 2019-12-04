package alex;
import java.util.Scanner;
import java.util.ArrayList;

public class tictactoeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String again;
        String choice;
        ArrayList<String> win1 = new ArrayList<>();
        ArrayList<String> win2 = new ArrayList<>();
        ArrayList<String> win3 = new ArrayList<>();
        ArrayList<String> winA = new ArrayList<>();
        ArrayList<String> winB = new ArrayList<>();
        ArrayList<String> winC = new ArrayList<>();
        ArrayList<String> crossA = new ArrayList<>();
        ArrayList<String> crossC = new ArrayList<>();
        ArrayList<String> chosen = new ArrayList<>();

        System.out.println("Welcome to tic tac toe!");
        do {
            String[][] board = {
                    {"", "A", "B", "C"},
                    {"1", "---", "---", "---"},
                    {"2", "---", "---", "---"},
                    {"3", "---", "---", "---"}
            };
            boolean complete = false;
            boolean xTurn = true;
            while (!complete){
                for (String[] row : board){
                    for (String spot : row){
                        System.out.print(spot + "\t");
                    }
                    System.out.print("\n");
                }
                System.out.println(chosen.size());
                if (xTurn){
                    System.out.println("It is X's turn.");
                    System.out.println("Enter position: (ex: 1A, 3C)");
                    choice = scanner.next();
                    choice = choice.toUpperCase();
                    while (!validChoice(choice) || chosen.contains(choice)){
                        if (!validChoice(choice)){
                            System.out.println("That is not a valid option. Try reentering: ");
                            choice = scanner.next();
                            choice = choice.toUpperCase();
                        }
                        else if (chosen.contains(choice)){
                            System.out.println("That spot is already taken. Try reentering: ");
                            choice = scanner.next();
                            choice = choice.toUpperCase();
                        }
                    }
                    switch (choice) {
                        case "1A":
                            chosen.add(choice);
                            win1.add("X");
                            winA.add("X");
                            crossA.add("X");
                            board[1][1] = "-X-";
                            break;
                        case "2A":
                            chosen.add(choice);
                            win2.add("X");
                            winA.add("X");
                            board[2][1] = "-X-";
                            break;
                        case "3A":
                            chosen.add(choice);
                            win3.add("X");
                            winA.add("X");
                            crossC.add("X");
                            board[3][1] = "-X-";
                            break;
                        case "1B":
                            chosen.add(choice);
                            win1.add("X");
                            winB.add("X");
                            board[1][2] = "-X-";
                            break;
                        case "2B":
                            chosen.add(choice);
                            win2.add("X");
                            winB.add("X");
                            crossA.add("X");
                            crossC.add("X");
                            board[2][2] = "-X-";
                            break;
                        case "3B":
                            chosen.add(choice);
                            win3.add("X");
                            winB.add("X");
                            board[3][2] = "-X-";
                            break;
                        case "1C":
                            chosen.add(choice);
                            win1.add("X");
                            winC.add("X");
                            crossC.add("X");
                            board[1][3] = "-X-";
                            break;
                        case "2C":
                            chosen.add(choice);
                            win2.add("X");
                            winC.add("X");
                            board[2][3] = "-X-";
                            break;
                        case "3C":
                            chosen.add(choice);
                            win3.add("X");
                            winC.add("X");
                            crossA.add("X");
                            board[3][3] = "-X-";
                            break;
                    }
                    if (win1.size() == 3){
                        if (threeRow(win1)) {
                            board[1][1] = "*X*";
                            board[1][2] = "*X*";
                            board[1][3] = "*X*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(win1.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (win2.size() == 3){
                        if (threeRow(win2)) {
                            board[2][1] = "*X*";
                            board[2][2] = "*X*";
                            board[2][3] = "*X*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(win2.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (win3.size() == 3){
                        if (threeRow(win3)) {
                            board[3][1] = "*X*";
                            board[3][2] = "*X*";
                            board[3][3] = "*X*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(win3.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (winA.size() == 3){
                        if (threeRow(winA)) {
                            board[1][1] = "*X*";
                            board[2][1] = "*X*";
                            board[3][1] = "*X*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(winA.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (winB.size() == 3){
                        if (threeRow(winB)) {
                            board[1][2] = "*X*";
                            board[2][2] = "*X*";
                            board[3][2] = "*X*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(winB.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (winC.size() == 3){
                        if (threeRow(winC)) {
                            board[1][3] = "*X*";
                            board[2][3] = "*X*";
                            board[3][3] = "*X*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(winC.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (crossA.size() == 3){
                        if (threeRow(crossA)) {
                            board[1][1] = "*X*";
                            board[2][2] = "*X*";
                            board[3][3] = "*X*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(crossA.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (crossC.size() == 3){
                        if (threeRow(crossC)) {
                            board[1][3] = "*X*";
                            board[2][2] = "*X*";
                            board[3][1] = "*X*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(crossC.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (chosen.size() == 9 && !complete){
                        for (String[] row : board){
                            for (String spot : row){
                                System.out.print(spot + "\t");
                            }
                            System.out.print("\n");
                        }
                        System.out.println("It is a tie...");
                        complete = true;
                    }
                    xTurn = false;
                }
                else {
                    System.out.println("It is O's turn.");
                    System.out.println("Enter position: (ex: 1A, 3C)");
                    choice = scanner.next();
                    choice = choice.toUpperCase();
                    while (!validChoice(choice) || chosen.contains(choice)){
                        if (!validChoice(choice)){
                            System.out.println("That is not a valid option. Try reentering: ");
                            choice = scanner.next();
                            choice = choice.toUpperCase();
                        }
                        else if (chosen.contains(choice)){
                            System.out.println("That spot is already taken. Try reentering: ");
                            choice = scanner.next();
                            choice = choice.toUpperCase();
                        }
                    }
                    switch (choice) {
                        case "1A":
                            chosen.add(choice);
                            win1.add("O");
                            winA.add("O");
                            crossA.add("O");
                            board[1][1] = "-O-";
                            break;
                        case "2A":
                            chosen.add(choice);
                            win2.add("O");
                            winA.add("O");
                            board[2][1] = "-O-";
                            break;
                        case "3A":
                            chosen.add(choice);
                            win3.add("O");
                            winA.add("O");
                            crossC.add("O");
                            board[3][1] = "-O-";
                            break;
                        case "1B":
                            chosen.add(choice);
                            win1.add("O");
                            winB.add("O");
                            board[1][2] = "-O-";
                            break;
                        case "2B":
                            chosen.add(choice);
                            win2.add("O");
                            winB.add("O");
                            crossA.add("O");
                            crossC.add("O");
                            board[2][2] = "-O-";
                            break;
                        case "3B":
                            chosen.add(choice);
                            win3.add("O");
                            winB.add("O");
                            board[3][2] = "-O-";
                            break;
                        case "1C":
                            chosen.add(choice);
                            win1.add("O");
                            winC.add("O");
                            crossC.add("O");
                            board[1][3] = "-O-";
                            break;
                        case "2C":
                            chosen.add(choice);
                            win2.add("O");
                            winC.add("O");
                            board[2][3] = "-O-";
                            break;
                        case "3C":
                            chosen.add(choice);
                            win3.add("O");
                            winC.add("O");
                            crossA.add("O");
                            board[3][3] = "-O-";
                            break;
                    }
                    if (win1.size() == 3){
                        if (threeRow(win1)) {
                            board[1][1] = "*O*";
                            board[1][2] = "*O*";
                            board[1][3] = "*O*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(win1.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (win2.size() == 3){
                        if (threeRow(win2)) {
                            board[2][1] = "*O*";
                            board[2][2] = "*O*";
                            board[2][3] = "*O*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(win2.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (win3.size() == 3){
                        if (threeRow(win3)) {
                            board[3][1] = "*O*";
                            board[3][2] = "*O*";
                            board[3][3] = "*O*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(win3.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (winA.size() == 3){
                        if (threeRow(winA)) {
                            board[1][1] = "*O*";
                            board[2][1] = "*O*";
                            board[3][1] = "*O*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(winA.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (winB.size() == 3){
                        if (threeRow(winB)) {
                            board[1][2] = "*O*";
                            board[2][2] = "*O*";
                            board[3][2] = "*O*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(winB.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (winC.size() == 3){
                        if (threeRow(winC)) {
                            board[1][3] = "*O*";
                            board[2][3] = "*O*";
                            board[3][3] = "*O*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(winC.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (crossA.size() == 3){
                        if (threeRow(crossA)) {
                            board[1][1] = "*O*";
                            board[2][2] = "*O*";
                            board[3][3] = "*O*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(crossA.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (crossC.size() == 3){
                        if (threeRow(crossC)) {
                            board[3][1] = "*O*";
                            board[2][2] = "*O*";
                            board[1][3] = "*O*";
                            for (String[] row : board){
                                for (String spot : row){
                                    System.out.print(spot + "\t");
                                }
                                System.out.print("\n");
                            }
                            System.out.println(crossC.get(0) + " is the winner!");
                            complete = true;
                        }
                    }
                    if (chosen.size() == 9 && !complete){
                        for (String[] row : board){
                            for (String spot : row){
                                System.out.print(spot + "\t");
                            }
                            System.out.print("\n");
                        }
                        System.out.println("It is a tie...");
                        complete = true;
                    }
                    xTurn = true;
                }
            }
            chosen.clear();
            win1.clear();
            win2.clear();
            win3.clear();
            winA.clear();
            winB.clear();
            winC.clear();
            crossA.clear();
            crossC.clear();
            System.out.println("Enter y to play again: ");
            again = scanner.next();
        } while(again.equalsIgnoreCase("y"));
        System.out.println("Goodbye...");
    }

    public static boolean validChoice(String choice){
        String[] correct = {"1A", "1B", "1C", "2A", "2B", "2C", "3A", "3B", "3C"};
        for (String valid : correct){
            if (choice.equalsIgnoreCase(valid)){
                return true;
            }
        }
        return false;
    }

    public static boolean threeRow(ArrayList<String> row){
        if (row.get(0).equals("X") && row.get(1).equals("X") && row.get(2).equals("X")){
            return true;
        }
        return row.get(0).equals("O") && row.get(1).equals("O") && row.get(2).equals("O");
    }
}
