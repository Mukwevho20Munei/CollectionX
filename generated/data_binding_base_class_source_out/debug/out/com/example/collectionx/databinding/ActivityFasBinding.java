// Generated by view binder compiler. Do not edit!
package com.example.collectionx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.example.collectionx.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFasBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LottieAnimationView lottieFas;

  @NonNull
  public final TextView lottieTextFas;

  private ActivityFasBinding(@NonNull RelativeLayout rootView,
      @NonNull LottieAnimationView lottieFas, @NonNull TextView lottieTextFas) {
    this.rootView = rootView;
    this.lottieFas = lottieFas;
    this.lottieTextFas = lottieTextFas;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFasBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFasBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_fas, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFasBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lottieFas;
      LottieAnimationView lottieFas = ViewBindings.findChildViewById(rootView, id);
      if (lottieFas == null) {
        break missingId;
      }

      id = R.id.lottieTextFas;
      TextView lottieTextFas = ViewBindings.findChildViewById(rootView, id);
      if (lottieTextFas == null) {
        break missingId;
      }

      return new ActivityFasBinding((RelativeLayout) rootView, lottieFas, lottieTextFas);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}