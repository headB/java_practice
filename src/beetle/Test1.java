package beetle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Test1 {

	Test1() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world!");

		// 添加一个数组
		int[] array1 = new int[] { 1, 2, 3, 4, 5 };

		List<Integer> l2 = new ArrayList<>();

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);

		Generic<Integer> gInteger = new Generic<Integer>(123);
		Generic<Number> gNumber = new Generic<Number>(456);

		
		showKeyValue1(gInteger);
		showKeyValue1(gNumber);

	}
	
	static public void showKeyValue1(Generic<?> obj){
	    System.out.println("泛型测试"+"key value is " + obj.getKey());
	}

	@Test
	public void six() {

		System.out.println("asd");
	}

}

//我是一个普通的泛型
class Generic<T>{ 
    //key这个成员变量的类型为T,T的类型由外部指定  
    private T key;

    public Generic(T key) { //泛型构造方法形参key的类型也为T，T的类型由外部指定
        this.key = key;
    }

    public T getKey(){ //泛型方法getKey的返回值类型为T，T的类型由外部指定
        return key;
    }
}



interface f1 {

	public void test(Integer i1);

	public void test1();

}

interface f2 {

	public void test(String str);

	public void test2();

	public void test1();

}

class c3 implements f1, f2 {

	@Override
	public void test2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test(String str) {
		// TODO Auto-generated method stub

	}

	@Override
	public void test(Integer i1) {
		// TODO Auto-generated method stub

	}

}

abstract class a1 implements f1 {

	public abstract void test123(Long l1);

	public void test1() {
		System.out.println("我是抽象类，但是我也可以实现接口方法");
	}

}

class c4 extends a1 {

	public String name = "kumanxuan";

	@Override
	public void test(Integer i1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void test123(Long l1) {
		// TODO Auto-generated method stub

	}

}

interface Iasd{
	
}





