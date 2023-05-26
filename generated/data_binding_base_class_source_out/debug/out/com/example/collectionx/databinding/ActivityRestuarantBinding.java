// Generated by view binder compiler. Do not edit!
package com.example.collectionx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.collectionx.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRestuarantBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addItems;

  @NonNull
  public final EditText editItems;

  @NonNull
  public final ImageView menu;

  @NonNull
  public final RecyclerView recyclerView;

  private ActivityRestuarantBinding(@NonNull LinearLayout rootView, @NonNull Button addItems,
      @NonNull EditText editItems, @NonNull ImageView menu, @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.addItems = addItems;
    this.editItems = editItems;
    this.menu = menu;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRestuarantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRestuarantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_restuarant, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRestuarantBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addItems;
      Button addItems = ViewBindings.findChildViewById(rootView, id);
      if (addItems == null) {
        break missingId;
      }

      id = R.id.editItems;
      EditText editItems = ViewBindings.findChildViewById(rootView, id);
      if (editItems == null) {
        break missingId;
      }

      id = R.id.menu;
      ImageView menu = ViewBindings.findChildViewById(rootView, id);
      if (menu == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new ActivityRestuarantBinding((LinearLayout) rootView, addItems, editItems, menu,
          recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
