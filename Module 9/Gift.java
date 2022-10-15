// Brandon Dreslin - SPC ID# 2414755; COP2250 #209; Chapter 9 Assignment

/* Notes: 
 * (a) The 'Gift' constructor was generated by utilizing the following command in Eclipse:
 * 			Source > Generate Constructor Using Fields
 * (b) Each accessor and mutator for the object's fields were generated by utilizing the following command in Eclipse:
 * 			Source > Generate Getters and Setters
 * (c) The 'ClassGiftUML.ucls' UML diagram was generated by utilizing the following command in Eclipse: 
 * 			File > New > Other > ObjectAid UML Diagram > ObjectAid Class Diagram
 */
package dreslin9;
//Create a new custom 'Gift' class - this will be called within the executable 'main' method inside 'Program91.java.'
public class Gift {
	// Declare a private attribute called 'recipient' of type 'String' belonging to class 'Gift.'
	private String recipient; 
	// Declare a private attribute called 'description' of type 'String' belonging to class 'Gift.'
	private String description; 
	// Declare a private attribute called 'price' of type 'double' belonging to class 'Gift.'
	private double price; 
	// Declare a private attribute called 'qty' of type 'int' belonging to class 'Gift.'
	private int qty; 
	// Declare a public and static attribute called 'recipients' (different from private 'recipient,' as this attribute will keep track of how many people receive gifts) of type 'int' belonging to class 'Gift.'
	public static int recipients = 0;
	// Construct a 'Gift' object (using the following constructor syntax) for parameters 'recipient,' 'description,' 'price,' and 'qty.'
	public Gift(String recipient, String description, double price, int qty) {
		// Create an instance of the parent class ('Gift') to immediately reference the class whenever a new object is created by using the 'super()' keyword.
		super();
		// Create a new 'recipient' field for the new 'Gift' object by utilizing the 'this' keyword for the 'recipient' attribute.
		this.recipient = recipient;
		// Create a new 'description' field for the new 'Gift' object by utilizing the 'this' keyword for the 'description' attribute.
		this.description = description;
		// Create a new 'price' field for the new 'Gift' object by utilizing the 'this' keyword for the 'price' attribute.
		this.price = price;
		// Create a new 'qty' field for the new 'Gift' object by utilizing the 'this' keyword for the 'qty' attribute.
		this.qty = qty;
		// Increment the 'recipients' attribute by one each time a new object is created and the previous field requirements are satisfied.
		recipients++;
	}
	// Create an accessor method for attribute 'recipient' called 'getRecipient.'
	public String getRecipient() {
		// Return the gift recipient's name. 
		return recipient;
	}
	// Create a mutator method for attribute 'recipient' called 'setRecipient.'
	public void setRecipient(String recipient) {
		// Set the gift recipient's name by using the 'this' keyword for the 'recipient' field.'
		this.recipient = recipient;
	}
	// Create an accessor method for attribute 'description' called 'getDescription.'
	public String getDescription() {
		// Return the gift's description (i.e., what the recipient's gift is). 
		return description;
	}
	// Create a mutator method for attribute 'description' called 'setDescription.'
	public void setDescription(String description) {
		// Set the gift's description by using the 'this' keyword for the 'description' field.'
		this.description = description;
	}
	// Create an accessor method for attribute 'price' called 'getPrice.'
	public double getPrice() {
		// Return the price of the gift.
		return price;
	}
	// Create a mutator method for attribute 'price' called 'setPrice.'
	public void setPrice(double price) {
		// Set the gift's price by using the 'this' keyword for the 'price' field.'
		this.price = price;
	}
	// Create an accessor method for attribute 'qty' called 'getQty.'
	public int getQty() {
		// Return the quantity of the gift. 
		return qty;
	}
	// Create a mutator method for attribute 'qty' called 'setQty.'
	public void setQty(int qty) {
		// Set the gift's quantity by using the 'this' keyword for the 'qty' field.'
		this.qty = qty;
	}
	// Create a void method for calculating the subtotal of the current 'Gift' object called 'giftsVal.'
	public void giftsVal() {
		// Calculate the gift's subtotal (i.e., the total spent on each individual) by multiplying 'price' and 'qty' together. Assign to variable 'subtotal' of type 'double.'
		double subtotal = price * qty;
		// Report the amount spent on each individual to the user, ensuring that the output is formatted according to currency format by calling the 'printf()' method.
		System.out.printf("Spent on " + recipient + ": " + "$%,.2f", subtotal);
	}
	// Eclipse overridden method.
	@Override
	// Report the value of an object's attributes to the user by using a 'toString()' method. 
	public String toString() {
		// Return the value of each attribute, ensuring that the output is presented in a logical manner. 
		return recipient + ", gift " + description + ", $" + price + ", quantity " + qty;
	}
	
	
	

}