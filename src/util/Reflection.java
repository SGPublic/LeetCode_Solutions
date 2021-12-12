package util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressWarnings("unchecked")
public class Reflection<T> {
    private final T object;

    private Reflection(T object) {
        this.object = object;
    }

    public <RESULT> RESULT involve(String methodName, Object... args)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = object.getClass().getMethod(methodName);
        method.setAccessible(true);
        return (RESULT) method.invoke(object, args);
    }

    public static <RESULT, TARGET> RESULT involve(Class<TARGET> clazz, String methodName, Object... args)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = clazz.getMethod(methodName);
        method.setAccessible(true);
        return (RESULT) method.invoke(args);
    }

    public static <TARGET> Reflection<TARGET> getInterface(TARGET object) {
        return new Reflection<>(object);
    }
}
