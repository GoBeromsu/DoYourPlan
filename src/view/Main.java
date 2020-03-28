package view;

public class Main implements view {
    @Override
    public void show() {
        System.out.println("Main 실행");
        System.out.println(info);

        int key = scan.nextInt();

        if (key == 1 ){
            addmemo.show();
        }
        else if(key == 2){

        }
        else{
            System.out.println("조곰 더 기다려봐");
        }
    }
}
