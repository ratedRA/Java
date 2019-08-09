import java.util.stream.Stream;

public interface CustomList<T> {
     boolean addItem(T item);
     T  getItem(int i);
     boolean remove(int i);
     int size();
}
