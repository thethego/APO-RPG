/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.InputStream;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.InputMismatchException;

/**
 *
 * @author antoine
 */
public abstract class Menu {

    public static final Scanner scanner = new Scanner(in);
    protected final String title;
    protected final String leave;
    protected final String[] items;

    public Menu(String title, String leave, String... items) {
        this.title = title;
        this.leave = leave;
        this.items = items;
    }

    protected abstract void on(int choice);

    public final void display() {
        out.println("# " + title + " #");
        for (int i = 0; i < items.length; i++) {
            out.println(i + 1 + ". " + items[i]);
        }
        out.println("< " + leave);
        out.print("(>");
        try {
            int choice = scanner.nextInt() - 1;
            scanner.nextLine();
            on(choice);
        } catch (InputMismatchException ex) {
            Log.e(ex);
            on(Integer.MAX_VALUE);
        }
    }
}
