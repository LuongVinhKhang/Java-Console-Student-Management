package com.yongkang;

/**
 * @author Yong Kang
 * @version 1.0 Mar 7, 2017
 */

public final class Student {

    /***
     * Student id.
     */
    private int id;

    /***
     * Student name.
     */
    private String name;

    /***
     * Student score.
     */
    private float score;

    /***
     * Student image.
     */
    private String image;

    /***
     * Student address.
     */
    private String address;

    /***
     * Student description.
     */
    private String description;

    /**
     * @return The id
     */
    public int getID() {
        return id;
    }

    /**
     * @param idInput
     *            The id to set.
     */
    public void setID(final int idInput) {
        this.id = idInput;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param nameInput
     *            The name to set.
     */
    public void setName(final String nameInput) {
        this.name = nameInput;
    }

    /**
     * @return The score
     */
    public float getScore() {
        return score;
    }

    /**
     * @param scoreInput
     *            The score to set.
     */
    public void setScore(final float scoreInput) {
        this.score = scoreInput;
    }

    /**
     * @return The image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param imageInput
     *            The image to set.
     */
    public void setImage(final String imageInput) {
        this.image = imageInput;
    }

    /**
     * @return The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param addressInput
     *            The address to set.
     */
    public void setAddress(final String addressInput) {
        this.address = addressInput;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param descriptionInput
     *            The description to set.
     */
    public void setDescription(final String descriptionInput) {
        this.description = descriptionInput;
    }

    /**
     * @param idInput
     *            The id to set.
     * @param nameInput
     *            The name to set.
     * @param scoreInput
     *            The score to set.
     * @param imageInput
     *            The image to set.
     * @param addressInput
     *            The address to set.
     * @param descriptionInput
     *            The description to set.
     */
    public Student(final int idInput, final String nameInput,
            final float scoreInput, final String imageInput,
            final String addressInput, final String descriptionInput) {
        super();
        this.id = idInput;
        this.name = nameInput;
        this.score = scoreInput;
        this.image = imageInput;
        this.address = addressInput;
        this.description = descriptionInput;

    }

    /**
     * 
     */
    public Student() {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("     Student ID         :");
        sb.append(id);
        sb.append("\n");
        sb.append("     Student Name       :");
        sb.append(name);
        sb.append("\n");
        sb.append("     Student Score      :");
        sb.append(score);
        sb.append("\n");
        sb.append("     Student Image      :");
        sb.append(image);
        sb.append("\n");
        sb.append("     Student Address    :");
        sb.append(address);
        sb.append("\n");
        sb.append("     Student Description:");
        sb.append(description);
        sb.append("\n");

        return sb.toString();
    }

    /***
     * to string to save to file.
     * 
     * @return string
     */
    public String toStringSaveFile() {

        String result = id + "," + name + "," + score + "," + image + ","
                + address + "," + description;

        return result;
    }

}
