/** This is a subclass of the superclass "Clothing"
 * which creates Pants objects.
 *
 * @author Harshil Shah
 * @version 1
 */
public class Pants extends Clothing {

    //declaration of instance variables
    private String pantSize;
    private boolean hasPockets;

    /** Creates a Pants object
     *
     * @param pantBrand - brand of pant
     * @param pantColor - color of pant
     * @param pantType - type of pant
     * @param pantPrice - price of the pant
     * @param pantSize - size of pant
     * @param hasPockets - does the pant have pockets?
     */
    public Pants (String pantBrand, String pantColor, String pantType, double pantPrice, String pantSize, boolean hasPockets) {
        super(pantBrand, pantColor, pantType, pantPrice);
        this.pantSize = pantSize;
        this.hasPockets = hasPockets;
    }


    /** Compares 2 objects to see if they are equal
     *
     * @param pant - the object being compared
     * @return a boolean result of whether or not the 2 objects are equal
     */
    public boolean equals(Clothing pant) {
        if (pant == null) {
            return false;
        }

        if (!(pant instanceof Pants)) {
            return false;
        }

        Pants comp = (Pants)pant;

        if (this.clothingEquals(comp) && this.pantSize.equals(comp.pantSize) && this.hasPockets == comp.hasPockets) {
            return true;
        }

        return false;
    }

    /** Makes a string representation of the object
     *
     * @return the string representation of the object
     */
    public String toString() {
        String message = "You have the new " + this.pantSize + " " + super.getClothingColor() + " " + super.getBrandName() + " " + getClothingType() + " that cost $" + super.getClothingPrice();

        if (this.hasPockets) {
            message += " with Pockets!";
        } else {
            message += " with no Pockets!";
        }

        return message;
    }
}
