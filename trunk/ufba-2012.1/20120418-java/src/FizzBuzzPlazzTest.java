import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzPlazzTest {

@Test
public  void test1() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(1), "1"); 
}

@Test
public  void test2() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(2), "1,2"); 
}

@Test
public  void test3() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(3), "1,2,Fizz"); 
}

@Test
public  void test4() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(4), "1,2,Fizz,4"); 
}

@Test
public  void test5() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(5), "1,2,Fizz,4,Buzz"); 
}

@Test
public  void test6() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(6), "1,2,Fizz,4,Buzz,Fizz"); 
}

@Test
public  void test7() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(7), "1,2,Fizz,4,Buzz,Fizz,Plazz"); 
}
@Test
public  void test10() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(10), "1,2,Fizz,4,Buzz,Fizz,Plazz,8,Fizz,Buzz"); 
}
@Test
public  void test14() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(14), "1,2,Fizz,4,Buzz,Fizz,Plazz,8,Fizz,Buzz,11,Fizz,13,Plazz"); 
}
@Test
public  void test15() {
	FizzBuzzPlazz f = new FizzBuzzPlazz();
	assertEquals(f.compare(15), "1,2,Fizz,4,Buzz,Fizz,Plazz,8,Fizz,Buzz,11,Fizz,13,Plazz,FizzBuzz"); 
}

}
