// Generated by view binder compiler. Do not edit!
package com.example.collectionx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.collectionx.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RestuarantLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ImageViewRes;

  @NonNull
  public final Button btnCameraRes;

  @NonNull
  public final Button btnGalleryRes;

  @NonNull
  public final TextView nameTextRes;

  private RestuarantLayoutBinding(@NonNull LinearLayout rootView, @NonNull ImageView ImageViewRes,
      @NonNull Button btnCameraRes, @NonNull Button btnGalleryRes, @NonNull TextView nameTextRes) {
    this.rootView = rootView;
    this.ImageViewRes = ImageViewRes;
    this.btnCameraRes = btnCameraRes;
    this.btnGalleryRes = btnGalleryRes;
    this.nameTextRes = nameTextRes;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RestuarantLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RestuarantLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.restuarant_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RestuarantLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ImageViewRes;
      ImageView ImageViewRes = ViewBindings.findChildViewById(rootView, id);
      if (ImageViewRes == null) {
        break missingId;
      }

      id = R.id.btn_camera_res;
      Button btnCameraRes = ViewBindings.findChildViewById(rootView, id);
      if (btnCameraRes == null) {
        break missingId;
      }

      id = R.id.btn_gallery_res;
      Button btnGalleryRes = ViewBindings.findChildViewById(rootView, id);
      if (btnGalleryRes == null) {
        break missingId;
      }

      id = R.id.nameTextRes;
      TextView nameTextRes = ViewBindings.findChildViewById(rootView, id);
      if (nameTextRes == null) {
        break missingId;
      }

      return new RestuarantLayoutBinding((LinearLayout) rootView, ImageViewRes, btnCameraRes,
          btnGalleryRes, nameTextRes);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
