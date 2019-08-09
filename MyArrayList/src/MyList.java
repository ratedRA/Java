import java.util.Arrays;
import java.util.stream.Stream;

public class MyList<T> implements CustomList<T> {
    private int size = 0;
    private static int defaultSize = 10;

    private Object storeList[];

    public MyList() {
        this.storeList = new Object[defaultSize];
    }

    public boolean addItem(T item){
        if(this.size == storeList.length){
            increaseCapacity();
        }
        else{
            storeList[size] = item;
            this.size+=1;
        }
        return true;
    }
    public void increaseCapacity(){
        int updatedSize = storeList.length*2;
        storeList = Arrays.copyOf(storeList, updatedSize);
    }

    public T getItem(int i){
        if(i>=size && i<0){
            return null;
        }
        return (T) storeList[i];
    }

    @Override
    public int size() {
        return storeList.length;
    }


    public boolean remove(int i){
        if(i>=size && i<0){
            return false;
        }
        else{
            int remainingIndexes = storeList.length - ( i + 1 ) ;
            System.arraycopy( storeList, i + 1, storeList, i, remainingIndexes ) ;
            size--;
            return true;
        }
    }

}
