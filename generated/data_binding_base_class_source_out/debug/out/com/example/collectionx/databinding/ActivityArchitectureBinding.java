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

public final class ActivityArchitectureBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addItemsArchi;

  @NonNull
  public final EditText editItemsArchi;

  @NonNull
  public final ImageView menu;

  @NonNull
  public final RecyclerView recyclerViewArchi;

  private ActivityArchitectureBinding(@NonNull LinearLayout rootView, @NonNull Button addItemsArchi,
      @NonNull EditText editItemsArchi, @NonNull ImageView menu,
      @NonNull RecyclerView recyclerViewArchi) {
    this.rootView = rootView;
    this.addItemsArchi = addItemsArchi;
    this.editItemsArchi = editItemsArchi;
    this.menu = menu;
    this.recyclerViewArchi = recyclerViewArchi;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityArchitectureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityArchitectureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_architecture, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityArchitectureBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addItemsArchi;
      Button addItemsArchi = ViewBindings.findChildViewById(rootView, id);
      if (addItemsArchi == null) {
        break missingId;
      }

      id = R.id.editItemsArchi;
      EditText editItemsArchi = ViewBindings.findChildViewById(rootView, id);
      if (editItemsArchi == null) {
        break missingId;
      }

      id = R.id.menu;
      ImageView menu = ViewBindings.findChildViewById(rootView, id);
      if (menu == null) {
        break missingId;
      }

      id = R.id.recyclerViewArchi;
      RecyclerView recyclerViewArchi = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewArchi == null) {
        break missingId;
      }

      return new ActivityArchitectureBinding((LinearLayout) rootView, addItemsArchi, editItemsArchi,
          menu, recyclerViewArchi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
