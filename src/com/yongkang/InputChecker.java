package com.yongkang;

/**
 * @author Yong Kang
 * @version 1.0 Mar 7, 2017
 */

/***
 * a checker to check if an input is valid.
 * 
 * @author Yong Kang
 *
 */
public final class InputChecker {

    /***
     * Private constructor.
     */
    private InputChecker() {

    }

    /***
     * Check if input is an valid integer.
     * 
     * @param input
     *            Input is a string.
     * @return True if input is integer.
     */
    public static boolean isInteger(final String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    /***
     * Check if input is an valid double.
     * 
     * @param input
     *            Input is a string.
     * @return True if input is double.
     */
    public static boolean isDouble(final String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    /***
     * Check if input is an valid float.
     * 
     * @param input
     *            input is a string.
     * @return True if input is float.
     */
    public static boolean isFloat(final String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (Exception e) {
        }
        return false;
    }
}
