package FindUser;

@FunctionalInterface
public interface FindUser<T,S>{

    T findBy(S attribute);
}
