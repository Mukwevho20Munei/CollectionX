// Generated by view binder compiler. Do not edit!
package com.example.collectionx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.example.collectionx.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityArcBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LottieAnimationView lottieSpi;

  private ActivityArcBinding(@NonNull RelativeLayout rootView,
      @NonNull LottieAnimationView lottieSpi) {
    this.rootView = rootView;
    this.lottieSpi = lottieSpi;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityArcBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityArcBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_arc, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityArcBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lottieSpi;
      LottieAnimationView lottieSpi = ViewBindings.findChildViewById(rootView, id);
      if (lottieSpi == null) {
        break missingId;
      }

      return new ActivityArcBinding((RelativeLayout) rootView, lottieSpi);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}