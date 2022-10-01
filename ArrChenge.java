package Less3;

public class ArrChenge<T> {



    T c;

    public T[] swap(T[] array, int a, int b) {
        T c = array[a];
        array[a] = array[b];
        array[b] = c;

        return array;
    }
}


