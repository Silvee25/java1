package access_modifier;

class priaccessspecifier 
{ 
  private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class AccessSpecifiers2 {

	public static void main(String[] args) {
		System.out.println("Private Access Specifier");
		priaccessspecifier  obj = new priaccessspecifier(); 
        //trying to access private method of another class 
        //obj.display();

	}

	}

