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

public final class ActivityThingsToDoBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addItemsThings;

  @NonNull
  public final EditText editItemsThings;

  @NonNull
  public final ImageView menu;

  @NonNull
  public final RecyclerView recyclerViewThings;

  private ActivityThingsToDoBinding(@NonNull LinearLayout rootView, @NonNull Button addItemsThings,
      @NonNull EditText editItemsThings, @NonNull ImageView menu,
      @NonNull RecyclerView recyclerViewThings) {
    this.rootView = rootView;
    this.addItemsThings = addItemsThings;
    this.editItemsThings = editItemsThings;
    this.menu = menu;
    this.recyclerViewThings = recyclerViewThings;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityThingsToDoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityThingsToDoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_things_to_do, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityThingsToDoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addItemsThings;
      Button addItemsThings = ViewBindings.findChildViewById(rootView, id);
      if (addItemsThings == null) {
        break missingId;
      }

      id = R.id.editItemsThings;
      EditText editItemsThings = ViewBindings.findChildViewById(rootView, id);
      if (editItemsThings == null) {
        break missingId;
      }

      id = R.id.menu;
      ImageView menu = ViewBindings.findChildViewById(rootView, id);
      if (menu == null) {
        break missingId;
      }

      id = R.id.recyclerViewThings;
      RecyclerView recyclerViewThings = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewThings == null) {
        break missingId;
      }

      return new ActivityThingsToDoBinding((LinearLayout) rootView, addItemsThings, editItemsThings,
          menu, recyclerViewThings);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
