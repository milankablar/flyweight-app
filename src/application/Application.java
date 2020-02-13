/*
 * Course: SE2811-051
 * Winter 2019-2020
 * Application - Final Presentation
 * Name: Milan Kablar, Jonas Cira, Nathan DuPont
 * Created: 2/9/2020
 */

package application;

import java.text.NumberFormat;

/**
 * SE2811-051 Winter 2019-2020
 * Application purpose: // TODO
 *
 * @author // TODO
 * @version created on 2/9/2020 at 8:11 PM
 */
public class Application {
    public static void main(String[] args) {
        // TODO write testing code here
        Runtime runtime = Runtime.getRuntime();
        NumberFormat format = NumberFormat.getInstance();
        StringBuilder sb = new StringBuilder();
        long freeMemory = runtime.freeMemory();
        sb.append("Free memory: " + format.format(freeMemory / 1024));
        System.out.println(sb);
    }
}
