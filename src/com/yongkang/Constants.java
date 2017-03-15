package com.yongkang;

/**
 * @author Yong Kang
 * @version 1.0 Mar 7, 2017
 */

public final class Constants {

    /***
     * Constructor.
     */
    private Constants() {

    }

    /***
     * Number of field for each student.
     */
    public static final int NUMBER_OF_FIELD = 6;

    /***
     * The position of the student's ID in the string.
     */
    public static final int CODE_POS = 0;

    /***
     * The position of the student's name in the string.
     */
    public static final int NAME_POS = 1;

    /***
     * The position of the student's score in the string.
     */
    public static final int POINT_POS = 2;

    /***
     * The position of the student's image in the string.
     */
    public static final int IMAGE_POS = 3;

    /***
     * The position of the student's address in the string.
     */
    public static final int ADDRESS_POS = 4;

    /***
     * The position of the student's description in the string.
     */
    public static final int NOTE_POS = 5;

    /***
     * Function NO.
     */
    public static final int ADD_STUDENT_FUNCTION = 1;

    /***
     * Function NO.
     */
    public static final int UPDATE_STUDENT_FUNCTION = 2;

    /***
     * Function NO.
     */
    public static final int DETELE_STUDENT_FUNCTION = 3;

    /***
     * Function NO.
     */
    public static final int SHOW_STUDENT_FUNCTION = 4;

    /***
     * Function NO.
     */
    public static final int SORT_STUDENT_FUNCTION = 5;

    /***
     * Function NO.
     */
    public static final int IMPORT_STUDENT_FUNCTION = 6;

    /***
     * Function NO.
     */
    public static final int EXPORT_STUDENT_FUNCTION = 7;

    /***
     * Function NO.
     */
    public static final int EXIT_FUNCTION = 8;

    /***
     * Function sort NO.
     */
    public static final int SORT_IN_CODE_FUNCTION = 1;

    /***
     * Function sort no.
     */
    public static final int SORT_DE_CODE_FUNCTION = 2;

    /***
     * Function sort no.
     */
    public static final int SORT_IN_POINT_FUNCTION = 3;

    /***
     * Function sort NO.
     */
    public static final int SORT_DE_POINT_FUNCTION = 4;

    /***
     * CSV export file header.
     */
    public static final String CSV_FILE_HEADER = "id,Name,"
            + "Score,Image,Address,Description";
}
