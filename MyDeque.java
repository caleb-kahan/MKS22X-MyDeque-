public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    this(10);
  }
  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    size= 0;
    start =  -1;
    end   =  -1;
    data = (E[])new Object[size];
  }
  public int size(){
    return size;
  }
  public String toString(){
    String returner = "";
    for(E gener: data){
      returner += gener + " ";
    }
    return returner;
  }
  public void addFirst(E element){
    if(start > 0 && start<=end){}
      data[--start]=element;
  }
  public void addLast(E element){
    if(end>=start && end <= data.length-2)
      data[++end]=element;

  }
  public E removeFirst(){
    if(start==size-1){
      start=0;
      return data[size-1];
    }
    return data[start++];
  }
  public E removeLast(){
    if(end==0){
      end = size-1;
      return data[0];
    }
    return data[end--];
  }
  public E getFirst(){
    return data[start];
  }
  public E getLast(){
    return data[end];
  }
}
