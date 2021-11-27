package util;

import java.util.Arrays;

public class ArrayFactory {
    public static int[] make(int... array) {
        return array;
    }

    public static boolean[] make(boolean... array) {
        return array;
    }

    public static float[] make(float... array) {
        return array;
    }

    public static double[] make(double... array) {
        return array;
    }

    public static byte[] make(byte... array) {
        return array;
    }

    public static char[] make(char... array) {
        return array;
    }

    @SafeVarargs
    public static <T> T[] makeAbs(T... array) {
        return array;
    }

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


    private final int row;
    private final int column;
    private ArrayFactory(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public static ArrayFactory getInterface(int row, int column) {
        return new ArrayFactory(row, column);
    }

    public int[][] getEmptyIntArray() {
        return new int[row][column];
    }

    public boolean[][] getEmptyBooleanArray() {
        return new boolean[row][column];
    }

    public float[][] getEmptyFloatArray() {
        return new float[row][column];
    }

    public double[][] getEmptyDoubleArray() {
        return new double[row][column];
    }

    public char[][] getEmptyCharArray() {
        return new char[row][column];
    }

    public byte[][] getEmptyByteArray() {
        return new byte[row][column];
    }

    public <T> T[][] getEmptyAbstractArray() {
        //noinspection unchecked
        return (T[][]) new Object[row][column];
    }

    public int[][] setup(int... data) {
        int[][] result = getEmptyIntArray();
        int index = 0;
        for (int[] ts : result) {
            System.arraycopy(data, index, ts, 0, ts.length);
            index += ts.length;
        }
        return result;
    }

    public boolean[][] setup(boolean... data) {
        boolean[][] result = getEmptyBooleanArray();
        int index = 0;
        for (boolean[] ts : result) {
            System.arraycopy(data, index, ts, 0, ts.length);
            index += ts.length;
        }
        return result;
    }

    public float[][] setup(float... data) {
        float[][] result = getEmptyFloatArray();
        int index = 0;
        for (float[] ts : result) {
            System.arraycopy(data, index, ts, 0, ts.length);
            index += ts.length;
        }
        return result;
    }

    public double[][] setup(double... data) {
        double[][] result = getEmptyDoubleArray();
        int index = 0;
        for (double[] ts : result) {
            System.arraycopy(data, index, ts, 0, ts.length);
            index += ts.length;
        }
        return result;
    }

    public char[][] setup(char... data) {
        char[][] result = getEmptyCharArray();
        int index = 0;
        for (char[] ts : result) {
            System.arraycopy(data, index, ts, 0, ts.length);
            index += ts.length;
        }
        return result;
    }

    public byte[][] setup(byte... data) {
        byte[][] result = getEmptyByteArray();
        int index = 0;
        for (byte[] ts : result) {
            System.arraycopy(data, index, ts, 0, ts.length);
            index += ts.length;
        }
        return result;
    }

    @SafeVarargs
    public final <T> T[][] setupAbs(T... data) {
        T[][] result = getEmptyAbstractArray();
        int index = 0;
        for (T[] ts : result) {
            System.arraycopy(data, index, ts, 0, ts.length);
            index += ts.length;
        }
        return result;
    }
}
