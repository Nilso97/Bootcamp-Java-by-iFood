/*
 * 
 * Singleton "preguiçoso"
 * 
 * @author Nilso97
 * 
 */
public class SingletonLazy {
    
    private static SingletonLazy instance;

    // Construtor privado
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
