// Generated by view binder compiler. Do not edit!
package org.owntracks.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.owntracks.android.R;

public final class SettingsToolbarBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final FrameLayout widgetFrame;

  private SettingsToolbarBinding(@NonNull FrameLayout rootView, @NonNull Toolbar toolbar,
      @NonNull FrameLayout widgetFrame) {
    this.rootView = rootView;
    this.toolbar = toolbar;
    this.widgetFrame = widgetFrame;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SettingsToolbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SettingsToolbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.settings_toolbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SettingsToolbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      FrameLayout widgetFrame = (FrameLayout) rootView;

      return new SettingsToolbarBinding((FrameLayout) rootView, toolbar, widgetFrame);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
