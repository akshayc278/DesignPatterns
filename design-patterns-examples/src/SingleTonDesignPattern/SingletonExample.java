package SingleTonDesignPattern;
//Eager initialization
class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {
	}

	public static Singleton getSingleton() {
		return singleton;
	}
}

//Lazy initialization
class SingletonLazy {
	private static SingletonLazy singletonLazy;

	private SingletonLazy() {

	}

	public static SingletonLazy getSingletonLazy() {
		if (singletonLazy == null) {
			singletonLazy = new SingletonLazy();
		}
		return singletonLazy;
	}

}

//Thread safe method level
class SingletonMethod {
	private static SingletonMethod singtonMethod;

	private SingletonMethod() {

	}

	public static synchronized SingletonMethod getSingtonMethod() {
		if (singtonMethod == null) {
			singtonMethod = new SingletonMethod();
		}
		return singtonMethod;
	}

}

//Thread safe block level
class SingletonBlock {
	private static SingletonBlock singletonBlock;

	private SingletonBlock() {

	}

	public static synchronized SingletonBlock getSingletonBlock() {
		if(singletonBlock == null) {
			synchronized(SingletonBlock.class) {
				if(singletonBlock == null) {
					singletonBlock=new SingletonBlock();
				}
			}
		}
		return singletonBlock;
	}

}

public class SingletonExample {
	public static void main(String[] args) {
		// Eager initialization
		Singleton singletonObj = Singleton.getSingleton();
		System.out.println(singletonObj);
		Singleton singletonObj2 = Singleton.getSingleton();
		System.out.println(singletonObj2);
		// Lazy initialization
		SingletonLazy singletonLazyObj = SingletonLazy.getSingletonLazy();
		System.out.println(singletonLazyObj);
		SingletonLazy singletonLazyObj2 = SingletonLazy.getSingletonLazy();
		System.out.println(singletonLazyObj2);
	}
}
