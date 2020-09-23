package com.example.coordinatorlayoutdemo.custombtn;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.snackbar.Snackbar;

public class CustomMoveUpBehaviour extends CoordinatorLayout.Behavior {

    @Override
    public boolean layoutDependsOn(@NonNull CoordinatorLayout parent, @NonNull View child, @NonNull View dependency) {
        return dependency instanceof Snackbar.SnackbarLayout;
    }

    @Override
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout parent, @NonNull View child, @NonNull View dependency) {
        float transY = Math.min(0, dependency.getTranslationY()-dependency.getHeight());
        child.setTranslationY(transY);
        return true;
    }
}
