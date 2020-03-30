package view;

public class Addmemo implements view {
    @Override
    public void show() {
        System.out.println("Addmemo 실행");

        int exitkey = scan.nextInt();
        if (exitkey >= 0) {
            controller.process();
        }
    }
}
