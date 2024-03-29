// Generated by view binder compiler. Do not edit!
package com.example.collectionx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.collectionx.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText Email;

  @NonNull
  public final EditText FullName;

  @NonNull
  public final Button Signin;

  @NonNull
  public final Button Signup;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final EditText password;

  @NonNull
  public final ProgressBar progressbarSignUp;

  private ActivityMainBinding(@NonNull LinearLayout rootView, @NonNull EditText Email,
      @NonNull EditText FullName, @NonNull Button Signin, @NonNull Button Signup,
      @NonNull ImageView logo, @NonNull EditText password, @NonNull ProgressBar progressbarSignUp) {
    this.rootView = rootView;
    this.Email = Email;
    this.FullName = FullName;
    this.Signin = Signin;
    this.Signup = Signup;
    this.logo = logo;
    this.password = password;
    this.progressbarSignUp = progressbarSignUp;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Email;
      EditText Email = ViewBindings.findChildViewById(rootView, id);
      if (Email == null) {
        break missingId;
      }

      id = R.id.FullName;
      EditText FullName = ViewBindings.findChildViewById(rootView, id);
      if (FullName == null) {
        break missingId;
      }

      id = R.id.Signin;
      Button Signin = ViewBindings.findChildViewById(rootView, id);
      if (Signin == null) {
        break missingId;
      }

      id = R.id.Signup;
      Button Signup = ViewBindings.findChildViewById(rootView, id);
      if (Signup == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.progressbarSignUp;
      ProgressBar progressbarSignUp = ViewBindings.findChildViewById(rootView, id);
      if (progressbarSignUp == null) {
        break missingId;
      }

      return new ActivityMainBinding((LinearLayout) rootView, Email, FullName, Signin, Signup, logo,
          password, progressbarSignUp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
