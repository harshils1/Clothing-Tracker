/** This is a subclass of the superclass "Clothing"
 * which creates Shoes objects.
 *
 * @author Harshil Shah
 * @version 1
 */
public class Shoes extends Clothing {

    //declaration of instance variables
    private double shoeSize;
    private boolean hasLaces;

    /** Creates a Shoes object
     *
     * @param shoeBrand - brand of shoe
     * @param shoeColor - color of shoe
     * @param shoeType - type of shoe
     * @param shoePrice - price of shoe
     * @param shoeSize - size of shoe
     * @param hasLaces - does the shoe have laces?
     */
    public Shoes (String shoeBrand, String shoeColor, String shoeType, double shoePrice, double shoeSize, boolean hasLaces) {
        super(shoeBrand, shoeColor, shoeType, shoePrice);
        this.shoeSize = shoeSize;
        this.hasLaces = hasLaces;
    }

    /** Compares 2 objects to see if they are equal
     *
     * @param shoe - the object being compared
     * @return a boolean result of whether or not the 2 objects are equal
     */
    public boolean equals(Clothing shoe) {
        if (shoe == null) {
            return false;
        }

        if (!(shoe instanceof Shoes)) {
            return false;
        }

        Shoes comp = (Shoes)shoe;

        if (this.clothingEquals(comp) && this.shoeSize == (comp.shoeSize) && this.hasLaces == comp.hasLaces) {
            return true;
        }

        return false;
    }

    /** Makes a string representation of the object
     *
     * @return the string representation of the object
     */
    public String toString() {
        String message = "You have the new size " + this.shoeSize + " " + super.getClothingColor() + " " + super.getBrandName() + " " + getClothingType() + " that cost $" + super.getClothingPrice();

        if (this.hasLaces) {
            message += " with Laces!";
        } else {
            message += " with no Laces!";
        }

        return message;
    }
}
