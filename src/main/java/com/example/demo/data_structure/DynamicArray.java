package com.example.demo.data_structure;

/**
 *
 * @author sunrui
 * @date 2021/1/20
 */
public class DynamicArray<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private static final int ELEMENT_NOT_FOUND = -1;
    private E[] elements = (E[]) new Object[DEFAULT_CAPACITY];

    public DynamicArray(){

    }
    public DynamicArray(int capacity){
        elements = (E[]) new Object[capacity];

    }

    /**
     * 检查索引越界
     * @author sunrui
     * @date 2021/1/20
     * @param index
     * @return void
     */
    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }
    private void checkAddIndex(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * 扩容1.5倍
     * @author sunrui
     * @date 2021/1/20
     * @param
     * @return void
     */
    private void ensureCapacity(){
        E[] newElements = (E[]) new Object[elements.length + (elements.length >> 1)];
        for(int i = 0;i < size;i++){
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    /**
     * 数组大小
     * @author sunrui
     * @date 2021/1/20
     * @param
     * @return int
     */
    public int size(){
        return size;
    }

    /**
     * 添加元素
     * @author sunrui
     * @date 2021/1/20
     * @param e
     * @return void
     */
    public void add(E e){
        if(size > elements.length -1){
            ensureCapacity();
        }
        elements[size++] = e;
    }

    /**
     * 指定位置添加元素
     * @author sunrui
     * @date 2021/1/20
     * @param index
     * @param e
     * @return void
     */
    public void add(int index,E e){
        checkAddIndex(index);
        for(int i = size; i > index;  i--){
            elements[i] = elements[i-1];
        }
        elements[index] = e;
        size++;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean contains(E e){
        if(e == null){
            for(int i = 0; i < size;i++){
                if(elements[i] == null){
                    return true;
                }
            }
        }else {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(e)) {
                    return true;
                }
            }
        }
        return false;
    }
    public E get(int index){
        checkIndex(index);
        return elements[index];
    }
    public E set(int index,E e){
        checkIndex(index);
        E old = elements[index];
        elements[index] = e;
        return old;
    }
    public E remove(int index){
        checkIndex(index);
        E old = elements[index];
        for (int i = index;i < size;i ++){
            elements[i] = elements[i+1];
        }
        elements[size--] = null;
        return old;

    }
    public int indexOf(E e){
        if(e == null){
            for(int i = 0; i < size;i++){
                if(elements[i] == null){
                    return i;
                }
            }
        }else {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(e)) {
                    return i;
                }
            }
        }
        return ELEMENT_NOT_FOUND;
    }
    public void clear(){
        for(int i = 0;i < size;i++){
            elements[i] = null;
        }
        size = 0;
    }

    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        System.out.println(array.size);
        array.clear();
        System.out.println(array.size);
    }
}
