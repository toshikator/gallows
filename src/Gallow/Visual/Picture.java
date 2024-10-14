package Gallow.Visual;

public class Picture {
    private static int amountOfElements = 0;

    public static void increaseAmountOfElements() {
        amountOfElements++;
    }

    public static void resetAmountOfElements() {
        amountOfElements = 0;
    }

//    public static void setAmountOfElements(int amountOfElements) {
//        if (amountOfElements >= 0 && amountOfElements <= 6) {
//            Picture.amountOfElements = amountOfElements;
//        } else {
//            System.out.println("there is a mistake, amount of elements must be between 0 and 6, but now is " + amountOfElements);
//        }
//    }

    public static void showPicture() {

        switch (Picture.amountOfElements) {
            case 0:
                System.out.println("_______________");
                System.out.println(" |           |");
                System.out.println(" |           |");
                System.out.println(" |          ");
                System.out.println(" |       ");
                System.out.println(" |       ");
                System.out.println(" |       ");
                System.out.println(" |       ");
                System.out.println(" |       ");
                System.out.println(" |");
                break;
            case 1:
                System.out.println("_______________");
                System.out.println(" |           |");
                System.out.println(" |           |");
                System.out.println(" |          (_)");
                System.out.println(" |          ");
                System.out.println(" |        ");
                System.out.println(" |        ");
                System.out.println(" |        ");
                System.out.println(" |        ");
                System.out.println(" |");
                break;
            case 2:
                System.out.println("_______________");
                System.out.println(" |           |");
                System.out.println(" |           |");
                System.out.println(" |          (_)");
                System.out.println(" |         /   \\");
                System.out.println(" |         |   |");
                System.out.println(" |         \\___/");
                System.out.println(" |            ");
                System.out.println(" |             ");
                System.out.println(" |");
                break;
            case 3:
                System.out.println("_______________");
                System.out.println(" |           |");
                System.out.println(" |           |");
                System.out.println(" |          (_)");
                System.out.println(" |       __/   \\");
                System.out.println(" |         |   |");
                System.out.println(" |         \\___/");
                System.out.println(" |            ");
                System.out.println(" |             ");
                System.out.println(" |");
                break;
            case 4:
                System.out.println("_______________");
                System.out.println(" |           |");
                System.out.println(" |           |");
                System.out.println(" |          (_)");
                System.out.println(" |       __/   \\__");
                System.out.println(" |         |   |");
                System.out.println(" |         \\___/");
                System.out.println(" |            ");
                System.out.println(" |             ");
                System.out.println(" |");
                break;
            case 5:
                System.out.println("_______________");
                System.out.println(" |           |");
                System.out.println(" |           |");
                System.out.println(" |          (_)");
                System.out.println(" |       __/   \\__");
                System.out.println(" |         |   |");
                System.out.println(" |         \\___/");
                System.out.println(" |         /   ");
                System.out.println(" |        /     ");
                System.out.println(" |");
                break;
            case 6:
                System.out.println("_______________");
                System.out.println(" |           |");
                System.out.println(" |           |");
                System.out.println(" |          (_)");
                System.out.println(" |       __/   \\__");
                System.out.println(" |         |   |");
                System.out.println(" |         \\___/");
                System.out.println(" |         /   \\");
                System.out.println(" |        /     \\");
                System.out.println(" |");
                break;
        }
    }
}
