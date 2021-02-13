/** This is the superclass program which
 * contains the brand name, clothing color,
 * clothing type, and clothing price for the
 * clothing objects.
 *
 * @author Harshil Shah
 * @version 1
 */
public abstract class Clothing {

    //declaring instance variables
    private String brandName;
    private String clothingColor;
    private String clothingType;
    private double clothingPrice;

    /** Create a new Clothing object
     *
     * @param brandName - the brand name of the clothing
     * @param clothingColor - the color of the clothing
     * @param clothingType - the type of clothing
     * @param clothingPrice - the price of the clothing
     */
    public Clothing (String brandName, String clothingColor, String clothingType, double clothingPrice) {
        this.brandName = brandName;
        this.clothingColor = clothingColor;
        this.clothingType = clothingType;
        this.clothingPrice = clothingPrice;
    }

    /** Returns the brand name of the clothing
     *
     * @return the brand name of the clothing
     */
    public String getBrandName() {
        return this.brandName;
    }

    /** Returns the color of the clothing
     *
     * @return the clothing color
     */
    public String getClothingColor() {
        return this.clothingColor;
    }

    /** Returns the type of clothing
     *
     * @return the type of clothing
     */
    public String getClothingType() {
        return this.clothingType;
    }

    /** Returns the price of clothing
     *
     * @return the price of clothing
     */
    public double getClothingPrice() {
        return this.clothingPrice;
    }

    /** Compares the 2 objects to see if they are equal
     *
     * @param clothes - the Clothing object being compared
     * @return a boolean result of whether or not the 2 objects' brandName, clothingColor, clothingType, and clothingPrice are equal
     */
    public boolean clothingEquals(Clothing clothes) {
        if (clothes == null) {
            return false;
        }

        if (this.brandName.equals(clothes.brandName) && this.clothingColor.equals(clothes.clothingColor) && this.clothingType.equals(clothes.clothingType) && this.clothingPrice == clothes.clothingPrice) {
            return true;
        }

        return false;
    }

    /** Compares 2 objects to see if they are equal (made to get overridden by the "equals" methods in the subclasses)
     *
     * @param c - Clothing object to be compared
     * @return true, unless "c" is null
     */
    public boolean equals(Clothing c) {
        if (c == null) {
            return false;
        }
        return true;
    }
}