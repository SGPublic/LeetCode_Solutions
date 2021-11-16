package util;

import java.util.Arrays;

public class PrintUtil {
    public static <T> void println(T[][] arrays) {
        for (T[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void println(int[][] arrays) {
        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void println(boolean[][] arrays) {
        for (boolean[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void println(float[][] arrays) {
        for (float[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void println(double[][] arrays) {
        for (double[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void println(byte[][] arrays) {
        for (byte[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
    }

    public static <T> void println(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void println(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void println(boolean[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void println(float[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void println(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void println(byte[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static <T> void println(T object) {
        System.out.println(object.toString());
    }

    public static void println() {
        System.out.println();
    }
}
