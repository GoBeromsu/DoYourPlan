package controller;

import view.*;

import java.util.Scanner;


public interface Resource {

    controller controller = new controller();
    Main main = new Main();
    Addmemo addmemo = new Addmemo();
    Showmemo showmemo = new Showmemo();
    Scanner scan = new Scanner(System.in);

    String info = "1: Add Memo 2 : show All Memo";

}
