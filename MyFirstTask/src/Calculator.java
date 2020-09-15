import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
            int operand1 = getOperand();
            int operand2 = getOperand();
            char operation = getOperation();
            int result = calculation(operand1, operand2 ,operation);
            System.out.println("равно: "+result);
        }

        private static int getOperand(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число:");
            int ourNumber;
            if(scanner.hasNextInt()){
                ourNumber = scanner.nextInt();
            } else {
                System.out.println("Введенный символ не является числом");
                scanner.next();
                ourNumber = getOperand();
            }
            return ourNumber;
        }

        private static char getOperation(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите операцию:");
            char operation;
            if(scanner.hasNext()){
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
                scanner.next();
                operation = getOperation();
            }
            return operation;
        }

    private static int calculation(int operand1, int operand2, char operator) {

        int relust = 0;
        switch (operator) {
            case '+':
                relust = operand1 + operand2;
                break;
            case '-':
                relust = operand1 - operand2;
                break;
            case '*':
                relust = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("Мы на ноль не делим");
                } else {
                    relust = operand1 / operand2;
                }
                break;
            default:
                System.out.println("указанной вами операции не существует ");
                break;
        }
        return relust;
    }
}

