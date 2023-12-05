package edu.datastructures.array;

import java.util.function.IntFunction;

public class ArrayUtilityHelper {
    public static <T> int size(T[]... items) {
        int length = 0;
        for (T [] x: items) {
            length += x.length;
        }
        return length;
    }
    public static Integer [] merge(Integer[]... items ) {
        return merge(Integer[]::new, items);
    }
    public static String [] merge(String[]... items ) {
        return merge(String[]::new, items);
    }
    public static <T> T [] merge(IntFunction<T[]> intFunction, T[]... items ) {
        T[] result = intFunction.apply(size(items));
        int i = 0;
        for (T [] ts: items) {
            for (T t : ts) {
                result [i ++] = t;
            }
        }
        return result;
    }
    public static <T> T [] copyRange(IntFunction<T[]> intFunction,T[] data,int start, int end) {
        int newSize = end - start+1;
        T[] newData = intFunction.apply(newSize);
        for(int i = start, n=0; i<=end;i++ ){
             newData[n++]=data[i];
        }
        return newData  ;
    }
    public static <T> T [] removeIndexes(IntFunction<T[]> intFunction,T[] data,int... indexes) {
        T[] newData = intFunction.apply(data.length-indexes.length);
        for (int i = 0,n=0,m=0; i < data.length; i++) {
            int len = indexes.length;
            boolean status = i == indexes[n];
            if(!status){
                newData[m++]= data[i];
            }else {
                if(len==0){
                    n=0;
                }else
                if(n>=len-1) {
                    n=0;
                }else {
                    n++;
                }
            }
        }
        return newData  ;
    }
    public static <T> T[] allocateMoreData(IntFunction<T[]> intFuntion, T[] data, int newSize, T... newItems) {
     int emptyElementSize = newSize - (newItems.length+ data.length);
     T[] emptyItems = intFuntion.apply(emptyElementSize);
     T[] newData = merge(intFuntion,data,newItems,emptyItems);
     return newData;
    }
    public static<T> String toString(T[] items){
        StringBuilder sb = new StringBuilder();
        sb.append("Content Size is: ");
        int size = size(items), count = 0;
        sb.append(size);
        sb.append(" ,content: [");
        String delimiter = ", ";
        for (T t: items
        ) {
            count++;
            if(count>size)break;
            else if(count>size-1)
                delimiter = "";
            sb.append(t);
            sb.append(delimiter);
        }
        sb.append("]");
        return sb.toString();
    }

}
