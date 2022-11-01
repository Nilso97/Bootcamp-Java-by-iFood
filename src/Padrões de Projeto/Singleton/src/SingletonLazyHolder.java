/*
 * 
 * Singleton "Lazy Holder"
 * 
 * @author Nilso97
 * 
 */
public class SingletonLazyHolder {
    
    private static class InstanceHolder {
        private static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    // Construtor privado
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
