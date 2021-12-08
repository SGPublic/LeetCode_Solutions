package util;

import java.util.Arrays;

public class ArrayFactory {
    public static int[] append(int[] array, int... newObjects) {
        int[] newArray = Arrays.copyOf(array, array.length + newObjects.length);
        System.arraycopy(newObjects, 0, newArray, array.length, newObjects.length);
        return newArray;
    }

    public static boolean[] append(boolean[] array, boolean... newObjects) {
        boolean[] newArray = Arrays.copyOf(array, array.length + newObjects.length);
        System.arraycopy(newObjects, 0, newArray, array.length, newObjects.length);
        return newArray;
    }

    public static float[] append(float[] array, float... newObjects) {
        float[] newArray = Arrays.copyOf(array, array.length + newObjects.length);
        System.arraycopy(newObjects, 0, newArray, array.length, newObjects.length);
        return newArray;
    }

    public static double[] append(double[] array, double... newObjects) {
        double[] newArray = Arrays.copyOf(array, array.length + newObjects.length);
        System.arraycopy(newObjects, 0, newArray, array.length, newObjects.length);
        return newArray;
    }

    public static char[] append(char[] array, char... newObjects) {
        char[] newArray = Arrays.copyOf(array, array.length + newObjects.length);
        System.arraycopy(newObjects, 0, newArray, array.length, newObjects.length);
        return newArray;
    }

    public static byte[] append(byte[] array, byte... newObjects) {
        byte[] newArray = Arrays.copyOf(array, array.length + newObjects.length);
        System.arraycopy(newObjects, 0, newArray, array.length, newObjects.length);
        return newArray;
    }

    @SafeVarargs
    public static <T> T[] appendAbs(T[] array, T... newObjects) {
        T[] newArray = Arrays.copyOf(array, array.length + newObjects.length);
        System.arraycopy(newObjects, 0, newArray, array.length, newObjects.length);
        return newArray;
    }

    public static String parseString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int obj : array) {
            sb.append(obj).append(" ");
        }
        return sb.substring(0, Math.max(sb.length(), 1) - 1);
    }

    public static String parseString(boolean[] array) {
        StringBuilder sb = new StringBuilder();
        for (boolean obj : array) {
            sb.append(obj).append(" ");
        }
        return sb.substring(0, Math.max(sb.length(), 1) - 1);
    }

    public static String parseString(float[] array) {
        StringBuilder sb = new StringBuilder();
        for (float obj : array) {
            sb.append(obj).append(" ");
        }
        return sb.substring(0, Math.max(sb.length(), 1) - 1);
    }

    public static String parseString(double[] array) {
        StringBuilder sb = new StringBuilder();
        for (double obj : array) {
            sb.append(obj).append(" ");
        }
        return sb.substring(0, Math.max(sb.length(), 1) - 1);
    }

    public static String parseString(char[] array) {
        StringBuilder sb = new StringBuilder();
        for (char obj : array) {
            sb.append(obj).append(" ");
        }
        return sb.substring(0, Math.max(sb.length(), 1) - 1);
    }

    public static String parseString(byte[] array) {
        StringBuilder sb = new StringBuilder();
        for (byte obj : array) {
            sb.append(obj).append(" ");
        }
        return sb.substring(0, Math.max(sb.length(), 1) - 1);
    }

    public static <T> String parseStringAbs(T[] array) {
        StringBuilder sb = new StringBuilder();
        for (T obj : array) {
            sb.append(obj).append(" ");
        }
        return sb.substring(0, Math.max(sb.length(), 1) - 1);
    }
}
