package multipleInheritanceOfBehaviour;

import java.util.Collections;

public interface MyInterface3 extends MyInterface, MyInterface2
{

	@Override
	default void defaultMethod() {
		// TODO Auto-generated method stub
		MyInterface.super.defaultMethod();

	}
	

}