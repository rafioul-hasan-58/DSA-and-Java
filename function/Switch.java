public class Switch {

    static void findGrade(int mark) {
        switch (mark / 10) {
            case 10:
            case 9:
            case 8:
                System.out.println("A+");
                break;
            case 7:
                System.out.println("A");
                break;
            case 6:
                System.out.println("A-");
            default:
                break;
        }
    }

    public static void main(String[] args) {
        findGrade(81);
    }
}
