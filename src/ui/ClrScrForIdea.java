package ui;

public class ClrScrForIdea {
    public static void ClrScr() {
        for (int i = 0; i < 50; ++i) {
            System.out.println();
            try {
                Thread.sleep(5);
            } catch (Exception e) {
                System.out.println("");
            }
        }
    }
}
