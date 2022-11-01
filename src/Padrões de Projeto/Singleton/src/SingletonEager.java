/*
 * 
 * Singleton "apressado"
 * 
 * @author Nilso97
 * 
 */
public class SingletonEager {
    
    private static SingletonEager instance = new SingletonEager();

    // Construtor privado
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
