/** This is a subclass of the superclass "Clothing"
 * which creates Shirts objects.
 *
 * @author Harshil Shah
 * @version 1
 */
public class Shirts extends Clothing {

    //declaration of instance variables
    private String shirtSize;
    private boolean hasDesign;

    /** Creates a Shirts object
     *
     * @param shirtBrand - brand of shirt
     * @param shirtColor - color of shirt
     * @param shirtType - type of shirt
     * @param shirtPrice - price of the shirt
     * @param shirtSize - size of shirt
     * @param hasDesign - does the shirt have a design?
     */
    public Shirts (String shirtBrand, String shirtColor, String shirtType, double shirtPrice, String shirtSize, boolean hasDesign) {
        super(shirtBrand, shirtColor, shirtType, shirtPrice);
        this.shirtSize = shirtSize;
        this.hasDesign = hasDesign;
    }

    /** Compares 2 objects to see if they are equal
     *
     * @param shirt - the object being compared
     * @return a boolean result of whether or not the 2 objects are equal
     */
    public boolean equals(Clothing shirt) {
        if (shirt == null) {
            return false;
        }

        if (!(shirt instanceof Shirts)) {
            return false;
        }

        Shirts comp = (Shirts)shirt;

        if (this.clothingEquals(comp) && this.shirtSize.equals(comp.shirtSize) && this.hasDesign == comp.hasDesign) {
            return true;
        }

        return false;
    }

    /** Makes a string representation of the object
     *
     * @return the string representation of the object
     */
    public String toString() {
        String message = "You have the new " + this.shirtSize + " " + super.getClothingColor() + " " + super.getBrandName() + " " + getClothingType() + " that cost $" + super.getClothingPrice();

        if (this.hasDesign) {
            message += " with a Design!";
        } else {
            message += " with no Design!";
        }

        return message;
    }
}
