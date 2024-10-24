package gallows.visual;

public class Picture {
    private static Picture instance;
    private int amountOfElements = 0;

    private Picture() {
    }

    public static Picture getPicture() {
        if (instance == null) {
            instance = new Picture();
        }
        return instance;
    }

    public void setAmountOfElements(int amount) {
        amountOfElements = amount;
    }

    public void showPicture() {

        switch (amountOfElements) {
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
