package com.yongkang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Yong Kang
 * @version 1.0 Mar 7, 2017
 */

/***
 * 
 * @author Yong Kang class use to sort student list
 */
public final class SortStudentList {

    /***
     * Private constructor.
     */
    private SortStudentList() {

    }

    /***
     * 
     * @param listStudent
     *            Input a list to sort
     */
    public static void sortIDIncrease(final ArrayList<Student> listStudent) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(final Student o1, final Student o2) {
                return Integer.compare(o1.getID(), o2.getID());
            }
        });
    }

    /***
     * 
     * @param listStudent
     *            Input a list to sort
     */
    public static void sortIDDecrease(final ArrayList<Student> listStudent) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(final Student o1, final Student o2) {
                return Integer.compare(o2.getID(), o1.getID());
            }
        });
    }

    /***
     * 
     * @param listStudent
     *            Input a list to sort
     * 
     */
    public static void sortScoreIncrease(final ArrayList<Student> listStudent) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(final Student o1, final Student o2) {
                return Float.compare(o1.getScore(), o2.getScore());
            }

        });
    }

    /***
     * 
     * @param listStudent
     *            Input a list to sort
     */
    public static void sortScoreDecrease(final ArrayList<Student> listStudent) {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(final Student o1, final Student o2) {
                return Float.compare(o2.getScore(), o1.getScore());
            }

        });
    }
}
