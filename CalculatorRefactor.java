 float firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number:-");
        firstNumber = scanner.nextFloat();
        System.out.println("Enter second number:-");
        secondNumber = scanner.nextFloat();
        System.out.println("Select operation:-");
        System.out.println(" for Addition press a: for Subtraction press-s: for Multiplication press-m: for Division press -/: for Modulus press-%: ");
        char cal = scanner.next().charAt(0);
        switch (cal) {
            case 'a':
                System.out.println("Sum of the given two numbers: " + (firstNumber + secondNumber));
                break;
            case 's':
                System.out.println("Subtraction of the given two numbers: " + (firstNumber - secondNumber));
                break;
            case 'm':
                System.out.println("multiplication of the given two numbers: " + (firstNumber * secondNumber));
                break;
            case '/':
                System.out.println("division of the given two numbers: " + (firstNumber / secondNumber));
                break;
            case '%':
                System.out.println("modulus of the given two numbers: " + (firstNumber % secondNumber));
                break;
            default:
                System.out.println("error");
        }
