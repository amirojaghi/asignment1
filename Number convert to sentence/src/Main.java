 public class Main {
    public static void main(String[] args) {

        int number = 368;
        String words = "";

        System.out.println("Your Number: " + number);

        if (number < 0) {
            words = "Negative number not supported";
        } else if (number == 0) {
            words = "Zero";
        } else if (number < 1000) {

            if (number / 100 > 0) {
                switch (number / 100) {
                    case 1:
                        words += "One Hundred ";
                        break;
                    case 2:
                        words += "Two Hundred ";
                        break;
                    case 3:
                        words += "Three Hundred ";
                        break;
                    case 4:
                        words += "Four Hundred ";
                        break;
                    case 5:
                        words += "Five Hundred ";
                        break;
                    case 6:
                        words += "Six Hundred ";
                        break;
                    case 7:
                        words += "Seven Hundred ";
                        break;
                    case 8:
                        words += "Eight Hundred ";
                        break;
                    case 9:
                        words += "Nine Hundred ";
                        break;
                }
                number = number % 100;
            }

            //Numbers less than 100
            if (number < 20) {
                switch (number) {
                    case 1:
                        words += "One";
                        break;
                    case 2:
                        words += "Two";
                        break;
                    case 3:
                        words += "Three";
                        break;
                    case 4:
                        words += "Four";
                        break;
                    case 5:
                        words += "Five";
                        break;
                    case 6:
                        words += "Six";
                        break;
                    case 7:
                        words += "Seven";
                        break;
                    case 8:
                        words += "Eight";
                        break;
                    case 9:
                        words += "Nine";
                        break;
                    case 10:
                        words += "Ten";
                        break;
                    case 11:
                        words += "Eleven";
                        break;
                    case 12:
                        words += "Twelve";
                        break;
                    case 13:
                        words += "Thirteen";
                        break;
                    case 14:
                        words += "Fourteen";
                        break;
                    case 15:
                        words += "Fifteen";
                        break;
                    case 16:
                        words += "Sixteen";
                        break;
                    case 17:
                        words += "Seventeen";
                        break;
                    case 18:
                        words += "Eighteen";
                        break;
                    case 19:
                        words += "Nineteen";
                        break;
                }
            } else {
                // Numbers lees ten
                switch (number / 10) {
                    case 2:
                        words += "Twenty";
                        break;
                    case 3:
                        words += "Thirty";
                        break;
                    case 4:
                        words += "Forty";
                        break;
                    case 5:
                        words += "Fifty";
                        break;
                    case 6:
                        words += "Sixty";
                        break;
                    case 7:
                        words += "Seventy";
                        break;
                    case 8:
                        words += "Eighty";
                        break;
                    case 9:
                        words += "Ninety";
                        break;
                }


                if (number % 10 != 0) {
                    switch (number % 10) {
                        case 1:
                            words += " One";
                            break;
                        case 2:
                            words += " Two";
                            break;
                        case 3:
                            words += " Three";
                            break;
                        case 4:
                            words += " Four";
                            break;
                        case 5:
                            words += " Five";
                            break;
                        case 6:
                            words += " Six";
                            break;
                        case 7:
                            words += " Seven";
                            break;
                        case 8:
                            words += " Eight";
                            break;
                        case 9:
                            words += " Nine";
                            break;
                    }
                }
            }
        } else if (number == 1000) {
            words = "One Thousand";
        } else {
            words = "Number out of range";
        }

        // Print result
        System.out.println(words.trim());
    }
        }

