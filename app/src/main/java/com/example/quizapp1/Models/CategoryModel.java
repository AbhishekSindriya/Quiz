package com.example.quizapp1.Models;

public class CategoryModel {

    private String categoryName,categoryImage,key;
    int setnum;

    public CategoryModel() {
    }

    public CategoryModel(String categoryName, String categoryImage, String key, int setnum) {
        this.categoryName = categoryName;
        this.categoryImage = categoryImage;
        this.key = key;
        this.setnum = setnum;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getSetnum() {
        return setnum;
    }

    public void setSetnum(int setnum) {
        this.setnum = setnum;
    }
}
