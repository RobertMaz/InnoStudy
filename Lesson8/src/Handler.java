import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {
    private final Printer printer;

    public Handler(Printer printer) {
        this.printer = printer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        final long l = System.currentTimeMillis();
        System.out.println("start message");
        method.invoke(printer, args);
        System.out.println("finish message");
        System.out.println(System.currentTimeMillis() - l);
        return null;
    }
}
