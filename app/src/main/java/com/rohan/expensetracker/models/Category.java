package com.rohan.expensetracker.models;

import androidx.annotation.NonNull;

import lombok.AllArgsConstructor;
import lombok.CustomLog;
import lombok.Getter;

@CustomLog
@Getter
@AllArgsConstructor
public class Category {
    private final String categoryId;
    private final String categoryName;

    @NonNull
    @Override
    public String toString() {
        return "Category(categoryId=" + categoryId + ", categoryName=" + categoryName+ ")";
    }
}
