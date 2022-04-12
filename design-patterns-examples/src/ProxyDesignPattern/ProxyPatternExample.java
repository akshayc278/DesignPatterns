//create separate call for each user //setting proxy code 
package ProxyDesignPattern;

interface DatabaseOperation{
	void delete();
}

class DbRepository implements DatabaseOperation{

	@Override
	public void delete() {
		System.out.println("Deleted all Records");
	}
	public void deleteQueryImpl(String user) throws Exception {
		if (user.equalsIgnoreCase("admin")) {
			delete();
		}
		else {
			throw new Exception("User not allowed yo do this operation");
		}
	}
	
}
public class ProxyPatternExample {
	public static void main(String[] args) {
		DbRepository dr=new DbRepository();
		try {
			System.out.println("calling admin query");
			dr.deleteQueryImpl("admin");
			System.out.println("calling user query");
			dr.deleteQueryImpl("user");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
