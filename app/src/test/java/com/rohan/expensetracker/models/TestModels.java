package com.rohan.expensetracker.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestModels {

    @Test
    public void testCategory(){
        Category foodCategory = new Category(String.valueOf(1), "Food");

        assertEquals("1", foodCategory.getCategoryId());
        assertEquals("Food", foodCategory.getCategoryName());
        assertEquals("Category(categoryId=1, categoryName=Food)", foodCategory.toString());
    }
}
